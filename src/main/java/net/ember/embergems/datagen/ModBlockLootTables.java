package net.ember.embergems.datagen;

import net.ember.embergems.block.ModBlocks;
import net.ember.embergems.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.OPAL_BLOCK.get());
        dropSelf(ModBlocks.PEARL_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.JADE_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());

        add(ModBlocks.OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.OPAL_ORE.get(), ModItems.OPAL.get()));
        add(ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_OPAL_ORE.get(), ModItems.OPAL.get()));
        add(ModBlocks.SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlocks.NETHER_JADE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHER_JADE_ORE.get(), ModItems.JADE.get()));
        add(ModBlocks.PEARLY_SAND.get(),
                (block) -> createOreDrop(ModBlocks.PEARLY_SAND.get(), ModItems.PEARL.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
