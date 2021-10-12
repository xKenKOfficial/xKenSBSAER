package x.KenKOfficial.SBSAER.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.SBSAER.Main.*;
import x.KenKOfficial.SBSAER.Utils.*;
import org.bukkit.enchantments.*;
import org.bukkit.event.block.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.inventory.*;
import org.bukkit.event.*;

public class RzucaneTnTListener implements Listener
{
    private static final /* synthetic */ String[] lIlIl;
    private static final /* synthetic */ int[] IllIl;
    
    private static void Illlll() {
        (lIlIl = new String[RzucaneTnTListener.IllIl[1]])[RzucaneTnTListener.IllIl[0]] = lIllll("SD3myyJhe1nCWS+iJD1MlwsPjmnZCuyO", "HDiWD");
    }
    
    private static boolean IIIIIIl(final Object IIllllllllIllll, final Object llIlllllllIllll) {
        return IIllllllllIllll != llIlllllllIllll;
    }
    
    private static boolean lIIIIIl(final Object IIIlllllllIllll, final Object lllIllllllIllll) {
        return IIIlllllllIllll == lllIllllllIllll;
    }
    
    static {
        llllll();
        Illlll();
    }
    
    private static String lIllll(final String IlIIIIIIIIlllll, final String lIIIIIIIIIlllll) {
        try {
            final SecretKeySpec lllIIIIIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIIIIIIIlllll = Cipher.getInstance("Blowfish");
            IllIIIIIIIlllll.init(RzucaneTnTListener.IllIl[3], lllIIIIIIIlllll);
            return new String(IllIIIIIIIlllll.doFinal(Base64.getDecoder().decode(IlIIIIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIIIIlllll) {
            lIlIIIIIIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void llllll() {
        (IllIl = new int[5])[0] = ((0x8F ^ 0x89) & ~(0x6A ^ 0x6C));
        RzucaneTnTListener.IllIl[1] = " ".length();
        RzucaneTnTListener.IllIl[2] = (0xAC ^ 0xBF ^ (0xBF ^ 0xA6));
        RzucaneTnTListener.IllIl[3] = "  ".length();
        RzucaneTnTListener.IllIl[4] = (131 + 31 - 77 + 52 ^ 89 + 120 - 138 + 114);
    }
    
    private static boolean IlIIIIl(final int lIlIllllllIllll) {
        return lIlIllllllIllll != 0;
    }
    
    @EventHandler
    public void onShot(final PlayerInteractEvent IIlllIIIIIlllll) {
        final String llIllIIIIIlllll = Main.getPlugin().getConfig().getString(RzucaneTnTListener.lIlIl[RzucaneTnTListener.IllIl[0]]);
        final Player IlIllIIIIIlllll = IIlllIIIIIlllll.getPlayer();
        final Action lIIllIIIIIlllll = IIlllIIIIIlllll.getAction();
        final Location IIIllIIIIIlllll = IlIllIIIIIlllll.getLocation();
        final ItemStack lllIlIIIIIlllll = IIlllIIIIIlllll.getPlayer().getItemInHand();
        final ItemMeta IllIlIIIIIlllll = lllIlIIIIIlllll.getItemMeta();
        final ItemBuilder lIlIlIIIIIlllll = new ItemBuilder(Material.TNT, RzucaneTnTListener.IllIl[1]).setTitle(ChatUtil.fixColor(llIllIIIIIlllll)).addEnchantment(Enchantment.ARROW_INFINITE, RzucaneTnTListener.IllIl[2]);
        if ((!IIIIIIl(lIIllIIIIIlllll, Action.RIGHT_CLICK_AIR) || lIIIIIl(lIIllIIIIIlllll, Action.RIGHT_CLICK_BLOCK)) && lIIIIIl(lllIlIIIIIlllll.getType(), Material.TNT) && IlIIIIl(IllIlIIIIIlllll.getDisplayName().contains(ChatUtil.fixColor(llIllIIIIIlllll)) ? 1 : 0)) {
            final TNTPrimed IllllIIIIIlllll = (TNTPrimed)IlIllIIIIIlllll.getWorld().spawn(new Location(IlIllIIIIIlllll.getWorld(), IIIllIIIIIlllll.getX(), IIIllIIIIIlllll.getY(), IIIllIIIIIlllll.getZ()), (Class)TNTPrimed.class);
            IllllIIIIIlllll.setVelocity(IlIllIIIIIlllll.getLocation().getDirection().multiply(RzucaneTnTListener.IllIl[3]));
            IllllIIIIIlllll.setFuseTicks(RzucaneTnTListener.IllIl[4]);
            final PlayerInventory inventory = IlIllIIIIIlllll.getInventory();
            final ItemStack[] array = new ItemStack[RzucaneTnTListener.IllIl[1]];
            array[RzucaneTnTListener.IllIl[0]] = lIlIlIIIIIlllll.build();
            inventory.removeItem(array);
            "".length();
        }
    }
}
