
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theancientmod.item.RawplatinumItem;
import net.mcreator.theancientmod.item.PlatinumswordItem;
import net.mcreator.theancientmod.item.PlatinumshovelItem;
import net.mcreator.theancientmod.item.PlatinumpickItem;
import net.mcreator.theancientmod.item.PlatinumingotItem;
import net.mcreator.theancientmod.item.PlatinumhoeItem;
import net.mcreator.theancientmod.item.PlatinumaxeItem;
import net.mcreator.theancientmod.item.PlatinumarmorArmorItem;
import net.mcreator.theancientmod.item.MalachiteItem;
import net.mcreator.theancientmod.item.EmberItem;
import net.mcreator.theancientmod.item.CopperarmorArmorItem;
import net.mcreator.theancientmod.TheAncientModMod;

public class TheAncientModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheAncientModMod.MODID);
	public static final RegistryObject<Item> DUGK = REGISTRY.register("dugk_spawn_egg",
			() -> new ForgeSpawnEggItem(TheAncientModModEntities.DUGK, -16740394, -671929, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MOSSYSTONE = block(TheAncientModModBlocks.MOSSYSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLATINUMORE = block(TheAncientModModBlocks.PLATINUMORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAWPLATINUM = REGISTRY.register("rawplatinum", () -> new RawplatinumItem());
	public static final RegistryObject<Item> PLATINUMINGOT = REGISTRY.register("platinumingot", () -> new PlatinumingotItem());
	public static final RegistryObject<Item> PLATINUMSWORD = REGISTRY.register("platinumsword", () -> new PlatinumswordItem());
	public static final RegistryObject<Item> PLATINUMPICK = REGISTRY.register("platinumpick", () -> new PlatinumpickItem());
	public static final RegistryObject<Item> PLATINUMAXE = REGISTRY.register("platinumaxe", () -> new PlatinumaxeItem());
	public static final RegistryObject<Item> PLATINUMSHOVEL = REGISTRY.register("platinumshovel", () -> new PlatinumshovelItem());
	public static final RegistryObject<Item> PLATINUMHOE = REGISTRY.register("platinumhoe", () -> new PlatinumhoeItem());
	public static final RegistryObject<Item> PLATINUMBLOCK = block(TheAncientModModBlocks.PLATINUMBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENSTONE = block(TheAncientModModBlocks.FROZENSTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENBRICK = block(TheAncientModModBlocks.FROZENBRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENCHISELEDBRICKS = block(TheAncientModModBlocks.FROZENCHISELEDBRICKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENCOBBLESTONE = block(TheAncientModModBlocks.FROZENCOBBLESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENIRONORE = block(TheAncientModModBlocks.FROZENIRONORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENSTAIRS = block(TheAncientModModBlocks.FROZENSTAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENSLAB = block(TheAncientModModBlocks.FROZENSLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROZENWALL = block(TheAncientModModBlocks.FROZENWALL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLATINUMARMOR_ARMOR_HELMET = REGISTRY.register("platinumarmor_armor_helmet",
			() -> new PlatinumarmorArmorItem.Helmet());
	public static final RegistryObject<Item> PLATINUMARMOR_ARMOR_CHESTPLATE = REGISTRY.register("platinumarmor_armor_chestplate",
			() -> new PlatinumarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> PLATINUMARMOR_ARMOR_LEGGINGS = REGISTRY.register("platinumarmor_armor_leggings",
			() -> new PlatinumarmorArmorItem.Leggings());
	public static final RegistryObject<Item> PLATINUMARMOR_ARMOR_BOOTS = REGISTRY.register("platinumarmor_armor_boots",
			() -> new PlatinumarmorArmorItem.Boots());
	public static final RegistryObject<Item> EMBER = REGISTRY.register("ember", () -> new EmberItem());
	public static final RegistryObject<Item> EMBERORE = block(TheAncientModModBlocks.EMBERORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MALACHITE = REGISTRY.register("malachite", () -> new MalachiteItem());
	public static final RegistryObject<Item> MALACHITEORE = block(TheAncientModModBlocks.MALACHITEORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COPPERARMOR_ARMOR_HELMET = REGISTRY.register("copperarmor_armor_helmet",
			() -> new CopperarmorArmorItem.Helmet());
	public static final RegistryObject<Item> COPPERARMOR_ARMOR_CHESTPLATE = REGISTRY.register("copperarmor_armor_chestplate",
			() -> new CopperarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPERARMOR_ARMOR_LEGGINGS = REGISTRY.register("copperarmor_armor_leggings",
			() -> new CopperarmorArmorItem.Leggings());
	public static final RegistryObject<Item> COPPERARMOR_ARMOR_BOOTS = REGISTRY.register("copperarmor_armor_boots",
			() -> new CopperarmorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
