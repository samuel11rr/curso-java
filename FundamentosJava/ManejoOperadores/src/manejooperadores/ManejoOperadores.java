package manejooperadores;

public class ManejoOperadores {

    public static void main(String[] args) {
        
        System.out.println("Operadores aritmeticos");
        
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        
        System.out.println("\nOperador Módulo (residuo)");
        System.out.println("x % 2 = " + a % 2);
        
        
        System.out.println("\nOperador Compuesto");
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        
        System.out.println("\nOperador de Incremento");
        a++;
        System.out.println("a = " + a);
        
        
        System.out.println("\nOperador de Decremento");
        c = ++a;
        d = b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        
        System.out.println("\n Operador relacional: ");
        boolean res = a<b;
        System.out.println("res: "+ res);
        
        
        System.out.println("\nOperador Ternario");
        int min = (a<b) ? a : b;
        System.out.println("min: " + min);
        
        
        System.out.println("\nOperador de Asignación");
        int i,j,k;
        i=j=k=100;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
    
}
