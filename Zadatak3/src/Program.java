import java.util.Scanner;

public class Program {
	
 public static void main(String []args){
         
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Inputi: ");
         int T = sc.nextInt();
         int N = sc.nextInt();
         int M = sc.nextInt();
         int[] niz = new int[N];
         for (int i = 0; i < N; i++) {
			niz[i]=sc.nextInt();
		}
         for (int i = 0; i < N; i++) {
        	 System.out.println(niz[i]);
 		}
         
         
         
         int x=0;
         boolean jelPostoji=false;
         for(int i=0;i<niz.length;i++){
             for(int j=0;j<niz.length;j++){
                 if(i!=j){
                 x=niz[i]+niz[j];
                    if(x==M){
                    jelPostoji = true;
                    }
                 }    
             }
         }
         
        System.out.println(jelPostoji);
     }

}
