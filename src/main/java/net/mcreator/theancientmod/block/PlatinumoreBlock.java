
package net.mcreator.theancientmod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.theancientmod.procedures.PlatinumoreBlockDestroyedByPlayerProcedure;
import net.mcreator.theancientmod.init.TheAncientModModItems;
import net.mcreator.theancientmod.init.TheAncientModModBlocks;

import java.util.List;
import java.util.Collections;

public class PlatinumoreBlock extends Block {
	public PlatinumoreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.WARPED_WART_BLOCK).sound(SoundType.DEEPSLATE).strength(3.5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheAncientModModItems.RAWPLATINUM.get()));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		PlatinumoreBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TheAncientModModBlocks.PLATINUMORE.get(), renderType -> renderType == RenderType.cutout());
	}
}
