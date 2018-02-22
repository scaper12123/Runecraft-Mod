package com.scaper12123.runecraft.objects.tools;

import com.scaper12123.runecraft.Main;
import com.scaper12123.runecraft.init.ModItems;
import com.scaper12123.runecraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabRunecraftMod);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
