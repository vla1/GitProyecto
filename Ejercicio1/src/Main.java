public class Main {
    public static void main (String [] args)throws Exception{
        //creando a los Fighters
        Fighter fighterRed = new Fighter("Red",10,2);
        Fighter fighterBlue = new Fighter("Blue",10,3);

        try{

            while((statusHealthFighter(fighterRed.getHealth())) && (statusHealthFighter(fighterBlue.getHealth()))){
                //azul recibe daño del rojo
                fighterBlue.setHealth(fighterBlue.getHealth()-fighterRed.getDamage());
                //ver si el azul tiene vida
                if(statusHealthFighter(fighterBlue.getHealth())){
                    //rojo recibe daño
                    fighterRed.setHealth(fighterRed.getHealth()-fighterBlue.getDamage());
                }
                //mostrar estados de azul y verde
                statusShow(fighterBlue.getHealth(),fighterRed.getHealth());
            }
            resultBattle(fighterBlue,fighterRed);

        }catch(Exception e){
            System.out.println("Error: "+e.toString());
        }
    }

    public static boolean statusHealthFighter (int vida){
        //si tiene vida
        if(vida>0) {
            return true;
        }
        // si la vida es <=0
        return false;
    }

    public static void statusShow (int statusBlue, int statusRed){
        System.out.println("Estado del luchador Azul: "+statusBlue);
        System.out.println("Estado del luchador Rojo: "+statusRed);
        System.out.println("-----------------------");
    }

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
}
