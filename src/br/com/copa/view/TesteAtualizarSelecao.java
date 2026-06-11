package br.com.copa.view;

import br.com.copa.dao.SelecaoDAO;
import br.com.copa.model.Selecao;

public class TesteAtualizarSelecao {

    public static void main(String[] args) {

        Selecao selecao = new Selecao();

        selecao.setId(1);
        selecao.setNome("Brasil");
        selecao.setPontos(6);

        SelecaoDAO dao = new SelecaoDAO();

        dao.atualizar(selecao);

    }

}
