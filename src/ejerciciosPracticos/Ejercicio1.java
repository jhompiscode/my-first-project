package ejerciciosPracticos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println();
        Scanner teclado = new Scanner(System.in);

        int contador_consecutivo = 0;
        double temperatura = 0.0;

        while (true) {

            System.out.println("Ingrese la temperatura: ");
            temperatura = teclado.nextDouble();

            if (temperatura > 100) {
                contador_consecutivo += 1;
                System.out.println("--- Alerta #" + contador_consecutivo + ". Temperatura Alta ---");
                
                if(contador_consecutivo == 3){
                    break;
                }
            } else {
                contador_consecutivo = 0;
                System.out.println("Bajando alertas. No hay peligro");
            }
        }
        System.out.println("--- Por su seguridad, salga del laboratorio. ---");
        teclado.close();
    }
}