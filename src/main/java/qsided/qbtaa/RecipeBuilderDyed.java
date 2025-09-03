package qsided.qbtaa;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCraftingShapeless;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryDyeing;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShapeless;

import java.util.ArrayList;
import java.util.List;

public class RecipeBuilderDyed extends RecipeBuilderShapeless {

	public RecipeBuilderDyed(String modID) {
		super(modID);
	}

	@SuppressWarnings({"unused", "unchecked"})
	public void create(String recipeID, RecipeSymbol symbol, IItemConvertible dyedOutput, boolean useUpperMeta, boolean useItemMeta) {
		((RecipeGroup<RecipeEntryCrafting<?, ?>>) RecipeBuilder.getRecipeGroup(modID, "workbench", new RecipeSymbol(Blocks.WORKBENCH.getDefaultStack())))
			.register(recipeID, new RecipeEntryDyeing(symbol, dyedOutput.getDefaultStack(), useUpperMeta, useItemMeta));
	}
}
