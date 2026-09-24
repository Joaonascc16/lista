package org.example;

public class Autenticador {

    public static boolean autenticar(String usuario, String senha, boolean ativo) {
        if (usuario == null || usuario.isEmpty()) {
            return false;
        }
        return usuario.equals("admin") && senha.equals("Senha123") && ativo;

    }

}
