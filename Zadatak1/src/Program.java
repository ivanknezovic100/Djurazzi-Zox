import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("Inputi: ");
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();//INPUT broj testova T
		Test[]testovi= new Test[T];
		for (int i = 0; i < T; i++) {
			
			int N = sc.nextInt();//INPUT N brojeva u nizu A
			
			int[] A = new int[N];
			for (int j = 0; j < N; j++) {
			A[j] = sc.nextInt();
			}
			testovi[i]=new Test(N,A);
			
		}
		sc.close();
		for (Test test : testovi) {
			System.out.println(test.Minimum());
		}
		
			
	}
		  	  	    
}  	      
	  
	class Test{
	    private int N;
	    private int[] niz;
	    
	    public int Minimum(){
	        int i=0;
	        int min=10000000;
	        for(int j=0;j<niz.length;j++){
	            if((prefiksSuma(j)+sufiksSuma(j))<min){
	            min=prefiksSuma(j)+sufiksSuma(j);
	            i=j;    
	            }
	        }
	        return i;
	    }
	        
	    
	    public int prefiksSuma(int i){
	        int x=0;
	        for(int j=0; j<i; j++){
	        x=x+niz[j];
	        }
	        return x;
	    }
	    public int sufiksSuma(int i){
	    	int x=0;
	    	int counter=1;
	        for(int j=niz.length-1; j>=0; j--){
	        	x = x + niz[j];
				counter++;
				if (counter>(N-i+1)) {
					break;
				}
	        
	        }
	        return x;
	    	
	    }
	        
	    	    
	    public Test(int N, int[] niz){
	        this.N=N;
	        this.niz=niz;
	    }

	}
