package day4;
import java.util.Scanner;
public class cinema {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] seat=new int[7];
	int money=0;
	
	
	while(true) {
		System.out.print("seat = ");
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+" ");
			}
		System.out.println("");
		
		System.out.println("�޴� ����");
		System.out.println("[1]�ڸ� ����");
		System.out.println("[2]���");
		System.out.println("[0]����");
		int slt=sc.nextInt();
		
		if(slt==1) {
			System.out.println("���� �ڸ� ����");
			int num=sc.nextInt()-1;
			if (seat[num]==1) {
				System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
			}
			else {
			seat[num]=1;
			continue;
			}
		}

	
		else if(slt==2) {
			for(int i=0; i<seat.length; i++) {
				if (seat[i]==1) {
					money+=12000;
				}
			}
			System.out.println("��ȭ��:"+money);
			continue;
		}
	
	
		else if(slt==0) {
			System.out.println("���� ���α׷��� �����մϴ�.");
			break;
		}
	
	}	
	
}
}
