import java.io.*;
import java.util.*;
class calculation{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        calculation c=new calculation();
        System.out.println(c.add(4,70));
        System.out.println(c.add(10,80,50));
    }
}