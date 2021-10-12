package x.KenKOfficial.SBSAER.Recipes;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import x.KenKOfficial.SBSAER.Main.*;
import org.bukkit.*;
import x.KenKOfficial.SBSAER.Utils.*;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.enchantments.*;

public class Recipe
{
    private static final /* synthetic */ int[] llIl;
    private static final /* synthetic */ String[] IlIl;
    
    private static String lIIll(final String lllllIlllIlllll, final String IllllIlllIlllll) {
        try {
            final SecretKeySpec IIlIIllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllllIlllIlllll.getBytes(StandardCharsets.UTF_8)), Recipe.llIl[8]), "DES");
            final Cipher llIIIllllIlllll = Cipher.getInstance("DES");
            llIIIllllIlllll.init(Recipe.llIl[2], IIlIIllllIlllll);
            return new String(llIIIllllIlllll.doFinal(Base64.getDecoder().decode(lllllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIllllIlllll) {
            IlIIIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlll() {
        (llIl = new int[79])[0] = ((0x1 ^ 0x6D ^ (0x57 ^ 0x10)) & (0x6C ^ 0x14 ^ (0x6C ^ 0x3F) ^ -" ".length()));
        Recipe.llIl[1] = " ".length();
        Recipe.llIl[2] = "  ".length();
        Recipe.llIl[3] = "   ".length();
        Recipe.llIl[4] = (0x36 ^ 0x4D ^ 50 + 38 - 35 + 74);
        Recipe.llIl[5] = (29 + 58 - 2 + 53 ^ 136 + 90 - 195 + 112);
        Recipe.llIl[6] = (111 + 97 - 185 + 105 ^ 3 + 25 + 58 + 48);
        Recipe.llIl[7] = (0x80 ^ 0xA7 ^ (0xB8 ^ 0x98));
        Recipe.llIl[8] = (0x2E ^ 0x14 ^ (0x1A ^ 0x28));
        Recipe.llIl[9] = (0x8 ^ 0x1);
        Recipe.llIl[10] = (31 + 73 + 20 + 26 ^ 41 + 40 - 41 + 116);
        Recipe.llIl[11] = (0x9 ^ 0x2);
        Recipe.llIl[12] = (0x6E ^ 0x62);
        Recipe.llIl[13] = (0x20 ^ 0x12 ^ "  ".length());
        Recipe.llIl[14] = (0x14 ^ 0x58 ^ (0x64 ^ 0x19));
        Recipe.llIl[15] = (0x2D ^ 0x1F);
        Recipe.llIl[16] = (77 + 5 + 129 + 30 ^ 174 + 44 - 148 + 124);
        Recipe.llIl[17] = (53 + 154 - 66 + 21 ^ 149 + 95 - 111 + 17);
        Recipe.llIl[18] = (18 + 9 + 33 + 86 ^ 94 + 133 - 172 + 112);
        Recipe.llIl[19] = (0x4B ^ 0x7D);
        Recipe.llIl[20] = (0x93 ^ 0xA4);
        Recipe.llIl[21] = (0x37 ^ 0xF);
        Recipe.llIl[22] = (0x82 ^ 0x8F);
        Recipe.llIl[23] = (0x50 ^ 0x5E);
        Recipe.llIl[24] = (0x2B ^ 0x24);
        Recipe.llIl[25] = (0x2A ^ 0x40 ^ (0xFA ^ 0x80));
        Recipe.llIl[26] = (0x11 ^ 0x0);
        Recipe.llIl[27] = (0x78 ^ 0x6A);
        Recipe.llIl[28] = (0x34 ^ 0x27);
        Recipe.llIl[29] = (0xB6 ^ 0xA2);
        Recipe.llIl[30] = (0xA7 ^ 0xB2);
        Recipe.llIl[31] = (0x5B ^ 0x4D);
        Recipe.llIl[32] = (24 + 61 + 66 + 33 ^ 144 + 119 - 244 + 156);
        Recipe.llIl[33] = (0xE9 ^ 0x8F ^ (0x5 ^ 0x7B));
        Recipe.llIl[34] = (0xA0 ^ 0xB9);
        Recipe.llIl[35] = (0x74 ^ 0x6E);
        Recipe.llIl[36] = (0x3B ^ 0x20);
        Recipe.llIl[37] = (0x65 ^ 0x1F ^ (0xE7 ^ 0x81));
        Recipe.llIl[38] = (0x97 ^ 0x8A);
        Recipe.llIl[39] = (0x2E ^ 0x4 ^ (0x9 ^ 0x3D));
        Recipe.llIl[40] = (0x6A ^ 0x75);
        Recipe.llIl[41] = (0x9A ^ 0xBA);
        Recipe.llIl[42] = (0xB2 ^ 0xA7 ^ (0x43 ^ 0x77));
        Recipe.llIl[43] = (0xDE ^ 0x85 ^ (0xF7 ^ 0x8E));
        Recipe.llIl[44] = (0xDF ^ 0xC6 ^ (0x77 ^ 0x4D));
        Recipe.llIl[45] = (0x73 ^ 0x57);
        Recipe.llIl[46] = (0xA2 ^ 0x87);
        Recipe.llIl[47] = (0x32 ^ 0x14);
        Recipe.llIl[48] = ("   ".length() ^ (0x2F ^ 0xB));
        Recipe.llIl[49] = (0x51 ^ 0x79);
        Recipe.llIl[50] = (0xA3 ^ 0x99 ^ (0x3E ^ 0x2D));
        Recipe.llIl[51] = (0x6F ^ 0x45);
        Recipe.llIl[52] = (66 + 157 - 156 + 96 ^ 131 + 66 - 163 + 102);
        Recipe.llIl[53] = (0xB7 ^ 0x9B);
        Recipe.llIl[54] = (0xC9 ^ 0xC1 ^ (0x5D ^ 0x78));
        Recipe.llIl[55] = (0xA6 ^ 0x88);
        Recipe.llIl[56] = (0xB6 ^ 0x9C ^ (0x6E ^ 0x6B));
        Recipe.llIl[57] = (0x94 ^ 0xAD);
        Recipe.llIl[58] = (0x8C ^ 0xB6);
        Recipe.llIl[59] = (0xA0 ^ 0x9B);
        Recipe.llIl[60] = (0xA ^ 0x36);
        Recipe.llIl[61] = (0x9F ^ 0xB1 ^ (0x4C ^ 0x5F));
        Recipe.llIl[62] = (0x2D ^ 0x13);
        Recipe.llIl[63] = (88 + 136 - 199 + 149 ^ 114 + 106 - 137 + 62);
        Recipe.llIl[64] = (0x5F ^ 0x6D ^ (0x35 ^ 0x47));
        Recipe.llIl[65] = (54 + 55 - 100 + 205 ^ 137 + 0 - 98 + 112);
        Recipe.llIl[66] = (0xF ^ 0x18 ^ (0xD6 ^ 0x83));
        Recipe.llIl[67] = (0x72 ^ 0x3B ^ (0x9B ^ 0x91));
        Recipe.llIl[68] = (0x5C ^ 0x6A ^ (0xEA ^ 0x98));
        Recipe.llIl[69] = (0x62 ^ 0x27);
        Recipe.llIl[70] = (0xC3 ^ 0x87 ^ "  ".length());
        Recipe.llIl[71] = (0x40 ^ 0x68 ^ (0xF2 ^ 0x9D));
        Recipe.llIl[72] = (0x72 ^ 0x9 ^ (0x84 ^ 0xB7));
        Recipe.llIl[73] = (0x6D ^ 0x24);
        Recipe.llIl[74] = (141 + 66 - 141 + 169 ^ 105 + 69 - 50 + 37);
        Recipe.llIl[75] = (0x7A ^ 0x31);
        Recipe.llIl[76] = (0xFF ^ 0x8C ^ (0x1E ^ 0x21));
        Recipe.llIl[77] = (0xDA ^ 0x97);
        Recipe.llIl[78] = (((0x57 ^ 0x5F) & ~(0x65 ^ 0x6D)) ^ (0xCE ^ 0x80));
    }
    
    public static void setBoyFarmer() {
        final String llIIIIllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[22]]);
        final String IlIIIIllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[23]]);
        final String lIIIIIllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[24]]);
        final String IIIIIIllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[25]]);
        final String llllllIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[26]]);
        final String IlllllIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[27]]);
        final String lIllllIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[28]]);
        final String IIllllIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[29]]);
        final String llIlllIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[30]]);
        final String IlIlllIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[31]]);
        final ItemStack lIIlllIlIllllll = new ItemStack(Material.OBSIDIAN, Recipe.llIl[1]);
        final ItemMeta IIIlllIlIllllll = lIIlllIlIllllll.getItemMeta();
        IIIlllIlIllllll.setDisplayName(ChatUtil.fixColor(llIIIIllIllllll));
        lIIlllIlIllllll.setItemMeta(IIIlllIlIllllll);
        "".length();
        final ShapedRecipe shapedRecipe;
        final ShapedRecipe lllIllIlIllllll = shapedRecipe = new ShapedRecipe(lIIlllIlIllllll);
        final String[] array = new String[Recipe.llIl[3]];
        array[Recipe.llIl[0]] = Recipe.IlIl[Recipe.llIl[32]];
        array[Recipe.llIl[1]] = Recipe.IlIl[Recipe.llIl[33]];
        array[Recipe.llIl[2]] = Recipe.IlIl[Recipe.llIl[34]];
        shapedRecipe.shape(array);
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[13], Material.valueOf(IlIIIIllIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[14], Material.valueOf(lIIIIIllIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[15], Material.valueOf(IIIIIIllIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[16], Material.valueOf(llllllIlIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[17], Material.valueOf(IlllllIlIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[18], Material.valueOf(lIllllIlIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[19], Material.valueOf(IIllllIlIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[20], Material.valueOf(llIlllIlIllllll));
        "".length();
        lllIllIlIllllll.setIngredient((char)Recipe.llIl[21], Material.valueOf(IlIlllIlIllllll));
        "".length();
        Main.getPlugin().getServer().addRecipe((org.bukkit.inventory.Recipe)lllIllIlIllllll);
        "".length();
    }
    
    static {
        lIlll();
        IIlll();
    }
    
    public static void setAutoFosa() {
        final String lIlIlllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[48]]);
        final String IIlIlllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[49]]);
        final String llIIlllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[50]]);
        final String IlIIlllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[51]]);
        final String lIIIlllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[52]]);
        final String IIIIlllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[53]]);
        final String llllIllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[54]]);
        final String IlllIllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[55]]);
        final String lIllIllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[56]]);
        final String IIllIllIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[13]]);
        final ItemStack llIlIllIIllllll = new ItemStack(Material.STONE, Recipe.llIl[1]);
        final ItemMeta IlIlIllIIllllll = llIlIllIIllllll.getItemMeta();
        IlIlIllIIllllll.setDisplayName(ChatUtil.fixColor(lIlIlllIIllllll));
        llIlIllIIllllll.setItemMeta(IlIlIllIIllllll);
        "".length();
        final ShapedRecipe shapedRecipe;
        final ShapedRecipe lIIlIllIIllllll = shapedRecipe = new ShapedRecipe(llIlIllIIllllll);
        final String[] array = new String[Recipe.llIl[3]];
        array[Recipe.llIl[0]] = Recipe.IlIl[Recipe.llIl[14]];
        array[Recipe.llIl[1]] = Recipe.IlIl[Recipe.llIl[15]];
        array[Recipe.llIl[2]] = Recipe.IlIl[Recipe.llIl[16]];
        shapedRecipe.shape(array);
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[13], Material.valueOf(IIlIlllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[14], Material.valueOf(llIIlllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[15], Material.valueOf(IlIIlllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[16], Material.valueOf(lIIIlllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[17], Material.valueOf(IIIIlllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[18], Material.valueOf(llllIllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[19], Material.valueOf(IlllIllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[20], Material.valueOf(lIllIllIIllllll));
        "".length();
        lIIlIllIIllllll.setIngredient((char)Recipe.llIl[21], Material.valueOf(IIllIllIIllllll));
        "".length();
        Main.getPlugin().getServer().addRecipe((org.bukkit.inventory.Recipe)lIIlIllIIllllll);
        "".length();
    }
    
    private static String llIll(final String IlllIllllIlllll, final String llIlIllllIlllll) {
        try {
            final SecretKeySpec lIIIlllllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIIlllllIlllll = Cipher.getInstance("Blowfish");
            IIIIlllllIlllll.init(Recipe.llIl[2], lIIIlllllIlllll);
            return new String(IIIIlllllIlllll.doFinal(Base64.getDecoder().decode(IlllIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllllIlllll) {
            llllIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    public static void setEnderChest() {
        final String IlllIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[17]]);
        final String lIllIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[18]]);
        final String IIllIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[19]]);
        final String llIlIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[20]]);
        final String IlIlIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[21]]);
        final String lIIlIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[57]]);
        final String IIIlIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[58]]);
        final String lllIIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[59]]);
        final String IllIIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[60]]);
        final String lIlIIIlIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[61]]);
        final ItemStack IIlIIIlIIllllll = new ItemStack(Material.ENDER_CHEST, Recipe.llIl[1]);
        final ItemMeta llIIIIlIIllllll = IIlIIIlIIllllll.getItemMeta();
        llIIIIlIIllllll.setDisplayName(ChatUtil.fixColor(IlllIIlIIllllll));
        IIlIIIlIIllllll.setItemMeta(llIIIIlIIllllll);
        "".length();
        final ShapedRecipe shapedRecipe;
        final ShapedRecipe IlIIIIlIIllllll = shapedRecipe = new ShapedRecipe(IIlIIIlIIllllll);
        final String[] array = new String[Recipe.llIl[3]];
        array[Recipe.llIl[0]] = Recipe.IlIl[Recipe.llIl[62]];
        array[Recipe.llIl[1]] = Recipe.IlIl[Recipe.llIl[63]];
        array[Recipe.llIl[2]] = Recipe.IlIl[Recipe.llIl[64]];
        shapedRecipe.shape(array);
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[13], Material.valueOf(lIllIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[14], Material.valueOf(IIllIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[15], Material.valueOf(llIlIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[16], Material.valueOf(IlIlIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[17], Material.valueOf(lIIlIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[18], Material.valueOf(IIIlIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[19], Material.valueOf(lllIIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[20], Material.valueOf(IllIIIlIIllllll));
        "".length();
        IlIIIIlIIllllll.setIngredient((char)Recipe.llIl[21], Material.valueOf(lIlIIIlIIllllll));
        "".length();
        Main.getPlugin().getServer().addRecipe((org.bukkit.inventory.Recipe)IlIIIIlIIllllll);
        "".length();
    }
    
    public static void setStoniarka() {
        final String IlIlIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[0]]);
        final String lIIlIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[1]]);
        final String IIIlIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[2]]);
        final String lllIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[3]]);
        final String IllIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[4]]);
        final String lIlIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[5]]);
        final String IIlIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[6]]);
        final String llIIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[7]]);
        final String IlIIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[8]]);
        final String lIIIIlllIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[9]]);
        final ItemStack IIIIIlllIllllll = new ItemStack(Material.COAL_ORE, Recipe.llIl[1]);
        final ItemMeta lllllIllIllllll = IIIIIlllIllllll.getItemMeta();
        lllllIllIllllll.setDisplayName(ChatUtil.fixColor(IlIlIlllIllllll));
        IIIIIlllIllllll.setItemMeta(lllllIllIllllll);
        "".length();
        final ShapedRecipe shapedRecipe;
        final ShapedRecipe IllllIllIllllll = shapedRecipe = new ShapedRecipe(IIIIIlllIllllll);
        final String[] array = new String[Recipe.llIl[3]];
        array[Recipe.llIl[0]] = Recipe.IlIl[Recipe.llIl[10]];
        array[Recipe.llIl[1]] = Recipe.IlIl[Recipe.llIl[11]];
        array[Recipe.llIl[2]] = Recipe.IlIl[Recipe.llIl[12]];
        shapedRecipe.shape(array);
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[13], Material.valueOf(lIIlIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[14], Material.valueOf(IIIlIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[15], Material.valueOf(lllIIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[16], Material.valueOf(IllIIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[17], Material.valueOf(lIlIIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[18], Material.valueOf(IIlIIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[19], Material.valueOf(llIIIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[20], Material.valueOf(IlIIIlllIllllll));
        "".length();
        IllllIllIllllll.setIngredient((char)Recipe.llIl[21], Material.valueOf(lIIIIlllIllllll));
        "".length();
        Main.getPlugin().getServer().addRecipe((org.bukkit.inventory.Recipe)IllllIllIllllll);
        "".length();
    }
    
    private static boolean Illll(final int lIIllIlllIlllll, final int IIIllIlllIlllll) {
        return lIIllIlllIlllll < IIIllIlllIlllll;
    }
    
    private static void IIlll() {
        (IlIl = new String[Recipe.llIl[78]])[Recipe.llIl[0]] = lIIll("w0cAPeELZhNxbRvVXH2kjogWn2v66sQG0UiDj2b1ITg=", "RGIya");
        Recipe.IlIl[Recipe.llIl[1]] = IlIll("EyYmAzY5OiBLESQ7KQAFNToiFyMkOzVLKyQxKkty", "PTGeB");
        Recipe.IlIl[Recipe.llIl[2]] = IlIll("Fz0bMyU9IR17AiAgFDAWMSEfJzAgIAh7OCAqF3tg", "TOzUQ");
        Recipe.IlIl[Recipe.llIl[3]] = llIll("ddBmHN5nGm7qZxkwdDpZ63qsramXCXYX50m4c3CLvOM=", "oOLlB");
        Recipe.IlIl[Recipe.llIl[4]] = IlIll("MAMsBxoaHypPPQceIwQpFh8oEw8HHj9PBwcUIE9d", "sqMan");
        Recipe.IlIl[Recipe.llIl[5]] = lIIll("GFJnlbCzZoffNgwTfVu8MxL6HdaQNDGzJog00xAt0Kk=", "Ccqow");
        Recipe.IlIl[Recipe.llIl[6]] = IlIll("FBEzHBs+DTVUPCMMPB8oMg03CA4jDCBUBiMGP1Ra", "WcRzo");
        Recipe.IlIl[Recipe.llIl[7]] = IlIll("Mx8WHAYZAxBUIQQCGR81FQMSCBMEAgVUGwQIGlRE", "pmwzr");
        Recipe.IlIl[Recipe.llIl[8]] = IlIll("CDoRNDUiJhd8Ej8nHjcGLiYVICA/JwJ8KD8tHXx2", "KHpRA");
        Recipe.IlIl[Recipe.llIl[9]] = llIll("gusAgFFRY7sjtZo3M5TOfqtIbANgWTsQMU/Fi5FsFVc=", "TVPHX");
        Recipe.IlIl[Recipe.llIl[10]] = llIll("REoTz/qX99c=", "bacMo");
        Recipe.IlIl[Recipe.llIl[11]] = lIIll("+JAnDklHK7c=", "RuMOj");
        Recipe.IlIl[Recipe.llIl[12]] = lIIll("mDNXcGRT0/I=", "FhcBc");
        Recipe.IlIl[Recipe.llIl[22]] = llIll("QE5spv1Maaf+MRq0W8BQ8hPaC1Qm2ews", "jyVIo");
        Recipe.IlIl[Recipe.llIl[23]] = lIIll("yHxj6r3JQuNLNoxMLCuqC0O6QBtQqlFyBTj3rGDMk+o=", "EUGGp");
        Recipe.IlIl[Recipe.llIl[24]] = lIIll("faI5EdUXZBaZ+u06GHI0i5I9fzkV/7xNASbUKXs7YWk=", "FIjzv");
        Recipe.IlIl[Recipe.llIl[25]] = llIll("NUNQ52ZPQ33L6n1CCYR2x7hd9jYPK/4BsWea1JRfQyE=", "WwxRM");
        Recipe.IlIl[Recipe.llIl[26]] = lIIll("rTbKDrfHn7XeJ5rWkCBoI6t1UbMEX5uXAB+9KxfvP4Y=", "MWOEN");
        Recipe.IlIl[Recipe.llIl[27]] = llIll("7JpM9Sse/p0dVQMkXGNJNEK86m4by/qVCBDP9dFBcDc=", "NIOdO");
        Recipe.IlIl[Recipe.llIl[28]] = lIIll("RJtBahdkaf3px9QI7FnK9leM0TDNAcdU3ukfQmAZ9Vw=", "ireFx");
        Recipe.IlIl[Recipe.llIl[29]] = lIIll("qIi1YzDYhsB13lPHRCYjoV/5ZznvQTX1wJ2AXBS1Y3c=", "vYhrX");
        Recipe.IlIl[Recipe.llIl[30]] = lIIll("iLnldKB5UKHLmF4shJBUv763mAlnUqweGMvbcnd5rRE=", "hoDUv");
        Recipe.IlIl[Recipe.llIl[31]] = lIIll("2a/OpW+bUeGWUInfSsrkr36LgMs70WkmYoEikOBSv5Q=", "JVOun");
        Recipe.IlIl[Recipe.llIl[32]] = llIll("9+r1IT5O8Xo=", "voxqH");
        Recipe.IlIl[Recipe.llIl[33]] = lIIll("wZP48A5mTkA=", "JPRAU");
        Recipe.IlIl[Recipe.llIl[34]] = llIll("VvpgBR6NxXg=", "nnPxl");
        Recipe.IlIl[Recipe.llIl[35]] = llIll("1uBj2raP7HdfXflM/NTjAdBAkOQb7fvX", "WVpYa");
        Recipe.IlIl[Recipe.llIl[36]] = lIIll("nQGglt1IZKOua8vtw9OdhSwJnW8NayPGdbxNBRmhHyw=", "iYAie");
        Recipe.IlIl[Recipe.llIl[37]] = llIll("ScRb345dRNuz6mLjqHAmN8jf7wD5saQZyysty4oZ0QU=", "KtuWv");
        Recipe.IlIl[Recipe.llIl[38]] = IlIll("KiQHIwwAOAFrKwg4AgMZGzsDN1YAIgMoVls=", "iVfEx");
        Recipe.IlIl[Recipe.llIl[39]] = llIll("weEZkgihY6I4VETbFsVX6eVBN4PNvWS4DvDdasiAF+g=", "tqcAd");
        Recipe.IlIl[Recipe.llIl[40]] = lIIll("jj9x5XTz4RxJD4Hyt6/1Ub/pAMjuCIIaMrxkZqlSvu4=", "frpDs");
        Recipe.IlIl[Recipe.llIl[41]] = IlIll("JQAJMRcPHA95MAccDBECFB8NJU0PBg06TVM=", "frhWc");
        Recipe.IlIl[Recipe.llIl[42]] = lIIll("NmZaVeNpfLgdoJ51KH1iDeciBphifC0ceawfrmm2QeU=", "QvXWL");
        Recipe.IlIl[Recipe.llIl[43]] = llIll("4xrN9F7YrPdyzv7JfE1Uro+swEBd64mgyoLGLnmt0WA=", "mnHnr");
        Recipe.IlIl[Recipe.llIl[44]] = IlIll("ID0bFxkKIR1fPgIhHjcMESIfA0MKOx8cQ1s=", "cOzqm");
        Recipe.IlIl[Recipe.llIl[45]] = IlIll("eVBe", "IallB");
        Recipe.IlIl[Recipe.llIl[46]] = llIll("fKp+u85GIl4=", "zuGXB");
        Recipe.IlIl[Recipe.llIl[47]] = lIIll("mqvKCj4azD4=", "jhEIt");
        Recipe.IlIl[Recipe.llIl[48]] = llIll("KisOk5nGnlu9+d5hQvCA5bGG1fcXg/tj", "MWrIx");
        Recipe.IlIl[Recipe.llIl[49]] = lIIll("wrmhC63Fvcgw6Aidnr0Sw7eouHqcC0zYc5w+eKRgf04=", "EDJhz");
        Recipe.IlIl[Recipe.llIl[50]] = llIll("PxyJT6wGInRq0uufZA1BkCmDft4NHYnHuvI8H3vOBbs=", "edxaO");
        Recipe.IlIl[Recipe.llIl[51]] = llIll("YiyOoJu7eEutep2/ig4Gr/875mDDJ8Hk4mRERwSLHwY=", "iHwBE");
        Recipe.IlIl[Recipe.llIl[52]] = llIll("//QOFkwakpudoV0pDc09/NeSU9h8oXRn95y26ZD+lrw=", "vlwsJ");
        Recipe.IlIl[Recipe.llIl[53]] = llIll("m49br7Y6+fDqpZ6J6xFzUtXzbB9Z3TfyxTsBN59n02g=", "ksJKI");
        Recipe.IlIl[Recipe.llIl[54]] = llIll("QkkTXNnuDCIgt8SC89/9GljtVBoXTlvIcCqHpTkid/A=", "hfqVv");
        Recipe.IlIl[Recipe.llIl[55]] = llIll("+UAgMj7T+LFccSV7Zr2nTpMFWq6AkLHvKCMIQZcdQhk=", "NDyzm");
        Recipe.IlIl[Recipe.llIl[56]] = llIll("5HzjcwtwFwb/cvpjL01jkD3X89CTTXCcwt1lYMF6OiY=", "lymVL");
        Recipe.IlIl[Recipe.llIl[13]] = IlIll("FhcTCBM8CxVAJiARHSMCNBFcBxMwCFxW", "Uerng");
        Recipe.IlIl[Recipe.llIl[14]] = IlIll("amN6", "ZRHfo");
        Recipe.IlIl[Recipe.llIl[15]] = lIIll("URZqcYfKvZ8=", "yXOtf");
        Recipe.IlIl[Recipe.llIl[16]] = lIIll("VThHsKGtK/A=", "fkVHk");
        Recipe.IlIl[Recipe.llIl[17]] = IlIll("ASYfNTkQDgY1JzxpNz4uKjUxOC88Mw==", "OGrPJ");
        Recipe.IlIl[Recipe.llIl[18]] = IlIll("FwguMho9FCh6KzoeKiYtPB88IEA9Dio5QGQ=", "TzOTn");
        Recipe.IlIl[Recipe.llIl[19]] = lIIll("CzEebasc1VKJWjQ4KA4SgtDs3DrZtuqlW8Oy4MKNAAQ=", "hkPuP");
        Recipe.IlIl[Recipe.llIl[20]] = llIll("mNZtWzvuiQIHJFAQCzzsDAChcdYAUdwU+wW4Ap+2B9E=", "efoUD");
        Recipe.IlIl[Recipe.llIl[21]] = lIIll("gkvdB/7sNTZuD9s+rIbpUbeAlxzSbPZ8YtXrcBLAhYo=", "sSRYR");
        Recipe.IlIl[Recipe.llIl[57]] = lIIll("iyRsobgOvUBiuahP6SpcrHo6z2ChxDl+TdGnFraUYcg=", "uLgXM");
        Recipe.IlIl[Recipe.llIl[58]] = IlIll("LBw7DRcGAD1FJgEKPxkgBwspH00GGj8GTVo=", "onZkc");
        Recipe.IlIl[Recipe.llIl[59]] = llIll("dThCKa89dXSOOFixGN/odVVHzF9ln4VpDR0Moq+Vl5w=", "ccwJR");
        Recipe.IlIl[Recipe.llIl[60]] = llIll("Ed0Cto+2Yura6tKBrH8POdvEL9cNL0UMtbcajH77HQY=", "csTPL");
        Recipe.IlIl[Recipe.llIl[61]] = IlIll("FTEQHBM/LRZUIjgnFAgkPiYCDkk/NxQXSW4=", "VCqzg");
        Recipe.IlIl[Recipe.llIl[62]] = llIll("IICygY4xUgY=", "CKyqB");
        Recipe.IlIl[Recipe.llIl[63]] = lIIll("A7LbCL1fsFE=", "OgBTp");
        Recipe.IlIl[Recipe.llIl[64]] = llIll("SJqXBLeSVNc=", "GevPq");
        Recipe.IlIl[Recipe.llIl[65]] = lIIll("m04R0z54Jf/U0pB+SU0jnWpsMFONvGzA", "zOSoh");
        Recipe.IlIl[Recipe.llIl[66]] = lIIll("XDEePSUK4DxT4ilywzdi/EzilXKRWKob", "jOcSe");
        Recipe.IlIl[Recipe.llIl[67]] = llIll("BsGB1268+AGjANU9hyc/EYIwuNv9vfDe", "Dxcmi");
        Recipe.IlIl[Recipe.llIl[68]] = IlIll("Jh8jLxcMAyVnIAQeNh0NMUMrPQYIQ3A=", "emBIc");
        Recipe.IlIl[Recipe.llIl[69]] = IlIll("AQsUFhYrFxJeISMKASQMFlccBAcvV0Y=", "Byupb");
        Recipe.IlIl[Recipe.llIl[70]] = IlIll("FAM4NwM+Hz5/NDYCLQUZA18wJRI6X20=", "WqYQw");
        Recipe.IlIl[Recipe.llIl[71]] = llIll("b3hNNwzdu3W9vfyndXgHUb+2/O1I0JEU", "rJlcQ");
        Recipe.IlIl[Recipe.llIl[72]] = IlIll("IDEHLxEKLQFnJgIwEh0LN20PPQAObVA=", "cCfIe");
        Recipe.IlIl[Recipe.llIl[73]] = llIll("GapB5atCDew1jxzR3CsNuyGde//PFNUS", "puaFF");
        Recipe.IlIl[Recipe.llIl[74]] = lIIll("LkpuOGNh5gtln0rcx+KIIw2GEHlB+6Rc", "ccSKP");
        Recipe.IlIl[Recipe.llIl[75]] = llIll("Aj4hkSxunm0=", "IshDW");
        Recipe.IlIl[Recipe.llIl[76]] = IlIll("Skdd", "yshDx");
        Recipe.IlIl[Recipe.llIl[77]] = IlIll("TnhL", "xOsGT");
    }
    
    private static String IlIll(String IllllllllIlllll, final String IlIIIIIIIllllll) {
        IllllllllIlllll = new String(Base64.getDecoder().decode(IllllllllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIIIIIIIllllll = new StringBuilder();
        final char[] IIIIIIIIIllllll = IlIIIIIIIllllll.toCharArray();
        int lllllllllIlllll = Recipe.llIl[0];
        final short lIIllllllIlllll = (Object)IllllllllIlllll.toCharArray();
        final int IIIllllllIlllll = lIIllllllIlllll.length;
        int lllIlllllIlllll = Recipe.llIl[0];
        while (Illll(lllIlllllIlllll, IIIllllllIlllll)) {
            final char IIlIIIIIIllllll = lIIllllllIlllll[lllIlllllIlllll];
            lIIIIIIIIllllll.append((char)(IIlIIIIIIllllll ^ IIIIIIIIIllllll[lllllllllIlllll % IIIIIIIIIllllll.length]));
            "".length();
            ++lllllllllIlllll;
            ++lllIlllllIlllll;
            "".length();
            if ("   ".length() >= (0x82 ^ 0x86)) {
                return null;
            }
        }
        return String.valueOf(lIIIIIIIIllllll);
    }
    
    public static void setSandFarmer() {
        final String IIlllIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[35]]);
        final String llIllIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[36]]);
        final String IlIllIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[37]]);
        final String lIIllIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[38]]);
        final String IIIllIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[39]]);
        final String lllIlIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[40]]);
        final String IllIlIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[41]]);
        final String lIlIlIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[42]]);
        final String IIlIlIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[43]]);
        final String llIIlIIlIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[44]]);
        final ItemStack IlIIlIIlIllllll = new ItemStack(Material.SAND, Recipe.llIl[1]);
        final ItemMeta lIIIlIIlIllllll = IlIIlIIlIllllll.getItemMeta();
        lIIIlIIlIllllll.setDisplayName(ChatUtil.fixColor(IIlllIIlIllllll));
        IlIIlIIlIllllll.setItemMeta(lIIIlIIlIllllll);
        "".length();
        final ShapedRecipe shapedRecipe;
        final ShapedRecipe IIIIlIIlIllllll = shapedRecipe = new ShapedRecipe(IlIIlIIlIllllll);
        final String[] array = new String[Recipe.llIl[3]];
        array[Recipe.llIl[0]] = Recipe.IlIl[Recipe.llIl[45]];
        array[Recipe.llIl[1]] = Recipe.IlIl[Recipe.llIl[46]];
        array[Recipe.llIl[2]] = Recipe.IlIl[Recipe.llIl[47]];
        shapedRecipe.shape(array);
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[13], Material.valueOf(llIllIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[14], Material.valueOf(IlIllIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[15], Material.valueOf(lIIllIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[16], Material.valueOf(IIIllIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[17], Material.valueOf(lllIlIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[18], Material.valueOf(IllIlIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[19], Material.valueOf(lIlIlIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[20], Material.valueOf(IIlIlIIlIllllll));
        "".length();
        IIIIlIIlIllllll.setIngredient((char)Recipe.llIl[21], Material.valueOf(llIIlIIlIllllll));
        "".length();
        Main.getPlugin().getServer().addRecipe((org.bukkit.inventory.Recipe)IIIIlIIlIllllll);
        "".length();
    }
    
    public static void setRzucaneTnT() {
        final String lllIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[65]]);
        final String IllIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[66]]);
        final String lIlIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[67]]);
        final String IIlIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[68]]);
        final String llIIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[69]]);
        final String IlIIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[70]]);
        final String lIIIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[71]]);
        final String IIIIIlIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[72]]);
        final String lllllIIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[73]]);
        final String IllllIIIIllllll = Main.getPlugin().getConfig().getString(Recipe.IlIl[Recipe.llIl[74]]);
        final ItemStack lIlllIIIIllllll = new ItemStack(Material.TNT, Recipe.llIl[1]);
        final ItemMeta IIlllIIIIllllll = lIlllIIIIllllll.getItemMeta();
        IIlllIIIIllllll.setDisplayName(ChatUtil.fixColor(lllIIlIIIllllll));
        IIlllIIIIllllll.addEnchant(Enchantment.ARROW_INFINITE, Recipe.llIl[10], (boolean)(Recipe.llIl[1] != 0));
        "".length();
        lIlllIIIIllllll.setItemMeta(IIlllIIIIllllll);
        "".length();
        final ShapedRecipe shapedRecipe;
        final ShapedRecipe llIllIIIIllllll = shapedRecipe = new ShapedRecipe(lIlllIIIIllllll);
        final String[] array = new String[Recipe.llIl[3]];
        array[Recipe.llIl[0]] = Recipe.IlIl[Recipe.llIl[75]];
        array[Recipe.llIl[1]] = Recipe.IlIl[Recipe.llIl[76]];
        array[Recipe.llIl[2]] = Recipe.IlIl[Recipe.llIl[77]];
        shapedRecipe.shape(array);
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[13], Material.valueOf(IllIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[14], Material.valueOf(lIlIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[15], Material.valueOf(IIlIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[16], Material.valueOf(llIIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[17], Material.valueOf(IlIIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[18], Material.valueOf(lIIIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[19], Material.valueOf(IIIIIlIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[20], Material.valueOf(lllllIIIIllllll));
        "".length();
        llIllIIIIllllll.setIngredient((char)Recipe.llIl[21], Material.valueOf(IllllIIIIllllll));
        "".length();
        Main.getPlugin().getServer().addRecipe((org.bukkit.inventory.Recipe)llIllIIIIllllll);
        "".length();
    }
}
