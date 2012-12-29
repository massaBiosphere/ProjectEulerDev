package massaBiosphere;

public class Ans014 {

	private long count;

	public void kick() {
		long maxCount = 0;
		long bestRecord = 0;
		for(int i=1;i<1000000;i++){
			count = 0;
			long target = (long) i;
			long tmp = countMax(target);
			if(tmp>maxCount){
				maxCount=tmp;
				bestRecord=i;
			}
		}
		System.out.println(bestRecord+":::has total:::"+maxCount);
	}

	private long countMax(long i) {
		count++;
		long result = count;
		if(i==1){
			return result;
		}else if(i%2==0){
			return countMax(i/2);
		}else{
			return countMax(3*i+1);
		}
	}
	
	

}
