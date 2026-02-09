import java.io.*;
import java.util.*;
class leapyear{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int year= sc.nextInt();
 if(year %4 ==0 && year %100 !=0||year %400 ==0){
  System.out.println("the year  is leap");
}
else{
System.out.println("the year is not leap");
}
}

}