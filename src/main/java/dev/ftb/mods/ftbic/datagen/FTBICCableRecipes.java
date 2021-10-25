package dev.ftb.mods.ftbic.datagen;

import dev.ftb.mods.ftbic.item.FTBICItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import java.util.function.Consumer;

public class FTBICCableRecipes extends FTBICRecipes {
	public FTBICCableRecipes(DataGenerator generator) {
		super(generator);
	}

	@Override
	public void add(Consumer<FinishedRecipe> consumer) {
		// Wire from metal

		ShapedRecipeBuilder.shaped(FTBICItems.COPPER_WIRE.get(), 6)
				.unlockedBy("has_item", has(COPPER_INGOT))
				.group(MODID + ":cable")
				.pattern("MMM")
				.define('M', COPPER_INGOT)
				.save(consumer, shapedLoc("copper_wire"));

		ShapedRecipeBuilder.shaped(FTBICItems.GOLD_WIRE.get(), 6)
				.unlockedBy("has_item", has(GOLD_INGOT))
				.group(MODID + ":cable")
				.pattern("MMM")
				.define('M', GOLD_INGOT)
				.save(consumer, shapedLoc("gold_wire"));

		ShapedRecipeBuilder.shaped(FTBICItems.ALUMINUM_WIRE.get(), 3)
				.unlockedBy("has_item", has(ALUMINUM_INGOT))
				.group(MODID + ":cable")
				.pattern("MMM")
				.define('M', ALUMINUM_INGOT)
				.save(consumer, shapedLoc("aluminum_wire"));

		// Cable from metal + rubber

		ShapedRecipeBuilder.shaped(FTBICItems.COPPER_CABLE.get(), 6)
				.unlockedBy("has_item", has(RUBBER))
				.group(MODID + ":cable")
				.pattern("RRR")
				.pattern("MMM")
				.pattern("RRR")
				.define('R', RUBBER)
				.define('M', COPPER_INGOT)
				.save(consumer, shapedLoc("copper_cable"));

		ShapedRecipeBuilder.shaped(FTBICItems.GOLD_CABLE.get(), 6)
				.unlockedBy("has_item", has(RUBBER))
				.group(MODID + ":cable")
				.pattern("RRR")
				.pattern("MMM")
				.pattern("RRR")
				.define('R', RUBBER)
				.define('M', GOLD_INGOT)
				.save(consumer, shapedLoc("gold_cable"));

		ShapedRecipeBuilder.shaped(FTBICItems.ALUMINUM_CABLE.get(), 3)
				.unlockedBy("has_item", has(RUBBER))
				.group(MODID + ":cable")
				.pattern("RRR")
				.pattern("MMM")
				.pattern("RRR")
				.define('R', RUBBER)
				.define('M', ALUMINUM_INGOT)
				.save(consumer, shapedLoc("aluminum_cable"));

		// Cable from wire + rubber

		ShapelessRecipeBuilder.shapeless(FTBICItems.COPPER_CABLE.get())
				.unlockedBy("has_item", has(RUBBER))
				.group(MODID + ":cable")
				.requires(FTBICItems.COPPER_WIRE.get())
				.requires(RUBBER)
				.save(consumer, shapelessLoc("copper_cable"));

		ShapelessRecipeBuilder.shapeless(FTBICItems.GOLD_CABLE.get())
				.unlockedBy("has_item", has(RUBBER))
				.group(MODID + ":cable")
				.requires(FTBICItems.GOLD_WIRE.get())
				.requires(RUBBER)
				.save(consumer, shapelessLoc("gold_cable"));

		ShapelessRecipeBuilder.shapeless(FTBICItems.ALUMINUM_CABLE.get())
				.unlockedBy("has_item", has(RUBBER))
				.group(MODID + ":cable")
				.requires(FTBICItems.ALUMINUM_WIRE.get())
				.requires(RUBBER)
				.requires(RUBBER)
				.save(consumer, shapelessLoc("aluminum_cable"));
	}
}
