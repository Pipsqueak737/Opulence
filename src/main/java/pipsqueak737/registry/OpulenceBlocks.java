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
    public static final RegistryObject<Block> CUT_GOLD = HELPER.createBlockWithItem("cut_gold", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL)), () -> new InjectedBlockItem(Items.GOLD_BLOCK, OpulenceBlocks.CUT_GOLD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_GOLD_STAIRS = HELPER.createBlockWithItem("cut_gold_stairs", () -> new StairBlock(CUT_GOLD.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(OpulenceBlocks.CUT_GOLD.get().asItem(), OpulenceBlocks.CUT_GOLD_STAIRS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> CUT_GOLD_SLAB = HELPER.createBlockWithItem("cut_gold_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(OpulenceBlocks.CUT_GOLD_STAIRS.get().asItem(), OpulenceBlocks.CUT_GOLD_SLAB.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> ENGRAVED_GOLD = HELPER.createBlockWithItem("engraved_gold", () -> new Block(BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(OpulenceBlocks.CUT_GOLD_SLAB.get().asItem(), OpulenceBlocks.ENGRAVED_GOLD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Block> GOLD_PILLAR = HELPER.createBlockWithItem("gold_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(CUT_GOLD.get())), () -> new InjectedBlockItem(OpulenceBlocks.ENGRAVED_GOLD.get().asItem(), OpulenceBlocks.GOLD_PILLAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
   // public static final RegistryObject<VerticalSlabBlock> CUT_GOLD_VERTICAL_SLAB = BLOCKS.register("cut_gold_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL)));

    //Emerald
   // public static final RegistryObject<Block> CUT_EMERALD = BLOCKS.register("cut_emerald", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
   // public static final RegistryObject<SlabBlock> CUT_EMERALD_SLAB = BLOCKS.register("cut_emerald_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    //public static final RegistryObject<StairBlock> CUT_EMERALD_STAIRS = BLOCKS.register("cut_emerald_stairs", () -> new StairBlock(CUT_EMERALD.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_EMERALD.get())));
   // public static final RegistryObject<Block> ENGRAVED_EMERALD = BLOCKS.register("engraved_emerald", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
   // public static final RegistryObject<Block> EMERALD_PILLAR = BLOCKS.register("emerald_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
   // public static final RegistryObject<VerticalSlabBlock> CUT_EMERALD_VERTICAL_SLAB = BLOCKS.register("cut_emerald_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    //Diamond
    //public static final RegistryObject<Block> CUT_DIAMOND = BLOCKS.register("cut_diamond", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    //public static final RegistryObject<SlabBlock> CUT_DIAMOND_SLAB = BLOCKS.register("cut_diamond_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    //public static final RegistryObject<StairBlock> CUT_DIAMOND_STAIRS = BLOCKS.register("cut_diamond_stairs", () -> new StairBlock(CUT_DIAMOND.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_DIAMOND.get())));
   // public static final RegistryObject<Block> DIAMOND_PILLAR = BLOCKS.register("diamond_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    //public static final RegistryObject<VerticalSlabBlock> CUT_DIAMOND_VERTICAL_SLAB = BLOCKS.register("cut_diamond_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

}