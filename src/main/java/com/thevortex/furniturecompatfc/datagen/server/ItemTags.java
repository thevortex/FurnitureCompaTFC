package com.thevortex.furniturecompatfc.datagen.server;

import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, FurnitureCompaTFC.MODID, existingFileHelper);
    }
    public String[] list_vanilla = { "acacia", "birch", "oak", "spruce" };
    public String[] list_tfc = { "ash", "aspen", "blackwood", "chestnut", "douglas_fir", "hickory", "kapok", "maple", "palm", "pine", "rosewood", "sequoia", "sycamore", "white_cedar", "willow" };

    @Override
    protected void addTags() {

    }

}
