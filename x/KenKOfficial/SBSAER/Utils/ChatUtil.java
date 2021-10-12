package x.KenKOfficial.SBSAER.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ String[] lIl;
    private static final /* synthetic */ int[] Ill;
    
    private static boolean IIIIl(final int llllIlIIlllllll, final int IlllIlIIlllllll) {
        return llllIlIIlllllll < IlllIlIIlllllll;
    }
    
    public static String fixColor(final String IIlIIllIlllllll) {
        return IIlIIllIlllllll.replaceAll(ChatUtil.lIl[ChatUtil.Ill[0]], ChatUtil.lIl[ChatUtil.Ill[1]]).replace(ChatUtil.lIl[ChatUtil.Ill[2]], ChatUtil.lIl[ChatUtil.Ill[3]]).replace(ChatUtil.lIl[ChatUtil.Ill[4]], ChatUtil.lIl[ChatUtil.Ill[5]]).replace(ChatUtil.lIl[ChatUtil.Ill[6]], ChatUtil.lIl[ChatUtil.Ill[7]]);
    }
    
    private static void Illl() {
        (lIl = new String[ChatUtil.Ill[8]])[ChatUtil.Ill[0]] = llIl("Tw==", "iicOr");
        ChatUtil.lIl[ChatUtil.Ill[1]] = IIll("wAsJmnAGo1Q=", "wjgqe");
        ChatUtil.lIl[ChatUtil.Ill[2]] = IIll("oRWUJ90sRRo=", "GxVjq");
        ChatUtil.lIl[ChatUtil.Ill[3]] = IIll("2EgJz8ALsq0=", "KaeYE");
        ChatUtil.lIl[ChatUtil.Ill[4]] = lIll("5VX5DSaQhiA=", "JwQqr");
        ChatUtil.lIl[ChatUtil.Ill[5]] = llIl("w50=", "vSrQZ");
        ChatUtil.lIl[ChatUtil.Ill[6]] = lIll("9uJRuLC5mUM=", "cJVYG");
        ChatUtil.lIl[ChatUtil.Ill[7]] = llIl("Rw==", "MuzPG");
    }
    
    static {
        llll();
        Illl();
    }
    
    private static String IIll(final String llllIIlIlllllll, final String IIllIIlIlllllll) {
        try {
            final SecretKeySpec IlIIlIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIllIIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIIIlIlIlllllll = Cipher.getInstance("Blowfish");
            lIIIlIlIlllllll.init(ChatUtil.Ill[2], IlIIlIlIlllllll);
            return new String(lIIIlIlIlllllll.doFinal(Base64.getDecoder().decode(llllIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIlIlllllll) {
            IIIIlIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static void llll() {
        (Ill = new int[9])[0] = ((39 + 118 - 136 + 164 ^ 21 + 88 - 49 + 96) & (0xDC ^ 0x8E ^ (0x7E ^ 0x9) ^ -" ".length()));
        ChatUtil.Ill[1] = " ".length();
        ChatUtil.Ill[2] = "  ".length();
        ChatUtil.Ill[3] = "   ".length();
        ChatUtil.Ill[4] = (0x2A ^ 0x2E);
        ChatUtil.Ill[5] = (69 + 110 - 86 + 102 ^ 159 + 172 - 270 + 137);
        ChatUtil.Ill[6] = (38 + 58 - 85 + 150 ^ 104 + 52 + 7 + 4);
        ChatUtil.Ill[7] = (0x6D ^ 0x24 ^ (0xE9 ^ 0xA7));
        ChatUtil.Ill[8] = (0xB3 ^ 0x99 ^ (0x5C ^ 0x7E));
    }
    
    private static String lIll(final String IlIllIlIlllllll, final String lIIllIlIlllllll) {
        try {
            final SecretKeySpec lllllIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIlIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.Ill[8]), "DES");
            final Cipher IllllIlIlllllll = Cipher.getInstance("DES");
            IllllIlIlllllll.init(ChatUtil.Ill[2], lllllIlIlllllll);
            return new String(IllllIlIlllllll.doFinal(Base64.getDecoder().decode(IlIllIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlIlllllll) {
            lIlllIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIl(String IlIlllIIlllllll, final String lIIlllIIlllllll) {
        IlIlllIIlllllll = new String(Base64.getDecoder().decode(IlIlllIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIllllIIlllllll = new StringBuilder();
        final char[] IIllllIIlllllll = lIIlllIIlllllll.toCharArray();
        int llIlllIIlllllll = ChatUtil.Ill[0];
        final double lIlIllIIlllllll = (Object)IlIlllIIlllllll.toCharArray();
        final String IIlIllIIlllllll = (String)lIlIllIIlllllll.length;
        boolean llIIllIIlllllll = ChatUtil.Ill[0] != 0;
        while (IIIIl(llIIllIIlllllll ? 1 : 0, (int)IIlIllIIlllllll)) {
            final char IIIIIIlIlllllll = lIlIllIIlllllll[llIIllIIlllllll];
            lIllllIIlllllll.append((char)(IIIIIIlIlllllll ^ IIllllIIlllllll[llIlllIIlllllll % IIllllIIlllllll.length]));
            "".length();
            ++llIlllIIlllllll;
            ++llIIllIIlllllll;
            "".length();
            if (((0xC0 ^ 0x98) & ~(0x38 ^ 0x60)) < 0) {
                return null;
            }
        }
        return String.valueOf(lIllllIIlllllll);
    }
}
