
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theancientmod.block.MossystoneBlock;
import net.mcreator.theancientmod.TheAncientModMod;

public class TheAncientModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheAncientModMod.MODID);
	public static final RegistryObject<Block> MOSSYSTONE = REGISTRY.register("mossystone", () -> new MossystoneBlock());
}
