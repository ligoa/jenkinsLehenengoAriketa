package examRecu;

public class examMock {
	
	public double add (double a, double b) {
		return a+b;
	}
	
	public double subtract (double a, double b) {
		return a-b;
	}
	
	public double multiply (double d, double e) {
		//Under development
		return 100;
	}
	
	public double divide (double a, double b) {
		//Under development
		return 100;
	}
	
	public double sphereVolume(double r) {
		double volume = multiply(4.0, 3.14);
		volume = multiply(volume, r*r*r);
		return divide(volume, 3.0);
	}

}
