/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// package eddybeyond;
public class Main
{
    private static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }  
	public static void main(String[] args) {
	    String numero = "1234";
        String base = "325";
        boolean bandera1 = isNumeric(numero);
        boolean bandera2 = isNumeric(base);
        System.out.println(bandera1);
        System.out.println(bandera2);
        int elnumero;
        int labase;
        if (bandera1 == true && bandera2 == true) {
            elnumero = Integer.parseInt(numero);
            labase =Integer.parseInt(base);
            if (1 < labase && labase < 33) {
                System.out.println(convertir(elnumero,labase));
            } else if (labase < 1) {
                System.out.println("La base no puede ser menor a 1");
            }
            else if (labase > 32) {
                System.out.println("La base paso de su limite permitido -32");
            }
        } else if (bandera1 == false && bandera2 == true) {
            System.out.println("Operacion detenida, debido a que el numero contiene letras");
        }
        else if (bandera1 == true && bandera2 == false) {
            System.out.println("Operacion detenida, debido a que la base contiene letras");
        }
        else if (bandera1 == false && bandera2 == false) {
            System.out.println("Operacion detenida, debido a que ambos contienen letras");
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
