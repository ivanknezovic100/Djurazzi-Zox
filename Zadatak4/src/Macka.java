
public class Macka {
	public static int K;
    private int duzina;
    public int GetDuzina(){
        return this.duzina;
    }
    
    int jediMacku(Macka macka){
        if (this.duzina>=macka.duzina && this.duzina<K
            && macka.duzina<K && macka.duzina != 0){
            this.duzina+=1;
            macka.duzina=0;
        }
            return this.duzina;
        
    }
    
    public Macka(int duzina){
        this.duzina=duzina;
    }
}
