package com.supinfo;

public class MagicTowers {
    public static void main(String[] args) {
        System.out.println("Dans un monde fantastique les tours magiques protègent le royaume du dragon infernal");

        Dragon dragon = new Dragon(1000);
        archersTower archersTower = new archersTower(80,"a");
        wizardTower wizardTower = new wizardTower(100,"w");
        burningTower burningTower = new burningTower(100,"b");
        movingTower movingTower = new movingTower(100,"m");

        for (int nbTurn=1;Dragon.HP<= 0;nbTurn++){
            //Tower's Turn
            archersTower.attack(dragon);
            wizardTower.attack(dragon);
            com.supinfo.burningTower.attack(dragon);
            com.supinfo.movingTower.attack(dragon);
            //Dragon's Turn
            Dragon.earthQuake("a");
        }
    }
}
