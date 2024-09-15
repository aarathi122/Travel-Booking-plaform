package com.DP;

public class EasyLevelFactory implements GameElementFactory {
    @Override
    public Enemy createEnemy() {
        return new GoblinEnemy();
    }

    @Override
    public Weapon createWeapon() {
        return new DaggerWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPowerUp();
    }
}
