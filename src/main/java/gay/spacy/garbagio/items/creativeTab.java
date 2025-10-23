package gay.spacy.garbagio.items;

import gay.spacy.garbagio.SpacyGarbage;
import gay.spacy.garbagio.blocks.modBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class creativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpacyGarbage.MODID);

    public static final RegistryObject<CreativeModeTab> GARB_TAB = CREATIVE_MODE_TABS.register("spacy_garbagio_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(modBlocks.BI_BRICKS.get()))
                    .title(Component.translatable("creativetab.spacy_garbagio"))
                    .displayItems((itemDisplayParameters, event) -> {
                        //Items

                        //Blocks
                        event.accept(modBlocks.BI_BRICKS.get());
                        event.accept(modBlocks.BI_BRICKS_STAIRS.get());
                        event.accept(modBlocks.BI_BRICKS_STAIRS_FLIPPED.get());
                        event.accept(modBlocks.BI_BRICKS_FLIPPED.get());
                        event.accept(modBlocks.BLUE_BRICKS.get());
                        event.accept(modBlocks.BLUE_BRICKS_STAIRS.get());
                        event.accept(modBlocks.PINK_BRICKS.get());
                        event.accept(modBlocks.PINK_BRICKS_STAIRS.get());
                        event.accept(modBlocks.MAGENTA_BRICKS.get());
                        event.accept(modBlocks.MAGENTA_BRICKS_STAIRS.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
