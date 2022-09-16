
public class Problem1 {

	public Problem1() {
		// TODO Auto-generated constructor stub
	}
	public static<AnyType extends Comparable<AnyType>>AnyType findMax(AnyType[] arr) {
		  int maxIndex = 0;
		  for (int i = 1; i < arr.length; i++)
		    if ( arr[i].compareTo(arr[maxIndex]) > 0 )
		       maxIndex = i;
		    return arr[maxIndex];
	}
	public static void main(String args[]){
		//Creates several new Rectangle objects.
		Rectangle Rectangle1=new Rectangle(1,1);
		Rectangle Rectangle2=new Rectangle(2,2);
		Rectangle Rectangle3=new Rectangle(3,3);
		Rectangle Rectangle4=new Rectangle(4,4);
		//puts all rectangles in an array.
		Rectangle[] arr={Rectangle2,Rectangle3,Rectangle1,Rectangle4};
		
		//Uses provided findMax function.
		Rectangle max=findMax(arr);
		//Finds and prints which rectangle was the largest
		int dimensions=(max.getPerimeter()/4);
		System.out.println("The largest rectangle is Rectangle "+dimensions);
		
	}
}
