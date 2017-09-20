

public class Task4 {

	public static void main(String[] args) {
		int[] mass= new int[3]; 
		int x;
		for(int i=0;i<mass.length;i++){
		   x=(int)(Math.random()*(10-1)+1);
		   mass[i]=x;
		   System.out.println(mass[i]);
		}
		int s=0;
		for(int i=0;i<mass.length;i++){
			s=s + mass[i];
		}
		s=s/mass.length;
		System.out.println("Средне арифметическое этих чисел"+s);
		

	}

}
