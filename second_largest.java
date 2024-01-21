package array;

import java.util.Scanner;

public class second_largest {
    public static int findSecondLargest(int n, int[] arr){
        int ls=arr[0], ss=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>ls){
            ss=ls;
            ls=arr[i];
            
        }
        else if(arr[i]!=ls&&arr[i]>ss){
            ss=arr[i];
        }
    }
    return ss!=-1?ss:-1;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the second largest element is"+findSecondLargest(arr.length,arr));
    }
    
}
