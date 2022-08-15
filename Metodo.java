
package metodo;
import java.util.Scanner;

public class Metodo {

    
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Escolha a operacao: \n1. Soma \n2.Subtracao  \n3. Multiplicacao"
                + "\n4. Divisao");
        int opcao = r. nextInt();
        int n1; int n2;
        switch(opcao){
                
            case 1:
                System.out.println("Primeiro Numero: ");
                n1=r.nextInt();
                System.out.println("Segundo Numero: ");
                n2=r.nextInt();
                System.out.println("Resultado: "+somar(n1,n2));
                break;   
            
            case 2:
                System.out.println("Primeiro Numero: ");
                n1=r.nextInt();
                System.out.println("Segundo Numero: ");
                n2=r.nextInt();
                System.out.println("Resultado: "+subtrair(n1,n2));
                break;   
            
            case 3:
                System.out.println("Primeiro Numero: ");
                n1=r.nextInt();
                System.out.println("Segundo Numero: ");
                n2=r.nextInt();
                System.out.println("Resultado: "+multiplicar(n1,n2));
                break;
            
            case 4:
                System.out.println("Primeiro Numero: ");
                n1=r.nextInt();
                System.out.println("Segundo Numero: ");
                n2=r.nextInt();
                System.out.println("Resultado: "+dividir(n1,n2));
                break;
                
            default:
                System.out.println("Escolha invalida");
                break;
        }
        
    }
    
    
    //METODOS    
    public static int somar(int a, int b){
        int c=a+b;
        return c;
    }
    public static int subtrair(int a, int b){
        int c=a-b;
        return c;
    }
    public static int multiplicar(int a, int b){
        int c=a*b;
        return c;
    }
    public static float dividir(int a, int b){
        int c=a+b;
        return c;
    }
    
}
