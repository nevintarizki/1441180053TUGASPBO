public class TestCircle{
	public static void main(String[] args) {
		
		circle cahya = new circle();
		circle dyah = new circle(5);
		circle vintul = new circle(4,"jelek");

		cahya.setColor("yeyyyy");
		System.out.println("Radius = "+ cahya.getRadius() + "Color = " +cahya.getColor() + "Luas = " +cahya.getArea());
		System.out.println("Radius = "+ dyah.getRadius() + "Color = " +dyah.getColor() + "Luas = " +dyah.getArea());
		System.out.println("Radius = "+ vintul.getRadius() + "Color = " +vintul.getColor() + "Luas = " +vintul.getArea());
	}
}