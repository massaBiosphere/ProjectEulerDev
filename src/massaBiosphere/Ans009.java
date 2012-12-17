package massaBiosphere;

public class Ans009 {

	public void kick() {
		for(int i=1;i<1000;i++){
			for(int j=i+1;j<1000;j++){
				if(checkPytagorus(i,j)){
					System.out.println(i*j*(1000-i-j));
				}
			}
		}
	}

	public boolean checkPytagorus(int a,int b){
		int c=1000-a-b;
		int a2=a*a;
		int b2=b*b;
		int c2=c*c;
		if (c2==a2+b2) return true;
		else return false;
	}

}
