/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicConnectivity;

/**
 *
 * @author ShawShank
 */
public class QuickFind {
    int []array;
    QuickFind(){
        array=new int[10]; 
    
        for(int i=0;i<10;i++)
            array[i]=i;
    }
    
    boolean connected(int p, int q){
      return (array[p]==array[q]);  
    }
    
    void union(int p,int q){
    
        int pID=array[p];
        int qID=array[q];
        
        for(int i=0;i<10;i++){
            if(array[i]==pID)
                array[i]=qID;
            
        }
    }
    
    public static void main(String args[]){
        
        QuickFind qF=new QuickFind();
        qF.union(2, 3);
        qF.union(4, 5);
        qF.union(8, 9);
        qF.union(0, 5);
        qF.union(4, 8);
        System.out.println("2, 3 "+qF.connected(2, 3));
        System.out.println("7, 8 "+qF.connected(7, 8));
        System.out.println("0, 9 "+qF.connected(0, 9));
    }
    
}
