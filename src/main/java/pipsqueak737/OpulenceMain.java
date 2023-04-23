package pipsqueak737;

import com.mojang.logging.LogUtils;
import com.teamabnormals.blueprint.common.item.InjectedBlockItem;
import com.teamabnormals.blueprint.common.item.InjectedItem;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import pipsqueak737.registry.OpulenceBlocks;
import pipsqueak737.registry.OpulenceItems;

@Mod(OpulenceMain.MOD_ID)

public class OpulenceMain
{

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MOD_ID = "opulence";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public OpulenceMain()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        OpulenceItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        OpulenceBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        REGISTRY_HELPER.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

    }

    private void processIMC(final InterModProcessEvent event)
    {

    }

}
