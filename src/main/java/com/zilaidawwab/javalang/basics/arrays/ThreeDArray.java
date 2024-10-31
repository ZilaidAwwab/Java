package com.zilaidawwab.javalang.basics.arrays;

public class ThreeDArray {
    public static void main(String[] args) {
        
        // Declaring the three-dimensional arrays
        int[][][] threeD = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*
 * This outputs
 * 
 * 0 0 0 0 0 
 * 0 0 0 0 0 
 * 0 0 0 0 0 
 * 0 0 0 0 0 
 * 
 * 0 0 0 0 0 
 * 0 1 2 3 4 
 * 0 2 4 6 8 
 * 0 3 6 9 12 
 * 
 * 0 0 0 0 0
 * 0 2 4 6 8
 * 0 4 8 12 16
 * 0 6 12 18 24
 */
