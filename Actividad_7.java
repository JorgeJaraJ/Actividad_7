/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner; 

/**
 *
 * @author jorgejarajuarez
 */
public class Actividad_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Aplicación de arreglos de números primos
        System.out.println("AQUÍ EMPIEZA LA PRIMERA PARTE DE LA ACTIVIDAD");
        int [] primos = new int[100];
        int contador;
        System.out.println(" Los números primos son los siguientes: 1");
        for(int i =0; i < 100; i++){
            primos [i] = i;
            contador =0;
            for(int j = 1; j <primos.length; j++){
                if (primos[i]%j==0){
                    contador++;
                }
            }
            if(contador==2){
              
                System.out.println(primos[i]);
            }
        }
        
        // Aquí empieza la serie Fibonacci
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("AQUÍ EMPIEZA LA PARTE 2 DE LA ACTIVIDAD");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        int n = sc.nextInt();
        int[] a = fibonacci(n);
        System.out.println("Fibonacci: ");
        for (int valor : a){
            System.out.println(" " + valor);
        }
        System.out.println();
    }
    public static int [] fibonacci(int n){
        int[] r = new int[n];
        r[0] = 1;
        r[1] = 1;
        for (int i=2; i<r.length; i++){
            r[i] = r[i -1] + r[i - 2];
        }
        return r;
    }
}
