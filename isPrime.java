

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i=0; icnt; i++) {
             int val = sc.nextInt();
                System.out.println (val + );

            for(int j=2; jj=val; j++){
                System.out.println(j +j+  val%j  +(val%j));
                if(val%j==0) {
                    val=1;  }
            }
		
               if(val==1) System.out.println(Not prime);
                else System.out.println(Prime);
            
		
        }
    
		sc.close();
		
}
		
}
