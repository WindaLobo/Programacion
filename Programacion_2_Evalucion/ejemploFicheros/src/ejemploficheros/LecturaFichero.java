package ejemploficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LecturaFichero {

    Scanner scann;

    public void leerPalabra(File fichero) {
        try {
            scann = new Scanner(fichero);
            while (scann.hasNext()) {
                String dato = scann.next();
                System.out.println(dato);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("error 1" + ex.getMessage());
        } finally {
            scann.close();
        }

    }
    //Leerlo por liñas
    public void leerlinas(File ficheiro){
        try {
            scann = new Scanner(ficheiro);
            while(scann.hasNext()){
                String dato = scann.nextLine();
                System.out.println(dato);
            }
        }catch (FileNotFoundException ex) {
            System.out.println("erro 2 " + ex.getMessage());
        }
        finally{
            scann.close();
        }
    }
     //arrayList
    public ArrayList<Integer> lerNumero(File ficheiro){
        int num;
        //int aux;
        ArrayList<Integer>lista=new ArrayList<>();
        try{
            scann = new Scanner(ficheiro);
            while(scann.hasNext()){
                num=scann.nextInt();
                //aux = Integer.parseInt(num);
                lista.add(num);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("error leer numero"+ex.getMessage());
        }
        finally{
                scann.close();
        }
       
        for(Integer ele:lista){
            System.out.println(ele);
        }
       
        return lista;
    }
    
    

}
