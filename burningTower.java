package com.supinfo;

public class burningTower extends Towers {

    private  String name = "Tour enflammée";

    public burningTower(int HP, String name) {
        this.HP = HP;
        this.name = name;
    }
    public static void attack(Dragon dragon){
        int dmg = 50;
        Dragon.HP = Dragon.HP-dmg;
        //System.out.println("The Burning Tower attacks with FIRE");
        System.out.println("La tour enflamméd attaque avec du feu et fait : "+dmg+" dégâts");
        System.out.println("Vie du dragon : "+Dragon.HP);
    }
}
