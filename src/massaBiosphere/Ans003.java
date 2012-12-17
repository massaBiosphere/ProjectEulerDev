package massaBiosphere;

public class Ans003 {

	public void kick() {
		long target = 600851475143L;
		int count = 2;
		int max =0;
		for(count =2;count<=target;count++){
			if(target%count==0){
				max = count;
				target /= count;
				count--;
			}
		}
		System.out.println(max);
	}
}
