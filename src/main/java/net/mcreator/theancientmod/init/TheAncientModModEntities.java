
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.theancientmod.entity.RedskeletonEntity;
import net.mcreator.theancientmod.entity.DugkEntity;
import net.mcreator.theancientmod.TheAncientModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheAncientModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, TheAncientModMod.MODID);
	public static final RegistryObject<EntityType<RedskeletonEntity>> REDSKELETON = register("redskeleton",
			EntityType.Builder.<RedskeletonEntity>of(RedskeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(23).setUpdateInterval(3).setCustomClientFactory(RedskeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DugkEntity>> DUGK = register("dugk",
			EntityType.Builder.<DugkEntity>of(DugkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(38)
					.setUpdateInterval(3).setCustomClientFactory(DugkEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RedskeletonEntity.init();
			DugkEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REDSKELETON.get(), RedskeletonEntity.createAttributes().build());
		event.put(DUGK.get(), DugkEntity.createAttributes().build());
	}
}
