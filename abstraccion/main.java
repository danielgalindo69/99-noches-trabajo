
abstract class Animales {
    public String raza;
    public String edad;
    public String nombre;
    
    Animales(String raza, String edad, String nombre){
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }

    abstract void gemir();
}

class caballo extends Animales {
    caballo(String raza, String edad, String nombre){
        super(raza, edad, nombre);
    }

    void gemir(){
        System.out.println("el perro gime de la alegria");
    }
}

class Gato extends Animales {
    Gato(String raza, String edad, String nombre){
        super(raza, edad, nombre);
    }

    void gemir(){
        System.out.println("el gato gime de la alegria");
    }
}

public class main  {    
    public static void main(String[] args) {
        caballo jordi = new caballo("p", "70", "pepe");
        Gato p = new Gato("g", "40", "t");
        jordi.gemir();
        p.gemir();
    }
}