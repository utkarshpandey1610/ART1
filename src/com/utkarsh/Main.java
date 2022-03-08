package com.utkarsh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double vigilance =0.8;
        int [] s={1,1,1,1,0,1,1,1,1};
        double alpha=2;
        double [][] bij= {
                {.33 ,.1},
                {0   ,.1},
                {0.33,  .1},
                {0,  .1},
                {0.33,  .1},
                {0,  .1},
                {0.33,  .1},
                {0,  .1},
                {0.33,  .1},


        };
        int [][] tji={
                {1,0,1,0,1,0,1,0,1},
                {1,1,1,1,1,1,1,1,1,}

        };

        int mods=0;
        for (int i = 0; i < s.length; i++) {
            mods += s[i];
        }
        System.out.println("|s|="+mods);
        //now we calculate net input
        double sum=0;
        double  [] yja= new double   [bij[1].length];
        for (int yj = 0; yj < bij[1].length; yj++) {
            sum=0;
            for (int i = 0; i < bij.length; i++) {

              sum+= bij[i][yj]*s[i];
            }
            yja[yj]=sum;



        }
        System.out.println("y1 to yn values are");
        for (int i = 0; i < yja.length; i++) {
            System.out.println(yja[i]);
        }
        double min = Integer.MIN_VALUE;
        int noting_index=0;
        for (int i = 0; i < yja.length; i++) {
                 if(min<yja[i]){
                     min=yja[i];
                     noting_index=i;
                 }
        }
        System.out.println("winnig index J = "+(noting_index+1));
        //compute f1 activation again
        int []x=new int [s.length];
        for (int i = 0; i < s.length; i++) {
            x[i]=s[i]*tji[noting_index][i];
        }
        System.out.print("x=[");
        for (int i = 0; i < s.length; i++) {
            if (i==s.length-1){
                System.out.print(x[i]);
            }
            else {
                System.out.print(x[i] + ",");
            }
        }
        System.out.println("]");
        int modx=0;
        for (int i = 0; i < x.length; i++) {
            modx+=x[i];

        }
        System.out.println("|x|="+modx);
        double reset=0;
        reset=(double)modx/mods;
        //we now test for reset
        System.out.print("|x|/|s|="+reset);
        //we now test for reset
        if(reset>=vigilance){
            System.out.println(">="+vigilance);
            System.out.println("update bottom up weights");
            for (int i = 0; i <bij.length; i++) {
                bij[i][noting_index]=(double)(alpha*x[i])/(double)(alpha-1+modx);
                System.out.println(bij[i][noting_index]);
                tji[noting_index][i]=x[i];
                
            }
        }
        else{
            System.out.println("<="+vigilance);
            System.out.println("no update changing value of Y");
            yja[noting_index]=-1;
            min = Integer.MIN_VALUE;
             noting_index=0;
            for (int i = 0; i < yja.length; i++) {
                if(min<yja[i]){
                    min=yja[i];
                    noting_index=i;
                }
            }
            System.out.println("winnig index J = "+(noting_index+1));
            //compute f1 activation again

            for (int i = 0; i < s.length; i++) {
                x[i]=s[i]*tji[noting_index][i];
            }
            System.out.print("x=[");
            for (int i = 0; i < s.length; i++) {
                if (i==s.length-1){
                    System.out.print(x[i]);
                }
                else {
                    System.out.print(x[i] + ",");
                }
            }
            System.out.println("]");
             modx=0;
            for (int i = 0; i < x.length; i++) {
                modx+=x[i];

            }
            System.out.println("|x|="+modx);
             reset=0;
            reset=(double)modx/mods;
            //we now test for reset
            System.out.print("|x|/|s|="+reset);
            //we now test for reset
            if(reset>=vigilance){
                System.out.println(">="+vigilance);
                System.out.println("update bottom up weights");
                for (int i = 0; i <bij.length; i++) {
                    bij[i][noting_index]=(double)(alpha*x[i])/(double)(alpha-1+modx);
                    System.out.println(bij[i][noting_index]);
                    tji[noting_index][i]=x[i];

                }
            }
            else{
                System.out.println("<="+vigilance);
                System.out.println("no update changing value of Y");
                yja[noting_index]=-1;
                min = Integer.MIN_VALUE;
                noting_index=0;
                for (int i = 0; i < yja.length; i++) {
                    if(min<yja[i]){
                        min=yja[i];
                        noting_index=i;
                    }
                }
                System.out.println("winnig index J = "+(noting_index+1));
                //compute f1 activation again

                for (int i = 0; i < s.length; i++) {
                    x[i]=s[i]*tji[noting_index][i];
                }
                System.out.print("x=[");
                for (int i = 0; i < s.length; i++) {
                    if (i==s.length-1){
                        System.out.print(x[i]);
                    }
                    else {
                        System.out.print(x[i] + ",");
                    }
                }
                System.out.println("]");
                modx=0;
                for (int i = 0; i < x.length; i++) {
                    modx+=x[i];

                }
                System.out.println("|x|="+modx);
                reset=0;
                reset=(double)modx/mods;
                //we now test for reset
                System.out.print("|x|/|s|="+reset);
                //we now test for reset
                if(reset>=vigilance){
                    System.out.println(">="+vigilance);
                    System.out.println("update bottom up weights");
                    for (int i = 0; i <bij.length; i++) {
                        bij[i][noting_index]=(double)(alpha*x[i])/(double)(alpha-1+modx);
                        System.out.println(bij[i][noting_index]);
                        tji[noting_index][i]=x[i];

                    }
                }
                else{
                    System.out.println("<="+vigilance);
                    System.out.println("no update changing value of Y");
                    yja[noting_index]=-1;
                    min = Integer.MIN_VALUE;
                    noting_index=0;
                    for (int i = 0; i < yja.length; i++) {
                        if(min<yja[i]){
                            min=yja[i];
                            noting_index=i;
                        }
                    }
                    System.out.println("winnig index J = "+(noting_index+1));
                    //compute f1 activation again

                    for (int i = 0; i < s.length; i++) {
                        x[i]=s[i]*tji[noting_index][i];
                    }
                    System.out.print("x=[");
                    for (int i = 0; i < s.length; i++) {
                        if (i==s.length-1){
                            System.out.print(x[i]);
                        }
                        else {
                            System.out.print(x[i] + ",");
                        }
                    }
                    System.out.println("]");
                    modx=0;
                    for (int i = 0; i < x.length; i++) {
                        modx+=x[i];

                    }
                    System.out.println("|x|="+modx);
                    reset=0;
                    reset=(double)modx/mods;
                    //we now test for reset
                    System.out.print("|x|/|s|="+reset);
                    //we now test for reset
                    if(reset>=vigilance){
                        System.out.println(">="+vigilance);
                        System.out.println("update bottom up weights");
                        for (int i = 0; i <bij.length; i++) {
                            bij[i][noting_index]=(double)(alpha*x[i])/(double)(alpha-1+modx);
                            System.out.println(bij[i][noting_index]);
                            tji[noting_index][i]=x[i];

                        }
                    }
                }


            }
        }

        for(double []a:bij) {
            System.out.println(Arrays.toString(a));
        }
        for(int  []a:tji) {
            System.out.println(Arrays.toString(a));

        }

    }
}
