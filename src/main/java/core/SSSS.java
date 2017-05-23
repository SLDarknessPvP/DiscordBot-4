package core;

import net.dv8tion.jda.core.entities.Guild;
import utils.STATICS;

import java.io.*;
import java.util.List;

/**
 * Created by zekro on 17.05.2017 / 14:12
 * DiscordBot/core
 * © zekro 2017
 */

public class SSSS /* Stands for "SERVER SPECIFIC SETTINGS SYSTEM" :^) */ {

    public static void checkFolders(List<Guild> guilds) {

        guilds.forEach(guild -> {
            File f = new File("SERVER_SETTINGS/" + guild.getId());
            if (!f.exists() || !f.isDirectory()) {
                f.mkdirs();
            }
        });
    }


    public static String getPREFIX(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/prefix");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return STATICS.PREFIX;
    }

    public static void setPREFIX(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/prefix");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getSERVERJOINMESSAGE(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/serverjoinmessage");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }  catch (Exception e) {}
        return "OFF";
    }

    public static void setSERVERJOINMESSAGE(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/serverjoinmessage");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getSERVERLEAVEMESSAGE(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/serverleavemessage");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return "OFF";
    }

    public static void setSERVERLEAVEMESSAGE(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/serverleavemessage");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getMUSICCHANNEL(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/musicchannel");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return "";
    }

    public static void setMUSICCHANNEL(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/musicchannel");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String[] getPERMROLES_1(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/permroles_1");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine().split(", ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return STATICS.PERMS;

    }

    public static void setPERMROLES_1(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/permroles_1");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String[] getPERMROLES_2(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/permroles_2");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine().split(", ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return STATICS.FULLPERMS;
    }

    public static void setPERMROLES_2(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/permroles_2");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static boolean getLOCKMUSICCHANNEL(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/lockmusicchannel");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine().equals("true");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return false;
    }

    public static void setLOCKMUSICCHANNEL(boolean entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/lockmusicchannel");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry + "");
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getAUTOROLE(Guild guild) {

        try {
            File f = new File("SERVER_SETTINGS/" + guild.getId() + "/autorole");
            if (f.exists()) {
                try {
                    return new BufferedReader(new FileReader(f)).readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {}
        return "";
    }

    public static void setAUTOROLE(String entry, Guild guild) {

        File f = new File("SERVER_SETTINGS/" + guild.getId() + "/autorole");
        try {
            BufferedWriter r = new BufferedWriter(new FileWriter(f));
            r.write(entry);
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}