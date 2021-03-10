package com.unrulymob.steelandplastic.core.init;

import com.unrulymob.steelandplastic.SteelAndPlastic;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SteelAndPlastic.MOD_ID);
    //Blocks
    public static final RegistryObject<Block> BITUMEN_BLOCK = BLOCKS.register("bitumen_block",
            () -> new Block(AbstractBlock.Properties.create(Material.EARTH)
                    .hardnessAndResistance(3.0f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .sound(SoundType.SLIME)));
    public static final RegistryObject<Block> PLASTIC_BLOCK = BLOCKS.register("plastic_block",
            () -> new Block(AbstractBlock.Properties.create(Material.EARTH)
                    .hardnessAndResistance(4.0f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PLASTIC_BRICK = BLOCKS.register("plastic_brick",
            () -> new Block(AbstractBlock.Properties.create(Material.EARTH)
                    .hardnessAndResistance(4.0f, 6.0f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .sound(SoundType.WOOD)));
}
