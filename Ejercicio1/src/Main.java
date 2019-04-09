public class Main {
    public static void main (String [] args)throws Exception{
        //creando a los Fighters
        Fighter fighterRed = new Fighter("Red",4,2);
        Fighter fighterBlue = new Fighter("Blue",1,3);

        //
        try{
            while(fighterRed.getHealth()>0 && fighterBlue.getHealth()>0){

                fighterBlue.setHealth(fighterBlue.getHealth()-fighterRed.getDamage());
                if(fighterBlue.getHealth()>0){
                    System.out.println("ENTRA EN IF");
                fighterRed.setHealth(fighterRed.getHealth()-fighterBlue.getDamage());
                }

                System.out.println("Estado vida Azul: "+fighterBlue.getHealth());
                System.out.println("Estado vida Rojo: "+fighterRed.getHealth());

            }
        }catch(Exception e){
            System.out.println("Error: "+e.toString());
        }
    }
    

}
