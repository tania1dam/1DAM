
package contarpalabrascadena;

import java.util.Scanner;

public class ContarPalabrasCadena {

   public static int contarPalabras(String cadena) {
    int palabras=0;
  
   if(cadena.length()!=0) 
   {
        palabras=1;
        for(int i=0;i<cadena.length();i++)
        {
            if(cadena.charAt(i)== ' ')
            {
                palabras++;
            }
        }
   } 
  
   return palabras;
}
        
    public static void main(String[] args) {
    
    String cadena;
            
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce la frase:");
    cadena=entrada.nextLine();
    
    System.out.println("El numero de palabras de la frase es: " +contarPalabras(cadena));

        
    }
}