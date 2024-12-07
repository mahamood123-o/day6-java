import java.util.Arrays;
import java.util.Scanner;

class main {
    public static void main(String args[]) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        int k=3;
        int n = nums.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+k)%n]=nums[i];
        }
        System.arraycopy(temp,0,nums,0,n);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]+" ");
        }
    }
}
