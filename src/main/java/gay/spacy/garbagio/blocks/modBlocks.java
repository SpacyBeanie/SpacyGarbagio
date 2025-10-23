package gay.spacy.garbagio.blocks;

import gay.spacy.garbagio.SpacyGarbage;
import gay.spacy.garbagio.items.modItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modBlocks {
    public static  final DeferredRegister<Block> BLOCKS=
            DeferredRegister.create(ForgeRegistries.BLOCKS, SpacyGarbage.MODID);

    public static final RegistryObject<Block> BI_BRICKS = registerBlock("bi_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(2.5f,6f).requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> BI_BRICKS_STAIRS = registerBlock("bi_bricks_stairs",
            () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).strength(2.5f,6)));
    public static final RegistryObject<Block> BLUE_BRICKS_STAIRS = registerBlock("blue_bricks_stairs",
            () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).strength(2.5f,6)));
    public static final RegistryObject<Block> MAGENTA_BRICKS_STAIRS = registerBlock("magenta_bricks_stairs",
            () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).strength(2.5f,6)));
    public static final RegistryObject<Block> PINK_BRICKS_STAIRS = registerBlock("pink_bricks_stairs",
            () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).strength(2.5f,6)));
    public static final RegistryObject<Block> BI_BRICKS_STAIRS_FLIPPED = registerBlock("bi_bricks_stairs_flipped",
            () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).strength(2.5f,6)));
    public static final RegistryObject<Block> BI_BRICKS_FLIPPED = registerBlock("bi_bricks_flipped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(2.5f,6)));
    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(2.5f,6)));
    public static final RegistryObject<Block> PINK_BRICKS = registerBlock("pink_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(2.5f,6)));
    public static final RegistryObject<Block> MAGENTA_BRICKS = registerBlock("magenta_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(2.5f,6)));


    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return modItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus event){
        BLOCKS.register(event);
    }
}
