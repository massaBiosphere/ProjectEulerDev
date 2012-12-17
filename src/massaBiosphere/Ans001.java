package massaBiosphere;

public class Ans001 {

	public void kick() {
		int total = 0;
		for(int count=1;count<1000;count++){
			if(count%3 == 0){
				total += count; 
			}if(count%5 ==0){
				total += count;
			}if(count%15 == 0){
				total -= count;
			}
		}
		System.out.println(total);
	}
}
