package pipsqueak737.forge.core;

import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import pipsqueak737.core.Opulence;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Opulence.MOD_ID)
public class OpulenceForge {

    public OpulenceForge() {
        Opulence.PLATFORM.setup();
    }

}