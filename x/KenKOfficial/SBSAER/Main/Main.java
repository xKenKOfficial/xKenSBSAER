package x.KenKOfficial.SBSAER.Main;

import org.bukkit.plugin.java.*;
import x.KenKOfficial.SBSAER.Recipes.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.SBSAER.Listeners.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Main extends JavaPlugin
{
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] Il;
    
    public void registerRecipes() {
        this.getLogger().info(Main.I[Main.Il[13]]);
        Recipe.setStoniarka();
        Recipe.setBoyFarmer();
        Recipe.setSandFarmer();
        Recipe.setAutoFosa();
        Recipe.setEnderChest();
        Recipe.setRzucaneTnT();
    }
    
    public void registerListeners() {
        this.getLogger().info(Main.I[Main.Il[12]]);
        Bukkit.getPluginManager().registerEvents((Listener)new StoniarkaListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new BoyFarmerListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new SandFarmerListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new AutoFosaListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new RzucaneTnTListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static void IIIl() {
        (Il = new int[15])[0] = ((0x10 ^ 0x1C) & ~(0x30 ^ 0x3C));
        Main.Il[1] = " ".length();
        Main.Il[2] = "  ".length();
        Main.Il[3] = "   ".length();
        Main.Il[4] = (0xA6 ^ 0xA2);
        Main.Il[5] = (121 + 122 - 178 + 77 ^ 60 + 102 - 32 + 9);
        Main.Il[6] = (50 + 45 - 87 + 120 ^ 105 + 77 - 112 + 64);
        Main.Il[7] = (63 + 54 - 93 + 172 ^ 181 + 188 - 288 + 114);
        Main.Il[8] = (0x3F ^ 0x11 ^ (0xA4 ^ 0x82));
        Main.Il[9] = (0x6 ^ 0xF);
        Main.Il[10] = (0xB6 ^ 0x84 ^ (0x99 ^ 0xA1));
        Main.Il[11] = (0x2D ^ 0x71 ^ (0xFC ^ 0xAB));
        Main.Il[12] = (0x70 ^ 0x12 ^ (0xC1 ^ 0xAF));
        Main.Il[13] = (0xC8 ^ 0xC5);
        Main.Il[14] = (0x29 ^ 0x27);
    }
    
    static {
        IIIl();
        lll();
    }
    
    private static String l(String lllIIIIllllllll, final String IllIIIIllllllll) {
        lllIIIIllllllll = (boolean)new String(Base64.getDecoder().decode(((String)lllIIIIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIlIIIllllllll = new StringBuilder();
        final char[] lIIlIIIllllllll = IllIIIIllllllll.toCharArray();
        int IIIlIIIllllllll = Main.Il[0];
        final Exception IlIIIIIllllllll = (Object)((String)lllIIIIllllllll).toCharArray();
        final short lIIIIIIllllllll = (short)IlIIIIIllllllll.length;
        double IIIIIIIllllllll = Main.Il[0];
        while (lIIl((int)IIIIIIIllllllll, lIIIIIIllllllll)) {
            final char lIllIIIllllllll = IlIIIIIllllllll[IIIIIIIllllllll];
            IlIlIIIllllllll.append((char)(lIllIIIllllllll ^ lIIlIIIllllllll[IIIlIIIllllllll % lIIlIIIllllllll.length]));
            "".length();
            ++IIIlIIIllllllll;
            ++IIIIIIIllllllll;
            "".length();
            if (-(0xAF ^ 0xAB) >= 0) {
                return null;
            }
        }
        return String.valueOf(IlIlIIIllllllll);
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.I[Main.Il[6]]);
        System.out.println(Main.I[Main.Il[7]]);
        System.out.println(Main.I[Main.Il[8]]);
        System.out.println(Main.I[Main.Il[9]]);
        System.out.println(Main.I[Main.Il[10]]);
        System.out.println(Main.I[Main.Il[11]]);
    }
    
    private static String I(final String lllIIlIllllllll, final String IIIlIlIllllllll) {
        try {
            final SecretKeySpec IIllIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIlIllllllll = Cipher.getInstance("Blowfish");
            llIlIlIllllllll.init(Main.Il[2], IIllIlIllllllll);
            return new String(llIlIlIllllllll.doFinal(Base64.getDecoder().decode(lllIIlIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlIllllllll) {
            IlIlIlIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lll() {
        (I = new String[Main.Il[14]])[Main.Il[0]] = I("cGB96Qu7Xa5wYH3pC7tdrnBgfekLu12ucGB96Qu7Xa5wYH3pC7tdrnBgfekLu12ucGB96Qu7Xa7f/p3tOrdxdw==", "yfvXW");
        Main.I[Main.Il[1]] = I("/9OerDEQAVWkDrMd4Pc7yg==", "LpPTD");
        Main.I[Main.Il[2]] = l("NQ4eBB0MBVZXRU1bQTURFwo=", "cklwt");
        Main.I[Main.Il[3]] = I("TVwNffmxsbkz43vhA3eLfA==", "eEpoy");
        Main.I[Main.Il[4]] = I("T8Hj+3UVIR0/aVkUJo7h+wgSL4S/uHCyeejZ/LeFnMHfm1K38ArBuWJ4JhlHtZY8oHS0cfhDcaE=", "goStd");
        Main.I[Main.Il[5]] = ll("9YDKcWrztAn1gMpxavO0CfWAynFq87QJ9YDKcWrztAn1gMpxavO0CfWAynFq87QJ9YDKcWrztAmWsm9nCBPb1g==", "TyNek");
        Main.I[Main.Il[6]] = l("b2dydlJvZ3J2Um9ncnZSb2dydlJvZ3J2Um9ncnZSb2dydlJvZ3J2Um9ncnZSb2dydlJvZ3J2Um9ncnY=", "LDQUq");
        Main.I[Main.Il[7]] = ll("15i/77J6ZN+jd3JHiGk8Lw==", "oQHVR");
        Main.I[Main.Il[8]] = I("c0KA+LVXIpAdHBpZqDdfz6kY3u0AtBIQ", "nCgvK");
        Main.I[Main.Il[9]] = ll("ngUg6aVJoHQ=", "XNJKC");
        Main.I[Main.Il[10]] = ll("P4iyWExwm8aIdm0ZA4YxSskLqHg4h7cLDLUl/j9IRrwCwBYzBEy1towg9RiWcAl2F8PtdxsBTgc=", "QFAqR");
        Main.I[Main.Il[11]] = l("U3NoeWhTc2h5aFNzaHloU3NoeWhTc2h5aFNzaHloU3NoeWhTc2h5aFNzaHloU3NoeWhTc2h5aFNzaHk=", "pPKZK");
        Main.I[Main.Il[12]] = l("GQMABw87C0EmEDACFRBIe0I=", "Ulacf");
        Main.I[Main.Il[13]] = ll("x29e7WkLIVwnBfxJ3I+OcAX3oGmSdKa1U6Z/WU6auY616bM9OksYFA==", "lMGQM");
    }
    
    private static boolean lIIl(final int IIlllllIlllllll, final int llIllllIlllllll) {
        return IIlllllIlllllll < llIllllIlllllll;
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        this.registerRecipes();
        System.out.println(Main.I[Main.Il[0]]);
        System.out.println(Main.I[Main.Il[1]]);
        System.out.println(Main.I[Main.Il[2]]);
        System.out.println(Main.I[Main.Il[3]]);
        System.out.println(Main.I[Main.Il[4]]);
        System.out.println(Main.I[Main.Il[5]]);
    }
    
    private static String ll(final String IlIllIIllllllll, final String lIIllIIllllllll) {
        try {
            final SecretKeySpec lllllIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIllllllll.getBytes(StandardCharsets.UTF_8)), Main.Il[8]), "DES");
            final Cipher IllllIIllllllll = Cipher.getInstance("DES");
            IllllIIllllllll.init(Main.Il[2], lllllIIllllllll);
            return new String(IllllIIllllllll.doFinal(Base64.getDecoder().decode(IlIllIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIllllllll) {
            lIlllIIllllllll.printStackTrace();
            return null;
        }
    }
}
