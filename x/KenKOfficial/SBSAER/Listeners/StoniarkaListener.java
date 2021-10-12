package x.KenKOfficial.SBSAER.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.*;
import x.KenKOfficial.SBSAER.Main.*;
import org.bukkit.block.*;
import org.bukkit.plugin.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import x.KenKOfficial.SBSAER.Utils.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;

public class StoniarkaListener implements Listener
{
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String[] I;
    
    private static void Il() {
        (I = new String[StoniarkaListener.l[1]])[StoniarkaListener.l[0]] = I("9Pw0wV5vQxKJTSfA47mLjAHAHgGOoo4EtZKsMLMbKXE=", "MTHjS");
    }
    
    private static String I(final String lIIlIIlllllllll, final String IIIlIIlllllllll) {
        try {
            final SecretKeySpec IlllIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIllIIlllllllll = Cipher.getInstance("Blowfish");
            lIllIIlllllllll.init(StoniarkaListener.l[2], IlllIIlllllllll);
            return new String(lIllIIlllllllll.doFinal(Base64.getDecoder().decode(lIIlIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIIlllllllll) {
            IIllIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IIl();
        Il();
    }
    
    private static boolean lIl(final Object llIIIIlllllllll, final Object IlIIIIlllllllll) {
        return llIIIIlllllllll == IlIIIIlllllllll;
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBreak(final BlockBreakEvent IllIlIlllllllll) {
        final Block IlIllIlllllllll = IllIlIlllllllll.getBlock();
        final Location lIIllIlllllllll = IlIllIlllllllll.getLocation();
        final Location IIIllIlllllllll = new Location(lIIllIlllllllll.getWorld(), lIIllIlllllllll.getX(), lIIllIlllllllll.getY() - 1.0, lIIllIlllllllll.getZ());
        if (lIl(IlIllIlllllllll.getType(), Material.STONE)) {
            Bukkit.getScheduler().runTaskLater((Plugin)Main.getPlugin(), (Runnable)new Runnable() {
                private static boolean lllll(final Object IIIlIIlllIlllll, final Object lllIIIlllIlllll) {
                    return IIIlIIlllIlllll == lllIIIlllIlllll;
                }
                
                @Override
                public void run() {
                    if (lllll(IIIllIlllllllll.getBlock().getType(), Material.COAL_ORE)) {
                        IlIllIlllllllll.setType(Material.STONE);
                    }
                }
            }, 20L);
            "".length();
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlace(final BlockPlaceEvent IlIIlllllllllll) {
        final String lIIIlllllllllll = Main.getPlugin().getConfig().getString(StoniarkaListener.I[StoniarkaListener.l[0]]);
        final Block IIIIlllllllllll = IlIIlllllllllll.getBlock();
        final ItemStack llllIllllllllll = IlIIlllllllllll.getPlayer().getItemInHand();
        final ItemMeta IlllIllllllllll = llllIllllllllll.getItemMeta();
        final int lIllIllllllllll = StoniarkaListener.l[1];
        final Location IIllIllllllllll = IIIIlllllllllll.getLocation();
        final Location llIlIllllllllll = new Location(IIllIllllllllll.getWorld(), IIllIllllllllll.getX(), IIllIllllllllll.getY() + 1.0, IIllIllllllllll.getZ());
        if (lIl(llllIllllllllll.getType(), Material.COAL_ORE) && lIl(llIlIllllllllll.getBlock().getType(), Material.AIR) && Ill(IlllIllllllllll.getDisplayName().contains(ChatUtil.fixColor(lIIIlllllllllll)) ? 1 : 0)) {
            Bukkit.getScheduler().runTaskLater((Plugin)Main.getPlugin(), (Runnable)new Runnable() {
                @Override
                public void run() {
                    if (IlIl(IIllIllllllllll.getBlock().getType(), Material.COAL_ORE)) {
                        llIlIllllllllll.getBlock().setType(Material.STONE);
                    }
                }
                
                private static boolean IlIl(final Object llIlIllIlllllll, final Object IlIlIllIlllllll) {
                    return llIlIllIlllllll == IlIlIllIlllllll;
                }
            }, 20L);
            "".length();
        }
    }
    
    private static boolean Ill(final int IIIIIIlllllllll) {
        return IIIIIIlllllllll != 0;
    }
    
    private static void IIl() {
        (l = new int[3])[0] = ((0xDD ^ 0x8B) & ~(0x4D ^ 0x1B));
        StoniarkaListener.l[1] = " ".length();
        StoniarkaListener.l[2] = "  ".length();
    }
}
