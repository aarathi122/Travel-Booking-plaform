package com.DP;

public interface GameElementFactory {
    Enemy createEnemy();

    Weapon createWeapon();

    PowerUp createPowerUp();
}
