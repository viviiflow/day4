package day4;
import java.util.Scanner;
public class p25 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("������ ������ �����ϼ���.");
	int a=sc.nextInt();
	
	int[] ar= new int[a];
	double sum=0.0;
	
	System.out.println(a+"���� ������ �Է��ϼ���.");
	for(int i=0; i<ar.length; i++) {
		ar[i]=sc.nextInt();
		sum+=ar[i];
	}
	
	System.out.println("�հ�� "+Math.round(sum)+"�̸�, ����� "+Math.round((sum/ar.length)*100)/100.0+"�Դϴ�.");
}
}
