package com.supinfo;

public class Dragon {
    public static int HP;
    //private int HP = 1000;

    public Dragon(int HP) {
        this.HP = HP;
    }
    //3 méthodes d'attaques
    public void fireBall(String name){
        int dmg = 30;
        name.HP = name.HP-dmg;
        System.out.println("Le dragon attaque avec une BOULE DE FEU "+name+" et fait : "+dmg+" dégâts");
    }
    public  void fireBreath(String name){
        int dmg = 30;
        name.HP = name.HP-dmg;
        System.out.println("Le dragon attaque avec un SOUFFLE DE FEU "+name+" et fait : "+dmg+" dégâts");
    }

    public static void earthQuake(String name){
        int dmg = 30;
        name.HP = name.HP-dmg;
        System.out.println("Le dragon attaque avec un TREMBLEMENT DE TERRE "+name+" et fait : "+dmg+" dégâts");
    }

}
