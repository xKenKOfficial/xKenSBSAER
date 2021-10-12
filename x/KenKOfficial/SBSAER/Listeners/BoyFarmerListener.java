package x.KenKOfficial.SBSAER.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.block.*;
import x.KenKOfficial.SBSAER.Main.*;
import x.KenKOfficial.SBSAER.Utils.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.event.*;

public class BoyFarmerListener implements Listener
{
    private static final /* synthetic */ int[] lIIl;
    private static final /* synthetic */ String[] lll;
    
    private static String lIIIl(final String IlIlIIIIlllllll, final String lllIIIIIlllllll) {
        try {
            final SecretKeySpec lIllIIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIllIIIIlllllll = Cipher.getInstance("Blowfish");
            IIllIIIIlllllll.init(BoyFarmerListener.lIIl[3], lIllIIIIlllllll);
            return new String(IIllIIIIlllllll.doFinal(Base64.getDecoder().decode(IlIlIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIlllllll) {
            llIlIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIl(final int llIlllllIllllll) {
        return llIlllllIllllll != 0;
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlace(final BlockPlaceEvent lIIllIIIlllllll) {
        final String IllllIIIlllllll = Main.getPlugin().getConfig().getString(BoyFarmerListener.lll[BoyFarmerListener.lIIl[0]]);
        final Player lIlllIIIlllllll = lIIllIIIlllllll.getPlayer();
        final Block IIlllIIIlllllll = lIIllIIIlllllll.getBlock();
        final ItemStack llIllIIIlllllll = lIIllIIIlllllll.getPlayer().getItemInHand();
        final ItemMeta IlIllIIIlllllll = llIllIIIlllllll.getItemMeta();
        if (IllIl(llIllIIIlllllll.getType(), Material.OBSIDIAN) && lllIl(IlIllIIIlllllll.getDisplayName().contains(ChatUtil.fixColor(IllllIIIlllllll)) ? 1 : 0)) {
            int lIIIIlIIlllllll = IIlllIIIlllllll.getY();
            while (IIIll(lIIIIlIIlllllll, BoyFarmerListener.lIIl[1])) {
                final Location IlIIIlIIlllllll = new Location(lIlllIIIlllllll.getLocation().getWorld(), (double)IIlllIIIlllllll.getX(), (double)lIIIIlIIlllllll, (double)IIlllIIIlllllll.getZ());
                IlIIIlIIlllllll.getBlock().setType(Material.OBSIDIAN);
                --lIIIIlIIlllllll;
                "".length();
                if (((0xA9 ^ 0x88) & ~(0x16 ^ 0x37)) != 0x0) {
                    return;
                }
            }
        }
    }
    
    private static void IlIIl() {
        (lll = new String[BoyFarmerListener.lIIl[2]])[BoyFarmerListener.lIIl[0]] = lIIIl("0SdOiuuQo01fHNxMSswNpnWPgmB0fscE", "OPNDG");
    }
    
    private static boolean IIIll(final int IlIIIIIIlllllll, final int lIIIIIIIlllllll) {
        return IlIIIIIIlllllll >= lIIIIIIIlllllll;
    }
    
    static {
        lIlIl();
        IlIIl();
    }
    
    private static boolean IllIl(final Object IlllllllIllllll, final Object lIllllllIllllll) {
        return IlllllllIllllll == lIllllllIllllll;
    }
    
    private static void lIlIl() {
        (lIIl = new int[4])[0] = ((0x5C ^ 0x44) & ~(0x1 ^ 0x19));
        BoyFarmerListener.lIIl[1] = (0x6A ^ 0x7E);
        BoyFarmerListener.lIIl[2] = " ".length();
        BoyFarmerListener.lIIl[3] = "  ".length();
    }
}
