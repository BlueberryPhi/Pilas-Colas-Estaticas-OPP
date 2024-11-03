/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MyStack {
 char stack[]=new char[10];
 int top=0;
 int MAX=10;
 char data;
 
public char pop()
{
if(top == 0)
    {   
    System.out.println("Stack is empty");
    return '#';
    }
else {

top--;/* decreases top */
//System.out.println("Elemento: "+stack[top]);
//System.out.println("Posicion: "+top);
return stack[top]; /*returns eliminated element*/

}

}


public void push(char data)
{
    if(top == MAX)
    System.out.println("Stack is full");
    else {
    stack[top] = data; /* agrega un elemento*/
   
    //System.out.println("Elemento: "+stack[top]);
    //System.out.println("Posicion:"+top);
     top++; /* incrementa el valor de top */
}
}

public void ConvPilaCadena(String cadena){
    for(int i=0;i<cadena.length();i++){
    push(cadena.charAt(i));
}

}

public void PopearTodo(String cadena){
    do{System.out.println(pop());  
if(top==0)
    break;
}
while(top>=0);
}


 public String invertir(String cadena) {
       for (int i = 0; i < cadena.length(); i++) {
            if (top < MAX) {  
                push(cadena.charAt(i));
            } else {
                System.out.println("No se puede agregar más caracteres, stack lleno.");
                break; 
            }
    }
 
StringBuilder cadenaInvertida = new StringBuilder();
        while (top > 0) {
            cadenaInvertida.append(pop());
        }
        return cadenaInvertida.toString();
    }
  
    
     public void palindromo(String cadena) {
       String procesada = cadena.toLowerCase().replace(" ", "");

       String invertida = invertir(procesada);

       if (procesada.equals(invertida)) {
            System.out.println("Sí es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
       }
    }
    

