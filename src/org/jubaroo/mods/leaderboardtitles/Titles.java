
package org.jubaroo.mods.leaderboardtitles;

import com.wurmonline.server.skills.SkillList;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import org.jubaroo.mods.leaderboardtitles.configurator.Constants;
import org.jubaroo.mods.leaderboardtitles.util.ExtendTitleEnum;

import java.util.Objects;

import static org.jubaroo.mods.leaderboardtitles.util.ExtendTitleEnum.getSingletonInstance;

class Titles {

    static void addNewTitles(){
        try {
            ExtendTitleEnum.builder("com.wurmonline.server.players.Titles$Title");

            // =========================================================================================================
            // ========================================== Config titles ===============================================
            // =========================================================================================================
            getSingletonInstance().addExtendEntry(Constants.titleName900, 900, Constants.titleMale900, Constants.titleFemale900, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName901, 901, Constants.titleMale901, Constants.titleFemale901, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName902, 902, Constants.titleMale902, Constants.titleFemale902, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName903, 903, Constants.titleMale903, Constants.titleFemale903, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName904, 904, Constants.titleMale904, Constants.titleFemale904, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName905, 905, Constants.titleMale905, Constants.titleFemale905, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName906, 906, Constants.titleMale906, Constants.titleFemale906, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName907, 907, Constants.titleMale907, Constants.titleFemale907, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName908, 908, Constants.titleMale908, Constants.titleFemale908, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName909, 909, Constants.titleMale909, Constants.titleFemale909, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName910, 910, Constants.titleMale910, Constants.titleFemale910, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName911, 911, Constants.titleMale911, Constants.titleFemale911, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName912, 912, Constants.titleMale912, Constants.titleFemale912, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName913, 913, Constants.titleMale913, Constants.titleFemale913, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName914, 914, Constants.titleMale914, Constants.titleFemale914, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName915, 915, Constants.titleMale915, Constants.titleFemale915, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName916, 916, Constants.titleMale916, Constants.titleFemale916, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName917, 917, Constants.titleMale917, Constants.titleFemale917, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName918, 918, Constants.titleMale918, Constants.titleFemale918, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName919, 919, Constants.titleMale919, Constants.titleFemale919, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName920, 920, Constants.titleMale920, Constants.titleFemale920, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName921, 921, Constants.titleMale921, Constants.titleFemale921, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName922, 922, Constants.titleMale922, Constants.titleFemale922, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName923, 923, Constants.titleMale923, Constants.titleFemale923, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName924, 924, Constants.titleMale924, Constants.titleFemale924, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName925, 925, Constants.titleMale925, Constants.titleFemale925, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName926, 926, Constants.titleMale926, Constants.titleFemale926, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName927, 927, Constants.titleMale927, Constants.titleFemale927, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName928, 928, Constants.titleMale928, Constants.titleFemale928, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName929, 929, Constants.titleMale929, Constants.titleFemale929, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName930, 930, Constants.titleMale930, Constants.titleFemale930, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName931, 931, Constants.titleMale931, Constants.titleFemale931, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName932, 932, Constants.titleMale932, Constants.titleFemale932, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName933, 933, Constants.titleMale933, Constants.titleFemale933, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName934, 934, Constants.titleMale934, Constants.titleFemale934, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName935, 935, Constants.titleMale935, Constants.titleFemale935, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName936, 936, Constants.titleMale936, Constants.titleFemale936, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName937, 937, Constants.titleMale937, Constants.titleFemale937, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName938, 938, Constants.titleMale938, Constants.titleFemale938, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName939, 939, Constants.titleMale939, Constants.titleFemale939, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName940, 940, Constants.titleMale940, Constants.titleFemale940, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName941, 941, Constants.titleMale941, Constants.titleFemale941, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName942, 942, Constants.titleMale942, Constants.titleFemale942, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName943, 943, Constants.titleMale943, Constants.titleFemale943, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName944, 944, Constants.titleMale944, Constants.titleFemale944, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName945, 945, Constants.titleMale945, Constants.titleFemale945, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName946, 946, Constants.titleMale946, Constants.titleFemale946, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName947, 947, Constants.titleMale947, Constants.titleFemale947, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName948, 948, Constants.titleMale948, Constants.titleFemale948, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName949, 949, Constants.titleMale949, Constants.titleFemale949, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName950, 950, Constants.titleMale950, Constants.titleFemale950, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName951, 951, Constants.titleMale951, Constants.titleFemale951, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName952, 952, Constants.titleMale952, Constants.titleFemale952, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName953, 953, Constants.titleMale953, Constants.titleFemale953, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName954, 954, Constants.titleMale954, Constants.titleFemale954, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName955, 955, Constants.titleMale955, Constants.titleFemale955, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName956, 956, Constants.titleMale956, Constants.titleFemale956, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName957, 957, Constants.titleMale957, Constants.titleFemale957, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName958, 958, Constants.titleMale958, Constants.titleFemale958, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName959, 959, Constants.titleMale959, Constants.titleFemale959, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName960, 960, Constants.titleMale960, Constants.titleFemale960, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName961, 961, Constants.titleMale961, Constants.titleFemale961, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName962, 962, Constants.titleMale962, Constants.titleFemale962, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName963, 963, Constants.titleMale963, Constants.titleFemale963, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName964, 964, Constants.titleMale964, Constants.titleFemale964, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName965, 965, Constants.titleMale965, Constants.titleFemale965, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName966, 966, Constants.titleMale966, Constants.titleFemale966, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName967, 967, Constants.titleMale967, Constants.titleFemale967, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName968, 968, Constants.titleMale968, Constants.titleFemale968, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName969, 969, Constants.titleMale969, Constants.titleFemale969, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName970, 970, Constants.titleMale970, Constants.titleFemale970, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName971, 971, Constants.titleMale971, Constants.titleFemale971, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName972, 972, Constants.titleMale972, Constants.titleFemale972, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName973, 973, Constants.titleMale973, Constants.titleFemale973, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName974, 974, Constants.titleMale974, Constants.titleFemale974, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName975, 975, Constants.titleMale975, Constants.titleFemale975, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName976, 976, Constants.titleMale976, Constants.titleFemale976, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName977, 977, Constants.titleMale977, Constants.titleFemale977, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName978, 978, Constants.titleMale978, Constants.titleFemale978, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName979, 979, Constants.titleMale979, Constants.titleFemale979, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName980, 980, Constants.titleMale980, Constants.titleFemale980, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName981, 981, Constants.titleMale981, Constants.titleFemale981, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName982, 982, Constants.titleMale982, Constants.titleFemale982, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName983, 983, Constants.titleMale983, Constants.titleFemale983, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName984, 984, Constants.titleMale984, Constants.titleFemale984, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName985, 985, Constants.titleMale985, Constants.titleFemale985, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName986, 986, Constants.titleMale986, Constants.titleFemale986, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName987, 987, Constants.titleMale987, Constants.titleFemale987, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName988, 988, Constants.titleMale988, Constants.titleFemale988, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName989, 989, Constants.titleMale989, Constants.titleFemale989, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName990, 990, Constants.titleMale990, Constants.titleFemale990, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName991, 991, Constants.titleMale991, Constants.titleFemale991, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName992, 992, Constants.titleMale992, Constants.titleFemale992, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName993, 993, Constants.titleMale993, Constants.titleFemale993, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName994, 994, Constants.titleMale994, Constants.titleFemale994, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName995, 995, Constants.titleMale995, Constants.titleFemale995, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName996, 996, Constants.titleMale996, Constants.titleFemale996, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName997, 997, Constants.titleMale997, Constants.titleFemale997, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName998, 998, Constants.titleMale998, Constants.titleFemale998, -1, "NORMAL");
            getSingletonInstance().addExtendEntry(Constants.titleName999, 999, Constants.titleMale999, Constants.titleFemale999, -1, "NORMAL");

            // =========================================================================================================
            // ========================================== Characteristic Titles ========================================
            // =========================================================================================================
            getSingletonInstance().addExtendEntry("MindLogic_Normal", 1000, "Logical", "Logical", 100, "NORMAL");
            getSingletonInstance().addExtendEntry("MindLogic_Minor", 1001, "Intelligent", "Intelligent", 100, "MINOR");
            getSingletonInstance().addExtendEntry("MindLogic_Master", 1002, "Brilliant", "Brilliant", 100, "MASTER");
            getSingletonInstance().addExtendEntry("MindLogic_Legendary", 1003, "Mentalist", "Mentalist", 100, "LEGENDARY");
            getSingletonInstance().addExtendEntry("MindSpeed_Normal", 1004, "Keen", "Keen", 101, "NORMAL");
            getSingletonInstance().addExtendEntry("MindSpeed_Minor", 1005, "Thinker", "Thinker", 101, "MINOR");
            getSingletonInstance().addExtendEntry("MindSpeed_Master", 1006, "Clever", "Clever", 101, "MASTER");
            getSingletonInstance().addExtendEntry("MindSpeed_Legendary", 1007, "Mind Over Matter", "Mind Over Matter", 101, "LEGENDARY");
            getSingletonInstance().addExtendEntry("BodyStrength_Normal", 1008, "Strong", "Strong", 102, "NORMAL");
            getSingletonInstance().addExtendEntry("BodyStrength_Minor", 1009, "Fortified", "Fortified", 102, "MINOR");
            getSingletonInstance().addExtendEntry("BodyStrength_Master", 1010, "Unyielding", "Unyielding", 102, "MASTER");
            getSingletonInstance().addExtendEntry("BodyStrength_Legendary", 1011, "Force of Nature", "Force of Nature", 102, "LEGENDARY");
            getSingletonInstance().addExtendEntry("BodyStamina_Normal", 1012, "Enduring", "Enduring", 103, "NORMAL");
            getSingletonInstance().addExtendEntry("BodyStamina_Minor", 1013, "Resilient", "Resilient", 103, "MINOR");
            getSingletonInstance().addExtendEntry("BodyStamina_Master", 1014, "Vigorous", "Vigorous", 103, "MASTER");
            getSingletonInstance().addExtendEntry("BodyStamina_Legendary", 1015, "Unstoppable", "Unstoppable", 103, "LEGENDARY");
            getSingletonInstance().addExtendEntry("BodyControl_Normal", 1016, "Nimble", "Nimble", 104, "NORMAL");
            getSingletonInstance().addExtendEntry("BodyControl_Minor", 1017, "Deft", "Deft", 104, "MINOR");
            getSingletonInstance().addExtendEntry("BodyControl_Master", 1018, "Skillful", "Skillful", 104, "MASTER");
            getSingletonInstance().addExtendEntry("BodyControl_Legendary", 1019, "Manipulator", "Manipulator", 104, "LEGENDARY");
            getSingletonInstance().addExtendEntry("SoulStrength_Normal", 1020, "Spirited", "Spirited", 105, "NORMAL");
            getSingletonInstance().addExtendEntry("SoulStrength_Minor", 1021, "Diviner", "Diviner", 105, "MINOR");
            getSingletonInstance().addExtendEntry("SoulStrength_Master", 1022, "Anima", "Anima", 105, "MASTER");
            getSingletonInstance().addExtendEntry("SoulStrength_Legendary", 1023, "Prophet", "Prophet", 105, "LEGENDARY");
            getSingletonInstance().addExtendEntry("SoulDepth_Normal", 1024, "Sensible", "Sensible", 106, "NORMAL");
            getSingletonInstance().addExtendEntry("SoulDepth_Minor", 1025, "Medium", "Medium", 106, "MINOR");
            getSingletonInstance().addExtendEntry("SoulDepth_Master", 1026, "Spiritual", "Spiritual", 106, "MASTER");
            getSingletonInstance().addExtendEntry("SoulDepth_Legendary", 1027, "Planewalker", "Planewalker", 106, "LEGENDARY");

            // =========================================================================================================
            // ========================================== Skill Titles (Full) ==========================================
            // =========================================================================================================
            getSingletonInstance().addExtendEntry("Staff_Normal", 1100, "Acolyte", "Acolyte", 10090, "NORMAL");
            getSingletonInstance().addExtendEntry("Staff_Minor", 1101, "Disciple", "Disciple", 10090, "MINOR");
            getSingletonInstance().addExtendEntry("Staff_Master", 1102, "Monk", "Monk", 10090, "MASTER");
            getSingletonInstance().addExtendEntry("Staff_Legendary", 1103, "Sensei", "Sensei", 10090, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Scythe_Normal", 1104, "Mower", "Mower", 10047, "NORMAL");
            getSingletonInstance().addExtendEntry("Scythe_Minor", 1105, "Harvester", "Harvester", 10047, "MINOR");
            getSingletonInstance().addExtendEntry("Scythe_Master", 1106, "Scythian", "Scythian", 10047, "MASTER");
            getSingletonInstance().addExtendEntry("Scythe_Legendary", 1107, "Reaper", "Reaper", 10047, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Defensive_Normal", 1108, "Resistant", "Resistant", 10054, "NORMAL");
            getSingletonInstance().addExtendEntry("Defensive_Minor", 1109, "Guardian", "Guardian", 10054, "MINOR");
            getSingletonInstance().addExtendEntry("Defensive_Master", 1110, "Bulwark", "Bulwark", 10054, "MASTER");
            getSingletonInstance().addExtendEntry("Defensive_Legendary", 1111, "Unbreakable", "Unbreakable", 10054, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Aggressive_Normal", 1112, "Angry", "Angry", 10053, "NORMAL");
            getSingletonInstance().addExtendEntry("Aggressive_Minor", 1113, "Violent", "Violent", 10053, "MINOR");
            getSingletonInstance().addExtendEntry("Aggressive_Master", 1114, "Battleborn", "Battleborn", 10053, "MASTER");
            getSingletonInstance().addExtendEntry("Aggressive_Legendary", 1115, "Warmonger", "Warmonger", 10053, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Normal_Normal", 1116, "Infantry", "Infantry", 10055, "NORMAL");
            getSingletonInstance().addExtendEntry("Normal_Minor", 1117, "Marauder", "Marauder", 10055, "MINOR");
            getSingletonInstance().addExtendEntry("Normal_Master", 1118, "Gladiator", "Gladiator", 10055, "MASTER");
            getSingletonInstance().addExtendEntry("Normal_Legendary", 1119, "Templar", "Templar", 10055, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Weaponless_Normal", 1120, "Scrapper", "Scrapper", 10052, "NORMAL");
            getSingletonInstance().addExtendEntry("Weaponless_Minor", 1121, "Brawler", "Brawler", 10052, "MINOR");
            getSingletonInstance().addExtendEntry("Weaponless_Master", 1122, "Boxer", "Boxer", 10052, "MASTER");
            getSingletonInstance().addExtendEntry("Weaponless_Legendary", 1123, "Martial Artist", "Martial Artist", 10052, "LEGENDARY");
            getSingletonInstance().addExtendEntry("BladesSmithing_Normal", 1124, "Bladesmith", "Bladesmith", SkillList.SMITHING_WEAPON_BLADES, "NORMAL");
            getSingletonInstance().addExtendEntry("BladesSmithing_Minor", 1125, "Renowned Bladesmith", "Renowned Bladesmith", SkillList.SMITHING_WEAPON_BLADES, "MINOR");
            getSingletonInstance().addExtendEntry("BladesSmithing_Master", 1126, "Master Bladesmith", "Master Bladesmith", SkillList.SMITHING_WEAPON_BLADES, "MASTER");
            getSingletonInstance().addExtendEntry("BladesSmithing_Legendary", 1127, "Legendary Bladesmith", "Legendary Bladesmith", SkillList.SMITHING_WEAPON_BLADES, "LEGENDARY");
            getSingletonInstance().addExtendEntry("HeadSmithing_Normal", 1128, "Headsmither", "Headsmither", SkillList.SMITHING_WEAPON_HEADS, "NORMAL");
            getSingletonInstance().addExtendEntry("HeadSmithing_Minor", 1129, "Renowned Headsmither", "Renowned Headsmither", SkillList.SMITHING_WEAPON_HEADS, "MINOR");
            getSingletonInstance().addExtendEntry("HeadSmithing_Master", 1130, "Master Headsmither", "Master Headsmither", SkillList.SMITHING_WEAPON_HEADS, "MASTER");
            getSingletonInstance().addExtendEntry("HeadSmithing_Legendary", 1131, "Legendary Headsmither", "Legendary Headsmither", SkillList.SMITHING_WEAPON_HEADS, "LEGENDARY");

            // =========================================================================================================
            // ========================================== Skill Titles (100) ===========================================
            // =========================================================================================================
            getSingletonInstance().addExtendEntry("Archery_Legendary", 1500, "Legendary Marksman", "Legendary Marksman", 1030, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Body_Legendary", 1501, "Hercules", "Hercules", 1, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Axes_Legendary", 1502, "Viking", "Viking", 1003, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Baking_Legendary", 1503, "Patissier", "Patissier", 10039, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Archaeology_Legendary", 1504, "Curator", "Curator", 10069, "LEGENDARY");
            getSingletonInstance().addExtendEntry("CarvingKnife_Legendary", 1505, "Woodsculptor", "Woodsculptor", 10007, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Taming_Legendary", 1506, "King of the Jungle", "Queen of the Jungle", 10078, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Climbing_Legendary", 1507, "Moonwalker", "Moonwalker", 10073, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Tracking_Legendary", 1508, "Bloodhound", "Bloodhound", 10018, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Clubs_Legendary", 1509, "Bam Bam", "Bam Bam", 1025, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Catapults_Legendary", 1510, "Castle Crasher", "Castle Crasher", 10077, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Firemaking_Legendary", 1511, "Incendiary", "Incendiary", 1010, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Gardening_Legendary", 1512, "Earthbound", "Earthbound", 10045, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Hammers_Legendary", 1513, "Doomhammer", "Doomhammer", 1027, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Locksmithing_Legendary", 1514, "Vault Smith", "Vault Smith", 10034, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Religion_Legendary", 1515, "Chosen", "Chosen", 1026, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Yoyo_Legendary", 1516, "String Theorist", "String Theorist", 10050, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Nature_Legendary", 1517, "Naturalist", "Naturalist", 1019, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Mind_Legendary", 1518, "Enlightened", "Enlightened", 2, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Mauls_Legendary", 1519, "Breaker", "Breaker", 1004, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Shipbuilding_Legendary", 1520, "Naval Engineer", "Naval Engineer", 10082, "LEGENDARY");
            getSingletonInstance().addExtendEntry("NaturalSubstances_Legendary", 1521, "Biochemist", "Biochemist", 10042, "LEGENDARY");
            getSingletonInstance().addExtendEntry("WarMachines_Legendary", 1522, "Eradicator", "Eradicator", 1029, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Thievery_Legendary", 1523, "Shadow", "Shadow", 1028, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Swords_Legendary", 1524, "Samurai", "Samurai", 1000, "LEGENDARY");
            getSingletonInstance().addExtendEntry("Forestry_Legendary", 1525, "Silvanus", "Mother Nature", 10048, "LEGENDARY");

            // =========================================================================================================
            // ========================================== Custom Skill Titles ==========================================
            // =========================================================================================================

            // ========================================== Taxidermy ====================================================
            getSingletonInstance().addExtendEntry("Taxidermy_Minor", 1700, "Junior Taxidermist", "Junior Taxidermist", 10096, "MINOR");
            getSingletonInstance().addExtendEntry("Taxidermy_Normal", 1701, "Anthropomorphic Taxidermist", "Anthropomorphic Taxidermist", 10096, "NORMAL");
            getSingletonInstance().addExtendEntry("Taxidermy_Master", 1702, "Head Hunter", "Head Hunter", 10096, "MASTER");
            getSingletonInstance().addExtendEntry("Taxidermy_Epic", 1703, "Epic Taxidermist", "Epic Taxidermist", 10096, "EPIC");
            getSingletonInstance().addExtendEntry("Taxidermy_Legendary", 1704, "Legendary Taxidermist", "Legendary Taxidermist", 10096, "LEGENDARY");

            // ========================================== Gem Crafting =================================================
            getSingletonInstance().addExtendEntry("GemCrafting_Minor", 1705, "Facetor", "Facetor", 11100, "MINOR");
            getSingletonInstance().addExtendEntry("GemCrafting_Normal", 1706, "Gem Stone Cutter", "Gem Stone Cutter", 11100, "NORMAL");
            getSingletonInstance().addExtendEntry("GemCrafting_Master", 1707, "Diamond Driller", "Diamond Driller", 11100, "MASTER");
            getSingletonInstance().addExtendEntry("GemCrafting_Epic", 1708, "Gem Expert ", "Gem Expert ", 11100, "EPIC");
            getSingletonInstance().addExtendEntry("GemCrafting_Legendary", 1709, "Gemologist", "Gemologist", 11100, "LEGENDARY");

            getSingletonInstance().ExtendEnumEntries();

        } catch (BadBytecode | NotFoundException | CannotCompileException e) {
            Constants.logger.warning(e.getMessage());
        }
    }

    static void changeExistingTitles(){
        for (com.wurmonline.server.players.Titles.Title title : com.wurmonline.server.players.Titles.Title.values()) {
            if (Objects.equals("Pumpkin King", title.getFemaleName())){
                try {
                    ReflectionUtil.setPrivateField(title,  ReflectionUtil.getField(title.getClass(), "femaleName"), "Pumpkin Queen");
                } catch (IllegalArgumentException | IllegalAccessException | ClassCastException | NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
