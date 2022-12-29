package com.thevortex.furniturecompatfc;

import com.mojang.logging.LogUtils;
import com.thevortex.furniturecompatfc.block.ModRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FurnitureCompaTFC.MODID)
public class FurnitureCompaTFC
{
    public static final String MODID = "mcw_tfc_furn";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final TabFCTFC TAB_GROUP = new TabFCTFC("tab_fctfc");
    public FurnitureCompaTFC()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        ModRegistry.BLOCKS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModRegistry.ITEMS_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event)
    {


    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {
     }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }


    public static class TabFCTFC extends CreativeModeTab
    {
        public TabFCTFC(String name)
        {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModRegistry.kapok_wardrobe.get());
        }

        @Override
        public boolean hasSearchBar()
        {
            return false;
        }
    }
}
