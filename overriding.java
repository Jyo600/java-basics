import java.io.*;
import java.util.*;
class B{
    void show(){
        System.out.println("this is class B");
    }

}
class overriding extends B{
    void show(){
        System.out.println("this is class A");
    }
    public static void main(String args[]){
        B ov=new overriding();
        ov.show();

    }
}