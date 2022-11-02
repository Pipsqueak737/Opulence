package pipsqueak737.core.registry;

import gg.moonflower.pollen.api.registry.PollinatedBlockRegistry;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import pipsqueak737.core.common.block.OpulenceStairBlock;
import pipsqueak737.core.common.item.TabInsertBlockItem;

import java.util.function.Function;
import java.util.function.Supplier;

public class OpulenceBlocks {

    public static final PollinatedBlockRegistry BLOCKS = PollinatedRegistry.createBlock(OpulenceItems.ITEMS);

    // Gold
    public static final Supplier<Block> GOLD_SLAB = BLOCKS.registerWithItem("gold_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), insertBlockItem(Items.GOLD_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> GOLD_STAIRS = BLOCKS.registerWithItem("gold_stairs", () -> new OpulenceStairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), insertBlockItem(Items.GOLD_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> CUT_GOLD = BLOCKS.registerWithItem("cut_gold", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CUT_GOLD_STAIRS = BLOCKS.registerWithItem("cut_gold_stairs", () -> new OpulenceStairBlock(CUT_GOLD.get().defaultBlockState(), BlockBehaviour.Properties.copy(OpulenceBlocks.CUT_GOLD.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CUT_GOLD_SLAB = BLOCKS.registerWithItem("cut_gold_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_GOLD.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> ENGRAVED_GOLD = BLOCKS.registerWithItem("engraved_gold", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> GOLD_PILLAR = BLOCKS.registerWithItem("gold_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    // Diamond
    public static final Supplier<Block> DIAMOND_SLAB = BLOCKS.registerWithItem("diamond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), insertBlockItem(Items.DIAMOND_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> DIAMOND_STAIRS = BLOCKS.registerWithItem("diamond_stairs", () -> new OpulenceStairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), insertBlockItem(Items.DIAMOND_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> CUT_DIAMOND = BLOCKS.registerWithItem("cut_diamond", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CUT_DIAMOND_STAIRS = BLOCKS.registerWithItem("cut_diamond_stairs", () -> new OpulenceStairBlock(CUT_DIAMOND.get().defaultBlockState(), BlockBehaviour.Properties.copy(OpulenceBlocks.CUT_DIAMOND.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CUT_DIAMOND_SLAB = BLOCKS.registerWithItem("cut_diamond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_DIAMOND.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> ENGRAVED_DIAMOND = BLOCKS.registerWithItem("engraved_diamond", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIAMOND_PILLAR = BLOCKS.registerWithItem("diamond_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    // Emerald
    public static final Supplier<Block> EMERALD_SLAB = BLOCKS.registerWithItem("emerald_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), insertBlockItem(Items.EMERALD_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> EMERALD_STAIRS = BLOCKS.registerWithItem("emerald_stairs", () -> new OpulenceStairBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), insertBlockItem(Items.EMERALD_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> CUT_EMERALD = BLOCKS.registerWithItem("cut_emerald", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CUT_EMERALD_STAIRS = BLOCKS.registerWithItem("cut_emerald_stairs", () -> new OpulenceStairBlock(CUT_EMERALD.get().defaultBlockState(), BlockBehaviour.Properties.copy(OpulenceBlocks.CUT_EMERALD.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CUT_EMERALD_SLAB = BLOCKS.registerWithItem("cut_emerald_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_EMERALD.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> ENGRAVED_EMERALD = BLOCKS.registerWithItem("engraved_emerald", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> EMERALD_PILLAR = BLOCKS.registerWithItem("emerald_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));


    private static Function<Block, Item> insertBlockItem(Item insertAfter, Item.Properties properties) {
        return object -> new TabInsertBlockItem(object, insertAfter, properties);
    }

}