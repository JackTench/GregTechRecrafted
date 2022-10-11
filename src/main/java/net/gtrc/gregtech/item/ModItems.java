package net.gtrc.gregtech.item;

import net.gtrc.gregtech.GregTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GregTech.MOD_ID);

    // Boring Test Item. Will be deleted soon.
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC)));

    // GregTech Raw Ores
    public static final RegistryObject<Item> RAW_ALMANDINE = ITEMS.register("raw_almandine", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_APATITE = ITEMS.register("raw_apatite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BANDEDIRON = ITEMS.register("raw_bandediron", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BARITE = ITEMS.register("raw_barite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BASTNASITE = ITEMS.register("raw_bastnasite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BAUXITE = ITEMS.register("raw_bauxite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BENTONITE = ITEMS.register("raw_bentonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BERYLLIUM = ITEMS.register("raw_beryllium", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_BROWNLIMONITE = ITEMS.register("raw_brownlimonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_CALCITE = ITEMS.register("raw_calcite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));
    public static final RegistryObject<Item> RAW_CASSITERITE = ITEMS.register("raw_cassiterite", () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.GTTAB_ORES)));

    // Em-Coin. An Emerald Coin.
    public static final RegistryObject<Item> COIN_EMERALD = ITEMS.register("coin_emerald",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).tab(ModCreativeModeTabs.GTTAB_MAIN)));

    // Called in the main class. Registers all of the items.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
