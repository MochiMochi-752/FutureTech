package future_tech;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(FutureTech.MOD_ID)
public class FutureTech {

    public static final String MOD_ID = "future_tech";
    public static final String MOD_NAME = "Future Tech";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FutureTech(IEventBus modBus, ModContainer container) {
        modBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info(MOD_NAME);
    }

}
