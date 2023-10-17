
import java.util.*;
public class perfect_sqaure {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); //input form the user
		int i=1;
		for( ;i*i<=a;i++) {
			if(i*i==a) {
				System.out.println("The number " + a + "is perfect square");
				break;
			}
		}
		if(i*i>a) {
			System.out.println("The number " + a + "is not a perfect square");
		}
	}
}
