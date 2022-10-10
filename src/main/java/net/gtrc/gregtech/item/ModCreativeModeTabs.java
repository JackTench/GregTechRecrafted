package net.gtrc.gregtech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    // Creates the main creative tab for GregTech Recrafted.
    public static final CreativeModeTab GTTAB_MAIN = new CreativeModeTab("maintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };

    // Creates a creative tab for all of the ores added by GregTech Recrafted.
    public static final CreativeModeTab GTTAB_ORES = new CreativeModeTab("orestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };

}
