package qsided.qbtaa;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
import net.minecraft.core.item.ItemDoorPainted;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.item.block.ItemBlockPainted;
import turniplabs.halplibe.helper.ItemBuilder;

import static qsided.qbtaa.QBTAAMod.MOD_ID;
import static qsided.qbtaa.QBTAAMod.LOGGER;

public class QBTAAItems {

	// Importing the starting id that we set in TestConfig
	private static int startingID = QBTAAConfig.CFG.getInt("IDs.startingItemID");
	private static int nextID() {return startingID++;} // just a little function to increase the id every new item

	// Declaring items

	public static Item stained_glass_door;
	public static Item stained_glass_trapdoor;
	public static Item stained_glass_block;


	public static void initItems() {

		// Creating a simple block with no functionality

		// Like block building but shorter, please check TestBlocks before this

		// Creating a simple item (no durability and nothing else, just an image and name):
		stained_glass_door = new ItemBuilder(MOD_ID)
			.build(new ItemDoorPainted("item.stained_glass_door", MOD_ID + ":item/stained_glass_door", nextID(), QBTAABlocks.stained_glass_door_bottom, QBTAABlocks.stained_glass_door_top));
		stained_glass_trapdoor = new ItemBuilder(MOD_ID)
			.build(new ItemBlockPainted<>(QBTAABlocks.stained_glass_trapdoor, true));
		stained_glass_block = new ItemBuilder(MOD_ID)
			.build(new ItemBlockPainted<>(QBTAABlocks.stained_glass, true));

		//							Δ							Δ					 Δ
		//					  translation key		   (String) NamespaceID	      item id

		// Creating a food

		//banana = new ItemBuilder(MOD_ID)
		//	.build(new ItemFood("item.banana", MOD_ID + ":item/banana", nextID(), 1, 20, false, 9));
		//						   Δ					 Δ			       Δ	  Δ	  Δ	   Δ     Δ
		//					 translation key	(String) NamespaceID	item id   |	  |	   |     stack max size
		//																		  |   |    |
		//														  health amount  /    |    favorite wolf meal
		//														 (in half hearts)     |
		//																			ticks per half heart (minecraft runs at 20 ticks per second)

		//cookedBanana = new ItemBuilder(MOD_ID)
		//	.build(new ItemFood("item.cookedbanana", MOD_ID + ":item/cooked_banana", nextID(), 3, 20, false, 3));

		// Creating a fuel

		// like a basic item
		//woodChips = new ItemBuilder(MOD_ID)
		//	.build(new Item("item.woodchips", MOD_ID + ":item/wood_chips", nextID()));
		// then you need to register it as a fuel. Go to TutorialRecipes


		LOGGER.info("Items initialized.");
	}
}
