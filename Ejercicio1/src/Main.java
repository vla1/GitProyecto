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
                    //rojo recibe dañ3o
                    fighterRed.setHealth(fighterRed.getHealth()-fighterBlue.getDamage());
                }
                //mostrar estados de azul y verde
                System.out.println("Estado vida Azul: "+fighterBlue.getHealth());
                System.out.println("Estado vida Rojo: "+fighterRed.getHealth());

            }
        }catch(Exception e){
            System.out.println("Error: "+e.toString());
        }
    }
    public static boolean statusHealthFighter (int vida){
        System.out.println("vidaFuncion "+vida);
        //si tiene vida
        if(vida>0) {

            return true;
        }
        //
        return false;
    }
    public static void statusShow (){

    }



}
