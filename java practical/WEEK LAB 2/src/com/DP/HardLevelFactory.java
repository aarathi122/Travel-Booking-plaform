package com.DP;

public class HardLevelFactory implements GameElementFactory {
    @Override
    public Enemy createEnemy() {
        return new OrcEnemy();
    }

    @Override
    public Weapon createWeapon() {
        return new SwordWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new ShieldPowerUp();
    }
}
