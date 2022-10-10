package net.gtrc.gregtech.item;

import net.gtrc.gregtech.GregTech;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GregTech.MOD_ID);

    // Boring Test Item. Will be deleted soon.
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.GTTAB_MAIN)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
