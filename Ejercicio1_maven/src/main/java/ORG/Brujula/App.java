package ORG.Brujula;

/**
 * Hello world!
 *
 */
public class App
{
    public static String declareWinner(Fighter fighterRed, Fighter fighterBlue, String firstStrike){
        System.out.println("*******_______*************__________");
        System.out.println("FighterRed: "+fighterRed.getName());
        System.out.println("FighterBlue: "+fighterBlue.getName());
        int cont=0;

        if(fighterBlue.getHealth()>0 && fighterRed.getHealth()>0) {
            if (firstStrike == fighterRed.getName()){
                System.out.println("dentro if");
                lucha(fighterBlue, fighterRed, cont);
            }else{
                cont++;
                lucha(fighterBlue, fighterRed, cont);
            }
        }

        if(fighterBlue.getHealth()<=0){
            return fighterRed.getName();
        }else{
            return fighterBlue.getName();
        }

    }

    public static void lucha(Fighter fighterBlue, Fighter fighterRed,int turno ){
        Fighter [] value={fighterBlue,fighterRed};
        System.out.println("STATUS BLUE: "+fighterBlue.getHealth());
        System.out.println("STATUS RED: "+fighterRed.getHealth());
        while(fighterBlue.getHealth()>0 && fighterRed.getHealth()>0) {

            switch (turno) {
                case 0:
                    System.out.println("------------------");
                    System.out.println("FIGHT START: "+value[1].getName());
                    value[0].setHealth(value[0].getHealth() - value[1].getDamage());
                    System.out.print("**");
                    System.out.println(fighterBlue.getName());
                    System.out.println("FighterBlue health: "+fighterBlue.getHealth());
                    System.out.println("------------------");
                    turno++;
                    break;
                case 1:
                    System.out.println("------------------");
                    System.out.println("FIGHT START: "+value[0].getName());
                    value[1].setHealth(value[1].getHealth() - value[0].getDamage());
                    System.out.print("--");
                    System.out.println(fighterRed.getName());
                    System.out.println("FighterRed health: "+fighterRed.getHealth());
                    System.out.println("------------------");
                    turno--;
                    break;
            }
        }
    }

}
