package com.scaper12123.runecraft.blocks.metal;

import com.scaper12123.runecraft.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BaneBlock extends BlockBase{
	
	public BaneBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(80.0F);
		setHarvestLevel("pickaxe", 7);
		
	}
}
