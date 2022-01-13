package day4;

public class x4 {
	public static void main(String[] args) {
		int[] arr = { 44, 11, 29, 24, 76 };
		int[] temp = null;
		int n=0, cnt=0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		temp=new int[cnt];
		
		
		for (int j = 0; j < 5; j++) {
			if (arr[j] % 4 == 0) {
				cnt++;
				temp[n]=arr[j];
				n++;
			}
		}
		
		System.out.print("[");
		for(int r=0; r<temp.length; r++) {
			System.out.print(temp[r]+" ");
			}
		System.out.println("]");
	}
}
