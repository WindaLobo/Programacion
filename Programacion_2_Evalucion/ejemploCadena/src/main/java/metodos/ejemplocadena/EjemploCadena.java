/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package metodos.ejemplocadena;

/**
 *
 * @author dam1
 */
public class EjemploCadena {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();

        System.out.println("La longitud del texto es : " + metodo.contarNumeroLetras());

        System.out.println("Nabuconodosor a mayuscula : " + metodo.pasarAMayuscula());
         System.out.println("Nabuconodosor a minuscula : " + metodo.pasarAMinuscula());
         System.out.println("Nabuconodosor es " + " ="  +  metodo.Comparar());
         System.out.println(metodo.pasarNombreAUnArrays());
         System.out.println(metodo.contar());
    }
}
