package com.av.ds.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

        public static int[] productExceptSelf_1s_2(int[] nums) {
            int ans[] = new int[nums.length];
            int prefix =1,suffix =1;

            for(int i=0;i<nums.length;i++)
            {
                ans[i] = prefix;
                prefix = prefix * nums[i];

            }
           // System.out.println("Ans="+Arrays.toString(ans));
            for(int i=nums.length-1;i>=0;i--)
            {
                ans[i]=suffix*ans[i];
                suffix = suffix * nums[i];
            }
            return ans;
        }

        public int[] productExceptSelf_1s_1(int[] nums) {
            int n = nums.length, product = 1, countZero = 0;
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                if(nums[i] == 0){
                    countZero++;
                    continue;
                }
                product *= nums[i];
            }
            for (int i = 0; i < n; i++) {
                if(nums[i] == 0 ){
                    if(countZero > 1)
                        ans[i] = 0;
                    else
                        ans[i] = product;
                }
                else if(countZero > 0){ //non-zero elements
                    ans[i] = 0;
                }
                else
                    ans[i] = product/nums[i];
            }
            return ans;
        }

    public static int[] productExceptSelfBestWay(int[] nums) {
            int n = nums.length;
            int pref[] = new int[n];
            int suff[] = new int[n];
            pref[0] = 1;
            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] * nums[i - 1];
            }
            suff[n-1]=1;
            for (int i = n - 2; i >= 0; i--) {
                suff[i] = suff[i+1]*nums[i+1];
            }

            int ans[] = new int[n];
            for(int i=0;i<n;i++){
                ans[i]=pref[i]*suff[i];
            }
            return ans;
    }// takes 2s of completion TC = O(n) SC= O(1)
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] resultArr = new int[n];

        for(int j = 0; j < n; j++){
            int prod = 1;
            int i = 0;
            while(i < n){
                if(i != j ){
                    prod = prod*nums[i];
                }
                i++;
            }
            resultArr[j] = prod;
        }
        return resultArr;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,5,7};
        System.out.println("Ori Arr="+ Arrays.toString(arr));
        int[] resArr = null;
                //resArr = productExceptSelfBestWay(arr);
       // resArr = productExceptSelf(arr);
        resArr = productExceptSelf_1s_2(arr);
        System.out.println("Res Arr="+ Arrays.toString(resArr));
    }
}
