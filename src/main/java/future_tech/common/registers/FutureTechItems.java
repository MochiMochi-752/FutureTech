package future_tech.common.registers;

import future_tech.FutureTech;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FutureTechItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FutureTech.MOD_ID);

    public static final Supplier<Item> TIN_INGOT = ITEMS.registerSimpleItem("tin_ingot");
    public static final Supplier<Item> BRONZE_INGOT = ITEMS.registerSimpleItem("bronze_ingot");

    public static final Supplier<Item> TIN_DUST = ITEMS.registerSimpleItem("tin_dust");
    public static final Supplier<Item> BRONZE_DUST = ITEMS.registerSimpleItem("bronze_dust");

    public static final Supplier<BlockItem> TIN_ORE = ITEMS.registerSimpleBlockItem(FutureTechBlocks.TIN_ORE);
    public static final Supplier<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.registerSimpleBlockItem(FutureTechBlocks.DEEPSLATE_TIN_ORE);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
