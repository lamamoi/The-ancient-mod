
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.theancientmod.world.features.Ruin1Feature;
import net.mcreator.theancientmod.world.features.MesaSpawnerFeature;
import net.mcreator.theancientmod.world.features.DesertspawnerFeature;
import net.mcreator.theancientmod.TheAncientModMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class TheAncientModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheAncientModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DESERTSPAWNER = register("desertspawner", DesertspawnerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, DesertspawnerFeature.GENERATE_BIOMES, DesertspawnerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MESA_SPAWNER = register("mesa_spawner", MesaSpawnerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, MesaSpawnerFeature.GENERATE_BIOMES, MesaSpawnerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUIN_1 = register("ruin_1", Ruin1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Ruin1Feature.GENERATE_BIOMES, Ruin1Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
