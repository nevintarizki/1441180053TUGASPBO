class circle {
	private double radius;
	private String color;

	public void setColor(String c){
		color = c;
	}
	public void setRadius(double r){
		radius = r;
	}

	public circle() 	// konstruktor
	{

		radius = 1.0;
		color ="pink";
	}

	public circle(double r){

		radius = r;
		color = "pink";
	}
	
	public circle(double r, String c){

		radius = r;
		color = c;
	}	

	public double getRadius(){

		return radius;
	}

	public String getColor(){

		return color;
	}

	public double getArea(){

		return radius*radius*Math.PI;
	}
}