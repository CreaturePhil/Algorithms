
public class Karatsuba {
	
	/**
	 * Returns product of num1 and num2.
	 * Gives running time of O(n^1.585) as opposed 
	 * to O(n^2) of "grade school" multiplication.
	 * This implementation only works for four-digit numbers.
	 */
	public long karatsuba(long num1, long num2) {
		if (num1 < 10 || num2 < 10) {
			return num1 * num2;
		}
		
		/* calculates the size of the numbers */
		double m = Math.round(Long.toString(num1).length());
		double m2 = m/2;
		
		/* split the digit sequences about the middle */
		long a = (long) (num1 / Math.pow(10, Math.round(m2)));
		long b = (long) (num1 % Math.pow(10, Math.round(m2)));
    long c = (long) (num2 / Math.pow(10, Math.round(m2)));
		long d = (long) (num2 % Math.pow(10, Math.round(m2)));

		/* 3 calls made to numbers approximately half the size */
		long z0 = karatsuba(a, c);
		long z1 = karatsuba(b, d);
		long z2 = karatsuba(a+b, c+d);

    return ((long) ((z0*Math.pow(10, Math.round(m)))+((z2-z1-z0)*Math.pow(10, Math.round(m2)))+z1));
	}

}
