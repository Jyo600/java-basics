import java.io.*;
import java.util.*;
class passingarrayofmethod{
    public static void main(String args[]){
        int[]x={22,3,4,55,78};
        System.out.println(x[4]);
        change (x);
        System.out.println(x[4]);
    }
    public static void change(int[] y){
        y[4]=90;
    }
}