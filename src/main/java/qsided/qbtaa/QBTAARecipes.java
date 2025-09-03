package qsided.qbtaa;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderBase;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.ArrayList;
import java.util.List;

import static qsided.qbtaa.QBTAAMod.LOGGER;
import static qsided.qbtaa.QBTAAMod.MOD_ID;

import static qsided.qbtaa.QBTAABlocks.*;

// Same as the Models
// Please register the model entrypoint in fabric.mod.json:
// "recipesReady": [
// "deivethedev.tutorialmod.TutorialRecipes"
// ],

public class QBTAARecipes implements RecipeEntrypoint { // don't forget to implement the RecipeEntrypoint

	@Override
	public void onRecipesReady() { // Why the function name is onRecipesReady instead of initRecipes I don't know.

		ItemStack whiteDye = Items.DYE.getDefaultStack();
		whiteDye.setMetadata(15);
		ItemStack blackDye = Items.DYE.getDefaultStack();
		blackDye.setMetadata(0);

		ItemStack blackSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 240);
		ItemStack redSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 224);
		ItemStack greenSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 208);
		ItemStack brownSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 192);
		ItemStack blueSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 176);
		ItemStack purpleSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 160);
		ItemStack cyanSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 144);
		ItemStack lGraySG = new ItemStack(QBTAAItems.stained_glass_block, 1, 128);
		ItemStack graySG = new ItemStack(QBTAAItems.stained_glass_block, 1, 112);
		ItemStack pinkSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 96);
		ItemStack limeSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 80);
		ItemStack yellowSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 64);
		ItemStack lBlueSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 48);
		ItemStack magentaSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 32);
		ItemStack orangeSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 16);
		ItemStack whiteSG = new ItemStack(QBTAAItems.stained_glass_block, 1, 0);

		ItemStack blackTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 240);
		ItemStack redTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 224);
		ItemStack greenTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 208);
		ItemStack brownTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 192);
		ItemStack blueTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 176);
		ItemStack purpleTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 160);
		ItemStack cyanTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 144);
		ItemStack lGrayTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 128);
		ItemStack grayTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 112);
		ItemStack pinkTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 96);
		ItemStack limeTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 80);
		ItemStack yellowTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 64);
		ItemStack lBlueTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 48);
		ItemStack magentaTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 32);
		ItemStack orangeTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 16);
		ItemStack whiteTD = new ItemStack(QBTAAItems.stained_glass_trapdoor, 1, 0);

		ItemStack blackD = new ItemStack(QBTAAItems.stained_glass_door, 1, 0);
		ItemStack redD = new ItemStack(QBTAAItems.stained_glass_door, 1, 1);
		ItemStack greenD = new ItemStack(QBTAAItems.stained_glass_door, 1, 2);
		ItemStack brownD = new ItemStack(QBTAAItems.stained_glass_door, 1, 3);
		ItemStack blueD = new ItemStack(QBTAAItems.stained_glass_door, 1, 4);
		ItemStack purpleD = new ItemStack(QBTAAItems.stained_glass_door, 1, 5);
		ItemStack cyanD = new ItemStack(QBTAAItems.stained_glass_door, 1, 6);
		ItemStack lGrayD = new ItemStack(QBTAAItems.stained_glass_door, 1, 7);
		ItemStack grayD = new ItemStack(QBTAAItems.stained_glass_door, 1, 8);
		ItemStack pinkD = new ItemStack(QBTAAItems.stained_glass_door, 1, 9);
		ItemStack limeD = new ItemStack(QBTAAItems.stained_glass_door, 1, 10);
		ItemStack yellowD = new ItemStack(QBTAAItems.stained_glass_door, 1, 11);
		ItemStack lBlueD = new ItemStack(QBTAAItems.stained_glass_door, 1, 12);
		ItemStack magentaD = new ItemStack(QBTAAItems.stained_glass_door, 1, 13);
		ItemStack orangeD = new ItemStack(QBTAAItems.stained_glass_door, 1, 14);
		ItemStack whiteD = new ItemStack(QBTAAItems.stained_glass_door, 1, 15);

		List<ItemStack> glass = new ArrayList<>();
		glass.add(blackSG);
		glass.add(redSG);
		glass.add(greenSG);
		glass.add(brownSG);
		glass.add(blueSG);
		glass.add(purpleSG);
		glass.add(cyanSG);
		glass.add(lGraySG);
		glass.add(graySG);
		glass.add(pinkSG);
		glass.add(limeSG);
		glass.add(yellowSG);
		glass.add(lBlueSG);
		glass.add(magentaSG);
		glass.add(orangeSG);
		glass.add(whiteSG);

		List<ItemStack> glassTD = new ArrayList<>();
		glassTD.add(blackTD);
		glassTD.add(redTD);
		glassTD.add(greenTD);
		glassTD.add(brownTD);
		glassTD.add(blueTD);
		glassTD.add(purpleTD);
		glassTD.add(cyanTD);
		glassTD.add(lGrayTD);
		glassTD.add(grayTD);
		glassTD.add(pinkTD);
		glassTD.add(limeTD);
		glassTD.add(yellowTD);
		glassTD.add(lBlueTD);
		glassTD.add(magentaTD);
		glassTD.add(orangeTD);
		glassTD.add(whiteTD);

		List<ItemStack> glassD = new ArrayList<>();
		glassD.add(blackD);
		glassD.add(redD);
		glassD.add(greenD);
		glassD.add(brownD);
		glassD.add(blueD);
		glassD.add(purpleD);
		glassD.add(cyanD);
		glassD.add(lGrayD);
		glassD.add(grayD);
		glassD.add(pinkD);
		glassD.add(limeD);
		glassD.add(yellowD);
		glassD.add(lBlueD);
		glassD.add(magentaD);
		glassD.add(orangeD);
		glassD.add(whiteD);

		// Registering a fuel
		//LookupFuelFurnace.instance.addFuelEntry(woodChips.id, 20);
		//						   				     Δ	       Δ
		//                                        item id    ticks per fuel (minecraft runs at 20 ticks per second and vanilla coal lasts 1600 ticks)


		// Crafting recipe

		// Like BlockBuilder
		RecipeBuilderDyed dyedRecipe = new RecipeBuilderDyed(MOD_ID);
		dyedRecipe.create("stained_glass_blocks", new RecipeSymbol(Blocks.GLASS.getDefaultStack()), QBTAAItems.stained_glass_block, true, false);
		dyedRecipe.create("stained_glass_doors", new RecipeSymbol(Items.DOOR_GLASS.getDefaultStack()), QBTAAItems.stained_glass_door, false, true);
		dyedRecipe.create("stained_glass_trap_doors", new RecipeSymbol(Blocks.TRAPDOOR_GLASS.getDefaultStack()), QBTAAItems.stained_glass_trapdoor, true, false);
		dyedRecipe.create("stained_glass_blocks_recolor", new RecipeSymbol(glass), QBTAAItems.stained_glass_block, true, false);
		dyedRecipe.create("stained_glass_doors_recolor", new RecipeSymbol(glassD), QBTAAItems.stained_glass_door, false, true);
		dyedRecipe.create("stained_glass_trap_doors_recolor", new RecipeSymbol(glassTD), QBTAAItems.stained_glass_trapdoor, true, false);

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', blackSG)
			.create("black_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 240));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', redSG)
			.create("red_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 224));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', greenSG)
			.create("green_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 208));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', brownSG)
			.create("brown_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 192));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', blueSG)
			.create("blue_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 176));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', purpleSG)
			.create("purple_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 160));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', cyanSG)
			.create("cyan_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 144));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', lGraySG)
			.create("light_gray_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 128));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', graySG)
			.create("gray_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 112));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', pinkSG)
			.create("pink_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 96));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', limeSG)
			.create("lime_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 80));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', yellowSG)
			.create("yellow_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 64));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', lBlueSG)
			.create("light_blue_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 48));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', magentaSG)
			.create("magenta_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 32));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', orangeSG)
			.create("orange_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 16));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BBB",
				"000")
			.addInput('B', whiteSG)
			.create("white_stained_glass_trapdoor", new ItemStack(QBTAAItems.stained_glass_trapdoor, 6, 0));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', blackSG)
			.create("black_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 0));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', redSG)
			.create("red_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', greenSG)
			.create("green_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 2));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', brownSG)
			.create("brown_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 3));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', blueSG)
			.create("blue_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 4));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', purpleSG)
			.create("purple_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 5));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', cyanSG)
			.create("cyan_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', lGraySG)
			.create("light_gray_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 7));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', graySG)
			.create("gray_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', pinkSG)
			.create("pink_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 9));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', limeSG)
			.create("lime_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 10));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', yellowSG)
			.create("yellow_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 11));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', lBlueSG)
			.create("light_blue_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 12));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', magentaSG)
			.create("magenta_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 13));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', orangeSG)
			.create("orange_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 14));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"0BB",
				"0BB",
				"0BB")
			.addInput('B', whiteSG)
			.create("white_stained_glass_door", new ItemStack(QBTAAItems.stained_glass_door, 2, 15));


		//			      Δ                           Δ        Δ
		//			 recipe name               output item   quantity

		// Furnace Recipe

		//RecipeBuilder.Furnace(MOD_ID)
		//	.setInput(banana) // Item you want to cook
		//	.create("cooked_banana", new ItemStack(cookedBanana, 1));


		LOGGER.info("Recipes initialized.");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}
