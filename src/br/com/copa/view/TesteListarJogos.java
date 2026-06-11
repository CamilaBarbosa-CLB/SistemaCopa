package br.com.copa.view;

import java.util.List;

import br.com.copa.dao.JogoDAO;
import br.com.copa.model.Jogo;

public class TesteListarJogos {

    public static void main(String[] args) {

        JogoDAO dao = new JogoDAO();

        List<Jogo> jogos = dao.listarTodos();

        for (Jogo j : jogos) {

            System.out.println("ID: " + j.getId());
            System.out.println("Local: " + j.getLocalJogo());
            System.out.println("Data: " + j.getDataHora());
            System.out.println("Time A: " + j.getTimeA());
            System.out.println("Time B: " + j.getTimeB());
            System.out.println("Placar: " + j.getGolsTimeA() + " x " + j.getGolsTimeB());
            System.out.println("---------------------");

        }
    }
}
