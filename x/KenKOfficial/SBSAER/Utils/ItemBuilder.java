package x.KenKOfficial.SBSAER.Utils;

import org.bukkit.enchantments.*;
import org.bukkit.potion.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.inventory.meta.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ItemBuilder
{
    private /* synthetic */ Material mat;
    private /* synthetic */ String title;
    private final /* synthetic */ HashMap<Enchantment, Integer> enchants;
    private static final /* synthetic */ int[] IlIIl;
    private /* synthetic */ Potion potion;
    private final /* synthetic */ List<String> lore;
    private final /* synthetic */ short data;
    private /* synthetic */ int amount;
    private /* synthetic */ Color color;
    private static final /* synthetic */ String[] lIIIl;
    
    static {
        llllIl();
        IlllIl();
    }
    
    public ItemBuilder(final Material lIIIIlIIlIlllll, final int IIIIIlIIlIlllll, final short lllllIIIlIlllll) {
        this.title = null;
        this.lore = new ArrayList<String>();
        this.enchants = new HashMap<Enchantment, Integer>();
        this.mat = lIIIIlIIlIlllll;
        this.amount = IIIIIlIIlIlllll;
        this.data = lllllIIIlIlllll;
    }
    
    public boolean isItem(final ItemStack llIIllIlIIlllll) {
        return this.isItem(llIIllIlIIlllll, (boolean)(ItemBuilder.IlIIl[1] != 0));
    }
    
    public ItemStack build() {
        Material IllIIlllIIlllll = this.mat;
        if (llIIll(IllIIlllIIlllll)) {
            IllIIlllIIlllll = Material.AIR;
            Bukkit.getLogger().warning(ItemBuilder.lIIIl[ItemBuilder.IlIIl[2]]);
        }
        final ItemStack lIlIIlllIIlllll = new ItemStack(this.mat, this.amount, this.data);
        final ItemMeta IIlIIlllIIlllll = lIlIIlllIIlllll.getItemMeta();
        if (IIlIll(this.title)) {
            IIlIIlllIIlllll.setDisplayName(this.title);
        }
        if (lIIIll(this.lore.isEmpty() ? 1 : 0)) {
            IIlIIlllIIlllll.setLore((List)this.lore);
        }
        if (IIIIll((IIlIIlllIIlllll instanceof LeatherArmorMeta) ? 1 : 0)) {
            ((LeatherArmorMeta)IIlIIlllIIlllll).setColor(this.color);
        }
        lIlIIlllIIlllll.setItemMeta(IIlIIlllIIlllll);
        "".length();
        lIlIIlllIIlllll.addUnsafeEnchantments((Map)this.enchants);
        if (IIlIll(this.potion)) {
            this.potion.apply(lIlIIlllIIlllll);
        }
        return lIlIIlllIIlllll;
    }
    
    private static void llllIl() {
        (IlIIl = new int[4])[0] = " ".length();
        ItemBuilder.IlIIl[1] = ((0xC6 ^ 0x98) & ~(0xD7 ^ 0x89));
        ItemBuilder.IlIIl[2] = "  ".length();
        ItemBuilder.IlIIl[3] = "   ".length();
    }
    
    public ItemBuilder setType(final Material llIllIIIlIlllll) {
        this.mat = llIllIIIlIlllll;
        return this;
    }
    
    public ItemBuilder setAmount(final int IIllIlllIIlllll) {
        this.amount = IIllIlllIIlllll;
        return this;
    }
    
    public HashMap<Enchantment, Integer> getAllEnchantments() {
        return this.enchants;
    }
    
    private static boolean IIlIll(final Object lIIIlllIIIlllll) {
        return lIIIlllIIIlllll != null;
    }
    
    public ItemBuilder setColor(final Color IIIlllllIIlllll) {
        if (lIIIll(this.mat.name().contains(ItemBuilder.lIIIl[ItemBuilder.IlIIl[1]]) ? 1 : 0)) {
            throw new IllegalArgumentException(ItemBuilder.lIIIl[ItemBuilder.IlIIl[0]]);
        }
        this.color = IIIlllllIIlllll;
        return this;
    }
    
    public List<String> getLore() {
        return this.lore;
    }
    
    public boolean isItem(final ItemStack IllIIlIlIIlllll, final boolean lIIlIlIlIIlllll) {
        final ItemMeta IIIlIlIlIIlllll = IllIIlIlIIlllll.getItemMeta();
        if (IlIIll(IllIIlIlIIlllll.getType(), this.getType())) {
            return ItemBuilder.IlIIl[1] != 0;
        }
        if (lIIIll(IIIlIlIlIIlllll.hasDisplayName() ? 1 : 0) && IIlIll(this.getTitle())) {
            return ItemBuilder.IlIIl[1] != 0;
        }
        if (lIIIll(IIIlIlIlIIlllll.getDisplayName().equals(this.getTitle()) ? 1 : 0)) {
            return ItemBuilder.IlIIl[1] != 0;
        }
        if (lIIIll(IIIlIlIlIIlllll.hasLore() ? 1 : 0) && lIIIll(this.getLore().isEmpty() ? 1 : 0)) {
            return ItemBuilder.IlIIl[1] != 0;
        }
        if (IIIIll(IIIlIlIlIIlllll.hasLore() ? 1 : 0)) {
            final long IIlIIlIlIIlllll = (long)IIIlIlIlIIlllll.getLore().iterator();
            while (IIIIll(((Iterator)IIlIIlIlIIlllll).hasNext() ? 1 : 0)) {
                final String lIllIlIlIIlllll = ((Iterator<String>)IIlIIlIlIIlllll).next();
                if (lIIIll(this.getLore().contains(lIllIlIlIIlllll) ? 1 : 0)) {
                    return ItemBuilder.IlIIl[1] != 0;
                }
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((0x1A ^ 0xE ^ (0x64 ^ 0x4F)) & (0x3F ^ 0x69 ^ (0x35 ^ 0x5C) ^ -" ".length())) != 0x0;
                }
            }
        }
        final long IIlIIlIlIIlllll = (long)IllIIlIlIIlllll.getEnchantments().keySet().iterator();
        while (IIIIll(((Iterator)IIlIIlIlIIlllll).hasNext() ? 1 : 0)) {
            final Enchantment IIllIlIlIIlllll = ((Iterator<Enchantment>)IIlIIlIlIIlllll).next();
            if (lIIIll(this.hasEnchantment(IIllIlIlIIlllll) ? 1 : 0)) {
                return ItemBuilder.IlIIl[1] != 0;
            }
            "".length();
            if (" ".length() >= (0xC4 ^ 0x94 ^ (0xD8 ^ 0x8C))) {
                return ((143 + 86 - 226 + 188 ^ 108 + 51 - 115 + 101) & (0xB ^ 0x53 ^ (0x6A ^ 0x1C) ^ -" ".length())) != 0x0;
            }
        }
        return ItemBuilder.IlIIl[0] != 0;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return this.clone1();
    }
    
    public ItemBuilder setTitle(final String lIlIlIIIlIlllll) {
        this.title = lIlIlIIIlIlllll;
        return this;
    }
    
    public boolean hasEnchantment(final Enchantment IlIIIIllIIlllll) {
        return this.enchants.containsKey(IlIIIIllIIlllll);
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getEnchantmentLevel(final Enchantment IIllllIlIIlllll) {
        return this.enchants.get(IIllllIlIIlllll);
    }
    
    public ItemBuilder addLore(final String lllIIIIIlIlllll) {
        this.lore.add(lllIIIIIlIlllll);
        "".length();
        return this;
    }
    
    private static boolean IlIIll(final Object IIlIlllIIIlllll, final Object llIIlllIIIlllll) {
        return IIlIlllIIIlllll != llIIlllIIIlllll;
    }
    
    public ItemBuilder addLores(final List<String> lIllIIIIlIlllll) {
        this.lore.addAll(lIllIIIIlIlllll);
        "".length();
        return this;
    }
    
    public ItemBuilder addEnchantment(final Enchantment llllllllIIlllll, final int lIIIIIIIlIlllll) {
        if (IIIIll(this.enchants.containsKey(llllllllIIlllll) ? 1 : 0)) {
            this.enchants.remove(llllllllIIlllll);
            "".length();
        }
        this.enchants.put(llllllllIIlllll, lIIIIIIIlIlllll);
        "".length();
        return this;
    }
    
    public ItemBuilder(final Material IIllIlIIlIlllll, final short IlllIlIIlIlllll) {
        this(IIllIlIIlIlllll, ItemBuilder.IlIIl[0], IlllIlIIlIlllll);
    }
    
    private static boolean IIIIll(final int lIllIllIIIlllll) {
        return lIllIllIIIlllll != 0;
    }
    
    private static boolean lIIIll(final int llIlIllIIIlllll) {
        return llIlIllIIIlllll == 0;
    }
    
    private static String IIllIl(String IIIIlIIlIIlllll, final String llllIIIlIIlllll) {
        IIIIlIIlIIlllll = (double)new String(Base64.getDecoder().decode(((String)IIIIlIIlIIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIIlIIlIIlllll = new StringBuilder();
        final char[] IlIIlIIlIIlllll = llllIIIlIIlllll.toCharArray();
        int lIIIlIIlIIlllll = ItemBuilder.IlIIl[1];
        final int llIlIIIlIIlllll = (Object)((String)IIIIlIIlIIlllll).toCharArray();
        final Exception IlIlIIIlIIlllll = (Exception)llIlIIIlIIlllll.length;
        String lIIlIIIlIIlllll = (String)ItemBuilder.IlIIl[1];
        while (lIlIll((int)lIIlIIIlIIlllll, (int)IlIlIIIlIIlllll)) {
            final char IllIlIIlIIlllll = llIlIIIlIIlllll[lIIlIIIlIIlllll];
            llIIlIIlIIlllll.append((char)(IllIlIIlIIlllll ^ IlIIlIIlIIlllll[lIIIlIIlIIlllll % IlIIlIIlIIlllll.length]));
            "".length();
            ++lIIIlIIlIIlllll;
            ++lIIlIIIlIIlllll;
            "".length();
            if ((0xA8 ^ 0x91 ^ (0xA8 ^ 0x94)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llIIlIIlIIlllll);
    }
    
    public ItemBuilder setPotion(final Potion IlIIllllIIlllll) {
        if (IlIIll(this.mat, Material.POTION)) {
            this.mat = Material.POTION;
        }
        this.potion = IlIIllllIIlllll;
        return this;
    }
    
    private static boolean llIIll(final Object llllIllIIIlllll) {
        return llllIllIIIlllll == null;
    }
    
    public ItemBuilder(final Material llllllIIlIlllll) {
        this(llllllIIlIlllll, ItemBuilder.IlIIl[0]);
    }
    
    private static boolean lIlIll(final int IIIllllIIIlllll, final int lllIlllIIIlllll) {
        return IIIllllIIIlllll < lllIlllIIIlllll;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public ItemBuilder(final Material lIlIllIIlIlllll, final int IIlIllIIlIlllll) {
        this(lIlIllIIlIlllll, IIlIllIIlIlllll, (short)ItemBuilder.IlIIl[1]);
    }
    
    public Material getType() {
        return this.mat;
    }
    
    private static String lIllIl(final String IIIIIIIlIIlllll, final String lIlllllIIIlllll) {
        try {
            final SecretKeySpec llIIIIIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIIIIlIIlllll = Cipher.getInstance("Blowfish");
            IlIIIIIlIIlllll.init(ItemBuilder.IlIIl[2], llIIIIIlIIlllll);
            return new String(IlIIIIIlIIlllll.doFinal(Base64.getDecoder().decode(IIIIIIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIlIIlllll) {
            lIIIIIIlIIlllll.printStackTrace();
            return null;
        }
    }
    
    public ItemBuilder clone1() {
        final ItemBuilder IIIllIllIIlllll = new ItemBuilder(this.mat);
        IIIllIllIIlllll.setTitle(this.title);
        "".length();
        Exception lIlIlIllIIlllll = (Exception)this.lore.iterator();
        while (IIIIll(((Iterator)lIlIlIllIIlllll).hasNext() ? 1 : 0)) {
            final String llIllIllIIlllll = ((Iterator<String>)lIlIlIllIIlllll).next();
            IIIllIllIIlllll.addLore(llIllIllIIlllll);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        lIlIlIllIIlllll = (Exception)this.enchants.entrySet().iterator();
        while (IIIIll(((Iterator)lIlIlIllIIlllll).hasNext() ? 1 : 0)) {
            final Map.Entry<Enchantment, Integer> IlIllIllIIlllll = ((Iterator<Map.Entry<Enchantment, Integer>>)lIlIlIllIIlllll).next();
            IIIllIllIIlllll.addEnchantment(IlIllIllIIlllll.getKey(), IlIllIllIIlllll.getValue());
            "".length();
            "".length();
            if (-(0xD7 ^ 0xA7 ^ (0x7 ^ 0x73)) >= 0) {
                return null;
            }
        }
        IIIllIllIIlllll.setColor(this.color);
        "".length();
        IIIllIllIIlllll.potion = this.potion;
        return IIIllIllIIlllll;
    }
    
    private static void IlllIl() {
        (lIIIl = new String[ItemBuilder.IlIIl[3]])[ItemBuilder.IlIIl[1]] = IIllIl("JQ4KBhksGRQ=", "iKKRQ");
        ItemBuilder.lIIIl[ItemBuilder.IlIIl[0]] = IIllIl("MikhcBwfJDZwFwgtbzwWEDwnNQFRKT09HANp", "qHOPs");
        ItemBuilder.lIIIl[ItemBuilder.IlIIl[2]] = lIllIl("vkklYLmyZBCzOTNp576KJQ==", "sLNzr");
    }
}
