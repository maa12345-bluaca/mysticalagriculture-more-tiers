package net.maa12345.mystimoretiers;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MystiMoreTiers.MOD_ID);

 //   public static final RegistryObject<Item> =

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
