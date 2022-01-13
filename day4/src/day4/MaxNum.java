package day4;
import java.util.Scanner;
public class MaxNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[5];
	int n=0;
	
	System.out.println("양수 5개를 입력하세요.");
	for(int i=0; i<arr.length; i++){
		arr[i]=sc.nextInt();
		if(n<arr[i]) {
			n=arr[i];
		}
	}
	System.out.println("가장 큰 수는 "+n+"입니다.");
}
}
