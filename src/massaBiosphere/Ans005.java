package massaBiosphere;

public class Ans005 {
	public void kick() {
		int i = 1;
        int j = 1;
        while(true){
            if(check(i, j)){
                i++;
            }else{
                i=1;
                j++;
            }
            if(i == 20) break;   
        	}
        System.out.println(j);
    	}
	
    public boolean check(int a, int b){
        if(b % a == 0)
            return true;
        return false;   
    }
}