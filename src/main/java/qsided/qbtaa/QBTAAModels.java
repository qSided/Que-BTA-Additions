package qsided.qbtaa;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;

import net.minecraft.client.render.item.model.ItemModelDoorPainted;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static qsided.qbtaa.QBTAAMod.MOD_ID;
import static qsided.qbtaa.QBTAAMod.LOGGER;

// Importing blocks and items

import static qsided.qbtaa.QBTAABlocks.*;

public class QBTAAModels implements ModelEntrypoint {

	// If the dispatcher arg is conflicting with the override, please update your halplibe to 5.1.2
	// Go to the file gradle.properties > halplibe_version=5.1.2
	// Then in the right tab if intelliJ > Gradle > Sync All Gradle Projects (it updates de halplibe)

	// Please register the model entrypoint in fabric.mod.json:

	// "initModels": [
	//	"deivethedev.testmod.TestModels"
	// ],

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

		// The block variable is being imported from TestBlocks, look in the top of the script

		// The ModelHelper is just an easier way to create models provided by HalpLibe

		// Creating a standard block model (full block) an "applying" to the block data.
		ModelHelper.setBlockModel(stained_glass, () -> new BlockModelGlassPainted<>(stained_glass).onRenderLayer(1)
			.setTex(0, MOD_ID + ":block/glass/white", Side.sides));
		ModelHelper.setBlockModel(stained_glass_door_bottom, () -> new BlockModelGlassDoorPainted<>(stained_glass_door_bottom, false).onRenderLayer(1)
			.setTex(0, MOD_ID + ":block/door/red/bottom", Side.sides));
		ModelHelper.setBlockModel(stained_glass_door_top, () -> new BlockModelGlassDoorPainted<>(stained_glass_door_top, true).onRenderLayer(1)
			.setTex(0, MOD_ID + ":block/door/red/top", Side.sides));
		ModelHelper.setBlockModel(stained_glass_trapdoor, () -> new BlockModelGlassTrapdoorPainted<>(stained_glass_trapdoor).onRenderLayer(1)
			.setTex(0, MOD_ID + ":block/door/red/top", Side.sides));

		LOGGER.info("Block Models initialized.");
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

		// ALMOST the same as creating a standard block model (look up)
		ModelHelper.setItemModel(QBTAAItems.stained_glass_door, () -> {
			ItemModelGlassDoorPainted model = new ItemModelGlassDoorPainted(QBTAAItems.stained_glass_door);
			model.icon = TextureRegistry.getTexture(MOD_ID + ":item/glass_door_white");
			return model;
		});

		LOGGER.info("Item Models initialized.");
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}
}
