
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

import net.mcreator.theancientmod.world.features.ores.PlatinumoreFeature;
import net.mcreator.theancientmod.world.features.ores.MossystoneFeature;
import net.mcreator.theancientmod.world.features.ores.FrozenironoreFeature;
import net.mcreator.theancientmod.world.features.ores.EmberoreFeature;
import net.mcreator.theancientmod.world.features.WitheredspawnerFeature;
import net.mcreator.theancientmod.world.features.SilvernestFeature;
import net.mcreator.theancientmod.world.features.Sandrock3Feature;
import net.mcreator.theancientmod.world.features.Sandrock2Feature;
import net.mcreator.theancientmod.world.features.Sandrock1Feature;
import net.mcreator.theancientmod.world.features.Sand3Feature;
import net.mcreator.theancientmod.world.features.Sand2Feature;
import net.mcreator.theancientmod.world.features.Sand1Feature;
import net.mcreator.theancientmod.world.features.Ruin1Feature;
import net.mcreator.theancientmod.world.features.Rock3Feature;
import net.mcreator.theancientmod.world.features.Rock2Feature;
import net.mcreator.theancientmod.world.features.Rock1Feature;
import net.mcreator.theancientmod.world.features.Redrock3Feature;
import net.mcreator.theancientmod.world.features.Redrock2Feature;
import net.mcreator.theancientmod.world.features.Redrock1Feature;
import net.mcreator.theancientmod.world.features.Red3Feature;
import net.mcreator.theancientmod.world.features.Red2Feature;
import net.mcreator.theancientmod.world.features.Red1Feature;
import net.mcreator.theancientmod.world.features.MesaSpawnerFeature;
import net.mcreator.theancientmod.world.features.MarketFeature;
import net.mcreator.theancientmod.world.features.JunglespawnerFeature;
import net.mcreator.theancientmod.world.features.DesertspawnerFeature;
import net.mcreator.theancientmod.world.features.DeepslateforgeFeature;
import net.mcreator.theancientmod.world.features.BushFeature;
import net.mcreator.theancientmod.world.features.Bone3Feature;
import net.mcreator.theancientmod.world.features.Bone2Feature;
import net.mcreator.theancientmod.world.features.Bone1Feature;
import net.mcreator.theancientmod.world.features.AmongusboneFeature;
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
	public static final RegistryObject<Feature<?>> SAND_1 = register("sand_1", Sand1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Sand1Feature.GENERATE_BIOMES, Sand1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SAND_2 = register("sand_2", Sand2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Sand2Feature.GENERATE_BIOMES, Sand2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SAND_3 = register("sand_3", Sand3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Sand3Feature.GENERATE_BIOMES, Sand3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_1 = register("red_1", Red1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Red1Feature.GENERATE_BIOMES, Red1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_2 = register("red_2", Red2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Red2Feature.GENERATE_BIOMES, Red2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_3 = register("red_3", Red3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Red3Feature.GENERATE_BIOMES, Red3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BONE_1 = register("bone_1", Bone1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Bone1Feature.GENERATE_BIOMES, Bone1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BONE_2 = register("bone_2", Bone2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Bone2Feature.GENERATE_BIOMES, Bone2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BONE_3 = register("bone_3", Bone3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Bone3Feature.GENERATE_BIOMES, Bone3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> AMONGUSBONE = register("amongusbone", AmongusboneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, AmongusboneFeature.GENERATE_BIOMES, AmongusboneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDROCK_1 = register("sandrock_1", Sandrock1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Sandrock1Feature.GENERATE_BIOMES, Sandrock1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDROCK_2 = register("sandrock_2", Sandrock2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Sandrock2Feature.GENERATE_BIOMES, Sandrock2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDROCK_3 = register("sandrock_3", Sandrock3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Sandrock3Feature.GENERATE_BIOMES, Sandrock3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> REDROCK_1 = register("redrock_1", Redrock1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Redrock1Feature.GENERATE_BIOMES, Redrock1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> REDROCK_2 = register("redrock_2", Redrock2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Redrock2Feature.GENERATE_BIOMES, Redrock2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> REDROCK_3 = register("redrock_3", Redrock3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Redrock3Feature.GENERATE_BIOMES, Redrock3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> WITHEREDSPAWNER = register("witheredspawner", WitheredspawnerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, WitheredspawnerFeature.GENERATE_BIOMES,
					WitheredspawnerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVERNEST = register("silvernest", SilvernestFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SilvernestFeature.GENERATE_BIOMES, SilvernestFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATEFORGE = register("deepslateforge", DeepslateforgeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, DeepslateforgeFeature.GENERATE_BIOMES,
					DeepslateforgeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MARKET = register("market", MarketFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MarketFeature.GENERATE_BIOMES, MarketFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JUNGLESPAWNER = register("junglespawner", JunglespawnerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, JunglespawnerFeature.GENERATE_BIOMES, JunglespawnerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCK_1 = register("rock_1", Rock1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rock1Feature.GENERATE_BIOMES, Rock1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCK_2 = register("rock_2", Rock2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rock2Feature.GENERATE_BIOMES, Rock2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCK_3 = register("rock_3", Rock3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rock3Feature.GENERATE_BIOMES, Rock3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BUSH = register("bush", BushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BushFeature.GENERATE_BIOMES, BushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MOSSYSTONE = register("mossystone", MossystoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MossystoneFeature.GENERATE_BIOMES, MossystoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLATINUMORE = register("platinumore", PlatinumoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, PlatinumoreFeature.GENERATE_BIOMES, PlatinumoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FROZENIRONORE = register("frozenironore", FrozenironoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, FrozenironoreFeature.GENERATE_BIOMES, FrozenironoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EMBERORE = register("emberore", EmberoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EmberoreFeature.GENERATE_BIOMES, EmberoreFeature::placedFeature));

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
