package day4;
import java.util.Scanner;
public class p22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int[] intArray = new int[5];
	System.out.println("��� 5���� �Է��ϼ���.");
	int max=0;
			
	for(int i=0; i<5; i++) {
		intArray[i]=sc.nextInt();
		if(max<intArray[i]) {
			max=intArray[i];
		}
	}

	System.out.println("���� ū ���� "+max+"�Դϴ�.");
}
}
