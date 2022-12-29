package com.thevortex.furniturecompatfc.datagen.server;

import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import com.thevortex.furniturecompatfc.block.ModRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.stream.Collectors;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, FurnitureCompaTFC.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Block knownBlock : getKnownBlocks()) {
            tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE).add(knownBlock);
        }
    }

    protected Iterable<Block> getKnownBlocks() {
        return ModRegistry.BLOCKS_REGISTRY.getEntries()
                .stream().map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
