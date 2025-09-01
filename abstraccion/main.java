
import java.util.Scanner;

interface Anima {
    void caminar();
    void dormir();
}

abstract class Animales {
    public String raza;
    public String edad;
    public String nombre;

    Animales(String raza, String edad, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }

    abstract void comer();
}

class Perro extends Animales implements Anima {
    Perro(String raza, String edad, String nombre) {
        super(raza, edad, nombre);
    }

    void comer() {
        System.out.println(nombre + " el perro come. Tiene " + edad + " años y es de raza " + raza + ".");
    }

    public void dormir(){
        System.out.println("Esta dormido");
    } 
    
    public void caminar(){
        System.out.println("Esta dormido");
    }
}

class Gato extends Animales {
    Gato(String raza, String edad, String nombre) {
        super(raza, edad, nombre);
    }

    void comer() {
        System.out.println(nombre + " el gato come. Tiene " + edad + " años y es de raza " + raza + ".");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese los datos del perro:");
        System.out.print("Raza: ");
        String razaPerro = scanner.nextLine();
        System.out.print("Edad: ");
        String edadPerro = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombrePerro = scanner.nextLine();

        Perro perro = new Perro(razaPerro, edadPerro, nombrePerro);

      
        System.out.println("\nIngrese los datos del gato:");
        System.out.print("Raza: ");
        String razaGato = scanner.nextLine();
        System.out.print("Edad: ");
        String edadGato = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreGato = scanner.nextLine();

        Gato gato = new Gato(razaGato, edadGato, nombreGato);

      
        System.out.println("Comportamiento de los animales:");
        perro.comer();
        gato.comer();
        perro.dormir();

        scanner.close();

    }
}