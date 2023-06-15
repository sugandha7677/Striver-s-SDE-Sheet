public class 99.ReverseString {
    public static String reverseString(String str) 
	{
		//Write your code here
		String [] arr = str.split(" ");
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.print(arr[i] + " ");
		}

		return "";
	}
}
