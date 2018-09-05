
package org.jubaroo.mods.leaderboardtitles.util;

import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.ModSupportDb;
import org.jubaroo.mods.leaderboardtitles.Initiator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHelper {

    public static void onPlayerLogin(Player p){
        Connection dbcon;
        PreparedStatement ps;
        boolean foundLeaderboardOpt = false;
        try {
            dbcon = ModSupportDb.getModSupportDb();
            ps = dbcon.prepareStatement("SELECT * FROM LeaderboardOpt");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (!rs.getString("name").equals(p.getName())) continue;
                foundLeaderboardOpt = true;
            }
            rs.close();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException((Throwable) e);
        }
        if (!foundLeaderboardOpt) {
            Initiator.debug("No leaderboard entry for "+p.getName()+". Creating one.");
            try {
                dbcon = ModSupportDb.getModSupportDb();
                ps = dbcon.prepareStatement("INSERT INTO LeaderboardOpt (name) VALUES(?)");
                ps.setString(1, p.getName());
                ps.executeUpdate();
                ps.close();
            }
            catch (SQLException e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        boolean foundPlayerStats = false;
        try {
            dbcon = ModSupportDb.getModSupportDb();
            ps = dbcon.prepareStatement("SELECT * FROM PlayerStats");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (!rs.getString("NAME").equals(p.getName())) continue;
                foundPlayerStats = true;
            }
            rs.close();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException((Throwable) e);
        }
        if (!foundPlayerStats) {
            Initiator.debug("No player stats entry for "+p.getName()+". Creating one.");
            try {
                dbcon = ModSupportDb.getModSupportDb();
                ps = dbcon.prepareStatement("INSERT INTO PlayerStats (NAME) VALUES(\"" + p.getName() + "\")");
                ps.executeUpdate();
                ps.close();
            }
            catch (SQLException e) {
                throw new RuntimeException((Throwable) e);
            }
        }
    }

    public static void onServerStarted(){
        try {
            Connection con = ModSupportDb.getModSupportDb();
            String sql;
            String tableName = "LeaderboardOpt";
            if (!ModSupportDb.hasTable(con, tableName)) {
                Initiator.debug(tableName+" table not found in ModSupport. Creating table now.");
                sql = "CREATE TABLE "+tableName+" (name VARCHAR(30) NOT NULL DEFAULT 'Unknown', OPTIN INT NOT NULL DEFAULT 0)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                ps.close();
            }
            tableName = "SteamIdMap";
            if (!ModSupportDb.hasTable(con, tableName)) {
                Initiator.debug(tableName+" table not found in ModSupport. Creating table now.");
                sql = "CREATE TABLE "+tableName+" (NAME VARCHAR(30) NOT NULL DEFAULT 'Unknown', STEAMID LONG NOT NULL DEFAULT 0)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                ps.close();
            }
            tableName = "PlayerStats";
            if (!ModSupportDb.hasTable(con, tableName)) {
                Initiator.debug(tableName+" table not found in ModSupport. Creating table now.");
                sql = "CREATE TABLE "+tableName+" (NAME VARCHAR(30) NOT NULL DEFAULT 'Unknown', KILLS INT NOT NULL DEFAULT 0, DEATHS INT NOT NULL DEFAULT 0, DEPOTS INT NOT NULL DEFAULT 0, HOTAS INT NOT NULL DEFAULT 0, TITANS INT NOT NULL DEFAULT 0, UNIQUES INT NOT NULL DEFAULT 0)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                ps.close();
            }else{
                Initiator.debug("Found "+tableName+". Checking if it has a unique column.");
                ResultSet rs = con.getMetaData().getColumns(null, null, tableName, "UNIQUES");
                if(rs.next()){
                    Initiator.debug(tableName+" already has a uniques column.");
                }else{
                    Initiator.debug("Detected no uniques column in "+tableName);
                    sql = "ALTER TABLE "+tableName+" ADD COLUMN UNIQUES INT NOT NULL DEFAULT 0";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.execute();
                    ps.close();
                }
            }
            tableName = "ObjectiveTimers";
            if (!ModSupportDb.hasTable(con, tableName)) {
                Initiator.debug(tableName+" table not found in ModSupport. Creating table now.");
                sql = "CREATE TABLE "+tableName+" (ID VARCHAR(30) NOT NULL DEFAULT 'Unknown', TIMER LONG NOT NULL DEFAULT 0)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.execute();
                ps.close();
                try {
                    Connection dbcon;
                    dbcon = ModSupportDb.getModSupportDb();
                    ps = dbcon.prepareStatement("INSERT INTO ObjectiveTimers (ID, TIMER) VALUES(\"DEPOT\", 0)");
                    ps.executeUpdate();
                    ps.close();
                }
                catch (SQLException e) {
                    throw new RuntimeException((Throwable) e);
                }
                try {
                    Connection dbcon;
                    dbcon = ModSupportDb.getModSupportDb();
                    ps = dbcon.prepareStatement("INSERT INTO ObjectiveTimers (ID, TIMER) VALUES(\"TITAN\", 0)");
                    ps.executeUpdate();
                    ps.close();
                }
                catch (SQLException e) {
                    throw new RuntimeException((Throwable) e);
                }
            }
        }
        catch (SQLException e) {
            throw new RuntimeException((Throwable) e);
        }
    }
}
