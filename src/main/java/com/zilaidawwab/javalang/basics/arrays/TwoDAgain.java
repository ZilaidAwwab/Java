package com.zilaidawwab.javalang.basics.arrays;

public class TwoDAgain {
    public static void main(String[] args) {
        
        // We can initialize the rows initially and leave cols initialization for later
        int[][] twoD = new int[4][];

        // We can have different number of cols for each row
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * This outputs
 * 
 * 0 
 * 1 2 
 * 3 4 5 
 * 6 7 8 9

 */
