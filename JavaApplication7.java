/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.*;
/**
 *
 * @author Batch1
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int[][] arr1=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int[][] arr2=new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        
        if(n1!=m2){
            System.out.println("matrix multiplication not possible.");
            return;
        }
        
        int[][] arr3=new int[m1][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n1;k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
