
public class CiclosConBreak {
    //encontrar archivo malicioso (archivos 1-10)
    public static void main(String[] args) {
        System.out.println("--- Iniciando escaneo de seguridad ---");
        //for(int variable = num_inicial; variable < num_final; variable + 1){}
        for (int archivos = 1; archivos <= 10; archivos++) {
            if(archivos == 4){
                System.out.println("Alerta. Archivo corrupto.\nArchivo #"+archivos);
                break;
            }
        System.out.println("Archivo #"+archivos+" - Escaneado");
        }
    System.out.println("--- Escaneo Finalizado ---");
    }
}
