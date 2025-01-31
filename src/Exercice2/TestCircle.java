package Exercice2;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle ();
		System.out.println("le cercle est de " + c1.getRadius() + 
				" et de surface " + c1.getArea());
		
		Circle c2 = new Circle (2.0);
		System.out.println("le cercle est de " + c2.getRadius() + 
				" et de surface " + c2.getArea());
		
		Circle c3 = new Circle (3.0);
		System.out.println("le cercle est de " + c3.getRadius() + 
				" et de surface " + c3.getArea());
		System.out.println("la couleur de ce cercle est " + c3.getColor());
		
		Circle c4 = new Circle(4.0);
		c4.setRadius(10.0);
		c4.setColor("rose");
		System.out.println("la couleur du cercle est " + c4.getColor());
	}
}