package net.gtrc.gregtech.block;

import net.gtrc.gregtech.GregTech;
import net.gtrc.gregtech.item.ModCreativeModeTabs;
import net.gtrc.gregtech.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GregTech.MOD_ID);

    // GregTech Ores
    public static final RegistryObject<Block> ORE_ALMANDINE = registerBlock("ore_almandine", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_ALMANDINE = registerBlock("ore_deepslate_almandine", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_ALUMINIUM = registerBlock("ore_aluminium", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_ALUMINIUM = registerBlock("ore_deepslate_aluminium", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_APATITE = registerBlock("ore_apatite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_APATITE = registerBlock("ore_deepslate_apatite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BANDEDIRON = registerBlock("ore_bandediron", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BANDEDIRON = registerBlock("ore_deepslate_bandediron", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BARITE = registerBlock("ore_barite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BARITE = registerBlock("ore_deepslate_barite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BASTNASITE = registerBlock("ore_bastnasite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BASTNASITE = registerBlock("ore_deepslate_bastnasite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BAUXITE = registerBlock("ore_bauxite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BAUXITE = registerBlock("ore_deepslate_bauxite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BENTONITE = registerBlock("ore_bentonite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BENTONITE = registerBlock("ore_deepslate_bentonite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BERYLLIUM = registerBlock("ore_beryllium", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BERYLLIUM = registerBlock("ore_deepslate_beryllium", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_BROWNLIMONITE = registerBlock("ore_brownlimonite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_BROWNLIMONITE = registerBlock("ore_deepslate_brownlimonite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_CALCITE = registerBlock("ore_calcite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_CALCITE = registerBlock("ore_deepslate_calcite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_CASSITERITE = registerBlock("ore_cassiterite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_CASSITERITE = registerBlock("ore_deepslate_cassiterite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    // Certus Quartz Ore might go here. Unsure if required or in scope of project. It is added by AE2.
    // Deepslate Certus Quartz Ore might go here. Unsure if required or in scope of project. It is added by AE2.
    public static final RegistryObject<Block> ORE_CHALCOPYRITE = registerBlock("ore_chalcopyrite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_CHALCOPYRITE = registerBlock("ore_deepslate_chalcopyrite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_CINNABAR = registerBlock("ore_cinnabar", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_CINNABAR = registerBlock("ore_deepslate_cinnabar", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_COBALTITE = registerBlock("ore_cobaltite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_COBALTITE = registerBlock("ore_deepslate_cobaltite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_ENRICHEDNAQUADAH = registerBlock("ore_enrichednaquadah", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_ENRICHEDNAQUADAH = registerBlock("ore_deepslate_enrichednaquadah", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_GALENA = registerBlock("ore_galena", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_GALENA = registerBlock("ore_deepslate_galena", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_GARNIERITE = registerBlock("ore_garnierite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_GARNIERITE = registerBlock("ore_deepslate_garnierite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_GLAUCONITE = registerBlock("ore_glauconite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_GLAUCONITE = registerBlock("ore_deepslate_glauconite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_GRAPHITE = registerBlock("ore_graphite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_GRAPHITE = registerBlock("ore_deepslate_graphite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_GROSSULAR = registerBlock("ore_grossular", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_GROSSULAR = registerBlock("ore_deepslate_grossular", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_ILMENITE = registerBlock("ore_ilmenite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_ILMENITE = registerBlock("ore_deepslate_ilmenite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_IRIDIUM = registerBlock("ore_iridium", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_IRIDIUM = registerBlock("ore_deepslate_iridium", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_LAZURITE = registerBlock("ore_lazurite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_LAZURITE = registerBlock("ore_deepslate_lazurite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_LEAD = registerBlock("ore_lead", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_LEAD = registerBlock("ore_deepslate_lead", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_LEPIDOLITE = registerBlock("ore_lepidolite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);
    public static final RegistryObject<Block> ORE_DEEPSLATE_LEPIDOLITE = registerBlock("ore_deepslate_lepidolite", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTabs.GTTAB_ORES);

    // Helper function for registering blocks.
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    // Helper function for registering blockitems.
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    // Called in the main mod class, registers all of the blocks.
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
