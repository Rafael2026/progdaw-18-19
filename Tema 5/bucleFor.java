
public class bucleFor {
  public static void main (String[] args) {
    int laVoluntad;
    
    
    System.out.print ("Dime cuántos números quieres que escriba: ");
    
    String s = System.console().readLine();
    laVoluntad = Integer.parseInt(s);
    
    for (int i=1; i <= laVoluntad; i+=2) {
        System.out.println(i);      
    }
    
  }
}
