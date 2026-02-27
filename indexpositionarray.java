import java.util.*;
import java.io.*;
class indexpositionarray{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the element of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the eneterd array element is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("operation performed in an aray");
    
       for(int i=0;i<arr.length;i++){
        if(i%2==0)
        {
            arr[i]+=10;
        }
        else
        {
            arr[i]*=2;

        }
        
       }
       //modified array
       System.out.println("modified array:");
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }

    }

}