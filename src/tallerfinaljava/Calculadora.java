
package tallerfinaljava;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    private boolean bandera = true;
    private double resultado;
    private double numero;
    private char operacion;
    Scanner input = new Scanner(System.in);
    public void Calcular()throws IOException {
            bandera=true;
            resultado = mensaje1();
        do {
            operacion = operacion();            
            
            bandera = evaluarOpcion(operacion);
        } while (bandera == true);
    }
    
    private boolean evaluarOpcion(char operacion) throws IOException {
        switch (operacion) {
            case '+':
                numero = mensaje2();
                resultado = resultado + numero;
                return true;
            case '-':
                numero = mensaje2();
                resultado = resultado - numero;
                return true;
            case '*':
                numero = mensaje2();
                resultado = resultado * numero;
                return true;
            case '/':
                numero = mensaje2();
                if(numero==0){
                    System.out.println("Es imposible dividir entre cero");
                    return true;
                }else{
                    resultado = resultado / numero;
                    return true;
                }
            case '%':
                numero = mensaje2();
                if(numero==0){
                    System.out.println("Es imposible realizar el modulo con respecto a cero");
                    return true;
                }else{
                    resultado = resultado % numero;
                    return true;
                }
            case '=':
                System.out.println(resultado);
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }
    private double mensaje1() {
        System.out.println("Ingrese por favor el numero, luego el signo de la operacion y luego el siguiente numero. Puede ingresar cuantos numeros desee  (no utilice espacios)");
        System.out.println("Para ver el resultado de toda la operacion, ingrese el signo igual");
        return input.nextDouble();
    }

    private char operacion() {
        return input.next().charAt(0);
    }

    private double mensaje2() {
        return input.nextDouble();
    }

}
