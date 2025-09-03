package qsided.qbtaa;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicGlass;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.Sys;

public class BlockLogicGlassPainted extends BlockLogicGlass implements IPainted {

	public BlockLogicGlassPainted(Block<?> block, Material material) {
		super(block, material);
	}

	@Override
	public DyeColor fromMetadata(int meta) {
		return DyeColor.colorFromBlockMeta(meta >> 4);
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case PICK_BLOCK:
			case SILK_TOUCH:
				return new ItemStack[]{new ItemStack(this.block, 1, meta & 240)};
			default:
				return null;
		}
	}

	@Override
	public int toMetadata(DyeColor dyeColor) {
		return dyeColor.blockMeta << 4;
	}

	@Override
	public int stripColorFromMetadata(int meta) {
		return meta & -241;
	}

	@Override
	public void removeDye(World world, int x, int y, int z) {
		world.setBlockWithNotify(x, y, z, QBTAABlocks.stained_glass.id());
	}

	@Override
	public DyeColor getColor(World world, int x, int y, int z) {
		return world.getBlockId(x, y, z) == QBTAABlocks.stained_glass.id() ? null : IPainted.super.getColor(world, x, y, z);
	}

	@Override
	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() & 240;
	}

	@Override
	public boolean canBePainted() {
		return true;
	}

	@Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
		System.out.print(world.getBlockMetadata(x, y, z) + " ");
		return super.onBlockRightClicked(world, x, y, z, player, side, xHit, yHit);
	}

	@Override
	public void setColor(World world, int x, int y, int z, DyeColor color) {
		int meta = world.getBlockMetadata(x, y, z);
		world.setBlockMetadataWithNotify(x, y, z, this.stripColorFromMetadata(meta) | this.toMetadata(color));
	}
}
