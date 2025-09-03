import java.util.Scanner;
interface Presentar {
   void presentar();
   void ncreatividad();
    
}

abstract class inventor implements Presentar{

    protected String nombre;
    protected String apellido;
    protected int edad;

    inventor( String nombre, String apellido, int edad){
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
    }

   
    
}

class desarrollador extends inventor {
    desarrollador(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    
      public void presentar() {
      System.out.println("buenas mañanas me llamo"+nombre+"mi apellido es"+apellido+"y tengo de años"+edad+"tengo");
       
    }

    public void ncreatividad(){
        System.out.print("mis puntos de hablilidad son");
        System.out.println(50);
    }



}


 class Quimico extends inventor {
    Quimico(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }



    public void presentar(){
      System.out.println("hola mi nombre es "+ nombre+"y soy quimico");
    }

    public void ncreatividad(){
        System.out.println(100);
    }

    
}



 class Constructor extends inventor {
     Constructor(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public void presentar(){
      System.out.println("hola mi nombre es "+ nombre+"y soy constructor");
    }

    public void ncreatividad(){
        System.out.println(10000);
    }

    
}

public class main {
    public static void main(String[] args) {
        inventor[] inventores = new inventor[9];

        for (inventor i : inventores) {
            i.presentar();
            i.ncreatividad();
        }

        Scanner scanner = new Scanner(System.in);
          System.out.println("Que tipo de invenetor va a registrar a registrar o la info (desarrollador/quimico/constructor/verinfo)");
        String opcion = scanner.nextLine();
        System.out.println("escriba el nombre");
        String nombre = scanner.nextLine();
        System.out.println("escriba el apellido");
        String apellido = scanner.nextLine();
        System.out.println("escriba la edad");
        int edad = scanner.nextInt();

        switch (opcion) {
            case ("desarrollador"):
                desarrollador desarrollador = new desarrollador(nombre, apellido, edad);
                desarrollador.presentar();
                desarrollador.ncreatividad();
                
                break;


            case ("quimico"):
                Quimico quimico = new Quimico(nombre, apellido, edad);
                quimico.presentar();
                quimico.ncreatividad();
                break;
            

            case ("constructor"):
                Constructor constructor = new Constructor(nombre, apellido, edad);
                constructor.presentar();
                constructor.ncreatividad();
                break;


            case ("verinfo"):{

                System.out.println(inventores);

            }

            default:

            System.out.println("opcion no valida");
            scanner.close();
                break;
        }


       

            
        
       }
    }
    
    

