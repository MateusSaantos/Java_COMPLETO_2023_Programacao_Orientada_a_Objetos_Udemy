/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_clientes_vendas;

import com.mycompany.projeto_clientes_vendas.controller.Cliente_Controller;
import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente_Controller cliente = new Cliente_Controller();
        int escolha;

        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Registrar Venda");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Opção 1 selecionada: Cadastrar Cliente");
                    String retorno = cliente.Cadastrar_Cliente();
                    System.out.println(retorno);
                            
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Listar Clientes");
                    cliente.Listar_Clientes();
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Registrar Venda");
                    
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Consultar Saldo");
                    
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 5);
           scanner.close();
    }
}
