package qsided.qbtaa;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicTrapDoorPainted;
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

public class BlockLogicGlassTrapdoorPainted extends BlockLogicTrapDoorPainted implements IPainted {

	public BlockLogicGlassTrapdoorPainted(Block<?> block, Material material) {
		super(block, material);
	}

	@Override
	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() | super.getPlacedBlockMetadata(player, stack, world, x, y, z, side, xPlaced, yPlaced);
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(QBTAABlocks.stained_glass_trapdoor, 1, (meta >> 4 & 15) << 4)};
	}

	@Override
	public DyeColor fromMetadata(int meta) {
		return DyeColor.colorFromBlockMeta(meta >> 4 & 15);
	}

	@Override
	public int toMetadata(DyeColor color) {
		return color.blockMeta << 4;
	}

	@Override
	public int stripColorFromMetadata(int meta) {
		return meta & 15;
	}

	@Override
	public void removeDye(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		world.setBlockAndMetadataWithNotify(x, y, z, QBTAABlocks.stained_glass_trapdoor.id(), meta & 15);
	}

	@Override
	public boolean canBePainted() {
		return true;
	}

	@Override
	public void setColor(World world, int x, int y, int z, DyeColor color) {
		super.setColor(world, x, y, z, color);
	}
}
