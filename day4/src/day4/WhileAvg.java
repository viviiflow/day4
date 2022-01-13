package day4;
import java.util.Scanner;
public class WhileAvg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

	int a, cnt=0;
	double sum=0;
	
	while((a=sc.nextInt())!=0) {
		cnt+=1;
		sum+=a;
		}

	
	System.out.println("수의 개수는 "+cnt+"개이며 평균은 "+Math.round((sum/cnt)*10)/10.0+"입니다.");
	
}
}
