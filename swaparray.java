import java.util.*;
import java.io.*;
class swaparray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //modified array is
        int first=0;
        int last=n-1;
        for(int i=0;i<n;i++){
            while(first<last){
                int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            last--;
            first++;
            }
        }
        System.out.println("the swappaed array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}