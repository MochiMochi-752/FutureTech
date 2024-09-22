package future_tech.common.registers;

import future_tech.FutureTech;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FutureTechBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FutureTech.MOD_ID);

    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.registerSimpleBlock("tin_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2, 3));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = BLOCKS.registerSimpleBlock("deepslate_tin_ore", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(3.5F, 3));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

}
