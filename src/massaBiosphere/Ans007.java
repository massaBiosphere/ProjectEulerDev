package massaBiosphere;

public class Ans007 {

	public void kick() {
		int result = getPrime(10001);
		System.out.println(result);
	}
	
	public int getPrime(int num) {
		int arr = 0;
		int primes[] = new int[num];
        primes[arr++] = 2;
        for (int x = 3;arr < num; x += 2)
        {
            int i = 0;
            while (i < arr && x % primes[i] != 0) i++;
            if (i == arr) primes[arr++] = x;
        }
        return primes[num-1];
	}
	
}
