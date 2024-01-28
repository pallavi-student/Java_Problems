package array;

public class duplicate {
    public static int removeDuplicates(int[] arr,int n){
        int i=0;
        int j=1;
        while(j<n){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;}
                j++;
            }
            return i+1;
        }
        public static void main(String[] args) {
            int[]arr={1,1,2,3,3,4};
            int n=arr.length;
            int ans=removeDuplicates(arr,n);
            System.out.println(ans +" "+"is the length");
        }
    }



