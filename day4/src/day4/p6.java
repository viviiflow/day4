package day4;
import java.util.Scanner; 
public class p6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int count=0, n=0;
	double sum=0;
	
	System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
	while((n=sc.nextInt()) != 0) {
		sum+=n;
		count++;
	}
	
	System.out.print("���� ������ "+count+"���̸� ");
	System.out.println("����� "+sum/count+"�Դϴ�.");
}
}
