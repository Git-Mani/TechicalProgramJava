
public class BSTree { 
 
	int binarySearch(int arr[], int start, int last, int x) 
	{ 
		if (last >= start) { 
			int mid = start + (last - start) / 2; 

			// If the element is present at the 
			// middle itself 
			if (arr[mid] == x) 
				return mid; 

			// If element is smaller than mid, then 
			// it can only be present in left subarray 
			if (arr[mid] > x) 
				return binarySearch(arr, start, mid - 1, x); 

			// Else the element can only be present 
			// in right subarray 
			return binarySearch(arr, mid + 1, last, x); 
		} 

		
		return -1; 
	} 

	
	public static void main(String args[]) 
	{ 
		BSTree ob = new BSTree(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Not Found"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 

