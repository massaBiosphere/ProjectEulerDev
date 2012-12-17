package massaBiosphere;

public class Ans002 {
	public void kick() {
		int a =1;
		int b =1;
		int c = a+b;
		int total = 0;
		while(c < 4000000){
			if(c %2 == 0){
			total += c;
			}
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println(total);
	}
}
