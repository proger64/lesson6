

public class Task2 {

	public static void main(String[] args) {
		int y=0;//���������� ��������� ���������.
		int[] mass={0,5,3,0,9};
		for(int i=0;i<mass.length;i++){
			if(mass[i]!=0) 
				y++;
		}
		System.out.println("��������� "+y);
		//System.out.println(mass[mass.length-1]);
		

	}

}