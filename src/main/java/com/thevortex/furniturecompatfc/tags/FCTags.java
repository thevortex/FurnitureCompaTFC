package com.thevortex.furniturecompatfc.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class FCTags {

public static void init() {
    String[] list_vanilla = { "acacia", "birch", "oak", "spruce" };
    String[] list_furniture = {"wardrobe", "modern_wardrobe", "double_wardrobe", "bookshelf", "bookshelf_cupboard", "drawer", "double_drawer",
            "bookshelf_drawer", "lower_bookshelf_drawer", "large_drawer", "lower_triple_drawer", "triple_drawer", "desk", "covered_desk", "modern_desk",
            "table", "end_table", "coffee_table", "glass_table", "chair", "modern_chair", "striped_chair", "stool_chair", "counter", "drawer_counter", "double_drawer_counter", "cupboard_counter"};
}

    public static ResourceLocation forge(String path) {
        return new ResourceLocation("forge", path);
    }
}
