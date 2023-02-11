package coda.whimsey.registry;

import coda.whimsey.LetsGoDiving;
import coda.whimsey.common.entities.Phoenix;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LGDEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, LetsGoDiving.MOD_ID);

    public static final RegistryObject<EntityType<Phoenix>> PHOENIX = ENTITIES.register("phoenix", () -> EntityType.Builder.of(Phoenix::new, MobCategory.CREATURE).sized(1.0F, 1.0F).setTrackingRange(16).updateInterval(1).build("phoenix"));
}
