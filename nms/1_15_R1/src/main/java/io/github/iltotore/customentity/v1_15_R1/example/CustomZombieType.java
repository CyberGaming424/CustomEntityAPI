package io.github.iltotore.customentity.v1_15_R1.example;

import io.github.iltotore.customentity.type.NullableEntityType;
import io.github.iltotore.customentity.util.ServerVersion;
import org.bukkit.entity.Zombie;

public class CustomZombieType implements NullableEntityType<Zombie> {
    @Override
    public int getBaseID(ServerVersion version) {
        return 95;
    }

    @Override
    public Class<?> getNMSClass(ServerVersion version) {
        return CustomZombie.class;
    }
}
