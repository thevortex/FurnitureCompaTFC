package com.thevortex.furniturecompatfc.datagen.client;

import com.thevortex.furniturecompatfc.FurnitureCompaTFC;
import com.thevortex.furniturecompatfc.block.ModRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public class BlockModels extends BlockModelProvider {
    public BlockModels(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, FurnitureCompaTFC.MODID, fileHelper);
    }

    private ResourceLocation resTFCLog(String name) {
        return new ResourceLocation("tfc", "block/wood/log/".concat(name));
    }

    @Override
    protected void registerModels() {
        Collection<RegistryObject<Block>> entries = ModRegistry.BLOCKS_REGISTRY.getEntries();

        ResourceLocation generated = new ResourceLocation("block/generated");

        entries.stream()
                .forEach(block -> {
                    String name = block.getId().getPath();
                    withExistingParent(name, generated)
                            .texture("layer0", resTFCLog(name));
                });

    }

    private void createModels(){
        ResourceLocation chair = new ResourceLocation("block/generated");
        ResourceLocation counter = new ResourceLocation("block/generated");
        ResourceLocation desk = new ResourceLocation("block/generated");
        ResourceLocation drawer = new ResourceLocation("block/generated");
        ResourceLocation table = new ResourceLocation("block/generated");
        ResourceLocation wardrobe = new ResourceLocation("block/generated");

    }
}