package net.ember.embergems.datagen;

import net.ember.embergems.EmberGems;
import net.ember.embergems.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EmberGems.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.OPAL);
        simpleItem(ModItems.OPAL_SWORD);
        simpleItem(ModItems.OPAL_PICKAXE);
        simpleItem(ModItems.OPAL_AXE);
        simpleItem(ModItems.OPAL_SHOVEL);
        simpleItem(ModItems.OPAL_HOE);
        simpleItem(ModItems.OPAL_HELMET);
        simpleItem(ModItems.OPAL_CHESTPLATE);
        simpleItem(ModItems.OPAL_LEGGINGS);
        simpleItem(ModItems.OPAL_BOOTS);

        simpleItem(ModItems.PEARL);
        simpleItem(ModItems.PEARL_SWORD);
        simpleItem(ModItems.PEARL_PICKAXE);
        simpleItem(ModItems.PEARL_AXE);
        simpleItem(ModItems.PEARL_SHOVEL);
        simpleItem(ModItems.PEARL_HOE);
        simpleItem(ModItems.PEARL_HELMET);
        simpleItem(ModItems.PEARL_CHESTPLATE);
        simpleItem(ModItems.PEARL_LEGGINGS);
        simpleItem(ModItems.PEARL_BOOTS);

        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_SWORD);
        simpleItem(ModItems.SAPPHIRE_PICKAXE);
        simpleItem(ModItems.SAPPHIRE_AXE);
        simpleItem(ModItems.SAPPHIRE_SHOVEL);
        simpleItem(ModItems.SAPPHIRE_HOE);
        simpleItem(ModItems.SAPPHIRE_HELMET);
        simpleItem(ModItems.SAPPHIRE_CHESTPLATE);
        simpleItem(ModItems.SAPPHIRE_LEGGINGS);
        simpleItem(ModItems.SAPPHIRE_BOOTS);

        simpleItem(ModItems.JADE);
        simpleItem(ModItems.JADE_SWORD);
        simpleItem(ModItems.JADE_PICKAXE);
        simpleItem(ModItems.JADE_AXE);
        simpleItem(ModItems.JADE_SHOVEL);
        simpleItem(ModItems.JADE_HOE);
        simpleItem(ModItems.JADE_HELMET);
        simpleItem(ModItems.JADE_CHESTPLATE);
        simpleItem(ModItems.JADE_LEGGINGS);
        simpleItem(ModItems.JADE_BOOTS);

        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.RUBY_SWORD);
        simpleItem(ModItems.RUBY_PICKAXE);
        simpleItem(ModItems.RUBY_AXE);
        simpleItem(ModItems.RUBY_SHOVEL);
        simpleItem(ModItems.RUBY_HOE);
        simpleItem(ModItems.RUBY_HELMET);
        simpleItem(ModItems.RUBY_CHESTPLATE);
        simpleItem(ModItems.RUBY_LEGGINGS);
        simpleItem(ModItems.RUBY_BOOTS);

        simpleItem(ModItems.GEODE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EmberGems.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EmberGems.MODID, "item/" + item.getId().getPath()));
    }
}