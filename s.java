


public class s {
    public static void main(String [] args){
        //Scanner scn = new Scanner(System.in);
        int [] arr = {4,2, 9, 12, 3};
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j +1]){
                    int  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println(arr[0]  + arr[1]);
    }
}
