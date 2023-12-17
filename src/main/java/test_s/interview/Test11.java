package test_s.interview;

import java.util.Arrays;
import java.util.Collections;


public class Test11 {

//	{5, 7, 1 , 4, 2}
	
	
	public static void main(String[] args) {
		
		int[] i={5, 7, 1 , 4, 2};
		Arrays.sort(i);
		
		
		System.out.println(Arrays.toString(i));
		
		
//		int len=i.length;
//		
//		int[] k=new int[len];
//		for(int j=0;j<len;j++) {
//			if(i[j]< i[j+1]) {
//				k[j]=i[j];
//			}
//		}
		
		String firstname="santanu";
		String lastName="panda";
		
		String name =firstname+lastName;
		String name1= name.substring(firstname.length(), name.length())+firstname;
		
		System.out.println(name1);
		
		}
		 
		

	
}
