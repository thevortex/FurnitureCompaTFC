package com.thevortex.furniturecompatfc.datagen;

import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import com.thevortex.furniturecompatfc.datagen.client.LangEntries;
import com.thevortex.furniturecompatfc.datagen.server.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.io.IOException;
import java.util.Locale;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) throws IOException {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if(event.includeClient()) {
            generator.addProvider(new LangEntries(generator, FurnitureCompaTFC.MODID, "en_us"));
        }

        if (event.includeServer()) {
            BlockTagsProvider blockTagsProvider = new BlockTags(generator, fileHelper);
            generator.addProvider(new ItemTags(generator, blockTagsProvider, fileHelper));
            generator.addProvider(blockTagsProvider);
            generator.addProvider(new CraftingRecipes(generator));
            generator.addProvider(new StrippedCraftingRecipes(generator));

            generator.addProvider(new LootTables(generator));
        }
    }
}
