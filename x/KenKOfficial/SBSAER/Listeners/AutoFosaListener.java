package x.KenKOfficial.SBSAER.Listeners;

import java.util.*;
import java.nio.charset.*;
import org.bukkit.event.block.*;
import x.KenKOfficial.SBSAER.Main.*;
import x.KenKOfficial.SBSAER.Utils.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.event.*;

public class AutoFosaListener implements Listener
{
    private static final /* synthetic */ int[] IIlIl;
    private static final /* synthetic */ String[] llIIl;
    
    private static void IIIlll() {
        (IIlIl = new int[2])[0] = ((0x93 ^ 0xB5) & ~(0x86 ^ 0xA0));
        AutoFosaListener.IIlIl[1] = " ".length();
    }
    
    private static boolean lIIlll(final Object IIIIllIIIIlllll, final Object llllIlIIIIlllll) {
        return IIIIllIIIIlllll == llllIlIIIIlllll;
    }
    
    private static boolean IIllll(final int IIlIllIIIIlllll, final int llIIllIIIIlllll) {
        return IIlIllIIIIlllll < llIIllIIIIlllll;
    }
    
    private static String IllIll(String llllllIIIIlllll, final String llIIIIlIIIlllll) {
        llllllIIIIlllll = (char)new String(Base64.getDecoder().decode(((String)llllllIIIIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIIIlIIIlllll = new StringBuilder();
        final char[] lIIIIIlIIIlllll = llIIIIlIIIlllll.toCharArray();
        int IIIIIIlIIIlllll = AutoFosaListener.IIlIl[0];
        final long IlIlllIIIIlllll = (Object)((String)llllllIIIIlllll).toCharArray();
        final short lIIlllIIIIlllll = (short)IlIlllIIIIlllll.length;
        float IIIlllIIIIlllll = AutoFosaListener.IIlIl[0];
        while (IIllll((int)IIIlllIIIIlllll, lIIlllIIIIlllll)) {
            final char lIlIIIlIIIlllll = IlIlllIIIIlllll[IIIlllIIIIlllll];
            IlIIIIlIIIlllll.append((char)(lIlIIIlIIIlllll ^ lIIIIIlIIIlllll[IIIIIIlIIIlllll % lIIIIIlIIIlllll.length]));
            "".length();
            ++IIIIIIlIIIlllll;
            ++IIIlllIIIIlllll;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(IlIIIIlIIIlllll);
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlace(final BlockPlaceEvent IllIlIlIIIlllll) {
        final String llIllIlIIIlllll = Main.getPlugin().getConfig().getString(AutoFosaListener.llIIl[AutoFosaListener.IIlIl[0]]);
        final Player IlIllIlIIIlllll = IllIlIlIIIlllll.getPlayer();
        final Block lIIllIlIIIlllll = IllIlIlIIIlllll.getBlock();
        final ItemStack IIIllIlIIIlllll = IllIlIlIIIlllll.getPlayer().getItemInHand();
        final ItemMeta lllIlIlIIIlllll = IIIllIlIIIlllll.getItemMeta();
        if (lIIlll(IIIllIlIIIlllll.getType(), Material.STONE) && IlIlll(lllIlIlIIIlllll.getDisplayName().contains(ChatUtil.fixColor(llIllIlIIIlllll)) ? 1 : 0)) {
            int IllllIlIIIlllll = lIIllIlIIIlllll.getY();
            while (llIlll(IllllIlIIIlllll)) {
                final Location lllllIlIIIlllll = new Location(IlIllIlIIIlllll.getLocation().getWorld(), (double)lIIllIlIIIlllll.getX(), (double)IllllIlIIIlllll, (double)lIIllIlIIIlllll.getZ());
                lllllIlIIIlllll.getBlock().setType(Material.AIR);
                --IllllIlIIIlllll;
                "".length();
                if ((0x4D ^ 0x29 ^ (0x26 ^ 0x47)) == 0x0) {
                    return;
                }
            }
        }
    }
    
    private static boolean IlIlll(final int lIllIlIIIIlllll) {
        return lIllIlIIIIlllll != 0;
    }
    
    private static boolean llIlll(final int llIlIlIIIIlllll) {
        return llIlIlIIIIlllll > 0;
    }
    
    static {
        IIIlll();
        lllIll();
    }
    
    private static void lllIll() {
        (llIIl = new String[AutoFosaListener.IIlIl[1]])[AutoFosaListener.IIlIl[0]] = IllIll("GgcDKCMLLxooPSdILzgkOyABPjE=", "TfnMP");
    }
}
