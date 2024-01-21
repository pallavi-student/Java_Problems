package array;

import java.util.ArrayList;
import java.util.Scanner;

public class left_rotate_ksteps {
    public static ArrayList<Integer> reverse(ArrayList<Integer>arr,int in,int ex){
        while(in<=ex){
            int temp=arr.get(in);
            arr.set(in,arr.get(ex));
            arr.set(ex,temp);
            in++;
            ex--;
    

        }
        return arr;
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer>arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.size()-1);
        reverse(arr,0,arr.size()-1);
        return arr;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
    System.out.println("enter no of rotation you want");
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        for(int i=0;i<6;i++){
            arr.add(i,sc.nextInt());
        }
       ArrayList<Integer> ans= rotateArray(arr,k);
    System.out.println("rotated array"+ans);

    }
    
}
