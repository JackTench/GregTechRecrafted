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
