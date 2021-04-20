/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class soal3 {
    public static void main (String [] args){
        int i, j, m, n;
        int matrixA [][] = new int [10][10];
        int matrixB [][] = new int [10][10];
        int transpos [][] = new int [10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan jml baris matrix: ");
        n = scan.nextInt();
          System.out.print("masukkan jml kolom matrix: ");
        n = scan.nextInt();
        System.out.println("masukkan elemen matrix: ");
         m = scan.nextInt();
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                matrixA[i][j] = scan.nextInt();
            }
        }
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                transpos[j][i] = matrixA[i][j];
            }
        }
               System.out.println("hasil transpos matrix: ");
               for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(transpos[i][j] + "\t");
            }
            System.out.println();
               }
    }
    
}
