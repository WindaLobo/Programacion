package ficheroserializado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeerEscribirSerializado {

    ObjectInputStream ler = null;
    ObjectOutputStream escr = null;

    public void escribiArchivo(File archivo) throws IOException {
        try {
            escr = new ObjectOutputStream(new FileOutputStream(archivo));
            AlumnadoSerializado a11 = new AlumnadoSerializado("a", 5);
            AlumnadoSerializado a12 = new AlumnadoSerializado("a", 6);
            AlumnadoSerializado a13 = new AlumnadoSerializado("a", 7);
            escr.writeObject(a11);
            escr.writeObject(a12);

            escr.writeObject(a13);

        } catch (FileNotFoundException ex) {
            System.out.println("Error al escribir al fichero" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error lectura"+ex.getMessage());
        } finally {
            try {
                escr.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }
        }

    }

    public void leerArchivo(File archivo) throws IOException, ClassNotFoundException {
        AlumnadoSerializado al = null;

        try {
            ler = new ObjectInputStream(new FileInputStream(archivo));
            al = (AlumnadoSerializado) ler.readObject();
            while (al != null) {
                

                System.out.println(al);
                al = (AlumnadoSerializado) ler.readObject();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error lectura1 " + ex.getMessage());

        } catch (FileNotFoundException ex) {
            System.out.println("Error lectura2" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error lectura3"+ex.getMessage());

        } finally {
            try {
                ler.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }
        }
    }
      public void añadirAlumno(File archivo) throws IOException {
          MeuObjectOutpuStrem x = null;
          
        try {
            x = new MeuObjectOutpuStrem (new FileOutputStream(archivo,true));
            AlumnadoSerializado a11 = new AlumnadoSerializado("windar", 5);
            AlumnadoSerializado a12 = new AlumnadoSerializado("Adrian", 6);
            
            x.writeObject(a11);
            x.writeObject(a12);

            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al escribir al fichero" + ex.getMessage());

        } catch (IOException ex) {
            System.out.println("Error lectura"+ex.getMessage());
        } finally {
            try {
                x.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero " + ex.getMessage());

            }
        }

        
    }
}
