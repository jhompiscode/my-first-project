public class CiclosContinue {
    public static void main(String[] args) {
        System.out.println("--- Envío material de clase ---");
        for (int estudiante = 1; estudiante < 17; estudiante++) {
            if (estudiante == 11){
                System.out.println("Estudiante #" + estudiante + " - Asignatura perdida");
                continue;
            }
        System.out.println("Estudiante #" +  estudiante + " - ENVIADO");
        }
    System.out.println("--- Material enviado a todos los estudiantes activos ---");
    }
}
