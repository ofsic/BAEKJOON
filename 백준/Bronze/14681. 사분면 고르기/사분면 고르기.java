import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
			
		if(a > 0) {
			if(b > 0) {
			System.out.println("1");
			}else{	
			System.out.println("4");
		    }
		}
		if(a < 0) {	
			if(b < 0) {
				System.out.println("3");
			}else {
				System.out.println("2");
			}	
	}
}
}