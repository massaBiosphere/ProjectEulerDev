package massaBiosphere;

public class Ans012 {

	public void kick() {
		int tmp;
        for(int i = 0; ; ++i){
            tmp = triangle(i);
            if(count(tmp) > 500){
                System.out.println(tmp);
                break;
            }
        }       
    }
	
    static int triangle(int i){
        return (1+i)*i/2;
    }

    static int count(int num){
        int count = 0;
        for(int i = 1; i*i < num; ++i) {
            if(num % i == 0){
                ++count;
            }
        }
        return count*2;
    }

}
