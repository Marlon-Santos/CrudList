package br.com.gft;

import br.com.gft.resources.UserResources;

import java.util.Scanner;


public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void options(UserResources user) {
        int option;
        String name;
        String email;

        System.out.println("escolha uma das opcoes para continuar");
        System.out.println("1 - Criar usuario");
        System.out.println("2 - Listar usuarios");
        System.out.println("3 - Remover usuario");
        System.out.println("4 - Editar usuario");
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Voce esta criando um novo usuario");
                System.out.print("por favor coloque o nome: ");
                name = sc.nextLine();
                name = sc.nextLine();
                System.out.print("por favor coloque o email: ");
                email = sc.nextLine();
                user.create(name, email);
                break;
            case 2:
                user.read();
                break;
            case 3:
                System.out.println("Voce esta removendo um usuario, tenha o numero da ID antes de continuar");
                System.out.println("Voce possui o ID do usuario?");
                System.out.println("1- para sim");
                System.out.println("2- para nao");
                option = sc.nextInt();
                if (option == 1) {
                    System.out.printf("coloque o id do usuario: ");
                    option = sc.nextInt();
                    user.delete(option);
                } else {
                    System.out.println("obtenha o numero ID listando os usuarios cadastrado no menu principal");
                }
                break;
            case 4:
                System.out.println("Voce esta editando um usuario, tenha o numero da ID antes de continuar");
                System.out.println("Voce possui o ID do usuario?");
                System.out.println("1- para sim");
                System.out.println("2- para nao");
                option = sc.nextInt();
                if (option == 1) {
                    System.out.printf("coloque o id do usuario: ");
                    option = sc.nextInt();
                    user.update(option);
                } else {
                    System.out.println("obtenha o numero ID listando os usuarios cadastrado no menu principal");
                }
                break;
        }
        options(user);
    }



    public static void main(String[] args) {
        UserResources user = new UserResources();
        options(user);

    }
}
