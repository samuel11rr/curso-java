package precedenciaoperadores;
public class PrecedenciaOperadores {
    public static void main(String[] args) {
        System.out.println("Ejemplo 1");
        
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("\nEvaluacion");
        System.out.println( 4 + 5 * 6 / 3);
        System.out.println( (4+5) * (6/3) );
        
        System.out.println("\nOtros ejemplos de evaluacion");
        System.out.println( 1+2-3*4/5 );
        System.out.println( 1 + 2 - (3 * (4/5)) );
        
        System.out.println("1 + 2 = " + 1+2);
        System.out.println("(1+2) = " + (1+2));
        System.out.println(1+2 + "abc");
        
    }
    
}
