package gt.edu.url.examen1.api;

public class ChudnovskyTry implements Chudnovsky {

	
	public double calcularPi(int k) {
		if ( k == 0 ) { return doCalc( k ); }

        return doCalc( k ) + calcularPi( k - 1 );
	}
     public double doCalc( int k ) {
	        double numerator = Math.pow( -1, k ) * factorial( 6 * k ) * ( 545140134 * k + 13591409 );
	        double denominator = factorial( 3 * k ) * Math.pow( factorial( k ), 3 ) * Math.pow( 640320, 3 * k + 3.0 / 2.0 );
	        return 12.0 * numerator / denominator;
	    }

	 public double factorial( int n ) {
	        if ( n == 0 ) {
	            return 1;
	        } else {
	            return n * factorial( n - 1 );
	        }
	    }


}
