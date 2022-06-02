import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    private static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe) {
    		return false;
    	}
    }  
	public static void main(String[] args) {
	    String numero = "4544";
        String base = "3.2";
        boolean bandera1 = isNumeric(numero);
        boolean bandera2 = isNumeric(base);
        int elnumero;
        int labase;
        int largonumero = numero.length();
        int largobase = base.length();
        if (bandera1 == true && bandera2 == true) {
            elnumero = Integer.parseInt(numero);
            labase =Integer.parseInt(base);
            if (1 < labase && labase < 33) {
                if (elnumero < 0) {
                    int numeropositivo = elnumero * -1;
                    System.out.println("-" + convertir(numeropositivo,labase));
                } else {
                    System.out.println(convertir(elnumero,labase));
                }
            } else if (labase < 1) {
                System.out.println("La base no puede ser menor a 1");
            }
            else if (labase > 32) {
                System.out.println("La base paso de su limite permitido -32");
            }
        } else if (bandera1 == false && bandera2 == true) {
            if (largonumero > 0) {
                System.out.println("Operacion detenida, debido a que el numero contiene letras o caracteres");
                if (numero.contains(".")) {
    	            System.out.println("No es posible procesar decimales, solo enteros");
    	        }
            } else {
                System.out.println("Operacion detenida, no hay dato en numero");
            }
        }
        else if (bandera1 == true && bandera2 == false) {
            if (largobase > 0) {
                System.out.println("Operacion detenida, debido a que la base contiene letras o caracteres");
                if (numero.contains(".")) {
    	            System.out.println("No hay bases decimales, solo enteros");
    	        }
            } else {
                System.out.println("Operacion detenida, no hay dato en base");
            }
        }
        else if (bandera1 == false && bandera2 == false) {
            if (largonumero > 0 && largobase > 0) {
            System.out.println("Operacion detenida, debido a que ambos contienen letras o caracteres");
            } else if (largonumero == 0 && largobase > 0) {
                System.out.println("Operacion detenida, no hay dato en numero");
            } else if (largonumero > 0 && largobase == 0) {
                System.out.println("Operacion detenida, no hay dato en base");
            } else if (largonumero == 0 && largobase == 0) {
                System.out.println("Operacion detenida, no hay dato en ambos");
            }
        }
	}
	private static String convertir(int n, int b){
        String salida = "";
        int div=n, mod=0;
        while(n>=b){
            div = n / b;
            mod = n % b; 
            salida = charAt(mod) + salida;
            n=div;
        }
        if(div > 0)
            salida = charAt(div) + salida;
        return salida;
    }
    private static String charAt(int pos){
        return String.valueOf("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(pos));
    }
}
