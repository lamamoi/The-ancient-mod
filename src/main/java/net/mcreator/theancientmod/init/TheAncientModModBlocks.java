
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.theancientmod.block.PlatinumoreBlock;
import net.mcreator.theancientmod.block.PlatinumblockBlock;
import net.mcreator.theancientmod.block.MossystoneBlock;
import net.mcreator.theancientmod.block.MalachiteoreBlock;
import net.mcreator.theancientmod.block.FrozenwallBlock;
import net.mcreator.theancientmod.block.FrozenstoneBlock;
import net.mcreator.theancientmod.block.FrozenstairsBlock;
import net.mcreator.theancientmod.block.FrozenslabBlock;
import net.mcreator.theancientmod.block.FrozenironoreBlock;
import net.mcreator.theancientmod.block.FrozencobblestoneBlock;
import net.mcreator.theancientmod.block.FrozenchiseledbricksBlock;
import net.mcreator.theancientmod.block.FrozenbrickBlock;
import net.mcreator.theancientmod.block.EmberoreBlock;
import net.mcreator.theancientmod.TheAncientModMod;

public class TheAncientModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheAncientModMod.MODID);
	public static final RegistryObject<Block> MOSSYSTONE = REGISTRY.register("mossystone", () -> new MossystoneBlock());
	public static final RegistryObject<Block> PLATINUMORE = REGISTRY.register("platinumore", () -> new PlatinumoreBlock());
	public static final RegistryObject<Block> PLATINUMBLOCK = REGISTRY.register("platinumblock", () -> new PlatinumblockBlock());
	public static final RegistryObject<Block> FROZENSTONE = REGISTRY.register("frozenstone", () -> new FrozenstoneBlock());
	public static final RegistryObject<Block> FROZENCOBBLESTONE = REGISTRY.register("frozencobblestone", () -> new FrozencobblestoneBlock());
	public static final RegistryObject<Block> FROZENBRICK = REGISTRY.register("frozenbrick", () -> new FrozenbrickBlock());
	public static final RegistryObject<Block> FROZENCHISELEDBRICKS = REGISTRY.register("frozenchiseledbricks", () -> new FrozenchiseledbricksBlock());
	public static final RegistryObject<Block> FROZENSTAIRS = REGISTRY.register("frozenstairs", () -> new FrozenstairsBlock());
	public static final RegistryObject<Block> FROZENSLAB = REGISTRY.register("frozenslab", () -> new FrozenslabBlock());
	public static final RegistryObject<Block> FROZENWALL = REGISTRY.register("frozenwall", () -> new FrozenwallBlock());
	public static final RegistryObject<Block> FROZENIRONORE = REGISTRY.register("frozenironore", () -> new FrozenironoreBlock());
	public static final RegistryObject<Block> EMBERORE = REGISTRY.register("emberore", () -> new EmberoreBlock());
	public static final RegistryObject<Block> MALACHITEORE = REGISTRY.register("malachiteore", () -> new MalachiteoreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PlatinumoreBlock.registerRenderLayer();
			FrozenwallBlock.registerRenderLayer();
		}
	}
}
