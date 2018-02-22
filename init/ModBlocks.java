package com.scaper12123.runecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.scaper12123.runecraft.blocks.BlockBase;
import com.scaper12123.runecraft.blocks.metal.*;
import com.scaper12123.runecraft.blocks.ore.*;
import com.scaper12123.runecraft.blocks.wood.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// WOOD BLOCKS
	// logs
	public static final Block GIELINWOOD_WOOD = new GielinwoodWood("gielinwood_wood", Material.WOOD);
	public static final Block WILLOW_WOOD = new WillowWood("willow_wood", Material.WOOD);
	public static final Block MAPLE_WOOD = new MapleWood("maple_wood", Material.WOOD);
	public static final Block YEW_WOOD = new YewWood("yew_wood", Material.WOOD);
	public static final Block MAGIC_WOOD = new MagicWood("magic_wood", Material.WOOD);
	public static final Block ELDER_WOOD = new ElderWood("elder_wood", Material.WOOD);
	
	// bark
	public static final Block GIELINWOOD_BARK = new GielinwoodWood("gielinwood_bark", Material.WOOD);
	public static final Block WILLOW_BARK = new WillowWood("willow_bark", Material.WOOD);
	public static final Block MAPLE_BARK = new MapleWood("maple_bark", Material.WOOD);
	public static final Block YEW_BARK = new YewWood("yew_bark", Material.WOOD);
	public static final Block MAGIC_BARK = new MagicWood("magic_bark", Material.WOOD);
	public static final Block ELDER_BARK = new ElderWood("elder_bark", Material.WOOD);
	
	// planks
	public static final Block GIELINWOOD_WOOD_PLANKS = new GielinwoodWood("gielinwood_wood_planks", Material.WOOD);
	public static final Block WILLOW_WOOD_PLANKS = new WillowWood("willow_wood_planks", Material.WOOD);
	public static final Block MAPLE_WOOD_PLANKS = new MapleWood("maple_wood_planks", Material.WOOD);
	public static final Block YEW_WOOD_PLANKS = new YewWood("yew_wood_planks", Material.WOOD);
	public static final Block MAGIC_WOOD_PLANKS = new MagicWood("magic_wood_planks", Material.WOOD);
	public static final Block ELDER_WOOD_PLANKS = new ElderWood("elder_wood_planks", Material.WOOD);
	
	// stairs (unimplemented)
	// public static final Block GIELINWOOD_WOOD_STAIRS = new BlockBase("gielinwood_wood_stairs", Material.WOOD);
	// public static final Block WILLOW_WOOD_STAIRS = new BlockBase("willow_wood_stairs", Material.WOOD);
	// public static final Block MAPLE_WOOD_STAIRS = new BlockBase("maple_wood_stairs", Material.WOOD);
	// public static final Block YEW_WOOD_STAIRS = new BlockBase("yew_wood_stairs", Material.WOOD);
	// public static final Block MAGIC_WOOD_STAIRS = new BlockBase("magic_wood_stairs", Material.WOOD);
	// public static final Block ELDER_WOOD_STAIRS = new BlockBase("elder_wood_stairs", Material.WOOD);
	
	// slabs (unimplemented)
	// public static final Block GIELINWOOD_WOOD_SLAB = new BlockBase("gielinwood_wood_slab", Material.WOOD);
	// public static final Block WILLOW_WOOD_SLAB = new BlockBase("willow_wood_slab", Material.WOOD);
	// public static final Block MAPLE_WOOD_SLAB = new BlockBase("maple_wood_slab", Material.WOOD);
	// public static final Block YEW_WOOD_SLAB = new BlockBase("yew_wood_slab", Material.WOOD);
	// public static final Block MAGIC_WOOD_SLAB = new BlockBase("magic_wood_slab", Material.WOOD);
	// public static final Block ELDER_WOOD_SLAB = new BlockBase("elder_wood_slab", Material.WOOD);
	
	// buttons (unimplemented)
	// public static final Block GIELINWOOD_BUTTON = new BlockBase("gielinwood_button", Material.WOOD);
	// public static final Block WILLOW_BUTTON = new BlockBase("willow_button", Material.WOOD);
	// public static final Block MAPLE_BUTTON = new BlockBase("maple_button", Material.WOOD);
	// public static final Block YEW_BUTTON = new BlockBase("yew_button", Material.WOOD);
	// public static final Block MAGIC_BUTTON = new BlockBase("magic_button", Material.WOOD);
	// public static final Block ELDER_BUTTON = new BlockBase("elder_button", Material.WOOD);
	
	// pressure plates (unimplemented)
	// public static final Block GIELINWOOD_PRESSURE_PLATE = new BlockBase("gielinwood_pressure_plate", Material.WOOD);
	// public static final Block WILLOW_PRESSURE_PLATE = new BlockBase("willow_pressure_plate", Material.WOOD);
	// public static final Block MAPLE_PRESSURE_PLATE = new BlockBase("maple_pressure_plate", Material.WOOD);
	// public static final Block YEW_PRESSURE_PLATE = new BlockBase("yew_pressure_plate", Material.WOOD);
	// public static final Block MAGIC_PRESSURE_PLATE = new BlockBase("magic_pressure_plate", Material.WOOD);
	// public static final Block ELDER_PRESSURE_PLATE = new BlockBase("elder_pressure_plate", Material.WOOD);
	
	
	
	// ORE BLOCKS
	// bronze
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	
	// mithril
	public static final Block MITHRIL_ORE = new MithrilOre("mithril_ore", Material.ROCK);
	
	// adamantite/runite
	public static final Block LUMINITE_ORE = new LuminiteOre("luminite_ore", Material.ROCK);
	public static final Block ADAMANTITE_ORE = new AdamantiteOre("adamantite_ore", Material.ROCK);
	public static final Block RUNITE_ORE = new RuniteOre("runite_ore", Material.ROCK);
	
	// drakolith
	public static final Block DRAKOLITH_ORE = new DrakolithOre("drakolith_ore", Material.ROCK);
	
	// necrite
	public static final Block PHASMATITE_ORE = new PhasmatiteOre("phasmatite_ore", Material.ROCK);
	public static final Block NECRITE_ORE = new NecriteOre("necrite_ore", Material.ROCK);

	// bane
	public static final Block DARK_ANIMICA_ORE = new DarkAnimicaOre("dark_animica_ore", Material.ROCK);
	public static final Block BANE_ORE = new BaneOre("bane_ore", Material.ROCK);
	
	// elder rune
	public static final Block LIVING_ROCK_ORE = new LivingRockOre("living_rock_ore", Material.ROCK);
	public static final Block LIGHT_ANIMICA_ORE = new LightAnimicaOre("light_animica_ore", Material.ROCK);
	public static final Block ELDER_RUNITE_ORE = new ElderRuniteOre("elder_runite_ore", Material.ROCK);
	
	
	
	// METAL BLOCKS
	public static final Block BRONZE_BLOCK = new BronzeBlock("bronze_block", Material.IRON);
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	public static final Block MITHRIL_BLOCK = new MithrilBlock("mithril_block", Material.IRON);
	public static final Block ADAMANT_BLOCK =  new AdamantBlock("adamant_block", Material.IRON);
	public static final Block RUNE_BLOCK = new RuneBlock("rune_block", Material.IRON);
	public static final Block DRAKOLITH_BLOCK = new DrakolithBlock("drakolith_block", Material.IRON);
	public static final Block NECRITE_BLOCK = new NecriteBlock("necrite_block", Material.IRON);
	public static final Block BANE_BLOCK = new BaneBlock("bane_block", Material.IRON);
	public static final Block ELDER_RUNE_BLOCK = new ElderRuneBlock("elder_rune_block", Material.IRON);
}
