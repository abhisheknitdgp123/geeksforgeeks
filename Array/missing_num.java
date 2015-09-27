package arrays;
//LOGIC - XOR A with B, with B being a part of A, we get the remaining part of A, because A's bits are fliped
public class missing_num {
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};
		int x1=arr[0],x2=1;
		for(int i=1;i<arr.length;i++){
			x1 ^= arr[i];
			for(i=2;i<arr.length+1;i++)
			x2 ^=i;
		}
		System.out.println(x1^x2);
	}

}
