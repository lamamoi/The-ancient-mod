
package net.mcreator.theancientmod.world.biome;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class UndergrounddesertBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(0.8333333333333334f, 1.0333333333333334f), Climate.Parameter.span(-1.1f, -0.9f), Climate.Parameter.span(0.41000000000000003f, 0.61f), Climate.Parameter.span(0.6f, 0.7999999999999999f),
					Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.2622848399272376f, -0.06228483992723763f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(0.8333333333333334f, 1.0333333333333334f), Climate.Parameter.span(-1.1f, -0.9f), Climate.Parameter.span(0.41000000000000003f, 0.61f), Climate.Parameter.span(0.6f, 0.7999999999999999f),
					Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.2622848399272376f, -0.06228483992723763f), 0));
	public static final List<Climate.ParameterPoint> UNDERGROUND_PARAMETER_POINTS = List.of(new Climate.ParameterPoint(Climate.Parameter.span(0.8333333333333334f, 1.0333333333333334f), Climate.Parameter.span(-1.1f, -0.9f),
			Climate.Parameter.span(0.41000000000000003f, 0.61f), Climate.Parameter.span(0.6f, 0.7999999999999999f), Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.2622848399272376f, -0.06228483992723763f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-4547486).waterFogColor(-860317087).skyColor(7972607).foliageColorOverride(-7110824).grassColorOverride(-7504806).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("the_ancient_mod:flower_undergrounddesert", VegetationFeatures.FLOWER_DEFAULT,
				List.of(CountPlacement.of(1), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_ancient_mod:patch_cactus_undergrounddesert", VegetationFeatures.PATCH_SUGAR_CANE, List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_ancient_mod:disk_sand_undergrounddesert",
						FeatureUtils.register("the_ancient_mod:disk_sand_undergrounddesert", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2, List.of(Blocks.SAND.defaultBlockState(), Blocks.SANDSTONE.defaultBlockState()))),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDesertVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addDesertExtraDecoration(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 6, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 9, 1, 1));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NONE).temperature(1.9f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}
}
