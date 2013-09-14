package roy.firstmod;

//This Import list will grow longer with each additional tutorial.
//It's not pruned between full class postings, unlike other tutorial code.
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "FirstMod", name = "FirstMod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = { "FirstModRandom" })
public class FirstMod {
	
	public final static Block ironGravel = new IronGravel(1000);
	public static ItemBow crossbow = (ItemBow)(new ItemBow(1001)).setUnlocalizedName("crossbow").setTextureName("firstmod:crossbow");
	
	static {
	    MinecraftForge.setBlockHarvestLevel(ironGravel, "shovel", 2);
	}
	
 @Instance("FirstMod")
 public static FirstMod instance;

 @SidedProxy(clientSide = "roy.firstmod.client.ClientProxy", serverSide = "roy.firstmod.CommonProxy")
 public static CommonProxy proxy;

 @EventHandler
 public void preInit (FMLPreInitializationEvent event) {
     // Stub Method
 }

 @EventHandler
 public void load (FMLInitializationEvent event) {
     proxy.registerRenderers();

     ItemStack dirtStack = new ItemStack(Block.dirt);
     ItemStack diamondsStack = new ItemStack(Item.diamond, 64);
     ItemStack leatherStack = new ItemStack(Item.leather);
     ItemStack stringStack = new ItemStack(Item.silk);
     ItemStack crossbowStack = new ItemStack(crossbow);
     ItemStack bowStack = new ItemStack(Item.bow);
     ItemStack stickStack = new ItemStack(Item.stick);
     ItemStack ironStack = new ItemStack(Item.ingotIron);
//     ItemStack cobbleStack = new ItemStack(Block.cobblestone);

     GameRegistry.addShapelessRecipe(diamondsStack, dirtStack);

//     GameRegistry.addShapelessRecipe(diamondsStack, dirtStack, dirtStack,
//             dirtStack, dirtStack, dirtStack, dirtStack, new ItemStack(
//                     Block.sand), gravelStack, cobbleStack);
//
//     GameRegistry.addRecipe(new ItemStack(Block.cobblestone), "xy", "yx",
//             'x', dirtStack, 'y', gravelStack);
//
     GameRegistry.addRecipe(new ItemStack(Item.saddle), 
    		 "x x", 
    		 "xxx", 
    		 " y ",
             'x', leatherStack, 'y', stringStack);

     GameRegistry.addRecipe(new ItemStack(crossbow), 
    		 "b  ", 
    		 " i ", 
    		 "  s",
             'b', bowStack, 'i', ironStack, 's', stickStack);

     //
//     GameRegistry.addSmelting(Block.stone.blockID, new ItemStack(
//             Block.stoneBrick), 0.1f);
//
//     FurnaceRecipes.smelting().addSmelting(Block.cloth.blockID, 15,
//             new ItemStack(Block.cloth, 1, 0), 0.1f);
     
     GameRegistry.registerBlock(ironGravel, "ironGravel");
     GameRegistry.registerItem(crossbow, "crossbow");
     
     LanguageRegistry.addName(ironGravel, "Iron Gravel");
     LanguageRegistry.addName(crossbow, "Crossbow");
 }

 @EventHandler
 public void postInit (FMLPostInitializationEvent event) {
 }
}