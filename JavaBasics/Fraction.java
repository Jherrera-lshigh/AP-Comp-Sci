public class Fraction 
{

	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 1;
		denominator = 1;
	}

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction add(Fraction other) {
		int newNum = (numerator*other.denominator) + (numerator*other.denominator);
		int newDen = denominator*other.denominator;
		Fraction newFrac = new Fraction(newNum, newDen);
		toString(newFrac);
		return newFrac;
	}

	public void toString(Fraction fraction) 
	{
		System.out.println(fraction.numerator + "/" + fraction.denominator);
	}

	public static String fracMultiply( int one, int two, int three, int four){

		int Numerator = one * three;
		int Denominator = two * four;

		while (Denominator %2 ==0 && Numerator % 2 ==0)
		{
			Denominator /=2;
			Numerator /=2;
		}

		return Numerator + "/" + Denominator;
	}
}



  /*
    Challenge : create a simplify method
  */
