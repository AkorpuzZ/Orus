package net.akorp.orus.item;

import net.akorp.orus.OrusMod;
import net.akorp.orus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativemodeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrusMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> ORUS_TAB = CREATIVE_MODE_TABS.register("orus_tab",
            () -> CreativeModeTab.builder()
            .icon(()->new ItemStack(ModItems.GALLIUM.get()))
            .title(Component.translatable("creativetab.orus_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.GALLIUM.get());
                output.accept(ModItems.REFINEDGALLIUM.get());
                output.accept((ModBlocks.GALLIUM_ORE.get()));

            })
            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
