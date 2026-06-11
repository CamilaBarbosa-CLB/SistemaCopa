package br.com.copa.view;

import br.com.copa.dao.SelecaoDAO;
import br.com.copa.model.Selecao;

public class TesteSelecaoDAO {

    public static void main(String[] args) {

        Selecao selecao = new Selecao();
        selecao.setNome("Brasil");
        selecao.setPontos(3);

        SelecaoDAO dao = new SelecaoDAO();
        dao.salvar(selecao);

    }
}