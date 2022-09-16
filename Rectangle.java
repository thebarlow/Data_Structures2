/*(18 pts) Define a rectangle class that provides a getLength method 
and and a getWidth method.  Rectangle should also implement the 
Comparable class; it should compare by perimeter. Create another class 
called Problem1 that has the findMax routine (included below) and add a 
main method that creates an array of Rectangle objects and finds the 
largest Rectangle on the bases of its perimeter.*/

//Implements comparable interface to employ CompareTo Method.
public class Rectangle implements Comparable<Rectangle> {
	private int width,length;
	//Instantiates class with length and width properties.
	public Rectangle(int w,int l) {
		width=w;
		length=l;
	}
	public int getLength(){return length;}//returns length
	public int getWidth(){return width;}//returns width
	//Perimeter = 2*width + 2*length
	public int getPerimeter(){return 2*this.getLength()+2*this.getWidth();}

	//Overrides Comparable's compareTo method
	@Override
	public int compareTo(Rectangle o) {
		//If this Rectangle has a larger perimeter than specified rectangle, return 1.
		if( this.getPerimeter()>o.getPerimeter()){
			return 1;
		}
		//If this Rectangle has a smaller perimeter than specified rectangle, return -1.
		else if(this.getPerimeter()<o.getPerimeter()){
			return -1;
		}
		//If they have the same periemeter, return 0.
		return 0;
	}

}
