package ORG.Brujula;

public class Fighter {
    private String Name;
    private int Health, Damage;

    //instanciar valores del estado del fighter
    public Fighter (){
        Name="unknown";
        Health=1;
        Damage=1;
    }
    //definir estado del fighter
    public Fighter(String name, int health, int damage){
        Name=name;
        Health=health;
        Damage=damage;
    }
    //obtener estado
    public String getName(){return Name;}
    public int getHealth(){return Health;}
    public int getDamage(){return Damage;}

    //guardar estado
    public void setName(String name){Name = name;}
    public void setHealth(int health){Health = health;}
    public void setDamage(int damage){Damage = damage;}

    //mostrar estado
    @Override
    public String toString() {
        return "Fighter{" +
                "Name='" + Name + '\'' +
                ", Health=" + Health +
                ", Damage=" + Damage +
                '}';
    }

}
