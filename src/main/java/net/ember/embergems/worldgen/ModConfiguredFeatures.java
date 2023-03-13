package net.ember.embergems.worldgen;

import net.ember.embergems.EmberGems;
import net.ember.embergems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OPAL_ORES_KEY = registerKey("opal_ores");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORES_KEY = registerKey("ruby_ores");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORES_KEY = registerKey("sapphire_ores");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEARL_SAND_KEY = registerKey("pearl_sand");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_JADE_ORE_KEY = registerKey("nether_jade_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest sandReplacables = new BlockMatchTest(Blocks.SAND);

        List<OreConfiguration.TargetBlockState> opalOres = List.of(OreConfiguration.target(stoneReplacables,
                        ModBlocks.OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, ModBlocks.DEEPSLATE_OPAL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> sapphireOres = List.of(OreConfiguration.target(stoneReplacables,
                        ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> rubyOres = List.of(OreConfiguration.target(stoneReplacables,
                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        register(context, OPAL_ORES_KEY, Feature.ORE, new OreConfiguration(opalOres, 8, 0.5F));
        register(context, SAPPHIRE_ORES_KEY, Feature.ORE, new OreConfiguration(rubyOres, 8, 0.5F));
        register(context, RUBY_ORES_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 8, 0.5F));
        register(context, PEARL_SAND_KEY, Feature.ORE, new OreConfiguration(sandReplacables,
                ModBlocks.PEARLY_SAND.get().defaultBlockState(), 2, 0.75F));
        register(context, NETHER_JADE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                ModBlocks.NETHER_JADE_ORE.get().defaultBlockState(), 6, 0.75F));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
     return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(EmberGems.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register (BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}