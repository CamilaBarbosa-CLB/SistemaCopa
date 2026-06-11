package br.com.copa.view;

import br.com.copa.controller.SelecaoController;
import br.com.copa.model.Selecao;

public class TesteController {

    public static void main(String[] args) {

        Selecao selecao = new Selecao();

        selecao.setNome("Franca");
        selecao.setPontos(9);

        SelecaoController controller =
                new SelecaoController();

        controller.salvar(selecao);

        System.out.println("Controller funcionando!");

    }

}
