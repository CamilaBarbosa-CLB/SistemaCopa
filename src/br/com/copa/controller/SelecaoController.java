package br.com.copa.controller;

import java.util.List;

import br.com.copa.dao.SelecaoDAO;
import br.com.copa.model.Selecao;

public class SelecaoController {

    private SelecaoDAO dao = new SelecaoDAO();

    public void salvar(Selecao selecao) {
        dao.salvar(selecao);
    }

    public List<Selecao> listarTodos() {
        return dao.listarTodos();
    }

    public void atualizar(Selecao selecao) {
        dao.atualizar(selecao);
    }

    public void excluir(int id) {
        dao.excluir(id);
    }
}
