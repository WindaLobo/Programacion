/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroserializado;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author dam1
 */
public class MeuObjectOutpuStrem  extends ObjectOutputStream{
    public MeuObjectOutpuStrem ()throws IOException{
        super();
        
    }
    
     public MeuObjectOutpuStrem (OutputStream x)throws IOException{
         super(x);
         
     }

    @Override
   protected void writeStreamHeader()throws IOException{
       
   }
     
    
}
