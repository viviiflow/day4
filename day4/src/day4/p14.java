package day4;
import java.util.Scanner;
public class p14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("exit를 입력시 종료");
	
	while(true) {
		System.out.print(">>");
		String a=sc.nextLine();
		if(a.equals("exit")) {
			break;
		}
	}
	System.out.println("종료합니다.");
}
}
