package br.com.copa.view;

import br.com.copa.dao.JogoDAO;
import br.com.copa.model.Jogo;

public class TesteJogoDAO {

    public static void main(String[] args) {

        Jogo jogo = new Jogo();

        jogo.setLocalJogo("Maracana");
        jogo.setDataHora("10/06/2026 20:00");
        jogo.setTimeA("Brasil");
        jogo.setTimeB("Argentina");
        jogo.setGolsTimeA(2);
        jogo.setGolsTimeB(1);
        jogo.setEscalacaoTimeA("Jogadores Brasil");
        jogo.setEscalacaoTimeB("Jogadores Argentina");

        JogoDAO dao = new JogoDAO();

        dao.salvar(jogo);

    }

}