
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theancientmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.theancientmod.world.biome.UndergroundmesaBiome;
import net.mcreator.theancientmod.world.biome.UndergroundjungleBiome;
import net.mcreator.theancientmod.world.biome.UndergrounddesertBiome;
import net.mcreator.theancientmod.world.biome.FrozencaveBiome;
import net.mcreator.theancientmod.TheAncientModMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber
public class TheAncientModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TheAncientModMod.MODID);
	public static final RegistryObject<Biome> UNDERGROUNDDESERT = REGISTRY.register("undergrounddesert", () -> UndergrounddesertBiome.createBiome());
	public static final RegistryObject<Biome> UNDERGROUNDMESA = REGISTRY.register("undergroundmesa", () -> UndergroundmesaBiome.createBiome());
	public static final RegistryObject<Biome> UNDERGROUNDJUNGLE = REGISTRY.register("undergroundjungle", () -> UndergroundjungleBiome.createBiome());
	public static final RegistryObject<Biome> FROZENCAVE = REGISTRY.register("frozencave", () -> FrozencaveBiome.createBiome());

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					for (Climate.ParameterPoint parameterPoint : UndergrounddesertBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDDESERT.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : UndergroundmesaBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDMESA.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : FrozencaveBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, FROZENCAVE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : UndergrounddesertBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDDESERT.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : UndergroundmesaBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDMESA.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : UndergroundjungleBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDJUNGLE.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : FrozencaveBiome.UNDERGROUND_PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, FROZENCAVE.getId()))));
					}

					MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
					chunkGenerator.biomeSource = moddedNoiseSource;
					chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDDESERT.getId()), Blocks.SAND.defaultBlockState(), Blocks.SANDSTONE.defaultBlockState(), Blocks.SMOOTH_SANDSTONE.defaultBlockState()));
						surfaceRules.add(1,
								anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDMESA.getId()), Blocks.RED_SAND.defaultBlockState(), Blocks.RED_SANDSTONE.defaultBlockState(), Blocks.SMOOTH_RED_SANDSTONE.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDJUNGLE.getId()), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.MOSS_BLOCK.defaultBlockState()));
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, FROZENCAVE.getId()), TheAncientModModBlocks.FROZENSTONE.get().defaultBlockState(), TheAncientModModBlocks.FROZENSTONE.get().defaultBlockState(),
								Blocks.PACKED_ICE.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDDESERT.getId()), Blocks.SAND.defaultBlockState(), Blocks.SANDSTONE.defaultBlockState(), Blocks.SMOOTH_SANDSTONE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, UNDERGROUNDMESA.getId()), Blocks.RED_SAND.defaultBlockState(), Blocks.RED_SANDSTONE.defaultBlockState(),
								Blocks.SMOOTH_RED_SANDSTONE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, FROZENCAVE.getId()), TheAncientModModBlocks.FROZENSTONE.get().defaultBlockState(),
								TheAncientModModBlocks.FROZENSTONE.get().defaultBlockState(), Blocks.PACKED_ICE.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])), noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
								noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
					}
				}
			}

		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}
}
