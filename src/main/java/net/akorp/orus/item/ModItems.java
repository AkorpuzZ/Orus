package net.akorp.orus.item;

import net.akorp.orus.OrusMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
    DeferredRegister.create(ForgeRegistries.ITEMS, OrusMod.MOD_ID);

    public static final RegistryObject<Item> GALLIUM = ITEMS.register("gallium",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINEDGALLIUM = ITEMS.register("refined_gallium",
            ()-> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

