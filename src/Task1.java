import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int a[]=new int[4];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			int x=i+1;
			System.out.println("¬ведите "+x+"число");
			a[i]= sc.nextInt();
		}
		System.out.println("»сходный массив:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("»зменЄнный массив:");
		for(int i=0;i<a.length;i++){
			if(i%2!=0)
				a[i]=0;
			System.out.println(a[i]);
		}
		
	}
	   
		
}
