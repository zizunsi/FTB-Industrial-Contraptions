package dev.ftb.mods.ftbic.recipe;

import dev.ftb.mods.ftbic.util.IngredientWithCount;
import dev.ftb.mods.ftbic.util.StackWithChance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;

public class MachineRecipe implements Recipe<NoContainer> {
	public final MachineRecipeSerializer serializer;
	public final ResourceLocation id;
	public List<IngredientWithCount> inputItems;
	public List<FluidStack> inputFluids;
	public List<StackWithChance> outputItems;
	public List<FluidStack> outputFluids;
	public double processingTime;

	public MachineRecipe(MachineRecipeSerializer s, ResourceLocation i) {
		serializer = s;
		id = i;
		processingTime = 1D;
	}

	@Override
	public boolean matches(NoContainer container, Level level) {
		return false;
	}

	@Override
	public ItemStack assemble(NoContainer container) {
		return getResultItem().copy();
	}

	@Override
	public boolean canCraftInDimensions(int width, int height) {
		return false;
	}

	@Override
	public ItemStack getResultItem() {
		return outputItems.isEmpty() ? ItemStack.EMPTY : outputItems.get(0).stack;
	}

	@Override
	public ResourceLocation getId() {
		return id;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return serializer;
	}

	@Override
	public RecipeType<?> getType() {
		return serializer.recipeType;
	}
}
