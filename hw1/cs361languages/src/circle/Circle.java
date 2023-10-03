/**
 * 
 */
package cs361languages.src.circle;

/**
 * @author Pride Y.
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() { }
	
	public Circle(double centerX, double centerY, double radius, int windowNumber) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.windowNumber = windowNumber;
	}
	
	public Circle(double centerX, double centerY, double radius) {
		this(centerX, centerY, radius, 0);
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
		this.centerX = newX;
		this.centerY = newY;
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "Circle: centerX = " + this.centerX + " centerY = " + this.centerY + " radius = " + this.radius;
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		Circle circle2 = (Circle) obj;
		// Not good practice because of floating point, but should be fine in this assignment
		return this.centerX == circle2.centerX && this.centerY == circle2.centerY && this.radius == circle2.radius;
	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Circle(this.centerX, this.centerY, this.radius, this.windowNumber);
	}

}
