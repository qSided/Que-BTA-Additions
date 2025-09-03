package qsided.qbtaa;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static qsided.qbtaa.QBTAAMod.MOD_ID; // need to static because it is just one variable
import static qsided.qbtaa.QBTAAMod.LOGGER; // same

public class QBTAABlocks {

	// START HERE
	// For each block you will need a texture, a name, and an id.
	// the id could be set manually, but if in the future you need to change them, you would need to do this manually as well
	// so we need make it automatically
	// go to TestConfig class, change the values and go back here

	// Importing the starting id that we set in TestConfig
	private static int startingID = QBTAAConfig.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {return startingID++;} // just a little function to increase the id every new item

	// Declaring blocks

	public static Block<?> stained_glass; // basic block
	public static Block<BlockLogicGlassDoorPainted> stained_glass_door_top; // basic block
	public static Block<BlockLogicGlassDoorPainted> stained_glass_door_bottom; // basic block
	public static Block<BlockLogicGlassTrapdoorPainted> stained_glass_trapdoor; // basic block

	public static void initBlocks() {
		// Creating a simple block with no functionality:

		// Creating a BlockBuilder
		// The BlockBuilder is just an easier way to create blocks provided by HalpLibe

		BlockBuilder builder = new BlockBuilder(MOD_ID) // MOD_ID is being imported from TestMod, look in the top of the script.

			// Setting properties of the block. Check the possible properties: Ctrl + LeftClick in BlockBuilder
			.setBlockSound(BlockSounds.GLASS)
			.setHardness(0.3F)
			.setLightOpacity(0)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.EXTENDS_MOTION_SENSOR_RANGE);

			// Sets the block tags (the game uses it to interact with the block). Check the possible tags: Ctrl + LeftClick in BlockTags
			//.addTags(BlockTags.MINEABLE_BY_PICKAXE);

		// The build function just create an Item with the created builder properties
		stained_glass = builder.build("block.stained_glass", "block/stained_glass", nextID(), b -> new BlockLogicGlassPainted(b, Material.glass));

		stained_glass_door_top = builder.build("block.stained_glass_door_top", "block/stained_glass_door_top", nextID(),
			b -> new BlockLogicGlassDoorPainted(b, Material.glass, true));
		stained_glass_door_bottom = builder.build("block.stained_glass_door_bottom", "block/stained_glass_door_bottom", nextID(),
			b -> new BlockLogicGlassDoorPainted(b, Material.glass, false));
		stained_glass_trapdoor = builder.build("block.stained_glass_trapdoor", "block/stained_glass_trapdoor", nextID(),
			b -> new BlockLogicGlassTrapdoorPainted(b, Material.glass));

		//								traslationKey      name               id        block logic ( you don't need to know for now, just that )
		// 									 |													    ( material sets the sound when placing the block)
		// 									 V
		// 								go to resources > lang > testmod > en_US.lang to see how it works

		// So far you have only registered the block, it appears in the inventory but does not have a texture. For that check TestModels > initBlockModels

		LOGGER.info("Blocks initialized.");
	}
}
