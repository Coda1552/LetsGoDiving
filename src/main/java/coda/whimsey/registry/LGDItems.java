package coda.whimsey.registry;

import coda.whimsey.LetsGoDiving;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LGDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LetsGoDiving.MOD_ID);

    public static final RegistryObject<Item> PHOENIX_ASHES = ITEMS.register("phoenix_ashes", () -> new Item(new Item.Properties().tab(LetsGoDiving.GROUP)));

    public static final RegistryObject<Item> PHOENIX_SPAWN_EGG = ITEMS.register("phoenix_spawn_egg", () -> new ForgeSpawnEggItem(LGDEntities.PHOENIX, 0xf07a08, 0x9e472e, new Item.Properties().tab(LetsGoDiving.GROUP)));
}
