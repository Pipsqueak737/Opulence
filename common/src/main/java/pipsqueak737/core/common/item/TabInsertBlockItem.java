package pipsqueak737.core.common.item;

import gg.moonflower.pollen.api.item.TabFiller;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.function.Predicate;

public class TabInsertBlockItem extends BlockItem {

    private final Predicate<ItemStack> filter;
    private final boolean insertBefore;

    public TabInsertBlockItem(Block block, Item insertAfter, Properties properties) {
        this(block, stack -> stack.getItem() == insertAfter, false, properties);
    }

    public TabInsertBlockItem(Block block, Class<Item> insertAfterClass, Properties properties) {
        this(block, stack -> insertAfterClass.isInstance(stack.getItem()), false, properties);
    }

    public TabInsertBlockItem(Block block, Predicate<ItemStack> filter, Properties properties) {
        this(block, filter, false, properties);
    }

    public TabInsertBlockItem(Block block, Predicate<ItemStack> filter, boolean insertBefore, Properties properties) {
        super(block, properties);
        this.filter = filter;
        this.insertBefore = insertBefore;
    }

    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        if (this.allowdedIn(category))
            TabFiller.insert(new ItemStack(this), this.insertBefore, items, this.filter);
    }
}