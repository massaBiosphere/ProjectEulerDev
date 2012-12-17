package massaBiosphere;

public class Ans004 {

	public void kick() {
			int a=100;
			int b=100;
			int result = 0;
			int max = 0;
			for(a=100;a<1000;a++){
				for(b=100;b<1000;b++){
					result = a*b;
					if(check(result)){
						if(max<result){
						max = result;
						}
					}	
				}
			}
			System.out.println(max);
	}
	public boolean check(int num){
		int num2 = 0;
		String str = String.valueOf(num);
		int length = str.length();
		String ret = "";
		for(int i = length - 1; i >= 0; i--) {
			ret += str.charAt(i);
		}
		num2 = Integer.parseInt(ret);
		if(num==num2){
		return true;
		}else return false;
	}
}
