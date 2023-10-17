public class Pivot {
    public static void main(String[] args) {
        int[] arr={3,4,5,7};
        int total_sum=19;
        int left_sum=0;
        int right_sum=19;
        for(int i=0;i<arr.length;i++)
        {
         right_sum=right_sum-arr[i];
         if(left_sum==right_sum)
         System.out.println(i);
         left_sum+=arr[i];   
        }
        
    }
    
}
