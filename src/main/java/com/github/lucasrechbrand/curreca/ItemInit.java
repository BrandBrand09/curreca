package com.github.lucasrechbrand.curreca;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CurrecaMod.MODID);

    public static final RegistryObject<Item> BLANK_RUNE = ITEMS.register("blank_rune", () -> {
        return new Item(new Item.Properties().setId(ITEMS.key("blank_rune")));
    });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

