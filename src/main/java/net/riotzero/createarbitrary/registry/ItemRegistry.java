package net.riotzero.createarbitrary.registry;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.riotzero.createarbitrary.CreateArbitrary;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateArbitrary.MOD_ID);

    // Ingredients
    public static final DeferredItem<Item> CHORIUM_POWDER = ITEMS.register("chorium_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHORIUM_QUARTZ = ITEMS.register("chorium_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_CHORIUM_QUARTZ = ITEMS.register("polished_chorium_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_CHORIUM_SHEET = ITEMS.register("polished_chorium_sheet",
            () -> new Item(new Item.Properties()));

    // Sequence
    public static final DeferredItem<SequencedAssemblyItem> INCOMPLETE_CREATIVE_MECHANISM = ITEMS.register(
            "incomplete_creative_mechanism", () -> new SequencedAssemblyItem(new Item.Properties()));

    // Mechanisms
    public static final DeferredItem<Item> CREATIVE_MECHANISM = ITEMS.register("creative_mechanism",
            () -> new Item(new Item.Properties()));
}
