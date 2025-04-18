package net.riotzero.createarbitrary.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.riotzero.createarbitrary.CreateArbitrary;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateArbitrary.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATEARBITRARY_TAB =
            CREATIVE_MODE_TABS.register("createarbitrary_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.createarbitrary"))
            .icon(() -> ItemRegistry.CHORIUM_QUARTZ.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                // Blocks

                // Tools

               // Ingredients
                output.accept(ItemRegistry.CHORIUM_POWDER.get());
                output.accept(ItemRegistry.CHORIUM_QUARTZ.get());
                output.accept(ItemRegistry.POLISHED_CHORIUM_QUARTZ.get());
                output.accept(ItemRegistry.POLISHED_CHORIUM_SHEET.get());
                output.accept(ItemRegistry.CREATIVE_MECHANISM.get());

            })
            .build());
}