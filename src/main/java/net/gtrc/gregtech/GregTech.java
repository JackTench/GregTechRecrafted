package net.gtrc.gregtech;

import com.mojang.logging.LogUtils;
import net.gtrc.gregtech.block.ModBlocks;
import net.gtrc.gregtech.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(GregTech.MOD_ID)
public class GregTech {

    // Define the modid as a string in the main class. This means I don't have to type it out perfectly whenever required. Easy to change in the future.
    public static final String MOD_ID = "gregtech";

    // Creates a logger for the mod. This is used to print text to the console.
    private static final Logger LOGGER = LogUtils.getLogger();

    // I believe this code runs when the game starts.
    public GregTech() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register items and blocks from GregTech Recrafted.
        ModItems.register(modEventBus);
        LOGGER.info("GTRC Items Loaded");
        ModBlocks.register(modEventBus);
        LOGGER.info("GTRC Blocks Loaded");

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Write code here to be run on the client side only.
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
