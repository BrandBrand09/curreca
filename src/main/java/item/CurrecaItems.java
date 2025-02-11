package item;

import com.github.lucasrechbrand.CurrecaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CurrecaItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CurrecaMod.MODID);

    public static final RegistryObject<Item> BLANKRUNE = ITEMS.register("blankrune", () -> {
        return new Item(new Item.Properties().setId(ITEMS.key("blankrune")));
    });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

