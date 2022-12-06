
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
}

/*
    Create a multiply method for fractions
  */

  /*
    Challenge : create a simplify method
  */
