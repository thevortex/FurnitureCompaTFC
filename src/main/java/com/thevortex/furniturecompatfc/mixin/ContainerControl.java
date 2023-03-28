package com.thevortex.furniturecompatfc.mixin;

import com.mcwfurnitures.kikoz.storage.StorageTileEntity;
import net.dries007.tfc.common.container.PestContainer;
import net.dries007.tfc.common.container.RestrictedChestContainer;
import net.dries007.tfc.common.container.TFCContainerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = StorageTileEntity.class,remap = false)
public abstract class ContainerControl extends RandomizableContainerBlockEntity implements PestContainer {

    protected ContainerControl(BlockEntityType<?> beType, BlockPos pos, BlockState state) {
        super(beType, pos, state);
    }

    /**
     * @author thevortex
     * @reason
     */
    @Overwrite
    protected AbstractContainerMenu createMenu(int ints, Inventory inventory) {
        return new RestrictedChestContainer(TFCContainerTypes.CHEST_9x2.get(), ints, inventory, this, 2);
    }

    /**
     * @author thevortex
     * @reason
     */
    @Overwrite
    public int getContainerSize() {
        return 18;
    }

    @Override
    public boolean canBeInfested()
    {
        return true;
    }


}