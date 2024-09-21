package future_tech.init;

import future_tech.FutureTech;
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

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
