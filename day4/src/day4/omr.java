package day4;
import java.util.Random;
public class omr {
public static void main(String[] args) {
	Random r = new Random();
	
	int[] ans= {1,3,4,2,5};
	int[] hgd= new int[5];
	int cnt=0, num=0;
	
	System.out.print("[");
	for(int i=0; i<ans.length; i++) {
		System.out.print(ans[i]+" ");
		}
	System.out.println("]");
	
	
	System.out.print("[");
	for(int j=0; j<hgd.length; j++) {
		hgd[j]=r.nextInt(5)+1;
		System.out.print(hgd[j]+" ");
		}
	System.out.println("]");
	
	
	System.out.print("[");
	for(int n=0; n<hgd.length; n++) {
		if(hgd[n]==ans[n]) {
			cnt++;
			System.out.print("O ");
		}
		else {
			System.out.print("X ");
		}
	}
	System.out.println("]");
	
	
	System.out.print("¼ºÀû:"+cnt*20);
	
	
	}
}
