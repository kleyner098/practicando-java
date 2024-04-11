import java.io.File;
public class EjemploFichero1 {
    public static void main(String[] args) {
        File fichero1=new File("README.md"); //en este caso existe un fichero README.md en mismo directorio
        if(fichero1.exists()){
            System.out.println("Nombre del archivo: " + fichero1.getName());
            System.out.println("Path: " + fichero1.getPath());
            System.out.println("Path absoluto "+fichero1.getAbsolutePath());
            System.out.println("Se puede escribir?: "+fichero1.canRead());
            System.out.println("Se puede leer?: "+fichero1.canWrite());
            System.out.println("Tamaño: "+fichero1.length() + "bytes");
        } 
        else System.out.println("Fichero " + fichero1.getName() + " no existe");
        
        File fichero2=new File("datos_empleados.sat"); //en este caso no existe el fichero
          
        if(fichero2.exists()){
            System.out.println("Nombre del archivo "+fichero2.getName());
            System.out.println("Camino "+fichero2.getPath());
            System.out.println("Camino absoluto "+fichero2.getAbsolutePath());
            System.out.println("Se puede escribir "+fichero2.canRead());
            System.out.println("Se puede leer "+fichero2.canWrite());
            System.out.println("Tamaño "+fichero2.length());
        } 
        else System.out.println("Fichero " + fichero2.getName() + " no existe");
    }
}
