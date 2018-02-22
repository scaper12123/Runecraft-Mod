package com.scaper12123.runecraft.blocks.ore;

import java.util.Random;

import com.scaper12123.runecraft.blocks.BlockBase;
import com.scaper12123.runecraft.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class PhasmatiteOre extends BlockBase{

	private Item drop;
	private int least_quantity;
	private int most_quantity;
	
	public PhasmatiteOre(String name, Material material) {		
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		this.drop = ModItems.PHASMATITE;
		this.least_quantity = 1;
		this.most_quantity = 3;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
	    return this.drop;
	}
	
	@Override
	public int quantityDropped(Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + 1);
	}
}
