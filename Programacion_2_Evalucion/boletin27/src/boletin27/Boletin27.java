
package boletin27;




public class Boletin27 {

    public static void main(String[] args) throws  Exception {
       Mantenimeinto.cargarTodos();
        System.out.println(Mantenimeinto.libros);
        Libro  libro1= new Libro("Maria","Sol",10.5f,10);
        Mantenimeinto.añadirLibro(libro1);
     Mantenimeinto.consutarFichero(libro1);
        
        
       
    }
    
}

