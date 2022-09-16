public class Problem3 {
	public static void set1(int n){
		int sum = 0;
		for ( int i = 0; i < 23; i ++)
		    for ( int j = 0; j < n ; j ++)
		        sum = sum + 1;
		//System.out.println("sum is: "+sum);
	}
	public static void set2(int n){
		int sum = 0;
		for ( int i = 0; i < n ; i ++)
		    for ( int k = i ; k < n ; k ++)
		        sum = sum + 1;
		//System.out.println("sum is: "+sum);
	}

	public static int foo(int n, int k) {
	    if(n<=k)
	        return 1;
	    else
	        return foo(n/k,k) + 1;
	}
	public static void main(String[] args){
		 int[] narr={1000,10000,20000,50000,100000,150000};
		 for(int i=0; i<narr.length;i++){
			 System.out.println("For n= "+narr[i]);
			 long starTime = System.currentTimeMillis();
			 set1(narr[i]);
			 long endTime = System.currentTimeMillis();
			 System.out.println("Run time for set1 is: "+(endTime-starTime));
			 
			 long starTime2 = System.currentTimeMillis();
			 set2(narr[i]);
			 long endTime2 = System.currentTimeMillis();
			 System.out.println("Run time for set2 is: "+(endTime2-starTime2));
			 
			 int k=2;
			 long starTime3 = System.currentTimeMillis();
			 foo(narr[i],k);
			 long endTime3 = System.currentTimeMillis();
			 System.out.println("Run time for set3 is: "+(endTime3-starTime3));
			 
			 System.out.println("");
		 }
	}
}
