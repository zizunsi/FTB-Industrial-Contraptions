package dev.ftb.mods.ftbic.datagen;

import com.ridanisaurus.emendatusenigmatica.registries.ItemHandler;
import com.ridanisaurus.emendatusenigmatica.util.Materials;
import com.ridanisaurus.emendatusenigmatica.util.ProcessedMaterials;
import dev.ftb.mods.ftbic.FTBIC;
import dev.ftb.mods.ftbic.block.FTBICElectricBlocks;
import dev.ftb.mods.ftbic.item.FTBICItems;
import io.alwa.mods.myrtrees.common.item.MyrtreesItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public abstract class FTBICRecipesGen extends RecipeProvider {
	public static final String MODID = FTBIC.MOD_ID;
	public static final Tag<Item> REDSTONE = Tags.Items.DUSTS_REDSTONE;
	public static final Tag<Item> GLOWSTONE = Tags.Items.DUSTS_GLOWSTONE;
	public static final Tag<Item> GLASS = Tags.Items.GLASS_COLORLESS;
	public static final Tag<Item> COAL = ItemTags.COALS;
	public static final Tag<Item> DIAMOND = Tags.Items.GEMS_DIAMOND;
	public static final Tag<Item> QUARTZ = Tags.Items.GEMS_QUARTZ;
	public static final Tag<Item> SAND = ItemTags.SAND;
	public static final Tag<Item> IRON_INGOT = Tags.Items.INGOTS_IRON;
	public static final Tag<Item> GOLD_INGOT = Tags.Items.INGOTS_GOLD;
	public static final Tag<Item> COPPER_INGOT = ItemTags.bind("forge:ingots/copper");
	public static final Tag<Item> COPPER_PLATE = ItemTags.bind("forge:plates/copper");
	public static final Tag<Item> TIN_INGOT = ItemTags.bind("forge:ingots/tin");
	public static final Tag<Item> ALUMINUM_INGOT = ItemTags.bind("forge:ingots/aluminum");
	public static final Tag<Item> ENDERIUM_INGOT = ItemTags.bind("forge:ingots/enderium");
	public static final Tag<Item> COAL_DUST = ItemTags.bind("forge:dusts/coal");
	public static final Tag<Item> PLANKS = ItemTags.PLANKS;
	public static final Tag<Item> LOGS_THAT_BURN = ItemTags.LOGS_THAT_BURN;
	public static final Tag<Item> STICK = Tags.Items.RODS_WOODEN;
	public static final Tag<Item> SAPLING = ItemTags.SAPLINGS;
	public static final Item SUGAR_CANE = Items.SUGAR_CANE;
	public static final Item CACTUS = Items.CACTUS;
	public static final Tag<Item> COBBLESTONE = Tags.Items.COBBLESTONE;
	public static final Item SMOOTH_STONE = Items.SMOOTH_STONE;
	public static final Tag<Item> OBSIDIAN = Tags.Items.OBSIDIAN;
	public static final Tag<Item> ENDER_PEARL = Tags.Items.ENDER_PEARLS;
	public static final Tag<Item> COAL_ORE = Tags.Items.ORES_COAL;
	public static final Item FLINT = Items.FLINT;
	public static final Tag<Item> STONE = Tags.Items.STONE;
	public static final Tag<Item> GRAVEL = Tags.Items.GRAVEL;
	public static final Tag<Item> WOOL = ItemTags.WOOL;
	public static final Tag<Item> SLIMEBALL = Tags.Items.SLIMEBALLS;
	public static final Tag<Item> SILICON = ItemTags.bind("forge:silicon");
	public static final Tag<Item> SULFUR = ItemTags.bind("forge:gems/sulfur");
	public static final Tag<Item> SULFUR_DUST = ItemTags.bind("forge:dusts/sulfur");
	public static final Tag<Item> BITUMEN = ItemTags.bind("forge:bitumen");
	public static final Tag<Item> URANIUM_DUST = ItemTags.bind("forge:dusts/uranium");
	public static final Tag<Item> IRIDIUM_INGOT = ItemTags.bind("forge:ingots/iridium");
	public static final Tag<Item> BLAZE_ROD = Tags.Items.RODS_BLAZE;
	public static final Item PISTON = Items.PISTON;
	public static final Item LATEX = MyrtreesItems.LATEX.get();
	public static final Item TREE_TAP = MyrtreesItems.TREE_TAP.get();
	public static final Item RUBBERWOOD_LOG = MyrtreesItems.RUBBERWOOD_LOG.get();
	public static final Item RUBBERWOOD_SAPLING = MyrtreesItems.RUBBERWOOD_SAPLING.get();
	public static final Item RUBBERWOOD_LEAVES = MyrtreesItems.RUBBERWOOD_LEAVES.get();
	public static final Tag<Item> IRON_ROD = ItemTags.bind("forge:rods/iron");
	public static final Tag<Item> IRON_DUST = ItemTags.bind("forge:dusts/iron");
	public static final Tag<Item> STEEL_DUST = ItemTags.bind("forge:dusts/steel");
	public static final Tag<Item> LEAD_DUST = ItemTags.bind("forge:dusts/lead");
	public static final Tag<Item> BRONZE_DUST = ItemTags.bind("forge:dusts/bronze");
	public static final Tag<Item> ELECTRUM_DUST = ItemTags.bind("forge:dusts/electrum");
	public static final Tag<Item> CONSTANTAN_DUST = ItemTags.bind("forge:dusts/constantan");
	public static final Tag<Item> TIN_DUST = ItemTags.bind("forge:dusts/tin");
	public static final Tag<Item> ALUMINUM_DUST = ItemTags.bind("forge:dusts/aluminum");

	public static final Item SILICON_ITEM = ItemHandler.backingItemTable.get(ProcessedMaterials.GEM, Materials.SILICON).get();
	public static final Item OBSIDIAN_DUST_ITEM = ItemHandler.DUST_OBSIDIAN.get();
	public static final Item ENDER_DUST_ITEM = ItemHandler.DUST_ENDER.get();
	public static final Item SAWDUST_ITEM = ItemHandler.DUST_WOOD.get();
	public static final Item COAL_DUST_ITEM = ItemHandler.backingItemTable.get(ProcessedMaterials.DUST, Materials.COAL).get();
	public static final Item CHARCOAL_DUST_ITEM = ItemHandler.DUST_CHARCOAL.get();
	public static final Item URANIUM_DUST_ITEM = ItemHandler.backingItemTable.get(ProcessedMaterials.DUST, Materials.URANIUM).get();

	public static final Item RUBBER_SHEET = FTBICItems.RUBBER_SHEET.get();
	public static final Item REINFORCED_STONE = FTBICItems.REINFORCED_STONE.get();
	public static final Item REINFORCED_GLASS = FTBICItems.REINFORCED_GLASS.get();
	public static final Item MACHINE_BLOCK = FTBICItems.MACHINE_BLOCK.get();
	public static final Item ADVANCED_MACHINE_BLOCK = FTBICItems.ADVANCED_MACHINE_BLOCK.get();
	public static final Item IRON_FURNACE = FTBICItems.IRON_FURNACE.get();
	public static final Item COPPER_CABLE = FTBICItems.COPPER_CABLE.get();
	public static final Item GOLD_CABLE = FTBICItems.GOLD_CABLE.get();
	public static final Item ALUMINUM_CABLE = FTBICItems.ALUMINUM_CABLE.get();
	public static final Item ENDERIUM_CABLE = FTBICItems.ENDERIUM_CABLE.get();
	public static final Item GLASS_CABLE = FTBICItems.GLASS_CABLE.get();
	public static final Item BURNT_CABLE = FTBICItems.BURNT_CABLE.get();

	public static final Item INDUSTRIAL_GRADE_METAL = FTBICItems.INDUSTRIAL_GRADE_METAL.item.get();
	public static final Item RUBBER = FTBICItems.RUBBER.item.get();
	public static final Item FUSE = FTBICItems.FUSE.item.get();
	public static final Item COPPER_WIRE = FTBICItems.COPPER_WIRE.item.get();
	public static final Item GOLD_WIRE = FTBICItems.GOLD_WIRE.item.get();
	public static final Item ALUMINUM_WIRE = FTBICItems.ALUMINUM_WIRE.item.get();
	public static final Item ENDERIUM_WIRE = FTBICItems.ENDERIUM_WIRE.item.get();
	public static final Item COPPER_COIL = FTBICItems.COPPER_COIL.item.get();
	public static final Item MIXED_METAL_BLEND = FTBICItems.MIXED_METAL_BLEND.item.get();
	public static final Item ADVANCED_ALLOY = FTBICItems.ADVANCED_ALLOY.item.get();
	public static final Item IRIDIUM_ALLOY = FTBICItems.IRIDIUM_ALLOY.item.get();
	public static final Item COAL_BALL = FTBICItems.COAL_BALL.item.get();
	public static final Item COMPRESSED_COAL_BALL = FTBICItems.COMPRESSED_COAL_BALL.item.get();
	public static final Item GRAPHENE = FTBICItems.GRAPHENE.item.get();
	public static final Item CARBON_FIBERS = FTBICItems.CARBON_FIBERS.item.get();
	public static final Item CARBON_FIBER_MESH = FTBICItems.CARBON_FIBER_MESH.item.get();
	public static final Item CARBON_PLATE = FTBICItems.CARBON_PLATE.item.get();
	public static final Item SCRAP = FTBICItems.SCRAP.item.get();
	public static final Item SCRAP_BOX = FTBICItems.SCRAP_BOX.item.get();
	public static final Item ELECTRONIC_CIRCUIT = FTBICItems.ELECTRONIC_CIRCUIT.item.get();
	public static final Item ADVANCED_CIRCUIT = FTBICItems.ADVANCED_CIRCUIT.item.get();
	public static final Item IRIDIUM_CIRCUIT = FTBICItems.IRIDIUM_CIRCUIT.item.get();
	public static final Item EMPTY_CAN = FTBICItems.EMPTY_CAN.item.get();
	public static final Item ANTIMATTER = FTBICItems.ANTIMATTER.item.get();
	public static final Item ANTIMATTER_CRYSTAL = FTBICItems.ANTIMATTER_CRYSTAL.item.get();
	public static final Item ENERGY_CRYSTAL = FTBICItems.ENERGY_CRYSTAL.item.get();

	public static final Item SINGLE_USE_BATTERY = FTBICItems.SINGLE_USE_BATTERY.get();
	public static final Item BATTERY = FTBICItems.BATTERY.get();
	public static final Item CRYSTAL_BATTERY = FTBICItems.CRYSTAL_BATTERY.get();
	public static final Item GRAPHENE_BATTERY = FTBICItems.GRAPHENE_BATTERY.get();
	public static final Item IRIDIUM_BATTERY = FTBICItems.IRIDIUM_BATTERY.get();
	public static final Item CREATIVE_BATTERY = FTBICItems.CREATIVE_BATTERY.get();
	public static final Item FLUID_CELL = FTBICItems.FLUID_CELL.get();
	public static final Item COOLANT_10K = FTBICItems.COOLANT_10K.get();
	public static final Item COOLANT_30K = FTBICItems.COOLANT_30K.get();
	public static final Item COOLANT_60K = FTBICItems.COOLANT_60K.get();
	public static final Item URANIUM_FUEL_ROD = FTBICItems.URANIUM_FUEL_ROD.get();
	public static final Item DUAL_URANIUM_FUEL_ROD = FTBICItems.DUAL_URANIUM_FUEL_ROD.get();
	public static final Item QUAD_URANIUM_FUEL_ROD = FTBICItems.QUAD_URANIUM_FUEL_ROD.get();
	public static final Item CANNED_FOOD = FTBICItems.CANNED_FOOD.get();
	public static final Item PROTEIN_BAR = FTBICItems.PROTEIN_BAR.get();
	public static final Item DARK_SPRAY_CAN = FTBICItems.DARK_SPRAY_PAINT_CAN.get();
	public static final Item LIGHT_SPRAY_CAN = FTBICItems.LIGHT_SPRAY_PAINT_CAN.get();
	public static final Item OVERCLOCKER_UPGRADE = FTBICItems.OVERCLOCKER_UPGRADE.get();
	public static final Item ENERGY_STORAGE_UPGRADE = FTBICItems.ENERGY_STORAGE_UPGRADE.get();
	public static final Item TRANSFORMER_UPGRADE = FTBICItems.TRANSFORMER_UPGRADE.get();
	public static final Item EJECTOR_UPGRADE = FTBICItems.EJECTOR_UPGRADE.get();
	public static final Item CARBON_CHESTPLATE = FTBICItems.CARBON_CHESTPLATE.get();
	public static final Item QUANTUM_CHESTPLATE = FTBICItems.QUANTUM_CHESTPLATE.get();

	public static final Item BASIC_GENERATOR = FTBICElectricBlocks.BASIC_GENERATOR.item.get();
	public static final Item GEOTHERMAL_GENERATOR = FTBICElectricBlocks.GEOTHERMAL_GENERATOR.item.get();
	public static final Item WIND_MILL = FTBICElectricBlocks.WIND_MILL.item.get();
	public static final Item LV_SOLAR_PANEL = FTBICElectricBlocks.LV_SOLAR_PANEL.item.get();
	public static final Item MV_SOLAR_PANEL = FTBICElectricBlocks.MV_SOLAR_PANEL.item.get();
	public static final Item HV_SOLAR_PANEL = FTBICElectricBlocks.HV_SOLAR_PANEL.item.get();
	public static final Item EV_SOLAR_PANEL = FTBICElectricBlocks.EV_SOLAR_PANEL.item.get();
	public static final Item NUCLEAR_REACTOR = FTBICElectricBlocks.NUCLEAR_REACTOR.item.get();
	public static final Item POWERED_FURNACE = FTBICElectricBlocks.POWERED_FURNACE.item.get();
	public static final Item MACERATOR = FTBICElectricBlocks.MACERATOR.item.get();
	public static final Item CENTRIFUGE = FTBICElectricBlocks.CENTRIFUGE.item.get();
	public static final Item COMPRESSOR = FTBICElectricBlocks.COMPRESSOR.item.get();
	public static final Item REPROCESSOR = FTBICElectricBlocks.REPROCESSOR.item.get();
	public static final Item CANNING_MACHINE = FTBICElectricBlocks.CANNING_MACHINE.item.get();
	public static final Item ROLLER = FTBICElectricBlocks.ROLLER.item.get();
	public static final Item EXTRUDER = FTBICElectricBlocks.EXTRUDER.item.get();
	public static final Item ANTIMATTER_FABRICATOR = FTBICElectricBlocks.ANTIMATTER_CONSTRUCTOR.item.get();
	public static final Item INDUCTION_FURNACE = FTBICElectricBlocks.ADVANCED_POWERED_FURNACE.item.get();
	public static final Item ROTARY_MACERATOR = FTBICElectricBlocks.ADVANCED_MACERATOR.item.get();
	public static final Item CENTRIFUGE_EXTRACTOR = FTBICElectricBlocks.ADVANCED_CENTRIFUGE.item.get();
	public static final Item SINGULARITY_COMPRESSOR = FTBICElectricBlocks.ADVANCED_COMPRESSOR.item.get();
	public static final Item TELEPORTER = FTBICElectricBlocks.TELEPORTER.item.get();
	public static final Item CHARGE_PAD = FTBICElectricBlocks.CHARGE_PAD.item.get();
	public static final Item LV_BATTERY_BOX = FTBICElectricBlocks.LV_BATTERY_BOX.item.get();
	public static final Item MV_BATTERY_BOX = FTBICElectricBlocks.MV_BATTERY_BOX.item.get();
	public static final Item HV_BATTERY_BOX = FTBICElectricBlocks.HV_BATTERY_BOX.item.get();
	public static final Item EV_BATTERY_BOX = FTBICElectricBlocks.EV_BATTERY_BOX.item.get();
	public static final Item LV_TRANSFORMER = FTBICElectricBlocks.LV_TRANSFORMER.item.get();
	public static final Item MV_TRANSFORMER = FTBICElectricBlocks.MV_TRANSFORMER.item.get();
	public static final Item HV_TRANSFORMER = FTBICElectricBlocks.HV_TRANSFORMER.item.get();
	public static final Item EV_TRANSFORMER = FTBICElectricBlocks.EV_TRANSFORMER.item.get();

	public FTBICRecipesGen(DataGenerator generator) {
		super(generator);
	}

	public static ResourceLocation modLoc(String s) {
		return new ResourceLocation(MODID, s);
	}

	public static ResourceLocation smeltingLoc(String s) {
		return modLoc("smelting/" + s);
	}

	public static ResourceLocation blastingLoc(String s) {
		return modLoc("blasting/" + s);
	}

	public static ResourceLocation campfireCookingLoc(String s) {
		return modLoc("campfire_cooking/" + s);
	}

	public static ResourceLocation smokingLoc(String s) {
		return modLoc("smoking/" + s);
	}

	public static ResourceLocation shapedLoc(String s) {
		return modLoc("shaped/" + s);
	}

	public static ResourceLocation shapelessLoc(String s) {
		return modLoc("shapeless/" + s);
	}

	public static ResourceLocation smithingLoc(String s) {
		return modLoc("smithing/" + s);
	}

	public static ResourceLocation maceratingLoc(String s) {
		return modLoc("macerating/" + s);
	}

	public static ResourceLocation separatingLoc(String s) {
		return modLoc("separating/" + s);
	}

	public static ResourceLocation compressingLoc(String s) {
		return modLoc("compressing/" + s);
	}

	public static ResourceLocation canningLoc(String s) {
		return modLoc("canning/" + s);
	}

	public static ResourceLocation rollingLoc(String s) {
		return modLoc("rolling/" + s);
	}

	public static ResourceLocation extrudingLoc(String s) {
		return modLoc("extruding/" + s);
	}

	public static ResourceLocation reconstructingLoc(String s) {
		return modLoc("reconstructing/" + s);
	}

	@Override
	protected final void buildShapelessRecipes(Consumer<FinishedRecipe> consumer) {
		add(consumer);
	}

	public abstract void add(Consumer<FinishedRecipe> consumer);
}
