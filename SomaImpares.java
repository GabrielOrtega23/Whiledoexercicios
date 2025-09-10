/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaimpares;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class SomaImpares {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Ler o valor inicial e o valor final
        System.out.print("Digite o valor inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = sc.nextInt();

        // Variável para acumular a soma dos números ímpares
        int soma = 0;

        // Variável de controle que começa no valor inicial
        int numero = inicio;

        // Estrutura do...while para percorrer do início até o fim
        do {
            // Verifica se o número é ímpar
            if (numero % 2 != 0) {
                soma += numero; // soma se for ímpar
            }

            // Avança para o próximo número
            numero++;
        } while (numero <= fim); // repete até chegar no valor final

        // Exibe o resultado
        System.out.println("A soma dos números ímpares entre " + inicio + " e " + fim + " é: " + soma);

        sc.close();
    }
}
    
