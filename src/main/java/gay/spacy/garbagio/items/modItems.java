package gay.spacy.garbagio.items;

import gay.spacy.garbagio.SpacyGarbage;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpacyGarbage.MODID);

    /*
    public static final RegistryObject<Item> GEM = modItems.ITEMS.register("coolgem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GEM = ITEMS.register("raw_coolgem",
            () -> new Item((new Item.Properties())));
    * */

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
