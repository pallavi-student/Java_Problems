package array;

public class squares_sorted_array {
    public static int[] sortedSquares(int[] nums) {
        int []v=new int[nums.length];
         int i=0;int j=nums.length-1;
       for(int k=nums.length-1;k>0;k--){
           int comp1=nums[i]*nums[i];
           int comp2=nums[j]*nums[j];
            if(comp1>comp2){
              v[k]=comp1;
                          i++;
            }
                          else{
                              v[k]=comp2;
                              j--;
                          }
        }
                          return v;
        
    }
    public static void main(String[] args) {
int[]nums={-4,-1,0,3,10};
        int[]ans=sortedSquares(nums);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }
    }
    
}
