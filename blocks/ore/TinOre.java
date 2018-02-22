package com.scaper12123.runecraft.blocks.ore;

import com.scaper12123.runecraft.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TinOre extends BlockBase{
	
	public TinOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
		
	}
}
