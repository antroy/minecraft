package roy.firstmod;

import java.util.Random;

import net.minecraft.block.BlockGravel;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class IronGravel extends BlockGravel {
	
	public IronGravel(int id) {
		super(id);
        setHardness(1F);
	    setUnlocalizedName("ironGravel");
	    setCreativeTab(CreativeTabs.tabBlock);
	    setStepSound(soundGravelFootstep);
	    setTextureName("firstmod:irongravel");
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        if (par3 > 3)
        {
            par3 = 3;
        }

        return par2Random.nextInt(10 - par3 * 3) == 0 ? Item.ingotIron.itemID : this.blockID;
    }
}