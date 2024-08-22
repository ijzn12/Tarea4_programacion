/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author zelay
 */
public class Tarea_4_ZelayaIsmael {
    public static void main(String[] args){
    Random rd=new Random();
    Scanner sc=new Scanner(System.in);
    int dimension,sumaderecha = 0,sumaizquierda = 0;
        System.out.println("Ingresar el numero de las dimensiones de la matriz ");
        dimension=sc.nextInt();
    int matriz[][]=new int[dimension][dimension];
   
    
    
    
        for (int fila = 0; fila < dimension ; fila++) {
            for (int columna = 0; columna < dimension; columna++) {
             matriz[fila][columna]=rd.nextInt(90)+10;
            } 
        }
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]+" ");       
            }
            System.out.println("");
        }
            for (int fila1 = 0; fila1 < dimension; fila1++) {
            sumaizquierda+=matriz[fila1][fila1];
        }
            for (int columna1 = 0; columna1 < dimension; columna1++) {
            sumaderecha+=matriz[columna1][columna1-dimension-1];
        }
    
        System.out.println("suma de la derecha "+sumaderecha);
        System.out.println("suma de la izquierda "+sumaizquierda);
        
            
            
    }
}
