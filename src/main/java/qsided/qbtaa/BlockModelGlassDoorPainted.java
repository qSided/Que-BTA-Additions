package qsided.qbtaa;

import net.minecraft.client.render.block.model.BlockModelDoor;
import net.minecraft.client.render.block.model.BlockModelDoorPainted;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicDoorPainted;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;

public class BlockModelGlassDoorPainted<T extends BlockLogicGlassDoorPainted> extends BlockModelDoorPainted<T> {

	public static final IconCoordinate[] doorBottomTextures = new IconCoordinate[16];
	public static final IconCoordinate[] doorTopTextures = new IconCoordinate[16];
	public static final IconCoordinate[] frameTopTextures = new IconCoordinate[16];
	private final boolean isTop;

	public BlockModelGlassDoorPainted(Block<T> block, boolean isTop) {
		super(block, false);
		this.isTop = isTop;
	}

	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		int color = data >> 4 & 15;
		if (side.getAxis() == Axis.Y) {
			return frameTopTextures[color];
		} else {
			return this.isTop ? doorTopTextures[color] : doorBottomTextures[color];
		}
	}

	static {
		for(DyeColor c : DyeColor.blockOrderedColors()) {
			doorTopTextures[c.blockMeta] = TextureRegistry.getTexture(QBTAAMod.MOD_ID + ":block/door/" + c.colorID + "/top");
			doorBottomTextures[c.blockMeta] = TextureRegistry.getTexture(QBTAAMod.MOD_ID + ":block/door/" + c.colorID + "/bottom");
			frameTopTextures[c.blockMeta] = TextureRegistry.getTexture(QBTAAMod.MOD_ID + ":block/door/" + c.colorID + "/frame_top");
		}

	}
}
