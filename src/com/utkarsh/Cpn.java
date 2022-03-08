package com.utkarsh;

import java.util.Arrays;

public class Cpn {
    public static void main(String[] args) {
        int [] x={1,0,0,0};
        int [] y={1,0};
        int J=2;

        double alpha=0.2;
        double beta =0.2;
        double [][] V ={
                {.8,  .2},
                {.8,  .2},
                {.2,   .8},
                {.2 ,  .8},
        };
        double [] [] W ={
                {.5  ,.5},
                {.5  ,.5}
        };
        // calculating euclidean distance
        double [] D= new double[J];
        double xiVij=0;
        double ykWkj=0;
        for (int i = 0; i < J; i++) {
            xiVij=0;
            ykWkj=0;
            for (int j = 0; j < V.length; j++) {
                xiVij+=((x[j]-V[j][i])*(x[j]-V[j][i]));
                
            }

            D[i]=xiVij;
        }
        System.out.println("values of D1 and D2 are =");
        System.out.println(Arrays.toString(D));
        if(D[0]<=D[1]){
            //weight updation
            for (int i = 0; i < V.length; i++) {
                V[i][0]=V[i][0]+alpha*(x[i]-V[i][0]);
            }
            /*for (int i = 0; i <J; i++) {
                W[i][0]=W[i][0]+beta*(y[i]-W[i][0]);
            }

                System.out.println("upated y input ");
                for (int i = 0; i < J; i++) {
                    System.out.println(Arrays.toString(W[i]));

                }*/

            System.out.println("updated array is ");
            for (int i = 0; i < V.length; i++) {
                System.out.println(Arrays.toString(V[i]));
            }


        }
        else{
            for (int i = 0; i < V.length; i++) {
                V[i][1]=V[i][1]+alpha*(x[i]-V[i][1]);
            }
         /*   for (int i = 0; i <J; i++) {
                W[i][1]=W[i][1]+beta*(y[i]-W[i][1]);
            }
            System.out.println("upated y input ");
            for (int i = 0; i < J; i++) {
                System.out.println(Arrays.toString(W[i]) );

            }*/
            System.out.println("updated array is ");
            for (int i = 0; i < V.length; i++) {
                System.out.println(Arrays.toString(V[i]));
            }

        }
        for (int i = 0; i < J; i++) {
            xiVij=0;
            ykWkj=0;
            for (int j = 0; j < V.length; j++) {
                xiVij+=((x[j]-V[j][i])*(x[j]-V[j][i]));

            }

            D[i]=xiVij;
        }
        System.out.println("values of D1 and D2 are =");
        System.out.println(Arrays.toString(D));
        if(D[0]<=D[1]){
            //weight updation
            for (int i = 0; i < V.length; i++) {
                V[i][0]=V[i][0]+alpha*(x[i]-V[i][0]);
            }
            for (int i = 0; i <J; i++) {
                W[i][0]=W[i][0]+beta*(y[i]-W[i][0]);
            }

                System.out.println("upated y input ");
                for (int i = 0; i < J; i++) {
                    System.out.println(Arrays.toString(W[i]));

                }

            System.out.println("updated array is ");
            for (int i = 0; i < V.length; i++) {
                System.out.println(Arrays.toString(V[i]));
            }


        }
        else{
            for (int i = 0; i < V.length; i++) {
                V[i][1]=V[i][1]+alpha*(x[i]-V[i][1]);
            }
            for (int i = 0; i <J; i++) {
                W[i][1]=W[i][1]+beta*(y[i]-W[i][1]);
            }
            System.out.println("upated y input ");
            for (int i = 0; i < J; i++) {
                System.out.println(Arrays.toString(W[i]) );

            }
            System.out.println("updated array is ");
            for (int i = 0; i < V.length; i++) {
                System.out.println(Arrays.toString(V[i]));
            }

        }


    }
}
