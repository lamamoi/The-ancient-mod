package net.mcreator.theancientmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UndergrouddesertgenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("the_ancient_mod:undergrounddesert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				&& (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COAL_ORE) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
		}
		if (true) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SAND.defaultBlockState(), 3);
		}
		if (true) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SAND.defaultBlockState(), 3);
		}
		if (true) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SAND.defaultBlockState(), 3);
		}
	}
}
