package ficherostext;


import java.io.File;

class TesteadorArchivosCarpetasArgs {

  public static void main(String[] args) {
    /*
    System.out.print("Introduzca el nombre del archivo que desea comprobar: ");
    String nombreFichero = System.console().readLine();
    */
    
    if (args.length >0) {
      File fichero = new File(args[0]);
      if (fichero.exists()) {
        //fichero.delete();
        System.out.println("El fichero o dir. existe.");
        if (fichero.isDirectory()) {
          System.out.println("Listado de acrhivos del directorio:");
          String[] listaArchivos = fichero.list();
          for(String nombreArchivo : listaArchivos) {
            System.out.println(nombreArchivo);
          }
        }
      } else {
        System.out.println("El fichero " + args[0] + " no existe.");
      }
    } else {
      System.out.println("Se esperaba el nombre de un fichero o directorio");
    }
  }
}
