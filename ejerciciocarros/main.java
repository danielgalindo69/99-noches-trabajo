package ejerciciocarros;
import java.util.Scanner;

interface Vehiculo {
    void arrancar();
    void detener();
}

abstract class Transporte implements Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    Transporte(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

     abstract void tipoCombustible();

    public void mostrarInformacion() {
        System.out.println("marca " + getMarca());
        System.out.println("modelo " + getModelo());
        System.out.println("velocidad  " + getVelocidadMaxima());
    }

}




class Carro extends Transporte {
    Carro(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }
    public void arrancar() {
        System.out.println("el carro arranco");
    }
    public void detener() {
        System.out.println("el carro esta quiet");
    }
    void tipoCombustible() {
        System.out.println("gasolina");
    }
}

class Moto extends Transporte {
    Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }
    public void arrancar() {
        System.out.println("la moto arranco");
    }
    public void detener() {
        System.out.println("la moto esta quieta");
    }
    void tipoCombustible() {
        System.out.println("gasolina");
    }
}

class Bicicleta extends Transporte {
    Bicicleta(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }
    public void arrancar() {
        System.out.println("la bicicleta arranco");
    }
    public void detener() {
        System.out.println("la bicicleta esta quieta");
    }
    void tipoCombustible() {
        System.out.println("no usa gasolina");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tipo de vehiculo va a registrar (carro/moto/bicicleta)");
        String tipo = scanner.nextLine().toLowerCase();
        System.out.print("ingrese la marca");
        String marca = scanner.nextLine();
        System.out.print("ingrese el modelo");
        String modelo = scanner.nextLine();
        System.out.print("ingrese la velocidad");
        int velocidadMaxima = scanner.nextInt();
        Transporte vehiculo;

        switch (tipo) {
        case ("carro"):
             vehiculo = new Carro(marca, modelo, velocidadMaxima);
             break;

        case ("moto"):
             vehiculo = new Moto(marca, modelo, velocidadMaxima);
             break;

         case ("bicicleta"):
            vehiculo = new Bicicleta(marca, modelo, velocidadMaxima);
            break;

         default:    
         
            System.out.println("Tipo de vehiculo no valido");
            scanner.close();
            return;
         
        }

        vehiculo.arrancar();
        vehiculo.detener();
        vehiculo.tipoCombustible();
        vehiculo.mostrarInformacion();

        scanner.close();

    }
}
