package day4;
import java.util.Scanner;
public class WhileBreak {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("exit�� �Է��ϸ� �����մϴ�.");
	
			
	while(true) {
		System.out.print(">>");
		String s=sc.nextLine();
		if(s.equals("exit")) {
			break;
		}
	}
	System.out.println("�����մϴ�.");
}
}
