/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares;
import java.util.Scanner;
/**
 *
 * @author support
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Numerospares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 2; //Começa com dois pois é o primeiro número par

            System.out.println("Números pares entre 1 e 20:");//Menagem inicial para o usuário
            do{
                //o bloco do...while garante que o código dentro do "do" será executado;
                //pelo menos uma vez antes de verificar a condição no "while"
                System.out.print(numero + " ");
                //Variável para o próximo número par
                numero += 2;
            //Condição enquanto "número" for menor ou igual a 20
            }while ( numero <= 20);
            sc.close();
        }
        }
        
        
           
      
    
