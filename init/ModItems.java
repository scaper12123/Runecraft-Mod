package com.scaper12123.runecraft.init;

import java.util.List;
import com.scaper12123.runecraft.items.ItemBase;
import com.scaper12123.runecraft.objects.armor.ArmorBase;
import com.scaper12123.runecraft.objects.tools.OldToolAxe;
import com.scaper12123.runecraft.objects.tools.ToolAxe;
import com.scaper12123.runecraft.objects.tools.ToolHoe;
import com.scaper12123.runecraft.objects.tools.ToolPickaxe;
import com.scaper12123.runecraft.objects.tools.ToolShovel;
import com.scaper12123.runecraft.objects.tools.ToolSword;
import com.scaper12123.runecraft.util.Reference;

import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//	##### Tool Material Values #####
	
	public static final ToolMaterial BRONZE_TOOL = EnumHelper.addToolMaterial("bronze_tool", 0, 90, 3.0F, 0.5F, 10);
	public static final ToolMaterial STEEL_TOOL = EnumHelper.addToolMaterial("steel_tool", 2, 400, 7.0F, 2.5F, 11);
	public static final ToolMaterial MITHRIL_TOOL = EnumHelper.addToolMaterial("mithril_tool", 3, 500, 7.0F, 2.0F, 17); // weaker, faster, v/enchantable
	public static final ToolMaterial ADAMANT_TOOL = EnumHelper.addToolMaterial("adamant_tool", 4, 1000, 5.0F, 4.0F, 11); // stronger, slower, less enchantable
	public static final ToolMaterial RUNE_TOOL = EnumHelper.addToolMaterial("rune_tool", 5, 1600, 8.0F, 3.5F, 12); // slightly superior to diamond
	public static final ToolMaterial DRAKOLITH_TOOL = EnumHelper.addToolMaterial("drakolith_tool", 6, 2200, 7.0F, 4.0F, 2); // stronger, not enchantable
	public static final ToolMaterial NECRITE_TOOL = EnumHelper.addToolMaterial("necrite_tool", 7, 1400, 13.0F, 2.0F, 15); // weaker, faster, v/enchantable
	public static final ToolMaterial BANE_TOOL = EnumHelper.addToolMaterial("bane_tool", 8, 1800, 10.0F, 3.0F, 14);
	public static final ToolMaterial ELDER_RUNE_TOOL = EnumHelper.addToolMaterial("elder_rune_tool", 9, 1900, 14.0F, 5.0F, 10);
	
	
	
	//	##### Armor Material Values #####
	public static final ArmorMaterial BRONZE_ARMOR = EnumHelper.addArmorMaterial("bronze_armor", Reference.MOD_ID + ":bronze", 5, new int[] {1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	
	
	//	##### Items #####
	
	// ~~~METALS~~~
	
	// bronze, components, and tools
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item BRONZE_DUST = new ItemBase("bronze_dust");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item BRONZE_PICKAXE = new ToolPickaxe("bronze_pickaxe", BRONZE_TOOL);
	public static final Item BRONZE_AXE = new OldToolAxe("bronze_axe", BRONZE_TOOL);
	public static final Item BRONZE_HOE = new ToolHoe("bronze_hoe", BRONZE_TOOL);
	public static final Item BRONZE_SHOVEL = new ToolShovel("bronze_shovel", BRONZE_TOOL);
	public static final Item BRONZE_SWORD = new ToolSword("bronze_sword", BRONZE_TOOL);
	public static final Item BRONZE_HELMET = new ArmorBase("bronze_helmet", BRONZE_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmorBase("bronze_chestplate", BRONZE_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmorBase("bronze_leggings", BRONZE_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmorBase("bronze_boots", BRONZE_ARMOR, 1, EntityEquipmentSlot.FEET);
	
	// steel and its components
	public static final Item STEEL_DUST = new ItemBase("steel_dust");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	
	// mithril and their components
	public static final Item MITHRIL_DUST = new ItemBase("mithril_dust");
	public static final Item MITHRIL_INGOT = new ItemBase("mithril_ingot");
	
	// adamant, rune, and their components
	public static final Item LUMINITE = new ItemBase("luminite");
	public static final Item ADAMANT_DUST = new ItemBase("adamant_dust");
	public static final Item ADAMANT_INGOT = new ItemBase("adamant_ingot");
	
	// runite
	public static final Item RUNE_DUST = new ItemBase("rune_dust");
	public static final Item RUNE_INGOT = new ItemBase("rune_ingot");
	
	// drakolith
	public static final Item DRAKOLITH_INGOT = new ItemBase("drakolith_ingot");
	
	// necrite and its components
	public static final Item PHASMATITE = new ItemBase("phasmatite");
	public static final Item NECRITE_DUST = new ItemBase("necrite_dust");
	public static final Item NECRITE_INGOT = new ItemBase("necrite_ingot");
	
	// bane and its components
	public static final Item DARK_ANIMICA = new ItemBase("dark_animica");
	public static final Item BANE_DUST = new ItemBase("bane_dust");
	public static final Item BANE_INGOT = new ItemBase("bane_ingot");
	
	// elder rune and its components
	public static final Item LIVING_ROCK = new ItemBase("living_rock");
	public static final Item LIGHT_ANIMICA = new ItemBase("light_animica");
	public static final Item ELDER_RUNE_DUST = new ItemBase("elder_rune_dust");
	public static final Item ELDER_RUNE_INGOT = new ItemBase("elder_rune_ingot");
	public static final Item ELDER_RUNE_PICKAXE = new ToolPickaxe("elder_rune_pickaxe", ELDER_RUNE_TOOL);
	public static final Item ELDER_RUNE_AXE = new OldToolAxe("elder_rune_axe", ELDER_RUNE_TOOL);
	public static final Item ELDER_RUNE_HOE = new ToolHoe("elder_rune_hoe", ELDER_RUNE_TOOL);
	public static final Item ELDER_RUNE_SHOVEL = new ToolShovel("elder_rune_shovel", ELDER_RUNE_TOOL);
	public static final Item ELDER_RUNE_SWORD = new ToolSword("elder_rune_sword", ELDER_RUNE_TOOL);
}
