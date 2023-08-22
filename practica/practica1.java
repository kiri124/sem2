package practica;

public class practica1 {
    // private 
    

    public static void main(String[] args) 
    {
      int edad;
      String nombre;
      double peso;
       String chiquito;
       chiquito="pequeño";
       System.out.println(chiquito);

       String brand = "";
       prac aCar = new prac();
       //con prac estamos llamando al otro codigo ,
       //new palabra reserva para llamar al otro codigo 
       brand = aCar.getBrand();
       System.out.println(brand);



       persona carla1 = new persona();
persona carla2 = new persona(21);
persona carla3 = new persona("carla33");
persona carla4 = new persona(65,"carla24");

System.out.println(carla1.getAge() + " " + carla1.getName());
System.out.println(carla2.getAge() + " " + carla2.getName());
System.out.println(carla3.getAge() + " " + carla3.getName());
System.out.println(carla4.getAge() + " " + carla4.getName());
    }
// debe estar todo dentro de la misma carpeteeeeeeeeee
 
}
