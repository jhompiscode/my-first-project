
public class Vehiculo {

    /* COMENTARIOS MULTILINEA
    Atributos: Marca, velocidad, encendido
    Metodos: encender(), apagar(), frenar(), acelerar(), mostrarEstado() 
     */
    static String marca = "Kia";
    static int velocidad = 100;
    static boolean encendido = false;

    static void encender() {
        if (encendido == true && velocidad > 0) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");

        }
    }

    static void apagar() {
        if (encendido == false) {
            System.out.println("El vehiculo ya está apagado");
        } else {
            System.out.println("Vehículo en movimiento");
        }
    }

    static void acelerar(){
        if (encendido == true){
            velocidad = velocidad + 10;
        } else {
            velocidad = 0;
        }
        System.out.println("Velocidad: " + velocidad + "Km/h");
    }

    public static void main(String[] args) {
        encender();
        apagar();
        acelerar();
    }
}
