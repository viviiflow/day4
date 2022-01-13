package day4;

public class lotto {
public static void main(String[] args) {
	int[] lotto1= {0,0,7,7,7,0,0,0};
	int[] lotto2= {7,0,7,7,0,0,0,0};
	int[] lotto3= {7,0,7,7,7,0,7,0};
	
	int a, b, c=0;
	int ox1=0, ox2=0, ox3=0;
	
	for(int i=1; i<7; i++) {
		a=lotto1[i-1];
		b=lotto1[i];
		c=lotto1[i+1];
		if(((a==b)&&(b==c)&&(a==c))&&(a!=0)) {
			ox1++;
		}
	
	}
	if(ox1==1) {
		System.out.println("첫번째 로또 당첨");}
	else {
		System.out.println("첫번째 로또 꽝");
	}
	
	
	
	for(int j=1; j<7; j++) {
		a=lotto2[j-1];
		b=lotto2[j];
		c=lotto2[j+1];
		if(((a==b)&&(b==c)&&(a==c))&&(a!=0)) {
			ox2++;
		}
	
	}
	if(ox2==1) {
		System.out.println("두번째 로또 당첨");}
	else {
		System.out.println("두번째 로또 꽝");
	}
	
	
	
	for(int n=1; n<7; n++) {
		a=lotto3[n-1];
		b=lotto3[n];
		c=lotto3[n+1];
		if(((a==b)&&(b==c)&&(a==c))&&(a!=0)) {
			ox3++;
		}
	
	}
	if(ox3==1) {
		System.out.println("세번째 로또 당첨");}
	else {
		System.out.println("세번째 로또 꽝");
	}
}
}