package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o tipo de documento (DocumentoTextoSimples, FolhaCalculo, Apresentacao): ");
        String type = scanner.nextLine();

        System.out.print("Introduza o autor: ");
        String author = scanner.nextLine();

        System.out.print("Introduza o nome: ");
        String name = scanner.nextLine();

        Documento documento = DocumentoFactory.createDocumento(type, author, name);

        while (true) {
            System.out.println("\nEscolha uma ação: 1 - Open | 2 - Save | 3 - Close | 4 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    documento.open();
                    break;
                case 2:
                    documento.save();
                    break;
                case 3:
                    documento.close();
                    break;
                case 4:
                    System.out.println("Xauuuu...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
