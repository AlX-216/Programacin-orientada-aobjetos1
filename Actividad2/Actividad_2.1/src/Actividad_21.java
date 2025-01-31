public class Actividad_21 {
    public static void main(String[] args) {
        
        int tamaño = 50;
        int[] numerosPares = new int[tamaño]; 

        int numero = 2; 
        int indice = 0;

        while (numero <= 100) {
            numerosPares[indice] = numero;
            numero += 2;
            indice++;
        }

        System.out.println("Numeros pares del 2 al 100:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.print(numerosPares[i] + " ");
        }
    }
}