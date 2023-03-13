package net.ember.embergems.item;

import net.ember.embergems.EmberGems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EmberGems.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab EMBR_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        EMBR_TAB = event.registerCreativeModeTab(new ResourceLocation(EmberGems.MODID, "embr_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.OPAL.get())).title(Component.literal("Ember's Gems")).build());
    }
}