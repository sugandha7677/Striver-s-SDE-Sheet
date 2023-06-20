public class 5.Sort0,1,2 {
    
    public static void sort012(int[] arr)
    {
        //Write your code here
        int c1 = 0;
        int c2 = 0;
        int c3 = arr.length - 1;

        while(c2 <= c3){
            if(arr[c2] == 0){
              
                int temp = arr[c1];
                arr[c1] = arr[c2];
                arr[c2] = temp;

                c1++;
                c2++;
            }else if(arr[c2] == 2){
               
                int temp = arr[c2];
                arr[c2] = arr[c3];
                arr[c3] = temp;
                c3--;
            }else c2++;
        }
    }

}
