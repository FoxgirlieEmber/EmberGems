package net.ember.embergems.datagen;

import net.ember.embergems.EmberGems;
import net.ember.embergems.block.ModBlocks;
import net.ember.embergems.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
//SMELTING
        oreSmelting(consumer, List.of(ModBlocks.OPAL_ORE.get()), RecipeCategory.MISC,
                ModItems.OPAL.get(), 0.7f, 200, "opal");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_OPAL_ORE.get()), RecipeCategory.MISC,
                ModItems.OPAL.get(), 0.7f, 200, "opal");
        oreSmelting(consumer, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 200, "sapphire");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 200, "sapphire");
        oreSmelting(consumer, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f, 200, "ruby");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f, 200, "ruby");
        oreSmelting(consumer, List.of(ModBlocks.NETHER_JADE_ORE.get()), RecipeCategory.MISC,
                ModItems.JADE.get(), 0.7f, 200, "jade");
        oreSmelting(consumer, List.of(ModBlocks.PEARLY_SAND.get()), RecipeCategory.MISC,
                ModItems.PEARL.get(), 0.7f, 200, "pearl");
//BLASTING
        oreBlasting(consumer, List.of(ModBlocks.OPAL_ORE.get()), RecipeCategory.MISC,
                ModItems.OPAL.get(), 0.7f, 100, "opal");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_OPAL_ORE.get()), RecipeCategory.MISC,
                ModItems.OPAL.get(), 0.7f, 100, "opal");
        oreBlasting(consumer, List.of(ModBlocks.SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 100, "sapphire");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 100, "sapphire");
        oreBlasting(consumer, List.of(ModBlocks.RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f, 100, "ruby");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC,
                ModItems.RUBY.get(), 0.7f, 100, "ruby");
        oreBlasting(consumer, List.of(ModBlocks.NETHER_JADE_ORE.get()), RecipeCategory.MISC,
                ModItems.JADE.get(), 0.7f, 100, "jade");
        oreBlasting(consumer, List.of(ModBlocks.PEARLY_SAND.get()), RecipeCategory.MISC,
                ModItems.PEARL.get(), 0.7f, 100, "pearl");
//GEM BLOCKS
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.OPAL.get(), RecipeCategory.MISC,
                ModBlocks.OPAL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.PEARL.get(), RecipeCategory.MISC,
                ModBlocks.PEARL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE.get(), RecipeCategory.MISC,
                ModBlocks.SAPPHIRE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE.get(), RecipeCategory.MISC,
                ModBlocks.JADE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY.get(), RecipeCategory.MISC,
                ModBlocks.RUBY_BLOCK.get());
//OPAL ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_SWORD.get())
                .define('E', ModItems.OPAL.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("I")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_SHOVEL.get())
                .define('E', ModItems.OPAL.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("I")
                .pattern("I")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_AXE.get())
                .define('E', ModItems.OPAL.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("IE")
                .pattern("I ")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_HOE.get())
                .define('E', ModItems.OPAL.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("I ")
                .pattern("I ")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_PICKAXE.get())
                .define('E', ModItems.OPAL.get())
                .define('I', Items.STICK)
                .pattern("EEE")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_HELMET.get())
                .define('E', ModItems.OPAL.get())
                .pattern("EEE")
                .pattern("E E")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_CHESTPLATE.get())
                .define('E', ModItems.OPAL.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_LEGGINGS.get())
                .define('E', ModItems.OPAL.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OPAL_BOOTS.get())
                .define('E', ModItems.OPAL.get())
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_opal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.OPAL.get()).build()))
                .save(consumer);
//PEARL ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_SWORD.get())
                .define('E', ModItems.PEARL.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("I")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_SHOVEL.get())
                .define('E', ModItems.PEARL.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("I")
                .pattern("I")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_AXE.get())
                .define('E', ModItems.PEARL.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("IE")
                .pattern("I ")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_HOE.get())
                .define('E', ModItems.PEARL.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("I ")
                .pattern("I ")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_PICKAXE.get())
                .define('E', ModItems.PEARL.get())
                .define('I', Items.STICK)
                .pattern("EEE")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_HELMET.get())
                .define('E', ModItems.PEARL.get())
                .pattern("EEE")
                .pattern("E E")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_CHESTPLATE.get())
                .define('E', ModItems.PEARL.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_LEGGINGS.get())
                .define('E', ModItems.PEARL.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.PEARL_BOOTS.get())
                .define('E', ModItems.PEARL.get())
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_pearl", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.PEARL.get()).build()))
                .save(consumer);
//SAPPHIRE ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SWORD.get())
                .define('E', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("I")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SHOVEL.get())
                .define('E', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("I")
                .pattern("I")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE.get())
                .define('E', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("IE")
                .pattern("I ")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HOE.get())
                .define('E', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("I ")
                .pattern("I ")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE.get())
                .define('E', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .pattern("EEE")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HELMET.get())
                .define('E', ModItems.SAPPHIRE.get())
                .pattern("EEE")
                .pattern("E E")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_CHESTPLATE.get())
                .define('E', ModItems.SAPPHIRE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_LEGGINGS.get())
                .define('E', ModItems.SAPPHIRE.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_BOOTS.get())
                .define('E', ModItems.SAPPHIRE.get())
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SAPPHIRE.get()).build()))
                .save(consumer);
//JADE ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_SWORD.get())
                .define('E', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("I")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_SHOVEL.get())
                .define('E', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("I")
                .pattern("I")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_AXE.get())
                .define('E', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("IE")
                .pattern("I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_HOE.get())
                .define('E', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("I ")
                .pattern("I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_PICKAXE.get())
                .define('E', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("EEE")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_HELMET.get())
                .define('E', ModItems.JADE.get())
                .pattern("EEE")
                .pattern("E E")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_CHESTPLATE.get())
                .define('E', ModItems.JADE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_LEGGINGS.get())
                .define('E', ModItems.JADE.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_BOOTS.get())
                .define('E', ModItems.JADE.get())
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
//RUBY ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_SWORD.get())
                .define('E', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("I")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL.get())
                .define('E', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .pattern("E")
                .pattern("I")
                .pattern("I")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE.get())
                .define('E', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("IE")
                .pattern("I ")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE.get())
                .define('E', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .pattern("EE")
                .pattern("I ")
                .pattern("I ")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE.get())
                .define('E', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .pattern("EEE")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_HELMET.get())
                .define('E', ModItems.RUBY.get())
                .pattern("EEE")
                .pattern("E E")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_CHESTPLATE.get())
                .define('E', ModItems.RUBY.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_LEGGINGS.get())
                .define('E', ModItems.RUBY.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_BOOTS.get())
                .define('E', ModItems.RUBY.get())
                .pattern("E E")
                .pattern("E E")
                .unlockedBy("has_ruby", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RUBY.get()).build()))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_,
                                      ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_,
                p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_,
                                      ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_,
                p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe>
            p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_,
                                     int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_,
                            p_251316_, p_251817_).group(p_251450_)
                    .unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(
                            EmberGems.MODID, getItemName(p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_,
                                                  ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_),
                (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_,
                                                  ItemLike p_250042_, RecipeCategory p_248977_, ItemLike p_251911_,
                                                  String p_250475_, @Nullable String p_248641_, String p_252237_,
                                                  @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).
                unlockedBy(getHasName(p_251911_), has(p_251911_)).save(p_250423_,
                        new ResourceLocation(EmberGems.MODID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").
                pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(
                        EmberGems.MODID, p_250475_));
    }
}
