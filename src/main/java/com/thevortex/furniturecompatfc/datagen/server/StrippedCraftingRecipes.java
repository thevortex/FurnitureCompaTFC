package com.thevortex.furniturecompatfc.datagen.server;

import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class StrippedCraftingRecipes extends RecipeProvider {
    public StrippedCraftingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    private ShapedRecipeBuilder shaped(ItemLike provider, int count) {
        return ShapedRecipeBuilder.shaped(provider,count);
    }
    private ResourceLocation recipeDir(String typeIn) {
        return new ResourceLocation(FurnitureCompaTFC.MODID,typeIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        final String hasCondition = "has_item_";

        String[] list_vanilla = { "acacia", "birch", "oak", "spruce" };
        String[] list_tfc = { "ash", "aspen", "blackwood", "chestnut", "douglas_fir", "hickory", "kapok", "maple", "palm", "pine", "rosewood", "sequoia", "sycamore", "white_cedar", "willow" };

        ////
        for (String log: list_vanilla
             ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_wardrobe")),4)
                    .pattern("lll")
                    .pattern("lol")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer,recipeDir("stripped_" +log + "_wardrobe"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_wardrobe")),4)
                    .pattern("lll")
                    .pattern("lol")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        ////
        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_modern_wardrobe")),4)
                    .pattern("lll")
                    .pattern("llo")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_modern_wardrobe"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_modern_wardrobe")),4)
                    .pattern("lll")
                    .pattern("llo")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        ////
        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_double_wardrobe")),4)
                    .pattern("lll")
                    .pattern("olo")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_double_wardrobe"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_double_wardrobe")),4)
                    .pattern("lll")
                    .pattern("olo")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        ////
        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_bookshelf")),4)
                    .pattern("lll")
                    .pattern("bbb")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_bookshelf"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_bookshelf")),4)
                    .pattern("lll")
                    .pattern("bbb")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        ////
        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_bookshelf_cupboard")),4)
                    .pattern("lll")
                    .pattern("olb")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_bookshelf_cupboard"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_bookshelf_cupboard")),4)
                    .pattern("lll")
                    .pattern("olb")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .define('o', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_door")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_double_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("ldl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_double_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_double_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("ldl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_bookshelf_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("lbl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_bookshelf_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_bookshelf_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("lbl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }



        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_lower_bookshelf_drawer")),4)
                    .pattern("lll")
                    .pattern("lbl")
                    .pattern("ldl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_lower_bookshelf_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_lower_bookshelf_drawer")),4)
                    .pattern("lll")
                    .pattern("lbl")
                    .pattern("ldl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .define('b', ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:book")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_large_drawer")),4)
                    .pattern("ldl")
                    .pattern("lll")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_large_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_large_drawer")),4)
                    .pattern("ldl")
                    .pattern("lll")
                    .pattern("lll")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_lower_triple_drawer")),4)
                    .pattern("lll")
                    .pattern("dld")
                    .pattern("ldl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_lower_triple_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_lower_triple_drawer")),4)
                    .pattern("lll")
                    .pattern("dld")
                    .pattern("ldl")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_triple_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("dld")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_triple_drawer"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_triple_drawer")),4)
                    .pattern("lll")
                    .pattern("ldl")
                    .pattern("dld")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:cabinet_drawer")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_desk")),2)
                    .pattern("   ")
                    .pattern("lll")
                    .pattern("f f")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_desk"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_desk")),2)
                    .pattern("   ")
                    .pattern("lll")
                    .pattern("f f")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_covered_desk")),2)
                    .pattern("   ")
                    .pattern("lll")
                    .pattern("l l")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_covered_desk"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_covered_desk")),2)
                    .pattern("   ")
                    .pattern("lll")
                    .pattern("l l")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_modern_desk")),2)
                    .pattern("   ")
                    .pattern("lll")
                    .pattern("fsf")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', Tags.Items.RODS_WOODEN)
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_modern_desk"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_modern_desk")),2)
                    .pattern("   ")
                    .pattern("lll")
                    .pattern("fsf")
                    .define('l',ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', Tags.Items.RODS_WOODEN)
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_table")),2)
                    .pattern(" c ")
                    .pattern(" f ")
                    .pattern("   ")
                    .define('c',ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_coffee_table")))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_table"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_table")),2)
                    .pattern(" c ")
                    .pattern(" f ")
                    .pattern("   ")
                    .define('c',ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_coffee_table")))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_end_table")),2)
                    .pattern(" c ")
                    .pattern(" l ")
                    .pattern("   ")
                    .define('c',ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_table")))
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_end_table"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_end_table")),2)
                    .pattern(" c ")
                    .pattern(" l ")
                    .pattern("   ")
                    .define('c',ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_table")))
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_coffee_table")),2)
                    .pattern(" l ")
                    .pattern(" f ")
                    .pattern("   ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_coffee_table"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_coffee_table")),2)
                    .pattern(" l ")
                    .pattern(" f ")
                    .pattern("   ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_glass_table")),1)
                    .pattern(" e ")
                    .pattern(" g ")
                    .pattern("   ")
                    .define('e',ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_table")))
                    .define('g', Tags.Items.GLASS)
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_glass_table"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_glass_table")),1)
                    .pattern(" e ")
                    .pattern(" g ")
                    .pattern("   ")
                    .define('e',ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_end_table")))
                    .define('g', Tags.Items.GLASS)
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_chair")),1)
                    .pattern(" l ")
                    .pattern("sl ")
                    .pattern("ff ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer,recipeDir("stripped_" +log + "_chair"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_chair")),1)
                    .pattern(" l ")
                    .pattern("sl ")
                    .pattern("ff ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }



        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_modern_chair")),1)
                    .pattern("sl ")
                    .pattern("ff ")
                    .pattern("   ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_modern_chair"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_modern_chair")),1)
                    .pattern("sl ")
                    .pattern("ff ")
                    .pattern("   ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_striped_chair")),1)
                    .pattern(" l ")
                    .pattern("sf ")
                    .pattern("ff ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_striped_chair"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_striped_chair")),1)
                    .pattern(" l ")
                    .pattern("sf ")
                    .pattern("ff ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_stool_chair")),1)
                    .pattern(" l ")
                    .pattern(" l ")
                    .pattern(" f ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_stool_chair"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_stool_chair")),1)
                    .pattern(" l ")
                    .pattern(" l ")
                    .pattern(" f ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('f', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_fence")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_counter")),1)
                    .pattern(" s ")
                    .pattern(" l ")
                    .pattern("   ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer, recipeDir("stripped_" +log + "_counter"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_counter")),1)
                    .pattern(" s ")
                    .pattern(" l ")
                    .pattern("   ")
                    .define('l', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log)))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_log", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/lumber/" + log))))
                    .save(consumer);

        }

        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_drawer_counter")),1)
                    .pattern(" s ")
                    .pattern(" d ")
                    .pattern("   ")
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_drawer")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_drawer", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_drawer"))))
                    .save(consumer, recipeDir("stripped_" +log + "_drawer_counter"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_drawer_counter")),1)
                    .pattern(" s ")
                    .pattern(" d ")
                    .pattern("   ")
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_drawer")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_drawer", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_drawer"))))
                    .save(consumer);

        }

        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_double_drawer_counter")),1)
                    .pattern(" s ")
                    .pattern(" d ")
                    .pattern("   ")
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_double_drawer")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_double_drawer", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_double_drawer"))))
                    .save(consumer, recipeDir("stripped_" +log + "_double_drawer_counter"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_double_drawer_counter")),1)
                    .pattern(" s ")
                    .pattern(" d ")
                    .pattern("   ")
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_double_drawer")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_double_drawer", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_double_drawer"))))
                    .save(consumer);

        }


        for (String log: list_vanilla
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:stripped_" + log + "_cupboard_counter")),1)
                    .pattern(" s ")
                    .pattern(" d ")
                    .pattern("   ")
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_wardrobe")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_wardrobe", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mcwfurnitures:" + log + "_wardrobe"))))
                    .save(consumer, recipeDir("stripped_" +log + "_cupboard_counter"));

        }
        for (String log: list_tfc
        ) {
            shaped(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_cupboard_counter")),1)
                    .pattern(" s ")
                    .pattern(" d ")
                    .pattern("   ")
                    .define('d', ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_wardrobe")))
                    .define('s', ForgeRegistries.ITEMS.getValue(new ResourceLocation("tfc:wood/planks/" + log + "_slab")))
                    .unlockedBy(hasCondition + log + "_wardrobe", has(ForgeRegistries.ITEMS.getValue(new ResourceLocation(FurnitureCompaTFC.MODID + ":stripped_" + log + "_wardrobe"))))
                    .save(consumer);

        }
    }
}
