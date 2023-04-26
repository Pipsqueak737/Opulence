package pipsqueak737.registry;

import com.teamabnormals.blueprint.common.block.VerticalSlabBlock;
import com.teamabnormals.blueprint.common.item.InjectedBlockItem;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pipsqueak737.OpulenceMain;

@Mod.EventBusSubscriber(
        modid = OpulenceMain.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)

public class OpulenceBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OpulenceMain.MOD_ID);

    public static final BlockSubRegistryHelper HELPER = OpulenceMain.REGISTRY_HELPER.getBlockSubHelper();

    //Gold
    public static final RegistryObject<Block> GOLD_STAIRS = HELPER.createBlockWithItem("gold_stairs", () -> new StairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), () -> new InjectedBlockItem(Blocks.GOLD_BLOCK.asItem(), OpulenceBlocks.GOLD_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> GOLD_SLAB = HELPER.createBlockWithItem("gold_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), () -> new InjectedBlockItem(GOLD_STAIRS.get().asItem(), OpulenceBlocks.GOLD_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_GOLD = HELPER.createBlockWithItem("cut_gold", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), () -> new InjectedBlockItem(GOLD_SLAB.get().asItem(), OpulenceBlocks.CUT_GOLD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_GOLD_STAIRS = HELPER.createBlockWithItem("cut_gold_stairs", () -> new StairBlock(CUT_GOLD.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(CUT_GOLD.get().asItem(), OpulenceBlocks.CUT_GOLD_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_GOLD_SLAB = HELPER.createBlockWithItem("cut_gold_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(CUT_GOLD_STAIRS.get().asItem(), OpulenceBlocks.CUT_GOLD_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> ENGRAVED_GOLD = HELPER.createBlockWithItem("engraved_gold", () -> new Block(BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(CUT_GOLD_SLAB.get().asItem(), OpulenceBlocks.ENGRAVED_GOLD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> GOLD_PILLAR = HELPER.createBlockWithItem("gold_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(ENGRAVED_GOLD.get().asItem(), OpulenceBlocks.GOLD_PILLAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    //Emerald
    public static final RegistryObject<Block> EMERALD_STAIRS = HELPER.createBlockWithItem("emerald_stairs", () -> new StairBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), () -> new InjectedBlockItem(Blocks.EMERALD_BLOCK.asItem(), OpulenceBlocks.EMERALD_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> EMERALD_SLAB = HELPER.createBlockWithItem("emerald_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), () -> new InjectedBlockItem(EMERALD_STAIRS.get().asItem(), OpulenceBlocks.EMERALD_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_EMERALD = HELPER.createBlockWithItem("cut_emerald", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), () -> new InjectedBlockItem(EMERALD_SLAB.get().asItem(), OpulenceBlocks.CUT_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_EMERALD_STAIRS = HELPER.createBlockWithItem("cut_emerald_stairs", () -> new StairBlock(CUT_EMERALD.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_EMERALD.get())), () -> new InjectedBlockItem(CUT_EMERALD.get().asItem(), OpulenceBlocks.CUT_EMERALD_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_EMERALD_SLAB = HELPER.createBlockWithItem("cut_emerald_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_EMERALD.get())), () -> new InjectedBlockItem(CUT_EMERALD_STAIRS.get().asItem(), OpulenceBlocks.CUT_EMERALD_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> ENGRAVED_EMERALD = HELPER.createBlockWithItem("engraved_emerald", () -> new Block(BlockBehaviour.Properties.copy(CUT_EMERALD.get())), () -> new InjectedBlockItem(CUT_EMERALD_SLAB.get().asItem(), OpulenceBlocks.ENGRAVED_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> EMERALD_PILLAR = HELPER.createBlockWithItem("emerald_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(CUT_EMERALD.get())), () -> new InjectedBlockItem(ENGRAVED_EMERALD.get().asItem(), OpulenceBlocks.EMERALD_PILLAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    //Diamond
    public static final RegistryObject<Block> DIAMOND_STAIRS = HELPER.createBlockWithItem("diamond_stairs", () -> new StairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), () -> new InjectedBlockItem(Blocks.DIAMOND_BLOCK.asItem(), OpulenceBlocks.DIAMOND_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> DIAMOND_SLAB = HELPER.createBlockWithItem("diamond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), () -> new InjectedBlockItem(DIAMOND_STAIRS.get().asItem(), OpulenceBlocks.DIAMOND_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_DIAMOND = HELPER.createBlockWithItem("cut_diamond", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), () -> new InjectedBlockItem(DIAMOND_SLAB.get().asItem(), OpulenceBlocks.CUT_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_DIAMOND_STAIRS = HELPER.createBlockWithItem("cut_diamond_stairs", () -> new StairBlock(CUT_DIAMOND.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_DIAMOND.get())), () -> new InjectedBlockItem(CUT_DIAMOND.get().asItem(), OpulenceBlocks.CUT_DIAMOND_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_DIAMOND_SLAB = HELPER.createBlockWithItem("cut_diamond_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_DIAMOND.get())), () -> new InjectedBlockItem(CUT_DIAMOND_STAIRS.get().asItem(), OpulenceBlocks.CUT_DIAMOND_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> ENGRAVED_DIAMOND = HELPER.createBlockWithItem("engraved_diamond", () -> new Block(BlockBehaviour.Properties.copy(CUT_DIAMOND.get())), () -> new InjectedBlockItem(CUT_DIAMOND_SLAB.get().asItem(), OpulenceBlocks.ENGRAVED_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> DIAMOND_PILLAR = HELPER.createBlockWithItem("diamond_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(CUT_DIAMOND.get())), () -> new InjectedBlockItem(ENGRAVED_DIAMOND.get().asItem(), OpulenceBlocks.DIAMOND_PILLAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}