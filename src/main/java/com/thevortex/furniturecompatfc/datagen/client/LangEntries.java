package com.thevortex.furniturecompatfc.datagen.client;

import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangEntries extends LanguageProvider {

    public LangEntries(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }
    public static final String[] list_furniture = {"Wardrobe", "Modern Wardrobe", "Double Wardrobe", "Bookshelf", "Bookshelf Cupboard", "Drawer", "Double Drawer",
            "Bookshelf Drawer", "Lower Bookshelf Drawer", "Large Drawer", "Lower Triple Drawer", "Triple Drawer", "Desk", "Covered Desk", "Modern Desk",
            "Table", "End Table", "Coffee Table", "Glass Table", "Chair", "Modern Chair", "Striped Chair", "Stool Chair", "Counter", "Drawer Counter", "Double Drawer Counter", "Cupboard Counter"};

    public static final String[] list_wood = { "Ash", "Aspen", "Blackwood", "Chestnut", "Douglas Fir", "Hickory", "Kapok", "Maple", "Palm", "Pine", "Rosewood", "Sequoia", "Sycamore", "White Cedar", "Willow" };


    @Override
    protected void addTranslations() {
        add("itemGroup.tab_fctfc", "Furniture Compat for TFC/Macaw");
        for (String log: list_wood) {
            for (String furniture : list_furniture) {
                add("block." + FurnitureCompaTFC.MODID + "." + log.toLowerCase().replace(" ","_")+ "_" + furniture.toLowerCase().replace(" ","_") , log + " " + furniture);
                add("block." + FurnitureCompaTFC.MODID + ".stripped_" + log.toLowerCase().replace(" ","_") + "_" + furniture.toLowerCase().replace(" ","_") , "Stripped " + log + " " + furniture);
                add("item." + FurnitureCompaTFC.MODID + "." + log.toLowerCase().replace(" ","_") + "_" + furniture.toLowerCase().replace(" ","_") , log + " " + furniture);
                add("item." + FurnitureCompaTFC.MODID + ".stripped_" + log.toLowerCase().replace(" ","_") + "_" + furniture.toLowerCase().replace(" ","_") , "Stripped " + log + " " + furniture);
            }
        }
    }
}
