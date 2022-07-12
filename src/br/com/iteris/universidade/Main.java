package br.com.iteris.universidade;

import br.com.iteris.universidade.modelos.Cliente;
import br.com.iteris.universidade.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
        // primeiro cliente
        Cliente clienteA = new Cliente();
        clienteA.setNome("Douglas");
        clienteA.setSobreNome("Fernandes");
        System.out.println(clienteA.faltaQuantosAnosPara(40));
        // Falta(m) 40 Anos(s)
        var clienteB = new Cliente(22); //var - tipo implícito
        clienteB.setNome("<Seu nome>");
        clienteB.setSobreNome("<Seu sobrenome>");
        System.out.println(clienteB.faltaQuantosAnosPara(40));
        // Falta(m) 18 Anos(s)

        Usuario usuarioA = new Usuario();
        usuarioA.setNome("Douglas");
        usuarioA.setEmail("douglas.pereira@iteris.com.br");
        usuarioA.obterLogin(usuarioA.getEmail());
        System.out.println(usuarioA.obterLogin(usuarioA.getEmail()));
    }
}
