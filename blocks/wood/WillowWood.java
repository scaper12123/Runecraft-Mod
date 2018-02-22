package com.scaper12123.runecraft.blocks.wood;

import com.scaper12123.runecraft.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WillowWood extends BlockBase{

	public WillowWood(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setResistance(20.0F);
		setHarvestLevel("axe", 1);
	}

}
