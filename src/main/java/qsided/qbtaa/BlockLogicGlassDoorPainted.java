package qsided.qbtaa;

import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockLogicGlassDoorPainted extends BlockLogicDoorPainted implements IPainted {


	public BlockLogicGlassDoorPainted(Block<?> block, Material material, boolean isTop) {
		super(block, material, isTop);
	}

	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(QBTAAItems.stained_glass_door, 1, 15 - (meta >> 4 & 15))};
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
		world.setBlockAndMetadataWithNotify(x, y, z, this.isTop ? QBTAABlocks.stained_glass_door_top.id() : QBTAABlocks.stained_glass_door_bottom.id(), meta & 15);
		if (this.isTop) {
			world.setBlockAndMetadataWithNotify(x, y - 1, z, QBTAABlocks.stained_glass_door_bottom.id(), meta & 15);
		} else {
			world.setBlockAndMetadataWithNotify(x, y + 1, z, QBTAABlocks.stained_glass_door_top.id(), meta & 15);
		}

	}

	@Override
	public boolean canBePainted() {
		return true;
	}

	@Override
	public int getPlacedBlockMetadata(@Nullable Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		return stack.getMetadata() | super.getPlacedBlockMetadata(player, stack, world, x, y, z, side, xPlaced, yPlaced);
	}

	@Override
	public void setColor(World world, int x, int y, int z, DyeColor color) {
		int meta = world.getBlockMetadata(x, y, z);
		world.setBlockMetadataWithNotify(x, y, z, meta & 15 | this.toMetadata(color));
		if (this.isTop) {
			world.setBlockMetadataWithNotify(x, y - 1, z, meta & 15 | this.toMetadata(color));
		} else {
			world.setBlockMetadataWithNotify(x, y + 1, z, meta & 15 | this.toMetadata(color));
		}

	}
}
