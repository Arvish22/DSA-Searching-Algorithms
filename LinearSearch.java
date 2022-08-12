import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
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
        
        System.out.println("Enter Element to get index of");
        int key = scn.nextInt();
        
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }      
}
