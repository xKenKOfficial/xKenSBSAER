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

public class SandFarmerListener implements Listener
{
    private static final /* synthetic */ int[] IIll;
    private static final /* synthetic */ String[] IIIl;
    
    private static void IIlIl() {
        (IIIl = new String[SandFarmerListener.IIll[2]])[SandFarmerListener.IIll[0]] = llIIl("FDsmCBUFEz8ICyl0GAwIPhwqHws/KA==", "ZZKmf");
    }
    
    private static String llIIl(String llIllIIllIlllll, final String IlIllIIllIlllll) {
        llIllIIllIlllll = new String(Base64.getDecoder().decode(llIllIIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllllIIllIlllll = new StringBuilder();
        final char[] lIlllIIllIlllll = IlIllIIllIlllll.toCharArray();
        int IIlllIIllIlllll = SandFarmerListener.IIll[0];
        final int IllIlIIllIlllll = (Object)llIllIIllIlllll.toCharArray();
        final byte lIlIlIIllIlllll = (byte)IllIlIIllIlllll.length;
        short IIlIlIIllIlllll = (short)SandFarmerListener.IIll[0];
        while (IIlIIl(IIlIlIIllIlllll, lIlIlIIllIlllll)) {
            final char lIIIIlIllIlllll = IllIlIIllIlllll[IIlIlIIllIlllll];
            IllllIIllIlllll.append((char)(lIIIIlIllIlllll ^ lIlllIIllIlllll[IIlllIIllIlllll % lIlllIIllIlllll.length]));
            "".length();
            ++IIlllIIllIlllll;
            ++IIlIlIIllIlllll;
            "".length();
            if ((0xF ^ 0xB) < ((0xBD ^ 0x91) & ~(0x37 ^ 0x1B))) {
                return null;
            }
        }
        return String.valueOf(IllllIIllIlllll);
    }
    
    private static boolean llIIIl(final int IIIIlIIllIlllll, final int llllIIIllIlllll) {
        return IIIIlIIllIlllll >= llllIIIllIlllll;
    }
    
    private static boolean lIIIIl(final Object IIIlIIIllIlllll, final Object lllIIIIllIlllll) {
        return IIIlIIIllIlllll == lllIIIIllIlllll;
    }
    
    private static boolean IIlIIl(final int IIllIIIllIlllll, final int llIlIIIllIlllll) {
        return IIllIIIllIlllll < llIlIIIllIlllll;
    }
    
    private static boolean IlIIIl(final int lIlIIIIllIlllll) {
        return lIlIIIIllIlllll != 0;
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlace(final BlockPlaceEvent IIIlllIllIlllll) {
        final String lllIllIllIlllll = Main.getPlugin().getConfig().getString(SandFarmerListener.IIIl[SandFarmerListener.IIll[0]]);
        final Player IllIllIllIlllll = IIIlllIllIlllll.getPlayer();
        final Block lIlIllIllIlllll = IIIlllIllIlllll.getBlock();
        final ItemStack IIlIllIllIlllll = IIIlllIllIlllll.getPlayer().getItemInHand();
        final ItemMeta llIIllIllIlllll = IIlIllIllIlllll.getItemMeta();
        if (lIIIIl(IIlIllIllIlllll.getType(), Material.SAND) && IlIIIl(llIIllIllIlllll.getDisplayName().contains(ChatUtil.fixColor(lllIllIllIlllll)) ? 1 : 0)) {
            int IlIlllIllIlllll = lIlIllIllIlllll.getY();
            while (llIIIl(IlIlllIllIlllll, SandFarmerListener.IIll[1])) {
                final Location llIlllIllIlllll = new Location(IllIllIllIlllll.getLocation().getWorld(), (double)lIlIllIllIlllll.getX(), (double)IlIlllIllIlllll, (double)lIlIllIllIlllll.getZ());
                llIlllIllIlllll.getBlock().setType(Material.SAND);
                --IlIlllIllIlllll;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
        }
    }
    
    static {
        IIIIIl();
        IIlIl();
    }
    
    private static void IIIIIl() {
        (IIll = new int[3])[0] = ((0x6E ^ 0x27 ^ (0xE9 ^ 0x89)) & (4 + 125 - 21 + 126 ^ 60 + 153 - 91 + 73 ^ -" ".length()));
        SandFarmerListener.IIll[1] = (0x6 ^ 0x2C ^ (0x7A ^ 0x44));
        SandFarmerListener.IIll[2] = " ".length();
    }
}
