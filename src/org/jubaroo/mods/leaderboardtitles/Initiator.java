
package org.jubaroo.mods.leaderboardtitles;

import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modloader.classhooks.HookException;
import org.gotti.wurmunlimited.modloader.interfaces.*;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.jubaroo.mods.leaderboardtitles.actions.LeaderboardAction;
import org.jubaroo.mods.leaderboardtitles.actions.LeaderboardSkillAction;
import org.jubaroo.mods.leaderboardtitles.configurator.Config;
import org.jubaroo.mods.leaderboardtitles.configurator.Constants;
import org.jubaroo.mods.leaderboardtitles.util.AchievementChanges;
import org.jubaroo.mods.leaderboardtitles.util.DatabaseHelper;
import org.jubaroo.mods.leaderboardtitles.util.Logging;

import java.util.Properties;
import java.util.logging.Level;

public class Initiator implements WurmServerMod, Configurable, ServerStartedListener, PlayerLoginListener, PreInitable {

    public static void debug(String msg) {
        if (Constants.debug) { Constants.logger.info(msg); }
    }

    @Override
    public void configure(final Properties properties) {
        Config.doConfig(properties);
        Logging.modLogging();
    }

    @Override
    public void preInit() {
        Initiator.debug( "preInit called");
        try {
            ModActions.init();
            if (Constants.titles) { Titles.addNewTitles(); }
        } catch (IllegalArgumentException | ClassCastException e) {
            throw new HookException(e);
        }
        Initiator.debug( "all preInit completed");
    }

    @Override
    public void init() {
        Initiator.debug( "init called");
        try {
            if (Constants.titles) { Titles.changeExistingTitles(); }
        } catch (Throwable e) {
            Constants.logger.log(Level.SEVERE, "Error in init()", e);
        }
        Initiator.debug( "all init completed");
    }

    @Override
    public void onServerStarted() {
        Initiator.debug( "onServerStarted called");
        try {
            Initiator.debug("Setting up Achievement templates...");
            AchievementChanges.onServerStarted();
            Initiator.debug("Registering Database helper...");
            DatabaseHelper.onServerStarted();
            Initiator.debug("Registering Leaderboard actions...");
            ModActions.registerAction(new LeaderboardAction());
            ModActions.registerAction(new LeaderboardSkillAction());
        }
        catch (IllegalArgumentException | ClassCastException e) {
            Constants.logger.log(Level.SEVERE, "Error in modifyItemsOnServerStarted()", e);
        }
        Initiator.debug( "all onServerStarted completed");
    }

    @Override
    public void onPlayerLogin(Player player) {
        try {
            DatabaseHelper.onPlayerLogin(player);
        } catch ( IllegalArgumentException | ClassCastException e) {
            Constants.logger.log(Level.SEVERE, "Error in onPlayerLogin()", e);
        }

    }

    public String getVersion() {
        return "v1.0";
    }

}