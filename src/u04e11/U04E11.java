
package u04e11;

import java.util.Scanner;
public class U04E11 {

    public static void main(String[] args) {
        int ladoA, ladoB, ladoC;
        Scanner entrada = new Scanner(System.in);
        String mensaje= "El triangulo es ";
        do{
            System.out.print("Ingrese el primer lado del triangulo: ");
            ladoA = entrada.nextInt();
            System.out.print("Ingrese el segundo lado del triangulo: ");
            ladoB = entrada.nextInt();
            System.out.print("Ingrese el tercer lado del triangulo: ");
            ladoC = entrada.nextInt();
        }
            while (((ladoA+ladoB<=ladoC)||(ladoA+ladoC<=ladoB))||(ladoC+ladoB<=ladoA));
            if ((ladoA==ladoB)&&(ladoB==ladoC)){
                System.out.print(mensaje+"equilatero");
            }
            else{
                    if(((ladoA==ladoB)||(ladoB==ladoC))||(ladoA==ladoC)){
                        System.out.print(mensaje+"isoceles");
                    }
                    else{
                System.out.print(mensaje+"escaleno");
                    }
            }
    }
}
