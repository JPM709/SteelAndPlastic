package com.unrulymob.steelandplastic.core.init;

import com.unrulymob.steelandplastic.SteelAndPlastic;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SteelAndPlastic.MOD_ID);
   //public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.ITEMS, SteelAndPlastic.MOD_ID);

   //Items
   public static final RegistryObject<Item> BITUMEN_ORE = ITEMS.register("bitumen_ore", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   //BlockItems
   public static final RegistryObject<BlockItem> BITUMEN_BLOCK = ITEMS.register("bitumen_block",
           () -> new BlockItem(BlockInit.BITUMEN_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
   public static final RegistryObject<BlockItem> PLASTIC_BLOCK = ITEMS.register("plastic_block",
           () -> new BlockItem(BlockInit.PLASTIC_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
   public static final RegistryObject<BlockItem> PLASTIC_BRICK = ITEMS.register("plastic_brick",
           () -> new BlockItem(BlockInit.PLASTIC_BRICK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
