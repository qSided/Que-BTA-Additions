package qsided.qbtaa;

import net.minecraft.client.render.block.model.BlockModelTransparent;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import org.jetbrains.annotations.Nullable;

public class BlockModelGlassPainted<T extends BlockLogic> extends BlockModelTransparent<T> {

	protected final IconCoordinate[] texCoords = new IconCoordinate[16];

	public BlockModelGlassPainted(Block<T> block) {
		super(block, false);

		for(DyeColor c : DyeColor.blockOrderedColors()) {
			this.texCoords[c.blockMeta] = TextureRegistry.getTexture(QBTAAMod.MOD_ID + ":block/glass/" + c.colorID);
		}

	}

	public @Nullable IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int meta) {
		return this.texCoords[meta >> 4 & 15];
	}
}
