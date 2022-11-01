package pipsqueak737.core;

import gg.moonflower.pollen.api.platform.Platform;
import pipsqueak737.core.registry.OpulenceBlocks;
import pipsqueak737.core.registry.OpulenceItems;

public class Opulence {

    public static final String MOD_ID = "opulence";

    public static final Platform PLATFORM = Platform.builder(Opulence.MOD_ID)
            .commonInit(Opulence::commonInit)
            .commonPostInit(Opulence::commonPostInit)
            .clientInit(Opulence::clientInit)
            .clientPostInit(Opulence::clientPostInit)
            .build();

    public static void commonInit() {
        OpulenceBlocks.BLOCKS.register(Opulence.PLATFORM);
        OpulenceItems.ITEMS.register(Opulence.PLATFORM);
    }

    public static void clientInit() {

    }

    public static void commonPostInit(Platform.ModSetupContext ctx) {

    }

    public static void clientPostInit(Platform.ModSetupContext ctx) {

    }

}