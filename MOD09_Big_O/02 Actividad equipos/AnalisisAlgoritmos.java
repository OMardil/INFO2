public class AnalisisAlgoritmos {
    
    public static final int CANTIDAD_ELEMENTOS = 100;


    public static void main(String[] args) {
        
        int[] x = new int[CANTIDAD_ELEMENTOS];
        
        long tiempoInicial = System.nanoTime();
        
        for(int i = 0; i<x.length; i++) {
			x = new int[CANTIDAD_ELEMENTOS];        
		}        
                
        long tiempoFinal = System.nanoTime();
        
        System.out.println((tiempoFinal - tiempoInicial) * Math.pow(10,-9));               
            
    }
        
}
