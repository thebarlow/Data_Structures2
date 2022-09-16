import java.util.Arrays;
public class Problem2 {
	public static <AnyType extends Comparable<AnyType>>int binarySearch(AnyType[] a, AnyType x){
		int upper=a.length-1;
		int lower=0;
		while(upper>=lower){
			int index=(upper+lower)/2;
			if(a[index].compareTo(x)==0){
				return 1;
			}
			else if(a[index].compareTo(x)==1){ //a[index] has a greater perimeter than x
				return binarySearch(Arrays.copyOfRange(a, lower, index),x);
			}
			else if(a[index].compareTo(x)==-1){
				return binarySearch(Arrays.copyOfRange(a, index+1, upper+1),x);
			}
		}
		return 0;
		
	}
	public static void main(String[] args){
		Rectangle rec1=new Rectangle(1,1);
		Rectangle rec2=new Rectangle(2,2);
		Rectangle rec3=new Rectangle(3,3);
		Rectangle rec4=new Rectangle(4,4);
		Rectangle rec5=new Rectangle(5,5);
		
		Rectangle[] arr={rec1,rec2,rec3,rec4};
		Arrays.sort(arr);
		System.out.println(binarySearch(arr,rec5));
		
	}
}
