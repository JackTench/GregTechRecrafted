package net.gtrc.gregtech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab GTTAB_MAIN = new CreativeModeTab("maintab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };

    public static final CreativeModeTab GTTAB_ORES = new CreativeModeTab("orestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TESTITEM.get());
        }
    };

}
