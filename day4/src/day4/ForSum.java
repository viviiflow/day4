package day4;

public class ForSum {
public static void main(String[] args) {
	int sum=0;
	for(int i=1; i<=10; i++) {
		sum+=i;
		if(i<10) {
			System.out.print(i+"+");
		}
		else {
			System.out.print(i);
		}
	}
	System.out.print("="+sum);
}
}
