package DSAProject2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ConstructionOrder {
	public static void main(String args[]) {

		System.out.println("Enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		int floorSize = sc.nextInt();
	

		Queue<Integer> queue= new LinkedList<>();
		
		int[] array = new int[floorSize];
        int i; 
		
        //do {
			
		for (i = 0; i < floorSize; i++) {
			System.out.println("Enter the floor size given on day : "+ (i+1) );
			int floorProvidePerDay = sc.nextInt();
			
			if(floorProvidePerDay<=floorSize) {
				queue.add(floorProvidePerDay);
			
				array[i]=floorProvidePerDay;
				}
			
		/*	else {
				System.out.println("Entered FloorSize is not valid");
				i--;
				}}}
		 while(i==0);*/
		
		}
		
		int Size=floorSize;
        
		System.out.println("The order of construction is as follows");
	
		for (int a = 0; a<= Size; a++) {
			    
			System.out.println("Day: "+ (a+1)); 
			
			       if((queue.peek() >= floorSize)); {
			    	   floorSize= floorSize-a;
			           for(int k=a;k>0;k--){
			        	   //System.out.println(array[k-1]);
			        	   System.out.println(queue.peek());
			        	   queue.poll();
			        	 }}
			           } queue.poll();      
			                	     
		}     
}