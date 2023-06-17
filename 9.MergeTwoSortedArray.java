public class 9.MergeTwoSortedArray {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int [] ans = new int[m + n];

        int  i =0;
        int j = 0;
        int  k = 0;

        while( i < m && j < n){
            if(arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i];
                i++;
            }else{
                ans[k++] = arr2[j];
                j++;
            }
        }

        while(i < m){
            ans[k++] = arr1[i++];
        }

        while(j < n) ans[k++] = arr2[j++];

        return ans;
    }
}
