package net.ember.embergems.item;

import net.ember.embergems.EmberGems;
import net.ember.embergems.item.custom.GeodeItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmberGems.MODID);

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OPAL_SWORD = ITEMS.register("opal_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OPAL_SHOVEL = ITEMS.register("opal_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OPAL_PICKAXE = ITEMS.register("opal_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OPAL_AXE = ITEMS.register("opal_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OPAL_HOE = ITEMS.register("opal_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PEARL_SWORD = ITEMS.register("pearl_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PEARL_SHOVEL = ITEMS.register("pearl_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PEARL_PICKAXE = ITEMS.register("pearl_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PEARL_AXE = ITEMS.register("pearl_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PEARL_HOE = ITEMS.register("pearl_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0.0F,
                    new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0.0F,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> OPAL_HELMET = ITEMS.register("opal_helmet",
            () -> new ArmorItem(ModArmorMaterials.OPAL, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> OPAL_CHESTPLATE = ITEMS.register("opal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OPAL, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> OPAL_LEGGINGS = ITEMS.register("opal_leggings",
            () -> new ArmorItem(ModArmorMaterials.OPAL, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> OPAL_BOOTS = ITEMS.register("opal_boots",
            () -> new ArmorItem(ModArmorMaterials.OPAL, EquipmentSlot.FEET,
                    new Item.Properties()));
    public static final RegistryObject<Item> PEARL_HELMET = ITEMS.register("pearl_helmet",
            () -> new ArmorItem(ModArmorMaterials.PEARL, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> PEARL_CHESTPLATE = ITEMS.register("pearl_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PEARL, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> PEARL_LEGGINGS = ITEMS.register("pearl_leggings",
            () -> new ArmorItem(ModArmorMaterials.PEARL, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> PEARL_BOOTS = ITEMS.register("pearl_boots",
            () -> new ArmorItem(ModArmorMaterials.PEARL, EquipmentSlot.FEET,
                    new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET,
                    new Item.Properties()));
    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new ArmorItem(ModArmorMaterials.JADE, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new ArmorItem(ModArmorMaterials.JADE, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new ArmorItem(ModArmorMaterials.JADE, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new ArmorItem(ModArmorMaterials.JADE, EquipmentSlot.FEET,
                    new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties()));

    public static final RegistryObject<Item> GEODE = ITEMS.register("geode",
            () -> new GeodeItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
