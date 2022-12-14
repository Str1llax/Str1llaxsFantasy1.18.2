package com.str1llax.sf.item;

import com.str1llax.sf.register.SFItems;
import com.str1llax.sf.register.SFTags;
import com.str1llax.sf.util.SFInventoryUtil;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AdvancedItem extends Item
{
    public AdvancedItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
        if (!world.isClientSide())
        {
            System.out.println(player.getName().getString() + " has used item with hand " + hand.name());
        }

        return super.use(world, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @javax.annotation.Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.sf.advanced_item.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.sf.advanced_item.tooltip"));
        }
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 72000;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                Block blockBelow = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    outputValuableCoordinates(positionClicked.below(i), player, blockBelow);
                    foundBlock = true;
                    if(SFInventoryUtil.hasPlayerStackInInventory(player, SFItems.DATA_TABLET.get())) {
                        addNbtToDataTablet(player, positionClicked.below(i), blockBelow);
                    }
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableComponent("item.sf.advanced_item.no_valuables"),
                        player.getUUID());
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }

    private void addNbtToDataTablet(Player player, BlockPos pos, Block blockBelow) {
        ItemStack dataTablet =
                player.getInventory().getItem(SFInventoryUtil.getFirstInventoryIndex(player, SFItems.DATA_TABLET.get()));

        CompoundTag nbtData = new CompoundTag();
        nbtData.putString("sf.last_ore", "Found " + blockBelow.asItem().getRegistryName().toString() + " at (" +
                pos.getX() + ", "+ pos.getY() + ", "+ pos.getZ() + ")");

        dataTablet.setTag(nbtData);
    }

    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block blockBelow) {
        player.sendMessage(new TextComponent(
                "Found " + blockBelow.asItem().getRegistryName().toString() + " at "
                        + "(X:" + blockPos.getX() + ", Y:" + blockPos.getY() + ", Z:" + blockPos.getZ() + ")"), player.getUUID());
    }

    private boolean isValuableBlock(Block block) {
        return Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(block).get()).is(SFTags.Blocks.ORES);
    }
}
