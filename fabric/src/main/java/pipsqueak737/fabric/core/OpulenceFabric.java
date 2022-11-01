package pipsqueak737.fabric.core;

import pipsqueak737.core.Opulence;
import net.fabricmc.api.ModInitializer;

public class OpulenceFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Opulence.PLATFORM.setup();
    }

}