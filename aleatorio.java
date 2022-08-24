
package dmg;
/*Construa um programa que gere aleatoriamente N valores inteiros no intervalo de [–100, 100[ sendo o valor de N dado pelo utilizador.
O programa deverá contar quantos valores gerados são positivos e quantos são negativos.*/
import java.util.Scanner;
public class Dmg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o tamanho de número a gerar");
        int nrs =sc.nextInt();
        int neg=0; int pos=0;
        System.out.println("-----");
        while(nrs>0){ 
       int result=(int) (Math.random() * 200-100);
        System.out.println(result);
        nrs--;
        if(result>0){
        pos++;}
        else{
        neg++;}
      
      
        }
        System.out.println("============");
        System.out.println(" Negativos: "+neg+"\n Positivos: "+pos);
        }
    
}
