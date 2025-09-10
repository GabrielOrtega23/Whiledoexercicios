/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemnumeros;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ContagemNumeros {

    public static void main(String[] args) {
         // Criar Scanner (mesmo que aqui não seja usado para leitura do usuário, mantemos por padrão)
        Scanner sc = new Scanner(System.in);

        // Variável que começa em 100
        int numero = 100;

        // Contador para saber quantos números foram exibidos
        int contador = 0;

        // Estrutura do...while
        System.out.println("Números entre 100 e 125:");
        do {
            // Mostra o número atual
            System.out.print(numero + " ");

            // Incrementa o contador
            contador++;

            // Passa para o próximo número
            numero++;
        } while (numero <= 125); // repete até chegar em 125

        // Exibe a quantidade total de números
        System.out.println("\nQuantidade total de números: " + contador);

        // Fecha o Scanner
        sc.close();
    }
}
    
