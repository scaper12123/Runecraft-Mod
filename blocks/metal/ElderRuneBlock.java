package com.scaper12123.runecraft.blocks.metal;

import com.scaper12123.runecraft.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ElderRuneBlock extends BlockBase{
	
	public ElderRuneBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(100.0F);
		setHarvestLevel("pickaxe", 8);
		
	}
}
