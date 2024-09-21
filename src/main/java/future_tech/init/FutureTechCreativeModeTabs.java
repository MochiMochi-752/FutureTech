package future_tech.init;

import future_tech.FutureTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FutureTechCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FutureTech.MOD_ID);

    public static final Supplier<CreativeModeTab> FUTURE_TECH_TAB = CREATIVE_MODE_TAB.register("future_tech_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + FutureTech.MOD_ID))
            .icon(() -> new ItemStack(FutureTechItems.TIN_INGOT.get()))
            .displayItems((itemDisplayParameters, output) -> {
                FutureTechItems.ITEMS.getEntries().stream().map(DeferredHolder::get).forEach(output::accept);
            })
            .build()
    );

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }

}
