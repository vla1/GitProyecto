package ORG.Brujula;

public class Fighter {
    private String name;
    private int health, damage;

    //instanciar valores del estado del fighter
    public Fighter (){
        this.name="unknown";
        this.health=1;
        this.damage=1;
    }
    //definir estado del fighter
    public Fighter(String name, int health, int damage){
        this.name=name;
        this.health=health;
        this.damage=damage;
    }
    //obtener estado
    public String getName(){return name;}
    public int getHealth(){return health;}
    public int getDamage(){return damage;}

    //guardar estado
    public void setName(String name){this.name = name;}
    public void setHealth(int health){this.health = health;}
    public void setDamage(int damage){this.damage = damage;}

}
