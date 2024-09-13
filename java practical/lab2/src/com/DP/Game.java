package com.DP;

public class Game {
    private static Game instance;
    private GameElementFactory factory;

    // Private constructor prevents direct instantiation
    private Game() {
    }

    // Singleton instance retrieval
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    // Set the factory to change the game level difficulty
    public void setLevelFactory(GameElementFactory factory) {
        this.factory = factory;
    }

    // Play the game based on the factory setup
    public void play() {
        Enemy enemy = factory.createEnemy();
        Weapon weapon = factory.createWeapon();
        PowerUp powerup = factory.createPowerUp();
        enemy.attack();
        weapon.use();
        powerup.activate();
    }
}
