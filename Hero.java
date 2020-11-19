import java.util.Random;
import java.util.Scanner;

public class Hero {
    private String name;
    private int HP;
    private int maxHP;
    private int level;
    private int XP;
    private int maxXP;
    private int damage;
    private int daJuice;
    private int Mana;
    private int maxMana;
    private int coins;
    private int critical;
    // Hero Stats
    public Hero(){
        name = "Knight";
        HP = 100;
        maxHP = 100;
        level = 1;
        XP = 0;
        maxXP = 50;
        damage = 20;
        coins = 0;
        critical = 5;
        Mana = 0;
        maxMana = 10;
        daJuice = 3;
    }


    public void setName(String nameInput){
        name = nameInput;
    }
    public String getName(){
        return name;
    }
    public int getHP(){
        return HP;
    }
    public int getmaxHP(){
        return maxHP;
    }
    public int getlevel(){
        return level;
    }
    public int getXP(){
        return XP;
    }
    public int getmaxXP(){
        return maxXP;
    }
    public int getdamage(){
        return damage;
    }
    public int getcoins(){
        return coins;
    }
    public int getcritical(){
        return critical;
    }
    public int getMana(){
        return Mana;
    }
    public int getmaxMana(){
        return maxMana;
    }
    public int getdaJuice(){
        return daJuice;
    }
    public int attack(int otherHealth){
        
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String z = s.nextLine();
        Hero man = new Hero();
        System.out.println(man.getName());
        System.out.println(man.getHP());
    }




}