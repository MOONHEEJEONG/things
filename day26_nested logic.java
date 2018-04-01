package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int da = sc.nextInt();
		int ma = sc.nextInt();
		int ya = sc.nextInt();
		int de = sc.nextInt();
		int me = sc.nextInt();
		int ye = sc.nextInt();
		int fine=0;
		
		System.out.println(ya-ye);

		
		if(ya-ye>0) {
			fine=10000;
		

					
		}else if(ya-ye<0) {
			ma = ma-12;
			da = da -31;
			if(ma-me>0) {
				fine=500*(ma-me);
			}else {
				if(da-de>0) {
					fine= 15*(da-de);
				}
			}
		}else{
			if(ma-me>0) {
				fine=500*(ma-me);
			}else {
				if(da-de>0) {
					fine= 15*(da-de);
				}
			}
		}
		
		System.out.println(fine);
				

}

}