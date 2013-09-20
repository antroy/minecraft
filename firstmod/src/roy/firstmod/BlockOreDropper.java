package roy.firstmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

public class BlockOreDropper extends BlockOre {

	private int dropItem;
	private int dropItemQty = 1;

	public BlockOreDropper(int par1) {
		super(par1);
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.dropItem;
    }

    public BlockOre setDropItem(int dropItem) {
		this.dropItem = dropItem;
		return this;
	}

	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return dropItemQty;
    }

	public BlockOre setDropItemQty(int dropItemQty) {
		this.dropItemQty = dropItemQty;
		return this;
	}

 
}
