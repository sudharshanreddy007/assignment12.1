package array;

import java.util.Arrays;

public class ExceptionHandling {

	public static void main(String[] args) { //creating a main method

	    int [] Array =   {8,12,6,5,19,30,20,54,8,1};//here i have created an array of size 10
	    int [] newArray =new  int [9];  
	    //here i have taken another array and declared an array size of 9
	    
	    for(int i=0;i<Array.length;i++)//here i=0 it means array starts from 0
			//i value is equal to array length which we have and this will be incremented
	    {
	    	try{
	    		
	           newArray[i]=Array[i];//given array is equal to new array
	    }
	    	
	    
	    	catch (Exception e){
	    	
	    		System.out.println("ArrayIndexOutOfBoundsException");
	    } }       
	    System.out.println(Arrays.toString(Array));//exist array
	 
	    System.out.println(Arrays.toString(newArray));//copied array
}
}
