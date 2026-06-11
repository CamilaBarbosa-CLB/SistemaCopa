package br.com.copa.view;

import java.util.List;

import br.com.copa.dao.SelecaoDAO;
import br.com.copa.model.Selecao;

public class TesteListarSelecao {

    public static void main(String[] args) {

        SelecaoDAO dao = new SelecaoDAO();

        List<Selecao> selecoes = dao.listarTodos();

        for (Selecao s : selecoes) {
            System.out.println("ID: " + s.getId());
            System.out.println("Nome: " + s.getNome());
            System.out.println("Pontos: " + s.getPontos());
            System.out.println("------------------");
        }
    }
}