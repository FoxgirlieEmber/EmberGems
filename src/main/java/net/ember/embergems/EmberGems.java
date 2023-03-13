package net.ember.embergems;

import com.mojang.logging.LogUtils;
import net.ember.embergems.block.ModBlocks;
import net.ember.embergems.item.ModCreativeModeTab;
import net.ember.embergems.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EmberGems.MODID)
public class EmberGems {
    public static final String MODID = "embergems";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public EmberGems() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTab.EMBR_TAB) {
            event.accept(ModItems.OPAL);
            event.accept(ModBlocks.OPAL_BLOCK);
            event.accept(ModBlocks.OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_OPAL_ORE);
            event.accept(ModItems.OPAL_SWORD);
            event.accept(ModItems.OPAL_PICKAXE);
            event.accept(ModItems.OPAL_AXE);
            event.accept(ModItems.OPAL_SHOVEL);
            event.accept(ModItems.OPAL_HOE);
            event.accept(ModItems.OPAL_HELMET);
            event.accept(ModItems.OPAL_CHESTPLATE);
            event.accept(ModItems.OPAL_LEGGINGS);
            event.accept(ModItems.OPAL_BOOTS);

            event.accept(ModItems.PEARL);
            event.accept(ModBlocks.PEARL_BLOCK);
            event.accept(ModBlocks.PEARLY_SAND);
            event.accept(ModItems.PEARL_SWORD);
            event.accept(ModItems.PEARL_PICKAXE);
            event.accept(ModItems.PEARL_AXE);
            event.accept(ModItems.PEARL_SHOVEL);
            event.accept(ModItems.PEARL_HOE);
            event.accept(ModItems.PEARL_HELMET);
            event.accept(ModItems.PEARL_CHESTPLATE);
            event.accept(ModItems.PEARL_LEGGINGS);
            event.accept(ModItems.PEARL_BOOTS);

            event.accept(ModItems.SAPPHIRE);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);

            event.accept(ModItems.JADE);
            event.accept(ModBlocks.JADE_BLOCK);
            event.accept(ModBlocks.NETHER_JADE_ORE);
            event.accept(ModItems.JADE_SWORD);
            event.accept(ModItems.JADE_PICKAXE);
            event.accept(ModItems.JADE_AXE);
            event.accept(ModItems.JADE_SHOVEL);
            event.accept(ModItems.JADE_HOE);
            event.accept(ModItems.JADE_HELMET);
            event.accept(ModItems.JADE_CHESTPLATE);
            event.accept(ModItems.JADE_LEGGINGS);
            event.accept(ModItems.JADE_BOOTS);

            event.accept(ModItems.RUBY);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModItems.RUBY_SWORD);
            event.accept(ModItems.RUBY_PICKAXE);
            event.accept(ModItems.RUBY_AXE);
            event.accept(ModItems.RUBY_SHOVEL);
            event.accept(ModItems.RUBY_HOE);
            event.accept(ModItems.RUBY_HELMET);
            event.accept(ModItems.RUBY_CHESTPLATE);
            event.accept(ModItems.RUBY_LEGGINGS);
            event.accept(ModItems.RUBY_BOOTS);

            event.accept(ModItems.GEODE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
