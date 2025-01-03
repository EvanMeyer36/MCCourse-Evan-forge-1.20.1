package com.evan.mccourse.item;

import com.evan.mccourse.MCCourseMod;
import com.evan.mccourse.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MODID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.EVANNITE.get())).title(Component.translatable("creativetab.course_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.EVANNITE.get());
                        output.accept(ModItems.RAW_EVANNITE.get());
                        output.accept(ModBlocks.EVANNITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_EVANNITE_BLOCK.get());
                        output.accept(ModBlocks.EVANNITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_EVANNITE_ORE.get());
                        output.accept(ModBlocks.NETHER_EVANNITE_ORE.get());
                        output.accept(ModBlocks.END_STONE_EVANNITE_ORE.get());

                    }).build());

    public static void register(IEventBus modEventBus){
        CREATIVE_MODE_TABS.register(modEventBus);
    }

}
