
package net.mcreator.theancientmod.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class UndergrounddesertBiome {

	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0.661904761905f, 0.804761904763f),
			Climate.Parameter.span(-1.071428571429f, -0.928571428571f), Climate.Parameter.span(0.438571428571f, 0.581428571429f),
			Climate.Parameter.span(0.628571428571f, 0.771428571429f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.233713411356f, -0.090856268498f), 0);

	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(0.01f, 1.01f), Climate.Parameter.span(0.2f, 1.2f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.662284839927f, 0.337715160073f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-4547486).waterFogColor(-860317087)
				.skyColor(7972607).foliageColorOverride(-7110824).grassColorOverride(-7504806).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_ancient_mod:flower_undergrounddesert", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(1),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_ancient_mod:patch_cactus_undergrounddesert", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("the_ancient_mod:disk_sand_undergrounddesert",
						FeatureUtils.register("the_ancient_mod:disk_sand_undergrounddesert", Feature.DISK,
								new DiskConfiguration(Blocks.SAND.defaultBlockState(), UniformInt.of(2, 6), 2,
										List.of(Blocks.SAND.defaultBlockState(), Blocks.SANDSTONE.defaultBlockState()))),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));

		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 16, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 6, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 9, 1, 1));

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).temperature(1.6f)
				.downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
	}

}
