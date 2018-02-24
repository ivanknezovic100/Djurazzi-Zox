import java.util.Scanner;

public class Program {
	public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Inputi: ");
        int T=sc.nextInt(); //Broj testova(INPUT!)
        for(int test=0;test<T;test++){ //petlja za svaki test
             
            int N=sc.nextInt(); //Broja macaka(INPUT!)
            int Q=sc.nextInt(); //Broj upita(INPUT!)
            for (int i = 0; i < Q; i++) {
				String str = sc.nextLine();
				String[] splited = str.split(" ");
				Integer[] L = new Integer[N];
				int j =0;
				for (String strng : splited) {
					L[j]=Integer.parseInt(strng);
					j++;
				}
				//for (int j = 0; j < N; j++) {
				//	L[j] = Integer.parseInt(splited[j]);
					
				//}
				
				
				
			}
            
            
            
            
        } 
                    
         
    }

}
