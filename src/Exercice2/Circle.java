package Exercice2;

public class Circle {   
	  
	private double rayon;
	private String couleur;

	public Circle () {
		rayon = 1.0;
		couleur = "rouge";
	}
	
	public Circle(double rayon) {
		this.rayon = rayon;
		couleur = "rouge";
	}
	
	public double getRadius() {
		return rayon;
	}
	
	public double getArea() {
		return rayon*rayon*Math.PI;
	}
	
	public Circle (double rayon, String couleur) {
		this.rayon = rayon;
		this.couleur = couleur;
	}
	
	public String getColor() {
		return couleur;
	}
	
	public void setRadius(double rayon) {
		   this.rayon = rayon;
		}
	
	public void setColor(String couleur) {
		this.couleur = couleur;
	}
}