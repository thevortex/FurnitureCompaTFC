package com.thevortex.furniturecompatfc.swap;

import com.mcwfurnitures.kikoz.storage.StorageTileEntity;
import net.dries007.tfc.common.container.PestContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class ModTileEntity extends StorageTileEntity implements PestContainer{
    public ModTileEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }
    
}
