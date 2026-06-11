package br.com.copa.view;

import br.com.copa.dao.SelecaoDAO;

public class TesteExcluirSelecao {

    public static void main(String[] args) {

        SelecaoDAO dao = new SelecaoDAO();

        dao.excluir(1);

    }

}
