package massaBiosphere;

public class Ans010 {

	public void kick() {
		int array[] = new int[2000000];
		array = makePrime(2000000);
		long ans = 0l;
        int i = 0;
        while(true){
            ans += array[i];
            i++;
            if(array[i] > 2000000)
                break;   
        }   
        System.out.println("" + ans);
    }

	public int[] makePrime(int num) {
		int arr = 0;
		int primes[] = new int[num];
        primes[arr++] = 2;
        for (int x = 3;arr < num; x += 2)
        {
            int i = 0;
            while (i < arr && x % primes[i] != 0) i++;
            if (i == arr) primes[arr++] = x;
            System.out.println(arr);
        }
        return primes;
	}
	
}
