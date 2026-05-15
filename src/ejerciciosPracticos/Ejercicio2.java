package ejerciciosPracticos;

public class Ejercicio2 {
    /* for (1, 50)
    si num % 3 == 0 acumularse en variable s3
    si num % 5 == 0 acumularse en variable s5
    si num % 3 && num % 5 == 0 unicamente añadirse a sambos */
    public static void main(String[] args) {
        
        int S3 = 0;
        int S5 = 0;
        int SAmbos = 0;

        for(int num = 1; num < 51; num++){
            if (num % 3 == 0 && num % 5 == 0){
                SAmbos += num;
            } else if(num % 3 == 0){
                S3 += num;
            } else if (num % 5 == 0){
                S5 += num;
            } else{
                System.out.println("Número " + num + " no cumple ninguna condición");
            }
        }
        System.out.println("La suma de los números divisibles entre 3 = " + S3);
        System.out.println("La suma de los números divisibles entre 5 = " + S5);
        System.out.println("La suma de los números divisibles entre ambos = " + SAmbos);
    }
}
