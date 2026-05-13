public class Persona {
    //declarar variables con atributos comunes
    static String nombre_persona = "";
    static String apellidos_persona = "";
    static int edad = 0;
    static char genero = 'M';
    static float promedio = 4.7f;
    static boolean vivo_manizales = true;
 
    // metodos adicionales -> (def de python)
    static void mostrarNombre(){
        System.out.println("INFORMACIÓN DEL ESTUDIANTE");
        System.out.println(" ");
        System.out.printf("Nombre completo: %s %s", nombre_persona, apellidos_persona);
        System.out.print("\n");
    }

    static void mostrarEdad(){
        System.out.println("Edad: " + edad);
    }
    static void mostrarProm(){
        System.out.println("Promedio: " + promedio);
    }

    static void vivirManizales(){
        if (vivo_manizales == true) {
            System.out.println("Si vive en Manizales");
        } else {
            System.out.println("No vive en Manizales");
        }
    }

    static void mostrarGenero(){
        if (genero == 'M'){
            System.out.println("Masculino");
        }else if (genero == 'F'){
            System.out.println("Femenino");
        }
        else{
            System.out.println("No binario");
        }
    }
    public static void main(String[] args) {
        mostrarNombre(); //Llamar metodo de mostrar información
        mostrarEdad();
        mostrarProm();
        vivirManizales();
        mostrarGenero();
    }
}
