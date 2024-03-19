package PBL05;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random randomNum = new Random();
        boolean continuar = true;
        String tipoUsuario = null;
        Scanner inputUsuario = new Scanner(System.in);
        while (continuar) {
            try {
                System.out.println("\nSelecione uma opção:");
                System.out.println("1 - Cadastrar Usuário");
                System.out.println("2 - Listar Usuários");
                System.out.println("3 - Buscar Usuário por Tipo");
                System.out.println("4 - Sair do programa\n");
                String operacao = inputUsuario.next();
                switch (operacao) {
                    case "1":
                        System.out.println("-- MENU 1 ## Cadastrar Usuário --");
                        System.out.println("Selecione o Tipo do Usuário:");
                        System.out.println("a - Cliente");
                        System.out.println("b - Funcionário");
                        System.out.println("c - Gerente");
                        String tipoOpcao = inputUsuario.next().toLowerCase();
                        switch (tipoOpcao) {
                            case "a":
                                tipoUsuario = Switch.tipoUsuario("a");
                                break;
                            case "b":
                                tipoUsuario = Switch.tipoUsuario("b");
                                break;
                            case "c":
                                tipoUsuario = Switch.tipoUsuario("c");
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                                continue;
                        }
                        System.out.println("Digite o nome do Usuário:");
                        String nomeUsuario = inputUsuario.next();
                        int numeroUsuario = randomNum.nextInt(1000);
                        Usuarios novoUsuario = new Usuarios(nomeUsuario, numeroUsuario);
                        Cadastro.adicionarUsuario(tipoUsuario, novoUsuario);
                        break;
                    case "2":
                        System.out.println("-- MENU 2 ## Listar Usuários --");
                        Cadastro.listarUsuarios();
                        break;
                    case "3":
                        System.out.println("-- MENU 3 ## Buscar Usuário por Tipo --");
                        System.out.println("Selecione o Tipo do Usuário:");
                        System.out.println("a - Cliente");
                        System.out.println("b - Funcionário");
                        System.out.println("c - Gerente");
                        String escolhaTipo = inputUsuario.next().toLowerCase();
                        switch (escolhaTipo) {
                            case "a":
                                tipoUsuario = Switch.tipoUsuario("a");
                                break;
                            case "b":
                                tipoUsuario = Switch.tipoUsuario("b");
                                break;
                            case "c":
                                tipoUsuario = Switch.tipoUsuario("c");
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                                continue;
                        }
                        Cadastro.buscarUsuariosPorTipo(tipoUsuario);
                        break;
                    case "4":
                        System.out.println("Saindo do programa.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
        inputUsuario.close();
    }
}