package PBL05;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Cadastro {
    // Atributos
    private static HashMap<String, List<Usuarios>> cadastroPessoas;

    static {
        cadastroPessoas = new HashMap<>();
        // Criando 3 HashMaps, cada Key é um tipo do usuário e em cada HashMap, terá uma lista com usuários
        cadastroPessoas.put("Cliente", new ArrayList<>());
        cadastroPessoas.put("Funcionário", new ArrayList<>());
        cadastroPessoas.put("Gerente", new ArrayList<>());
    }
    // Método pra adicionar usuário
    public static void adicionarUsuario(String tipoUsuario, Usuarios novoUsuario) {
        // Verifica se o tipo de usuário é válido
        if (cadastroPessoas.containsKey(tipoUsuario)) {
            // Obtém a lista de usuários do tipo especificado
            List<Usuarios> usuariosLista = cadastroPessoas.get(tipoUsuario);
            // Adiciona o novo usuário à lista de usuários
            usuariosLista.add(novoUsuario);
        } else {
            System.out.println("Tipo de usuário inválido.");
        }
    }
    public static void listarUsuarios() {
        // Percorre toda as chaves do HashMap 'cadastroPessoas'
        for (String tipo : cadastroPessoas.keySet()) {
            // Imprimir o tipo de usuário
            System.out.println("Usuários do tipo '" + tipo.toUpperCase() + "':");
            // Pega a lista de usuários do tipo atual
            List<Usuarios> usuarios = cadastroPessoas.get(tipo);
            // Percorre a lista de usuários e imprimi as informações de cada um
            for (Usuarios usuario : usuarios) {
                System.out.println("Nome: " + usuario.getNomeUsuario() + ", Número: " + usuario.getNumeroUsuario());
            }
            System.out.println(); // Adiciona linha em branco entre cada tipo de usuários
        }
    }
    public static void buscarUsuariosPorTipo(String tipo) {
        // Verifica se o tipo de usuário está presente no Hash
        if (cadastroPessoas.containsKey(tipo)) {
            // Pega a lista de usuários do tipo especificado
            List<Usuarios> usuarios = cadastroPessoas.get(tipo);
            // Imprimi os usuários do tipo
            System.out.println("Usuários do tipo " + tipo + ":");
            for (Usuarios usuario : usuarios) {
                System.out.println("Nome: " + usuario.getNomeUsuario() + ", Número: " + usuario.getNumeroUsuario());
            }
        } else {
            System.out.println("Tipo de usuário não encontrado.");
        }
    }

}