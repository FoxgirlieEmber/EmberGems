package net.ember.embergems.item.custom;

import net.ember.embergems.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.data.SoundDefinition;
import org.joml.Vector3d;

public class GeodeItem extends Item {
    public GeodeItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide) {
        ItemStack heldStack = player.getItemInHand(hand);
        int Number = getRandomNumber();
        ItemStack stackToDrop = null;
        if(Number >= 6) {
            stackToDrop = new ItemStack(Items.DIAMOND);
        } else if (Number >= 5) {
            stackToDrop = new ItemStack(ModItems.OPAL.get());
        } else if (Number >= 4) {
            stackToDrop = new ItemStack(ModItems.PEARL.get());
        } else if (Number >= 3) {
            stackToDrop = new ItemStack(ModItems.SAPPHIRE.get());
        } else if (Number >= 2) {
            stackToDrop = new ItemStack(ModItems.JADE.get());
        } else {
            stackToDrop = new ItemStack(ModItems.RUBY.get());
        }

        if (stackToDrop != null)
            player.drop(stackToDrop, false, false);
        heldStack.shrink(1);
        soundEffect(level, player.position());
        player.getCooldowns().addCooldown(this, 5);
        }
        return super.use(level, player, hand);
    }

    private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(7);
    }

    public static void soundEffect(Level level, Vec3 position) {
        level.playSound(
                null,
                position.x,
                position.y,
                position.z,
                SoundEvents.STONE_BREAK,
                SoundSource.PLAYERS,
                1f, 1f
        );
    }

};

