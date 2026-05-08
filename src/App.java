public class App {
    
    static String nombre_estudiante = "Pablo";
    static int edad = 15;
    static float peso = 72.0f;
    static boolean activo = true;
    static String texto_activo = "";
    
    public static void main(String[] args) {
        if (activo) {
            texto_activo = "Sí";
        }
        else{
            texto_activo = "No";
        }
        System.out.printf("Hola, %s, tienes %d años y pesas %.2f kilos", nombre_estudiante, edad, peso);
        System.out.println("");
        System.out.println("Estudiante activo: " + texto_activo);
    }
}

//clase {
//Variables importantes -> tipo de dato + nombre + inicializcion + valor inicial
//  metodo { -> psvm tab
//      instrucciones; (-> sout tab)
//      instrucciones;
//  }
//}


//VISIBILIDAD
//public: todas las clases y paquetes (+)
//protected: decide que clases y paquetes (#)
//privada: nadie accede (-)

//METODO
//Visibilidad + tipo de clase + 