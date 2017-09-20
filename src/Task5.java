import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("¬ведите степень");
		int x =sc.nextInt();
		for(int i=0;i<a.length;i++){
			int c= (int)(Math.pow(a[i], x));
			System.out.println(c);
		}

	}

}
