package com.company;

public class Lab {
    public static void main(String[] args) {
        int a[] = new int[] {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        float[] x = new float[16];
        float[][] b = new float[20][16];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (-4.0 + Math.random()*19);
            System.out.printf("%.2f ", x[i]);
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (a[i] == 16)
                    b[i][j] =(float) Math.cos(Math.cbrt(Math.cos(x[j])));
                else if (a[i] == 1 || a[i] == 3 ||a[i] == 4 ||a[i] == 6 ||a[i] == 8 ||a[i] == 9 ||a[i] == 11 ||a[i] == 17 || a[i] == 18 ||a[i] == 19)
                    b[i][j] =(float) Math.pow(Math.cos(Math.pow(0.5*(x[j]-1),2)),2*Math.pow(((float) 2*2/3)/(x[j]-0.5),2));
                else
                    b[i][j] = (float) ((float)  Math.log(Math.sqrt(Math.abs(x[j])+1/Math.abs(x[j]))) * (1/3 + Math.atan(Math.getExponent(Math.cbrt(-1*Math.pow(Math.cos(x[j]),2))))));
                System.out.printf("%.2f ", b[i][j]);
            }
            System.out.println(' ');
        }

        }
    }

