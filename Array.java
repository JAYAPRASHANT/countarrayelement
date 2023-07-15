package CountArray;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner sc=new Scanner(System.in);
				int ar[]=new int[3];
				int count=0;
				int max=Integer.MIN_VALUE;
				for(int i=0;i<3;i++) {
					ar[i]=sc.nextInt();
					
					
					
				}
				for(int i=0;i<3;i++) {
					
					
					
					if(ar[i]>max) {
						max=ar[i];
					}
				}
					for(int i=0;i<3;i++) {
						
					
					if(ar[i]==max) {
						count++;
					}
					
					
				}
				
					System.out.println(3-count);
	}

}
