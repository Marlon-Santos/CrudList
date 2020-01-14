package br.com.gft.resources;

import br.com.gft.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserResources {
    static private List<User> list = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public UserResources() {
    }

    public void create(String name, String email) {
        User u = new User(name, email);
        System.out.printf("##########################################################################################%n");
        System.out.println("usuario " + name + " cadastrado com sucesso");
        list.add(u);
        System.out.printf("##########################################################################################%n");
    }

    public void read() {
        System.out.printf("##########################################################################################%n");
        System.out.println("usarios cadastrados:");
        for (User user : list) {
            System.out.printf("Id: " + user.getIdF() + " Name: " + user.getName() + " - Email: " + user.getEmail() + "%n");
        }
        System.out.printf("##########################################################################################%n");
    }

    public void update(long id) {
        for (User user : list) {
            if (user.getIdF() == id) {
                System.out.printf("#################### Edição ################%n");
                System.out.println("Nome atual: " + user.getName());
                System.out.print("novo Nome: ");
                user.setName(sc.nextLine());
                System.out.println("Email atual: " + user.getEmail());
                System.out.print("novo email: ");
                user.setEmail(sc.nextLine());
                System.out.printf("#################### Edição concluida ################%n");
            }
        }
    }

    public void delete(long id) {
        for (User user : list) {
            if (user.getIdF() == id) {
                list.remove(user);
                System.out.printf("##########################################################################################%n");
                System.out.printf("usuario deletado com sucesso \n");
                System.out.printf("##########################################################################################%n");
                break;
            }
        }
    }

}
