package br.com.iteris.universidade.modelos;

import org.jetbrains.annotations.NotNull;

public class Usuario {
    public Usuario() {} // construtor simples
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    private String nome;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ref: https://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
    public String obterLogin(@NotNull String email) {
        String splitLogin = email.split("@")[0];
        return splitLogin;
    }

}
