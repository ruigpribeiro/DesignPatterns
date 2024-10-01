package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o seu taco favorito:");
        System.out.println("1. Taco de Carne de Vaca");
        System.out.println("2. Taco de Carne de Frango");
        System.out.println("3. Taco Vegetariano");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Taco tacoCarneVaca = TacoFactory.createTaco("TacoCarneVaca");
                tacoCarneVaca.prepare();
                tacoCarneVaca.bake();
                tacoCarneVaca.box();
                break;
            case 2:
                Taco tacoCarneFrango = TacoFactory.createTaco("TacoCarneFrango");
                tacoCarneFrango.prepare();
                tacoCarneFrango.bake();
                tacoCarneFrango.box();
                break;
            case 3:
                Taco tacoVegetariano = TacoFactory.createTaco("TacoVegetariano");
                tacoVegetariano.prepare();
                tacoVegetariano.bake();
                tacoVegetariano.box();
                break;
        }
    }
}
