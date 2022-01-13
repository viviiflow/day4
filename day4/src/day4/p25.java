package day4;
import java.util.Scanner;
public class p25 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("정수의 개수를 지정하세요.");
	int a=sc.nextInt();
	
	int[] ar= new int[a];
	double sum=0.0;
	
	System.out.println(a+"개의 정수를 입력하세요.");
	for(int i=0; i<ar.length; i++) {
		ar[i]=sc.nextInt();
		sum+=ar[i];
	}
	
	System.out.println("합계는 "+Math.round(sum)+"이며, 평균은 "+Math.round((sum/ar.length)*100)/100.0+"입니다.");
}
}
