//array sorted
import java.io.*;
import java.util.*;
class arr3{
    public static void main(String args[]){
        int[]arr={1,2,3,4,5};
        boolean sorted=true;
        for(int i=1;i<arr.length;i++)
            if(arr[i]>arr[i-1]){
                sorted=false;
                System.out.println("the array is sorted");
                break;
            }
    }
}