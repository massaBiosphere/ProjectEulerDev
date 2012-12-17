package massaBiosphere;

public class Ans006 {

	public void kick() {
		int max = 100;
		int result = wanonijou(max)-nijouwa(max);
		System.out.println(result);
	}
	
	public int nijouwa(int num){
		int njw = 0;
		for(int i=1;i<num+1;i++){
			njw += i*i;
		}
		return njw;
	}
	
	public int wanonijou(int num){
		int wnj = 0;
		for(int j=1;j<num+1;j++){
			wnj += j;
		}
		wnj *= wnj; 
		return wnj;
	}
	
}
