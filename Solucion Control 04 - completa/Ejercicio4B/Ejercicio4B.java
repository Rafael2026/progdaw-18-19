public class Ejercicio4B {
  public static void main (String[] args) {
    RamoFlores ramo1 = new RamoFlores ("1","Ramo de rosas",112);
    RamoFlores ramo2 = new RamoFlores ("2","Ramo de azucenas",120,12,"Azucena");
    
    Perfume perfume1 = new Perfume ("3","Perfume1",130,"marino",1920);
    
    System.out.println(ramo1);
    System.out.println(ramo2);
    ramo2.fijarPrecio(1000);
    System.out.println(ramo2);
    System.out.println(perfume1);
    
  }
}
