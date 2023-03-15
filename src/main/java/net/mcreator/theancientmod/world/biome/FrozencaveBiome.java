
package net.mcreator.theancientmod.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;

public class FrozencaveBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.7666666666666667f, -0.5666666666666668f), Climate.Parameter.span(0.29999999999999993f, 0.4999999999999999f), Climate.Parameter.span(0.37f, 0.5700000000000001f),
					Climate.Parameter.span(0.7000000000000001f, 0.9f), Climate.Parameter.point(0.0f), Climate.Parameter.span(0.3149913064081432f, 0.5149913064081432f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.7666666666666667f, -0.5666666666666668f), Climate.Parameter.span(0.29999999999999993f, 0.4999999999999999f), Climate.Parameter.span(0.37f, 0.5700000000000001f),
					Climate.Parameter.span(0.7000000000000001f, 0.9f), Climate.Parameter.point(1.0f), Climate.Parameter.span(0.3149913064081432f, 0.5149913064081432f), 0));
	public static final List<Climate.ParameterPoint> UNDERGROUND_PARAMETER_POINTS = List
			.of(new Climate.ParameterPoint(Climate.Parameter.span(-0.7666666666666667f, -0.5666666666666668f), Climate.Parameter.span(0.29999999999999993f, 0.4999999999999999f), Climate.Parameter.span(0.37f, 0.5700000000000001f),
					Climate.Parameter.span(0.7000000000000001f, 0.9f), Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(0.3149913064081432f, 0.5149913064081432f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-12457483).waterFogColor(-15548983).skyColor(7972607).foliageColorOverride(-4199185).grassColorOverride(-4199185)
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.SNOWFLAKE, 0.001f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.UNDERGROUND_WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.GLOW_SQUID, 2, 1, 1));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.NONE).temperature(-0.5f).downfall(0.7f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}
}
