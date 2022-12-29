package com.thevortex.furniturecompatfc.block;

import com.mcwfurnitures.kikoz.objects.*;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookCabinet;
import com.mcwfurnitures.kikoz.objects.bookshelves.BookDrawer;
import com.mcwfurnitures.kikoz.objects.chairs.ClassicChair;
import com.mcwfurnitures.kikoz.objects.chairs.ModernChair;
import com.mcwfurnitures.kikoz.objects.chairs.StripedChair;
import com.mcwfurnitures.kikoz.objects.counters.Counter;
import com.mcwfurnitures.kikoz.objects.counters.StorageCounter;
import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModRegistry {

    public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FurnitureCompaTFC.MODID);
    public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FurnitureCompaTFC.MODID);

    public static final RegistryObject<Block> ash_wardrobe = createBlock("ash_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_modern_wardrobe = createBlock("ash_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_double_wardrobe = createBlock("ash_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_bookshelf = createBlock("ash_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_bookshelf_cupboard = createBlock("ash_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_drawer = createBlock("ash_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_double_drawer = createBlock("ash_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_bookshelf_drawer = createBlock("ash_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_lower_bookshelf_drawer = createBlock("ash_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_large_drawer = createBlock("ash_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_lower_triple_drawer = createBlock("ash_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_triple_drawer = createBlock("ash_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_desk = createBlock("ash_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_covered_desk = createBlock("ash_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_modern_desk = createBlock("ash_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_table = createBlock("ash_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_end_table = createBlock("ash_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_coffee_table = createBlock("ash_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_glass_table = createBlock("ash_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_chair = createBlock("ash_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_modern_chair = createBlock("ash_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_striped_chair = createBlock("ash_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_stool_chair = createBlock("ash_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_counter = createBlock("ash_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_drawer_counter = createBlock("ash_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_double_drawer_counter = createBlock("ash_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> ash_cupboard_counter = createBlock("ash_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));




    public static final RegistryObject<Block> aspen_wardrobe = createBlock("aspen_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_modern_wardrobe = createBlock("aspen_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_double_wardrobe = createBlock("aspen_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_bookshelf = createBlock("aspen_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_bookshelf_cupboard = createBlock("aspen_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_drawer = createBlock("aspen_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_double_drawer = createBlock("aspen_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_bookshelf_drawer = createBlock("aspen_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_lower_bookshelf_drawer = createBlock("aspen_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_large_drawer = createBlock("aspen_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_lower_triple_drawer = createBlock("aspen_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_triple_drawer = createBlock("aspen_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_desk = createBlock("aspen_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_covered_desk = createBlock("aspen_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_modern_desk = createBlock("aspen_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_table = createBlock("aspen_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_end_table = createBlock("aspen_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_coffee_table = createBlock("aspen_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_glass_table = createBlock("aspen_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_chair = createBlock("aspen_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_modern_chair = createBlock("aspen_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_striped_chair = createBlock("aspen_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_stool_chair = createBlock("aspen_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_counter = createBlock("aspen_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_drawer_counter = createBlock("aspen_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_double_drawer_counter = createBlock("aspen_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> aspen_cupboard_counter = createBlock("aspen_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> blackwood_wardrobe = createBlock("blackwood_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_modern_wardrobe = createBlock("blackwood_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_double_wardrobe = createBlock("blackwood_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_bookshelf = createBlock("blackwood_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_bookshelf_cupboard = createBlock("blackwood_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_drawer = createBlock("blackwood_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_double_drawer = createBlock("blackwood_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_bookshelf_drawer = createBlock("blackwood_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_lower_bookshelf_drawer = createBlock("blackwood_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_large_drawer = createBlock("blackwood_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_lower_triple_drawer = createBlock("blackwood_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_triple_drawer = createBlock("blackwood_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_desk = createBlock("blackwood_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_covered_desk = createBlock("blackwood_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_modern_desk = createBlock("blackwood_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_table = createBlock("blackwood_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_end_table = createBlock("blackwood_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_coffee_table = createBlock("blackwood_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_glass_table = createBlock("blackwood_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_chair = createBlock("blackwood_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_modern_chair = createBlock("blackwood_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_striped_chair = createBlock("blackwood_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_stool_chair = createBlock("blackwood_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_counter = createBlock("blackwood_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_drawer_counter = createBlock("blackwood_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_double_drawer_counter = createBlock("blackwood_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> blackwood_cupboard_counter = createBlock("blackwood_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> chestnut_wardrobe = createBlock("chestnut_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_modern_wardrobe = createBlock("chestnut_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_double_wardrobe = createBlock("chestnut_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_bookshelf = createBlock("chestnut_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_bookshelf_cupboard = createBlock("chestnut_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_drawer = createBlock("chestnut_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_double_drawer = createBlock("chestnut_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_bookshelf_drawer = createBlock("chestnut_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_lower_bookshelf_drawer = createBlock("chestnut_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_large_drawer = createBlock("chestnut_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_lower_triple_drawer = createBlock("chestnut_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_triple_drawer = createBlock("chestnut_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_desk = createBlock("chestnut_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_covered_desk = createBlock("chestnut_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_modern_desk = createBlock("chestnut_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_table = createBlock("chestnut_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_end_table = createBlock("chestnut_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_coffee_table = createBlock("chestnut_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_glass_table = createBlock("chestnut_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_chair = createBlock("chestnut_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_modern_chair = createBlock("chestnut_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_striped_chair = createBlock("chestnut_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_stool_chair = createBlock("chestnut_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_counter = createBlock("chestnut_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_drawer_counter = createBlock("chestnut_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_double_drawer_counter = createBlock("chestnut_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> chestnut_cupboard_counter = createBlock("chestnut_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> douglas_fir_wardrobe = createBlock("douglas_fir_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_modern_wardrobe = createBlock("douglas_fir_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_double_wardrobe = createBlock("douglas_fir_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_bookshelf = createBlock("douglas_fir_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_bookshelf_cupboard = createBlock("douglas_fir_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_drawer = createBlock("douglas_fir_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_double_drawer = createBlock("douglas_fir_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_bookshelf_drawer = createBlock("douglas_fir_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_lower_bookshelf_drawer = createBlock("douglas_fir_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_large_drawer = createBlock("douglas_fir_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_lower_triple_drawer = createBlock("douglas_fir_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_triple_drawer = createBlock("douglas_fir_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_desk = createBlock("douglas_fir_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_covered_desk = createBlock("douglas_fir_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_modern_desk = createBlock("douglas_fir_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_table = createBlock("douglas_fir_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_end_table = createBlock("douglas_fir_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_coffee_table = createBlock("douglas_fir_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_glass_table = createBlock("douglas_fir_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_chair = createBlock("douglas_fir_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_modern_chair = createBlock("douglas_fir_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_striped_chair = createBlock("douglas_fir_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_stool_chair = createBlock("douglas_fir_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_counter = createBlock("douglas_fir_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_drawer_counter = createBlock("douglas_fir_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_double_drawer_counter = createBlock("douglas_fir_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> douglas_fir_cupboard_counter = createBlock("douglas_fir_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> hickory_wardrobe = createBlock("hickory_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_modern_wardrobe = createBlock("hickory_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_double_wardrobe = createBlock("hickory_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_bookshelf = createBlock("hickory_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_bookshelf_cupboard = createBlock("hickory_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_drawer = createBlock("hickory_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_double_drawer = createBlock("hickory_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_bookshelf_drawer = createBlock("hickory_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_lower_bookshelf_drawer = createBlock("hickory_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_large_drawer = createBlock("hickory_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_lower_triple_drawer = createBlock("hickory_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_triple_drawer = createBlock("hickory_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_desk = createBlock("hickory_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_covered_desk = createBlock("hickory_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_modern_desk = createBlock("hickory_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_table = createBlock("hickory_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_end_table = createBlock("hickory_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_coffee_table = createBlock("hickory_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_glass_table = createBlock("hickory_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_chair = createBlock("hickory_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_modern_chair = createBlock("hickory_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_striped_chair = createBlock("hickory_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_stool_chair = createBlock("hickory_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_counter = createBlock("hickory_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_drawer_counter = createBlock("hickory_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_double_drawer_counter = createBlock("hickory_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> hickory_cupboard_counter = createBlock("hickory_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> kapok_wardrobe = createBlock("kapok_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_modern_wardrobe = createBlock("kapok_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_double_wardrobe = createBlock("kapok_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_bookshelf = createBlock("kapok_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_bookshelf_cupboard = createBlock("kapok_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_drawer = createBlock("kapok_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_double_drawer = createBlock("kapok_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_bookshelf_drawer = createBlock("kapok_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_lower_bookshelf_drawer = createBlock("kapok_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_large_drawer = createBlock("kapok_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_lower_triple_drawer = createBlock("kapok_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_triple_drawer = createBlock("kapok_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_desk = createBlock("kapok_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_covered_desk = createBlock("kapok_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_modern_desk = createBlock("kapok_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_table = createBlock("kapok_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_end_table = createBlock("kapok_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_coffee_table = createBlock("kapok_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_glass_table = createBlock("kapok_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_chair = createBlock("kapok_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_modern_chair = createBlock("kapok_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_striped_chair = createBlock("kapok_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_stool_chair = createBlock("kapok_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_counter = createBlock("kapok_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_drawer_counter = createBlock("kapok_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_double_drawer_counter = createBlock("kapok_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> kapok_cupboard_counter = createBlock("kapok_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> maple_wardrobe = createBlock("maple_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_modern_wardrobe = createBlock("maple_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_double_wardrobe = createBlock("maple_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_bookshelf = createBlock("maple_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_bookshelf_cupboard = createBlock("maple_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_drawer = createBlock("maple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_double_drawer = createBlock("maple_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_bookshelf_drawer = createBlock("maple_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_lower_bookshelf_drawer = createBlock("maple_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_large_drawer = createBlock("maple_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_lower_triple_drawer = createBlock("maple_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_triple_drawer = createBlock("maple_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_desk = createBlock("maple_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_covered_desk = createBlock("maple_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_modern_desk = createBlock("maple_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_table = createBlock("maple_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_end_table = createBlock("maple_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_coffee_table = createBlock("maple_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_glass_table = createBlock("maple_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_chair = createBlock("maple_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_modern_chair = createBlock("maple_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_striped_chair = createBlock("maple_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_stool_chair = createBlock("maple_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_counter = createBlock("maple_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_drawer_counter = createBlock("maple_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_double_drawer_counter = createBlock("maple_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> maple_cupboard_counter = createBlock("maple_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> palm_wardrobe = createBlock("palm_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_modern_wardrobe = createBlock("palm_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_double_wardrobe = createBlock("palm_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_bookshelf = createBlock("palm_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_bookshelf_cupboard = createBlock("palm_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_drawer = createBlock("palm_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_double_drawer = createBlock("palm_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_bookshelf_drawer = createBlock("palm_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_lower_bookshelf_drawer = createBlock("palm_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_large_drawer = createBlock("palm_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_lower_triple_drawer = createBlock("palm_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_triple_drawer = createBlock("palm_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_desk = createBlock("palm_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_covered_desk = createBlock("palm_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_modern_desk = createBlock("palm_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_table = createBlock("palm_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_end_table = createBlock("palm_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_coffee_table = createBlock("palm_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_glass_table = createBlock("palm_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_chair = createBlock("palm_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_modern_chair = createBlock("palm_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_striped_chair = createBlock("palm_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_stool_chair = createBlock("palm_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_counter = createBlock("palm_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_drawer_counter = createBlock("palm_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_double_drawer_counter = createBlock("palm_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> palm_cupboard_counter = createBlock("palm_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> pine_wardrobe = createBlock("pine_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_modern_wardrobe = createBlock("pine_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_double_wardrobe = createBlock("pine_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_bookshelf = createBlock("pine_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_bookshelf_cupboard = createBlock("pine_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_drawer = createBlock("pine_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_double_drawer = createBlock("pine_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_bookshelf_drawer = createBlock("pine_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_lower_bookshelf_drawer = createBlock("pine_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_large_drawer = createBlock("pine_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_lower_triple_drawer = createBlock("pine_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_triple_drawer = createBlock("pine_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_desk = createBlock("pine_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_covered_desk = createBlock("pine_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_modern_desk = createBlock("pine_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_table = createBlock("pine_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_end_table = createBlock("pine_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_coffee_table = createBlock("pine_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_glass_table = createBlock("pine_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_chair = createBlock("pine_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_modern_chair = createBlock("pine_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_striped_chair = createBlock("pine_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_stool_chair = createBlock("pine_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_counter = createBlock("pine_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_drawer_counter = createBlock("pine_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_double_drawer_counter = createBlock("pine_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> pine_cupboard_counter = createBlock("pine_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> rosewood_wardrobe = createBlock("rosewood_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_modern_wardrobe = createBlock("rosewood_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_double_wardrobe = createBlock("rosewood_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_bookshelf = createBlock("rosewood_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_bookshelf_cupboard = createBlock("rosewood_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_drawer = createBlock("rosewood_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_double_drawer = createBlock("rosewood_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_bookshelf_drawer = createBlock("rosewood_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_lower_bookshelf_drawer = createBlock("rosewood_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_large_drawer = createBlock("rosewood_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_lower_triple_drawer = createBlock("rosewood_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_triple_drawer = createBlock("rosewood_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_desk = createBlock("rosewood_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_covered_desk = createBlock("rosewood_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_modern_desk = createBlock("rosewood_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_table = createBlock("rosewood_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_end_table = createBlock("rosewood_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_coffee_table = createBlock("rosewood_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_glass_table = createBlock("rosewood_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_chair = createBlock("rosewood_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_modern_chair = createBlock("rosewood_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_striped_chair = createBlock("rosewood_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_stool_chair = createBlock("rosewood_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_counter = createBlock("rosewood_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_drawer_counter = createBlock("rosewood_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_double_drawer_counter = createBlock("rosewood_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> rosewood_cupboard_counter = createBlock("rosewood_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> sequoia_wardrobe = createBlock("sequoia_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_modern_wardrobe = createBlock("sequoia_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_double_wardrobe = createBlock("sequoia_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_bookshelf = createBlock("sequoia_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_bookshelf_cupboard = createBlock("sequoia_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_drawer = createBlock("sequoia_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_double_drawer = createBlock("sequoia_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_bookshelf_drawer = createBlock("sequoia_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_lower_bookshelf_drawer = createBlock("sequoia_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_large_drawer = createBlock("sequoia_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_lower_triple_drawer = createBlock("sequoia_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_triple_drawer = createBlock("sequoia_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_desk = createBlock("sequoia_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_covered_desk = createBlock("sequoia_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_modern_desk = createBlock("sequoia_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_table = createBlock("sequoia_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_end_table = createBlock("sequoia_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_coffee_table = createBlock("sequoia_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_glass_table = createBlock("sequoia_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_chair = createBlock("sequoia_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_modern_chair = createBlock("sequoia_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_striped_chair = createBlock("sequoia_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_stool_chair = createBlock("sequoia_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_counter = createBlock("sequoia_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_drawer_counter = createBlock("sequoia_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_double_drawer_counter = createBlock("sequoia_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sequoia_cupboard_counter = createBlock("sequoia_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> sycamore_wardrobe = createBlock("sycamore_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_modern_wardrobe = createBlock("sycamore_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_double_wardrobe = createBlock("sycamore_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_bookshelf = createBlock("sycamore_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_bookshelf_cupboard = createBlock("sycamore_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_drawer = createBlock("sycamore_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_double_drawer = createBlock("sycamore_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_bookshelf_drawer = createBlock("sycamore_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_lower_bookshelf_drawer = createBlock("sycamore_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_large_drawer = createBlock("sycamore_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_lower_triple_drawer = createBlock("sycamore_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_triple_drawer = createBlock("sycamore_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_desk = createBlock("sycamore_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_covered_desk = createBlock("sycamore_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_modern_desk = createBlock("sycamore_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_table = createBlock("sycamore_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_end_table = createBlock("sycamore_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_coffee_table = createBlock("sycamore_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_glass_table = createBlock("sycamore_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_chair = createBlock("sycamore_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_modern_chair = createBlock("sycamore_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_striped_chair = createBlock("sycamore_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_stool_chair = createBlock("sycamore_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_counter = createBlock("sycamore_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_drawer_counter = createBlock("sycamore_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_double_drawer_counter = createBlock("sycamore_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> sycamore_cupboard_counter = createBlock("sycamore_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> white_cedar_wardrobe = createBlock("white_cedar_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_modern_wardrobe = createBlock("white_cedar_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_double_wardrobe = createBlock("white_cedar_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_bookshelf = createBlock("white_cedar_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_bookshelf_cupboard = createBlock("white_cedar_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_drawer = createBlock("white_cedar_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_double_drawer = createBlock("white_cedar_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_bookshelf_drawer = createBlock("white_cedar_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_lower_bookshelf_drawer = createBlock("white_cedar_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_large_drawer = createBlock("white_cedar_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_lower_triple_drawer = createBlock("white_cedar_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_triple_drawer = createBlock("white_cedar_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_desk = createBlock("white_cedar_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_covered_desk = createBlock("white_cedar_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_modern_desk = createBlock("white_cedar_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_table = createBlock("white_cedar_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_end_table = createBlock("white_cedar_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_coffee_table = createBlock("white_cedar_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_glass_table = createBlock("white_cedar_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_chair = createBlock("white_cedar_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_modern_chair = createBlock("white_cedar_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_striped_chair = createBlock("white_cedar_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_stool_chair = createBlock("white_cedar_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_counter = createBlock("white_cedar_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_drawer_counter = createBlock("white_cedar_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_double_drawer_counter = createBlock("white_cedar_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> white_cedar_cupboard_counter = createBlock("white_cedar_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> willow_wardrobe = createBlock("willow_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_modern_wardrobe = createBlock("willow_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_double_wardrobe = createBlock("willow_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_bookshelf = createBlock("willow_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_bookshelf_cupboard = createBlock("willow_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_drawer = createBlock("willow_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_double_drawer = createBlock("willow_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_bookshelf_drawer = createBlock("willow_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_lower_bookshelf_drawer = createBlock("willow_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_large_drawer = createBlock("willow_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_lower_triple_drawer = createBlock("willow_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_triple_drawer = createBlock("willow_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_desk = createBlock("willow_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_covered_desk = createBlock("willow_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_modern_desk = createBlock("willow_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_table = createBlock("willow_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_end_table = createBlock("willow_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_coffee_table = createBlock("willow_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_glass_table = createBlock("willow_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_chair = createBlock("willow_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_modern_chair = createBlock("willow_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_striped_chair = createBlock("willow_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_stool_chair = createBlock("willow_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_counter = createBlock("willow_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_drawer_counter = createBlock("willow_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_double_drawer_counter = createBlock("willow_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> willow_cupboard_counter = createBlock("willow_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_wardrobe = createBlock("stripped_ash_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_modern_wardrobe = createBlock("stripped_ash_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_double_wardrobe = createBlock("stripped_ash_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_bookshelf = createBlock("stripped_ash_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_bookshelf_cupboard = createBlock("stripped_ash_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_drawer = createBlock("stripped_ash_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_double_drawer = createBlock("stripped_ash_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_bookshelf_drawer = createBlock("stripped_ash_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_lower_bookshelf_drawer = createBlock("stripped_ash_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_large_drawer = createBlock("stripped_ash_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_lower_triple_drawer = createBlock("stripped_ash_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_triple_drawer = createBlock("stripped_ash_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_desk = createBlock("stripped_ash_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_covered_desk = createBlock("stripped_ash_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_modern_desk = createBlock("stripped_ash_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_table = createBlock("stripped_ash_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_end_table = createBlock("stripped_ash_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_coffee_table = createBlock("stripped_ash_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_glass_table = createBlock("stripped_ash_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_chair = createBlock("stripped_ash_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_modern_chair = createBlock("stripped_ash_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_striped_chair = createBlock("stripped_ash_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_stool_chair = createBlock("stripped_ash_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_counter = createBlock("stripped_ash_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_drawer_counter = createBlock("stripped_ash_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_double_drawer_counter = createBlock("stripped_ash_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_ash_cupboard_counter = createBlock("stripped_ash_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));




    public static final RegistryObject<Block> stripped_aspen_wardrobe = createBlock("stripped_aspen_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_modern_wardrobe = createBlock("stripped_aspen_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_double_wardrobe = createBlock("stripped_aspen_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_bookshelf = createBlock("stripped_aspen_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_bookshelf_cupboard = createBlock("stripped_aspen_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_drawer = createBlock("stripped_aspen_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_double_drawer = createBlock("stripped_aspen_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_bookshelf_drawer = createBlock("stripped_aspen_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_lower_bookshelf_drawer = createBlock("stripped_aspen_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_large_drawer = createBlock("stripped_aspen_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_lower_triple_drawer = createBlock("stripped_aspen_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_triple_drawer = createBlock("stripped_aspen_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_desk = createBlock("stripped_aspen_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_covered_desk = createBlock("stripped_aspen_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_modern_desk = createBlock("stripped_aspen_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_table = createBlock("stripped_aspen_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_end_table = createBlock("stripped_aspen_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_coffee_table = createBlock("stripped_aspen_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_glass_table = createBlock("stripped_aspen_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_chair = createBlock("stripped_aspen_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_modern_chair = createBlock("stripped_aspen_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_striped_chair = createBlock("stripped_aspen_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_stool_chair = createBlock("stripped_aspen_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_counter = createBlock("stripped_aspen_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_drawer_counter = createBlock("stripped_aspen_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_double_drawer_counter = createBlock("stripped_aspen_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_aspen_cupboard_counter = createBlock("stripped_aspen_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_blackwood_wardrobe = createBlock("stripped_blackwood_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_modern_wardrobe = createBlock("stripped_blackwood_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_double_wardrobe = createBlock("stripped_blackwood_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_bookshelf = createBlock("stripped_blackwood_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_bookshelf_cupboard = createBlock("stripped_blackwood_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_drawer = createBlock("stripped_blackwood_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_double_drawer = createBlock("stripped_blackwood_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_bookshelf_drawer = createBlock("stripped_blackwood_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_lower_bookshelf_drawer = createBlock("stripped_blackwood_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_large_drawer = createBlock("stripped_blackwood_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_lower_triple_drawer = createBlock("stripped_blackwood_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_triple_drawer = createBlock("stripped_blackwood_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_desk = createBlock("stripped_blackwood_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_covered_desk = createBlock("stripped_blackwood_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_modern_desk = createBlock("stripped_blackwood_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_table = createBlock("stripped_blackwood_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_end_table = createBlock("stripped_blackwood_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_coffee_table = createBlock("stripped_blackwood_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_glass_table = createBlock("stripped_blackwood_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_chair = createBlock("stripped_blackwood_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_modern_chair = createBlock("stripped_blackwood_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_striped_chair = createBlock("stripped_blackwood_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_stool_chair = createBlock("stripped_blackwood_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_counter = createBlock("stripped_blackwood_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_drawer_counter = createBlock("stripped_blackwood_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_double_drawer_counter = createBlock("stripped_blackwood_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_blackwood_cupboard_counter = createBlock("stripped_blackwood_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> stripped_chestnut_wardrobe = createBlock("stripped_chestnut_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_modern_wardrobe = createBlock("stripped_chestnut_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_double_wardrobe = createBlock("stripped_chestnut_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_bookshelf = createBlock("stripped_chestnut_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_bookshelf_cupboard = createBlock("stripped_chestnut_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_drawer = createBlock("stripped_chestnut_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_double_drawer = createBlock("stripped_chestnut_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_bookshelf_drawer = createBlock("stripped_chestnut_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_lower_bookshelf_drawer = createBlock("stripped_chestnut_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_large_drawer = createBlock("stripped_chestnut_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_lower_triple_drawer = createBlock("stripped_chestnut_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_triple_drawer = createBlock("stripped_chestnut_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_desk = createBlock("stripped_chestnut_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_covered_desk = createBlock("stripped_chestnut_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_modern_desk = createBlock("stripped_chestnut_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_table = createBlock("stripped_chestnut_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_end_table = createBlock("stripped_chestnut_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_coffee_table = createBlock("stripped_chestnut_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_glass_table = createBlock("stripped_chestnut_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_chair = createBlock("stripped_chestnut_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_modern_chair = createBlock("stripped_chestnut_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_striped_chair = createBlock("stripped_chestnut_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_stool_chair = createBlock("stripped_chestnut_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_counter = createBlock("stripped_chestnut_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_drawer_counter = createBlock("stripped_chestnut_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_double_drawer_counter = createBlock("stripped_chestnut_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_chestnut_cupboard_counter = createBlock("stripped_chestnut_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> stripped_douglas_fir_wardrobe = createBlock("stripped_douglas_fir_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_modern_wardrobe = createBlock("stripped_douglas_fir_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_double_wardrobe = createBlock("stripped_douglas_fir_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_bookshelf = createBlock("stripped_douglas_fir_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_bookshelf_cupboard = createBlock("stripped_douglas_fir_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_drawer = createBlock("stripped_douglas_fir_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_double_drawer = createBlock("stripped_douglas_fir_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_bookshelf_drawer = createBlock("stripped_douglas_fir_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_lower_bookshelf_drawer = createBlock("stripped_douglas_fir_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_large_drawer = createBlock("stripped_douglas_fir_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_lower_triple_drawer = createBlock("stripped_douglas_fir_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_triple_drawer = createBlock("stripped_douglas_fir_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_desk = createBlock("stripped_douglas_fir_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_covered_desk = createBlock("stripped_douglas_fir_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_modern_desk = createBlock("stripped_douglas_fir_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_table = createBlock("stripped_douglas_fir_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_end_table = createBlock("stripped_douglas_fir_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_coffee_table = createBlock("stripped_douglas_fir_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_glass_table = createBlock("stripped_douglas_fir_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_chair = createBlock("stripped_douglas_fir_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_modern_chair = createBlock("stripped_douglas_fir_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_striped_chair = createBlock("stripped_douglas_fir_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_stool_chair = createBlock("stripped_douglas_fir_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_counter = createBlock("stripped_douglas_fir_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_drawer_counter = createBlock("stripped_douglas_fir_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_double_drawer_counter = createBlock("stripped_douglas_fir_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_douglas_fir_cupboard_counter = createBlock("stripped_douglas_fir_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_hickory_wardrobe = createBlock("stripped_hickory_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_modern_wardrobe = createBlock("stripped_hickory_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_double_wardrobe = createBlock("stripped_hickory_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_bookshelf = createBlock("stripped_hickory_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_bookshelf_cupboard = createBlock("stripped_hickory_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_drawer = createBlock("stripped_hickory_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_double_drawer = createBlock("stripped_hickory_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_bookshelf_drawer = createBlock("stripped_hickory_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_lower_bookshelf_drawer = createBlock("stripped_hickory_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_large_drawer = createBlock("stripped_hickory_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_lower_triple_drawer = createBlock("stripped_hickory_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_triple_drawer = createBlock("stripped_hickory_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_desk = createBlock("stripped_hickory_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_covered_desk = createBlock("stripped_hickory_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_modern_desk = createBlock("stripped_hickory_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_table = createBlock("stripped_hickory_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_end_table = createBlock("stripped_hickory_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_coffee_table = createBlock("stripped_hickory_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_glass_table = createBlock("stripped_hickory_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_chair = createBlock("stripped_hickory_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_modern_chair = createBlock("stripped_hickory_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_striped_chair = createBlock("stripped_hickory_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_stool_chair = createBlock("stripped_hickory_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_counter = createBlock("stripped_hickory_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_drawer_counter = createBlock("stripped_hickory_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_double_drawer_counter = createBlock("stripped_hickory_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_hickory_cupboard_counter = createBlock("stripped_hickory_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> stripped_kapok_wardrobe = createBlock("stripped_kapok_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_modern_wardrobe = createBlock("stripped_kapok_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_double_wardrobe = createBlock("stripped_kapok_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_bookshelf = createBlock("stripped_kapok_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_bookshelf_cupboard = createBlock("stripped_kapok_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_drawer = createBlock("stripped_kapok_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_double_drawer = createBlock("stripped_kapok_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_bookshelf_drawer = createBlock("stripped_kapok_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_lower_bookshelf_drawer = createBlock("stripped_kapok_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_large_drawer = createBlock("stripped_kapok_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_lower_triple_drawer = createBlock("stripped_kapok_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_triple_drawer = createBlock("stripped_kapok_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_desk = createBlock("stripped_kapok_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_covered_desk = createBlock("stripped_kapok_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_modern_desk = createBlock("stripped_kapok_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_table = createBlock("stripped_kapok_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_end_table = createBlock("stripped_kapok_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_coffee_table = createBlock("stripped_kapok_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_glass_table = createBlock("stripped_kapok_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_chair = createBlock("stripped_kapok_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_modern_chair = createBlock("stripped_kapok_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_striped_chair = createBlock("stripped_kapok_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_stool_chair = createBlock("stripped_kapok_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_counter = createBlock("stripped_kapok_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_drawer_counter = createBlock("stripped_kapok_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_double_drawer_counter = createBlock("stripped_kapok_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_kapok_cupboard_counter = createBlock("stripped_kapok_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_maple_wardrobe = createBlock("stripped_maple_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_modern_wardrobe = createBlock("stripped_maple_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_double_wardrobe = createBlock("stripped_maple_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_bookshelf = createBlock("stripped_maple_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_bookshelf_cupboard = createBlock("stripped_maple_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_drawer = createBlock("stripped_maple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_double_drawer = createBlock("stripped_maple_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_bookshelf_drawer = createBlock("stripped_maple_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_lower_bookshelf_drawer = createBlock("stripped_maple_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_large_drawer = createBlock("stripped_maple_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_lower_triple_drawer = createBlock("stripped_maple_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_triple_drawer = createBlock("stripped_maple_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_desk = createBlock("stripped_maple_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_covered_desk = createBlock("stripped_maple_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_modern_desk = createBlock("stripped_maple_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_table = createBlock("stripped_maple_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_end_table = createBlock("stripped_maple_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_coffee_table = createBlock("stripped_maple_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_glass_table = createBlock("stripped_maple_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_chair = createBlock("stripped_maple_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_modern_chair = createBlock("stripped_maple_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_striped_chair = createBlock("stripped_maple_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_stool_chair = createBlock("stripped_maple_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_counter = createBlock("stripped_maple_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_drawer_counter = createBlock("stripped_maple_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_double_drawer_counter = createBlock("stripped_maple_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_maple_cupboard_counter = createBlock("stripped_maple_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_palm_wardrobe = createBlock("stripped_palm_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_modern_wardrobe = createBlock("stripped_palm_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_double_wardrobe = createBlock("stripped_palm_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_bookshelf = createBlock("stripped_palm_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_bookshelf_cupboard = createBlock("stripped_palm_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_drawer = createBlock("stripped_palm_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_double_drawer = createBlock("stripped_palm_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_bookshelf_drawer = createBlock("stripped_palm_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_lower_bookshelf_drawer = createBlock("stripped_palm_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_large_drawer = createBlock("stripped_palm_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_lower_triple_drawer = createBlock("stripped_palm_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_triple_drawer = createBlock("stripped_palm_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_desk = createBlock("stripped_palm_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_covered_desk = createBlock("stripped_palm_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_modern_desk = createBlock("stripped_palm_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_table = createBlock("stripped_palm_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_end_table = createBlock("stripped_palm_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_coffee_table = createBlock("stripped_palm_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_glass_table = createBlock("stripped_palm_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_chair = createBlock("stripped_palm_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_modern_chair = createBlock("stripped_palm_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_striped_chair = createBlock("stripped_palm_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_stool_chair = createBlock("stripped_palm_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_counter = createBlock("stripped_palm_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_drawer_counter = createBlock("stripped_palm_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_double_drawer_counter = createBlock("stripped_palm_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_palm_cupboard_counter = createBlock("stripped_palm_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_pine_wardrobe = createBlock("stripped_pine_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_modern_wardrobe = createBlock("stripped_pine_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_double_wardrobe = createBlock("stripped_pine_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_bookshelf = createBlock("stripped_pine_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_bookshelf_cupboard = createBlock("stripped_pine_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_drawer = createBlock("stripped_pine_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_double_drawer = createBlock("stripped_pine_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_bookshelf_drawer = createBlock("stripped_pine_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_lower_bookshelf_drawer = createBlock("stripped_pine_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_large_drawer = createBlock("stripped_pine_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_lower_triple_drawer = createBlock("stripped_pine_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_triple_drawer = createBlock("stripped_pine_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_desk = createBlock("stripped_pine_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_covered_desk = createBlock("stripped_pine_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_modern_desk = createBlock("stripped_pine_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_table = createBlock("stripped_pine_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_end_table = createBlock("stripped_pine_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_coffee_table = createBlock("stripped_pine_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_glass_table = createBlock("stripped_pine_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_chair = createBlock("stripped_pine_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_modern_chair = createBlock("stripped_pine_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_striped_chair = createBlock("stripped_pine_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_stool_chair = createBlock("stripped_pine_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_counter = createBlock("stripped_pine_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_drawer_counter = createBlock("stripped_pine_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_double_drawer_counter = createBlock("stripped_pine_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_pine_cupboard_counter = createBlock("stripped_pine_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> stripped_rosewood_wardrobe = createBlock("stripped_rosewood_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_modern_wardrobe = createBlock("stripped_rosewood_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_double_wardrobe = createBlock("stripped_rosewood_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_bookshelf = createBlock("stripped_rosewood_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_bookshelf_cupboard = createBlock("stripped_rosewood_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_drawer = createBlock("stripped_rosewood_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_double_drawer = createBlock("stripped_rosewood_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_bookshelf_drawer = createBlock("stripped_rosewood_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_lower_bookshelf_drawer = createBlock("stripped_rosewood_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_large_drawer = createBlock("stripped_rosewood_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_lower_triple_drawer = createBlock("stripped_rosewood_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_triple_drawer = createBlock("stripped_rosewood_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_desk = createBlock("stripped_rosewood_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_covered_desk = createBlock("stripped_rosewood_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_modern_desk = createBlock("stripped_rosewood_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_table = createBlock("stripped_rosewood_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_end_table = createBlock("stripped_rosewood_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_coffee_table = createBlock("stripped_rosewood_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_glass_table = createBlock("stripped_rosewood_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_chair = createBlock("stripped_rosewood_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_modern_chair = createBlock("stripped_rosewood_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_striped_chair = createBlock("stripped_rosewood_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_stool_chair = createBlock("stripped_rosewood_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_counter = createBlock("stripped_rosewood_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_drawer_counter = createBlock("stripped_rosewood_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_double_drawer_counter = createBlock("stripped_rosewood_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_rosewood_cupboard_counter = createBlock("stripped_rosewood_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_sequoia_wardrobe = createBlock("stripped_sequoia_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_modern_wardrobe = createBlock("stripped_sequoia_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_double_wardrobe = createBlock("stripped_sequoia_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_bookshelf = createBlock("stripped_sequoia_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_bookshelf_cupboard = createBlock("stripped_sequoia_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_drawer = createBlock("stripped_sequoia_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_double_drawer = createBlock("stripped_sequoia_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_bookshelf_drawer = createBlock("stripped_sequoia_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_lower_bookshelf_drawer = createBlock("stripped_sequoia_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_large_drawer = createBlock("stripped_sequoia_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_lower_triple_drawer = createBlock("stripped_sequoia_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_triple_drawer = createBlock("stripped_sequoia_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_desk = createBlock("stripped_sequoia_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_covered_desk = createBlock("stripped_sequoia_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_modern_desk = createBlock("stripped_sequoia_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_table = createBlock("stripped_sequoia_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_end_table = createBlock("stripped_sequoia_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_coffee_table = createBlock("stripped_sequoia_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_glass_table = createBlock("stripped_sequoia_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_chair = createBlock("stripped_sequoia_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_modern_chair = createBlock("stripped_sequoia_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_striped_chair = createBlock("stripped_sequoia_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_stool_chair = createBlock("stripped_sequoia_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_counter = createBlock("stripped_sequoia_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_drawer_counter = createBlock("stripped_sequoia_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_double_drawer_counter = createBlock("stripped_sequoia_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sequoia_cupboard_counter = createBlock("stripped_sequoia_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_sycamore_wardrobe = createBlock("stripped_sycamore_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_modern_wardrobe = createBlock("stripped_sycamore_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_double_wardrobe = createBlock("stripped_sycamore_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_bookshelf = createBlock("stripped_sycamore_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_bookshelf_cupboard = createBlock("stripped_sycamore_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_drawer = createBlock("stripped_sycamore_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_double_drawer = createBlock("stripped_sycamore_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_bookshelf_drawer = createBlock("stripped_sycamore_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_lower_bookshelf_drawer = createBlock("stripped_sycamore_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_large_drawer = createBlock("stripped_sycamore_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_lower_triple_drawer = createBlock("stripped_sycamore_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_triple_drawer = createBlock("stripped_sycamore_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_desk = createBlock("stripped_sycamore_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_covered_desk = createBlock("stripped_sycamore_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_modern_desk = createBlock("stripped_sycamore_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_table = createBlock("stripped_sycamore_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_end_table = createBlock("stripped_sycamore_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_coffee_table = createBlock("stripped_sycamore_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_glass_table = createBlock("stripped_sycamore_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_chair = createBlock("stripped_sycamore_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_modern_chair = createBlock("stripped_sycamore_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_striped_chair = createBlock("stripped_sycamore_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_stool_chair = createBlock("stripped_sycamore_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_counter = createBlock("stripped_sycamore_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_drawer_counter = createBlock("stripped_sycamore_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_double_drawer_counter = createBlock("stripped_sycamore_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_sycamore_cupboard_counter = createBlock("stripped_sycamore_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));



    public static final RegistryObject<Block> stripped_white_cedar_wardrobe = createBlock("stripped_white_cedar_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_modern_wardrobe = createBlock("stripped_white_cedar_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_double_wardrobe = createBlock("stripped_white_cedar_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_bookshelf = createBlock("stripped_white_cedar_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_bookshelf_cupboard = createBlock("stripped_white_cedar_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_drawer = createBlock("stripped_white_cedar_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_double_drawer = createBlock("stripped_white_cedar_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_bookshelf_drawer = createBlock("stripped_white_cedar_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_lower_bookshelf_drawer = createBlock("stripped_white_cedar_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_large_drawer = createBlock("stripped_white_cedar_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_lower_triple_drawer = createBlock("stripped_white_cedar_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_triple_drawer = createBlock("stripped_white_cedar_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_desk = createBlock("stripped_white_cedar_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_covered_desk = createBlock("stripped_white_cedar_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_modern_desk = createBlock("stripped_white_cedar_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_table = createBlock("stripped_white_cedar_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_end_table = createBlock("stripped_white_cedar_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_coffee_table = createBlock("stripped_white_cedar_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_glass_table = createBlock("stripped_white_cedar_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_chair = createBlock("stripped_white_cedar_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_modern_chair = createBlock("stripped_white_cedar_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_striped_chair = createBlock("stripped_white_cedar_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_stool_chair = createBlock("stripped_white_cedar_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_counter = createBlock("stripped_white_cedar_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_drawer_counter = createBlock("stripped_white_cedar_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_double_drawer_counter = createBlock("stripped_white_cedar_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_white_cedar_cupboard_counter = createBlock("stripped_white_cedar_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final RegistryObject<Block> stripped_willow_wardrobe = createBlock("stripped_willow_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_modern_wardrobe = createBlock("stripped_willow_modern_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_double_wardrobe = createBlock("stripped_willow_double_wardrobe", () -> new TallFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_bookshelf = createBlock("stripped_willow_bookshelf", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_bookshelf_cupboard = createBlock("stripped_willow_bookshelf_cupboard", () -> new BookCabinet(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_drawer = createBlock("stripped_willow_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_double_drawer = createBlock("stripped_willow_double_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_bookshelf_drawer = createBlock("stripped_willow_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_lower_bookshelf_drawer = createBlock("stripped_willow_lower_bookshelf_drawer", () -> new BookDrawer(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_large_drawer = createBlock("stripped_willow_large_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_lower_triple_drawer = createBlock("stripped_willow_lower_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_triple_drawer = createBlock("stripped_willow_triple_drawer", () -> new WideFurniture(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_desk = createBlock("stripped_willow_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_covered_desk = createBlock("stripped_willow_covered_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_modern_desk = createBlock("stripped_willow_modern_desk", () -> new Desk(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_table = createBlock("stripped_willow_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_end_table = createBlock("stripped_willow_end_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_coffee_table = createBlock("stripped_willow_coffee_table", () -> new Table(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_glass_table = createBlock("stripped_willow_glass_table", () -> new TableHitbox(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_chair = createBlock("stripped_willow_chair", () -> new ClassicChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_modern_chair = createBlock("stripped_willow_modern_chair", () -> new ModernChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_striped_chair = createBlock("stripped_willow_striped_chair", () -> new StripedChair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_stool_chair = createBlock("stripped_willow_stool_chair", () -> new Chair(Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_counter = createBlock("stripped_willow_counter", () -> new Counter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_drawer_counter = createBlock("stripped_willow_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_double_drawer_counter = createBlock("stripped_willow_double_drawer_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));

    public static final RegistryObject<Block> stripped_willow_cupboard_counter = createBlock("stripped_willow_cupboard_counter", () -> new StorageCounter(Blocks.OAK_LOG.defaultBlockState(), Block.Properties.of(Material.WOOD).strength(2.0F, 2.3F)));


    public static final String[] list_furniture = {"wardrobe", "modern_wardrobe", "double_wardrobe", "bookshelf", "bookshelf_cupboard", "drawer", "double_drawer",
            "bookshelf_drawer", "lower_bookshelf_drawer", "large_drawer", "lower_triple_drawer", "triple_drawer", "desk", "covered_desk", "modern_desk",
            "table", "end_table", "coffee_table", "glass_table", "chair", "modern_chair", "striped_chair", "stool_chair", "counter", "drawer_counter", "double_drawer_counter", "cupboard_counter"};

    public static final String[] list_wood = { "acacia", "ash", "aspen","birch", "blackwood", "chestnut", "douglas_fir", "hickory", "kapok", "maple","oak", "palm", "pine", "rosewood", "sequoia", "spruce", "sycamore", "white_cedar", "willow" };


    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(FurnitureCompaTFC.TAB_GROUP)));
        return block;
    }
}
