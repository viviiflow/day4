package day4;
import java.util.Scanner;
public class WhileAvg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");

	int a, cnt=0;
	double sum=0;
	
	while((a=sc.nextInt())!=0) {
		cnt+=1;
		sum+=a;
		}

	
	System.out.println("���� ������ "+cnt+"���̸� ����� "+Math.round((sum/cnt)*10)/10.0+"�Դϴ�.");
	
}
}
