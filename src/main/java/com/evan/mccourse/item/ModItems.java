package com.evan.mccourse.item;

import com.evan.mccourse.MCCourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MODID);

    public static final RegistryObject<Item> EVANNITE = ITEMS.register("evannite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_EVANNITE = ITEMS.register("raw_evannite",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
