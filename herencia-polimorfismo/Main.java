class persona{

   private String nombre;
   private int edad;
   private float puntosvida;
   private String raza;
   private String secreto;


   public persona(String nombre, int edad, float puntosvida, String secreto, String raza){
       this.nombre=nombre;
       this.edad=edad;
       this.puntosvida=puntosvida;
         this.secreto=secreto;
         this.raza=raza;
   }

    public String getNombre(){
         return nombre;
    }
    public int getEdad(){
         return edad;
    }
    public float getPuntosvida(){
         return puntosvida;
    }
    public String getSecreto(){
         return raza;
    }
}
 
    class cazador extends persona{
        private String arma;
        public cazador(String nombre, int edad, float puntosvida, String secreto, String raza, String arma){
            super(nombre, edad, puntosvida, secreto, raza);
            this.arma=arma;
        }
        public String atacar(){
            return "Atacando con: "+arma;
        }

        public float restarVida(float puntosvida, float daño){
            return (float) (puntosvida - daño);
        }

        public String getArma(){
            return arma;
        }
    }

   class alien extends persona{
        public alien(String nombre, int edad, float puntosvida, String secreto, String raza){
            super(nombre, edad, puntosvida, secreto, raza);
        
    }

    public String recuperarvida(float puntosvida){
        if (puntosvida<0){
            return "No se puede recuperar vida";
        }else{
            return "Vida recuperada" + (puntosvida += 50);
        }
    }
    }

    class cultista extends persona{
        private int laanza;
        private String ritosatanico;
        public cultista(String nombre, int edad, float puntosvida, String secreto, String raza,String ritosatanico, int laanza){
            super(nombre, edad, puntosvida, secreto, raza);
            this.ritosatanico= ritosatanico;
            this.laanza= laanza;
        }

        public String invocar(){
            return "Invocando con: "+ritosatanico;
        }

        public float usarLanza(persona enemigo) {
        float vidaRestante = enemigo.getPuntosvida() - laanza;
        return vidaRestante;
    }

    }

  public class Main {
    public static void main(String[] args) {
        persona p3 = new cultista("Michael", 40, 120.0f, "invoca demonios", "Cultista", "espada", 30);
        persona p4 = new alien("Giraldo", 30, 110.0f, "experta en armas", "Alien");
        persona p2 = new cazador("Xen", 35, 130.0f, "controla mentes", "Cazador", "rifle");

        System.out.println(((cazador)p2).atacar());
        System.out.println(((alien)p4).recuperarvida(50));
        System.out.println(((cultista)p3).invocar());

        float vidaRestante = ((cultista)p3).usarLanza(p4);
        System.out.println("Vida de alien después del ataque: " + vidaRestante);
    }
}

    
   

 
    




