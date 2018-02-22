package com.scaper12123.runecraft.blocks.wood;

import com.scaper12123.runecraft.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ElderWood extends BlockBase{

	public ElderWood(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(4.0F);
		setResistance(40.0F);
		setHarvestLevel("axe", 3);
	}

}
