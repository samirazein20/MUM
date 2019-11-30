package lab2.Prog2_2;

public class Square extends ClosedCurve {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	@Override
	public double computeArea() {
		return side * side;
	}


}
