package br.com.sabatinirafa;


import java.util.Scanner;


public class ClassePrincipal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valorP = scanner.nextInt();
        
        Integer valorW = valorP;
        System.out.println("Valor digitado: " + valorW);
        System.out.println("Tipo final da variável: " + valorW.getClass().getSimpleName());

        scanner.close();
        
	}

}
