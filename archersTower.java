package com.supinfo;

public class archersTower extends Towers {
    private String name = "Tour des archers";
    public int HP = 80;

    public archersTower(int HP, String name) {
        this.HP = HP;
        this.name = name;
    }
    public void attack(Dragon dragon){
        int dmg = 50;
        Dragon.HP = Dragon.HP-dmg;
        //System.out.println("The Archers' Tower attacks with arrows and deals");
        System.out.println("La tour d'archer tire des flèches sur le dragon et fait : "+dmg+" dégats");
        System.out.println("Vie du dragon : "+Dragon.HP);

    }
}
