
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.theancientmod.TheAncientModMod;

public class TheAncientModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheAncientModMod.MODID);
	public static final RegistryObject<Item> REDSKELETON = REGISTRY.register("redskeleton_spawn_egg",
			() -> new ForgeSpawnEggItem(TheAncientModModEntities.REDSKELETON, -8630525, -8643837,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DUGK = REGISTRY.register("dugk_spawn_egg",
			() -> new ForgeSpawnEggItem(TheAncientModModEntities.DUGK, -16740394, -671929, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
