package ficherostext;


import java.io.File;

class TesteadorArchivosCarpetas {

  public static void main(String[] args) {
    System.out.print("Introduzca el nombre del archivo que desea comprobar: ");
    String nombreFichero = System.console().readLine();
    File fichero = new File(nombreFichero);
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
      System.out.println("El fichero " + nombreFichero + " no existe.");
    }
  }
}
