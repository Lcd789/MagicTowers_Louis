package com.supinfo;

public class movingTower extends Towers {
    String name = "Tour amovible";
    public movingTower(int HP, String name) {
        this.HP = HP;
        this.name = name;
    }

    public static void attack(Dragon dragon){
        int dmg = 50;
        Dragon.HP = Dragon.HP-dmg;
        System.out.println("La tour amovible attaque avec un backflip et fait : "+dmg+ "dégâts");
        System.out.println("Vie du dragon : "+Dragon.HP);
    }


    public void move(int positionX, int positionY){
        this.positionX=positionX;
        this.positionY=positionY;
        System.out.println("La tour amovible est en :" + this.positionX + ", " + this.positionY);
    }
}
