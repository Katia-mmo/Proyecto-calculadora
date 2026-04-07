
package vector;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author milanez.katia01
 */
public class Vector2 {
    
    Random aleatorio = new Random();
    

    
    public Vector2(){
        
    }
    
    public void rellenarVector(int[] A){
        for(int i=0; i<20;i++){
            A[i]= aleatorio.nextInt(21);
        }
    }
    
    public void calcular(int[] A, int[] B, int[] C){
        for(int i=0; i<20; i++){
            C[i]=A[i]+B[i];
        }
    }
    
    public void mostrarVectores(int[] A, int[] B, int[] C){
        System.out.println("\nVector A: "+Arrays.toString(A));
        System.out.println("Vector B: "+Arrays.toString(B));
        System.out.println("Vector C: "+Arrays.toString(C));
        
    }
}
