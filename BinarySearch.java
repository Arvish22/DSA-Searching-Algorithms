import java.util.Arrays;
import java.util.Scanner;


//When the list is sorted we can use the binary search technique to find items on the list.
//	In this procedure, the entire list is divided into two sub-lists. 
//	If the item is found in the middle position, it returns the location, 
//	otherwise jumps to either left or right sub-list and do the same process again until finding the item or exceed the range.


//	Time Complexity: O(1) for the best case. O(log2 n) for average or worst case.
//	Space Complexity: O(1)
public class BinarySearch {

	public static int binarySearch(int array[], int start, int end, int searchKey) {
		if(start < end) {

			int mid = (start + (end-start))/2;

			if(array[mid] == searchKey)
				return mid;

			if(array[mid] > searchKey)
				return binarySearch(array, start, mid-1, searchKey);

			return binarySearch(array, mid+1, end, searchKey);
		}   
		return -1;
	}


	public static void main(String a[]){ 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size");
		int s = scn.nextInt();

		int[] a1= new int[s];

		for(int i=0;i<s;i++) {
			int index = i+1;
			System.out.println("Enter "+ index + " Element");
			a1[i] = scn.nextInt();
		}   

		Arrays.sort(a1);

		System.out.println("Array after sorting");
		for(int num : a1)
			System.out.print(num+" ");

		System.out.println();
		System.out.println("Enter Element to get index of");
		int key = scn.nextInt();

		System.out.println(key+" is found at index: "+binarySearch(a1,0,s,key));    
	}      
}
