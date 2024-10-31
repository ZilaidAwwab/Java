package com.zilaidawwab.javalang.basics.arrays;

public class TwoDArray {
    public static void main(String[] args) {
        
        // This initializes an array of 4 rows and 5 cols
        int[][] twoD = new int[4][5]; // int twoD[][]; (Both are valid)
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

/*
 * This outputs
 * 
 * 0 1 2 3 4 
 * 5 6 7 8 9 
 * 10 11 12 13 14 
 * 15 16 17 18 19

 */
