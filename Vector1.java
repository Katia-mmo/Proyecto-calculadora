
package vector;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author milanez.katia01
 */
public class Vector1 {
    Random aleatorio = new Random();
    int[] vector = new int[10];
    int[] temp = new int[10];
    int j=0;
    
    public Vector1(){
        
    }
    
    public void rellenarVector(){
        for(int i=0; i<vector.length;i++){
            vector[i]= aleatorio.nextInt(11);
        }
    }
    
    public void imprimirVector(){
        System.out.println("Vector: "+Arrays.toString(vector));

    }
    
    public void imprimirReves(){
        for(int i=vector.length-1; i>=0;i--){
            
            
            temp[j]=vector[i];
            j++;
        }
        System.out.println("Vector al reves: "+Arrays.toString(temp));
    }
    
    
}
