import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String [] args)throws Exception{
        //creando a los Fighters
        int contador=1;
        Fighter fighterRed = new Fighter();
        Fighter fighterBlue = new Fighter();


        try{

            asignStatus(fighterBlue);
            asignStatus(fighterRed);

            System.out.println("**¡¡FIGHT!!**");
            //mientras los dos tengan vida, el combate sigue
            while((statusHealthFighter(fighterRed.getHealth())) && (statusHealthFighter(fighterBlue.getHealth()))){

                //azul recibe daño del rojo
                fighterBlue.setHealth(fighterBlue.getHealth()-fighterRed.getDamage());
                System.out.print("*** ");
                turno(fighterBlue.getName(),fighterBlue.getDamage());

                //ver si el azul tiene vida
                if(statusHealthFighter(fighterBlue.getHealth())){

                    //rojo recibe daño de azul
                    fighterRed.setHealth(fighterRed.getHealth()-fighterBlue.getDamage());
                    System.out.print("*** ");
                    turno(fighterRed.getName(),fighterRed.getDamage());
                }

                //mostrar estados de azul y rojo
                statusShow(fighterBlue.getName(),fighterBlue.getHealth(),fighterRed.getName(),fighterRed.getHealth());
                System.out.println("-------------"+"RONDA: "+contador+"--------------");
                contador++;
            }

            //mostrar resultado de batalla
            resultBattle(fighterBlue,fighterRed);

        }catch(Exception e){
            System.out.println("Error: "+e.toString());
        }
    }
    //crea el personaje y lo guarda en objeto Fighter
    public static void asignStatus(Fighter fighter) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("**********CREACION DEL PERSONAJE*************");
            System.out.println("Nombre del luchador: ");
            fighter.setName(br.readLine());
            System.out.println("Vida: ");
            fighter.setHealth(Integer.parseInt(br.readLine()));
            System.out.println("Daño por ataque");
            fighter.setDamage(Integer.parseInt(br.readLine()));
        }catch(Exception e){
            System.out.println("ERROR CREACION PERSONAJE"+ e.toString());
        }
    }
    //muestra las acciones de cada luchador
    public static void turno(String name, int damage){
        System.out.println("Atacante: "+name+"\n    Daño infligido:"+damage);
    }
    //muestra estado despues de cada lucha
    public static void statusShow (String nameBlue, int statusBlue,String nameRed, int statusRed){
        System.out.println(nameBlue+"\nVida Restante: "+statusBlue);
        System.out.println(nameRed+"\nVida Restante: "+statusRed);
    }
    //resultado del combate, muestra el ganador final
    public static void resultBattle(Fighter fighterBlue, Fighter fighterRed){
        if(fighterBlue.getHealth()>0){
            System.out.println("***************");
            System.out.println("EL GANADOR ES: "+fighterBlue.getName()+"\nDAÑO POR ATAQUE: "+fighterBlue.getDamage()+"\nVIDA RESTANTE: "+fighterBlue.getHealth());
            System.out.println("***************");
        }else{
            System.out.println("***************");
            System.out.println("EL GANADOR ES: "+fighterRed.getName()+"\nDAÑO POR ATAQUE: "+fighterRed.getDamage()+"\nVIDA RESTANTE: "+fighterRed.getHealth());
            System.out.println("***************");
        }
    }
    //comprueba estado de vida del luchador
    public static boolean statusHealthFighter (int vida){
        //si tiene vida
        if(vida>0) {
            return true;
        }
        // si la vida es <=0
        return false;
    }

}
