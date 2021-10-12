package x.KenKOfficial.SBSAER.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.SBSAER.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] llll;
    private static final /* synthetic */ int[] IIIIl;
    
    private static boolean llIlIl(final int IllIIIlIlIlllll, final int lIlIIIlIlIlllll) {
        return IllIIIlIlIlllll < lIlIIIlIlIlllll;
    }
    
    private static String IllIIl(final String IlllIIlIlIlllll, final String llIlIIlIlIlllll) {
        try {
            final SecretKeySpec lIIIlIlIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.IIIIl[8]), "DES");
            final Cipher IIIIlIlIlIlllll = Cipher.getInstance("DES");
            IIIIlIlIlIlllll.init(PlayerJoin.IIIIl[2], lIIIlIlIlIlllll);
            return new String(IIIIlIlIlIlllll.doFinal(Base64.getDecoder().decode(IlllIIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIlIlllll) {
            llllIIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IIlllllIlIlllll) {
        final Player lIlllllIlIlllll = IIlllllIlIlllll.getPlayer();
        if (IlIlIl(lIlllllIlIlllll.hasPermission(PlayerJoin.llll[PlayerJoin.IIIIl[0]]) ? 1 : 0)) {
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[1]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[2]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[3]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[4]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[5]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[6]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[7]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[8]]));
            lIlllllIlIlllll.sendMessage(ChatUtil.fixColor(PlayerJoin.llll[PlayerJoin.IIIIl[9]]));
        }
    }
    
    private static boolean IlIlIl(final int llIIIIlIlIlllll) {
        return llIIIIlIlIlllll != 0;
    }
    
    private static String lIlIIl(String llIlIllIlIlllll, final String IlIlIllIlIlllll) {
        llIlIllIlIlllll = new String(Base64.getDecoder().decode(llIlIllIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllIllIlIlllll = new StringBuilder();
        final char[] lIllIllIlIlllll = IlIlIllIlIlllll.toCharArray();
        int IIllIllIlIlllll = PlayerJoin.IIIIl[0];
        final long IllIIllIlIlllll = (Object)llIlIllIlIlllll.toCharArray();
        final String lIlIIllIlIlllll = (String)IllIIllIlIlllll.length;
        String IIlIIllIlIlllll = (String)PlayerJoin.IIIIl[0];
        while (llIlIl((int)IIlIIllIlIlllll, (int)lIlIIllIlIlllll)) {
            final char lIIIlllIlIlllll = IllIIllIlIlllll[IIlIIllIlIlllll];
            IlllIllIlIlllll.append((char)(lIIIlllIlIlllll ^ lIllIllIlIlllll[IIllIllIlIlllll % lIllIllIlIlllll.length]));
            "".length();
            ++IIllIllIlIlllll;
            ++IIlIIllIlIlllll;
            "".length();
            if (((89 + 42 - 79 + 85 ^ 56 + 19 + 11 + 46) & (0x6E ^ 0x7B ^ (0x2E ^ 0x36) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IlllIllIlIlllll);
    }
    
    private static String lllIIl(final String llIllIlIlIlllll, final String IlIllIlIlIlllll) {
        try {
            final SecretKeySpec IllllIlIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlllIlIlIlllll = Cipher.getInstance("Blowfish");
            lIlllIlIlIlllll.init(PlayerJoin.IIIIl[2], IllllIlIlIlllll);
            return new String(lIlllIlIlIlllll.doFinal(Base64.getDecoder().decode(llIllIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllIlIlIlllll) {
            IIlllIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIl() {
        (IIIIl = new int[11])[0] = ((0x74 ^ 0x49) & ~(0x1D ^ 0x20));
        PlayerJoin.IIIIl[1] = " ".length();
        PlayerJoin.IIIIl[2] = "  ".length();
        PlayerJoin.IIIIl[3] = "   ".length();
        PlayerJoin.IIIIl[4] = (0xEE ^ 0xB4 ^ (0x16 ^ 0x48));
        PlayerJoin.IIIIl[5] = (170 + 168 - 319 + 163 ^ 132 + 37 - 148 + 158);
        PlayerJoin.IIIIl[6] = (137 + 107 - 215 + 140 ^ 170 + 107 - 181 + 79);
        PlayerJoin.IIIIl[7] = (76 + 41 - 115 + 145 ^ 121 + 117 - 98 + 8);
        PlayerJoin.IIIIl[8] = (0x60 ^ 0x68);
        PlayerJoin.IIIIl[9] = (0x42 ^ 0x4B);
        PlayerJoin.IIIIl[10] = (0xCB ^ 0x86 ^ (0x1B ^ 0x5C));
    }
    
    static {
        lIIlIl();
        IIIlIl();
    }
    
    private static void IIIlIl() {
        (llll = new String[PlayerJoin.IIIIl[10]])[PlayerJoin.IIIIl[0]] = lIlIIl("HQQBOgYHHAUxB0sOADkcCw==", "eodTu");
        PlayerJoin.llll[PlayerJoin.IIIIl[1]] = IllIIl("CYCuFyDGnyYd+GwgXNitH/nbrZbB+MHf+klmeZ5JY3dCS4F6tAopKB34bCBc2K0fKxlH93geZcw=", "DkFUH");
        PlayerJoin.llll[PlayerJoin.IIIIl[2]] = IllIIl("7Tlfqrq93tk=", "ZXvgd");
        PlayerJoin.llll[PlayerJoin.IIIIl[3]] = lIlIIl("WlNuMSEPEjAPa0JPeUcvAj48Dx44JhgkHw==", "zuYaM");
        PlayerJoin.llll[PlayerJoin.IIIIl[4]] = lllIIl("SGRsk/CfaB0=", "MuZgO");
        PlayerJoin.llll[PlayerJoin.IIIIl[5]] = lllIIl("2Z8A3eUrbz2Q0rCXYxjnMZvcGaEZkQq4Nb3cb2gRi80=", "QiRqN");
        PlayerJoin.llll[PlayerJoin.IIIIl[6]] = lIlIIl("TA==", "llhBt");
        PlayerJoin.llll[PlayerJoin.IIIIl[7]] = lIlIIl("akF2FQk5E2EMGC4GNTxOcl1hfwp7VW9oWGRVcWtZagAuPRJkR3NqUnhQ", "JgAYh");
        PlayerJoin.llll[PlayerJoin.IIIIl[8]] = IllIIl("5ccmIbWgHDc=", "idjrx");
        PlayerJoin.llll[PlayerJoin.IIIIl[9]] = IllIIl("Ex+d0P47oQ0qRzEdoqZK33XYpQgFF87+wuK6LVmrCbMbwYwr6U8PnipHMR2ipkrfpT0hoxA7ELQ=", "zsWUD");
    }
}
