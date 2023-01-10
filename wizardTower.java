package com.supinfo;

public class wizardTower extends Towers {
    private String name = "Tour des mages";
    public int health = 100;
    public wizardTower(int HP, String name) {
        this.HP = HP;
        this.name = name;
    }

    public void attack(Dragon dragon){
        int dmg = 50;
        Dragon.HP = Dragon.HP-dmg;
        //System.out.println("The WizardTower");
        System.out.println("La tour des sorciers attaque et fait : "+dmg+" dégâts");
        System.out.println("Vie du dragon : "+Dragon.HP);
    }

    public void move(int positionX, int positionY){
        System.out.println("La tour des mages est en :" + positionX + ", " + positionY);
    }

    public void heal(String name){
        System.out.println("The WizardTower heals");
        if (name.equals("Tour des archers") ){
            this.health=80;
        }else{
            this.health=100;
        }

    }
}
