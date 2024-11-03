
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//import java.util.Stack;
/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
MyStack pila1=new MyStack();
System.out.println("Pila basica");
int continuar=1;
String cadena;

/*do{
  System.out.println("Ingresa elemento (char): ");
char elemento=scan.next().charAt(0);
pila1.push(elemento);
//System.out.println(pila1.pop());  

System.out.println("Continuar (1 Si) (2 No)? ");
continuar=scan.nextInt();
}
while(continuar==1);

do{System.out.println(pila1.pop());  
}
while(pila1.top>=0);
*/

System.out.println("Inserta cadena");
cadena=scan.next();
pila1.ConvPilaCadena(cadena);
System.out.println(pila1.invertir(cadena));
pila1.palindromo(cadena);

     }
}
    

