package br.com.copa.controller;

import java.util.List;

import br.com.copa.dao.JogoDAO;
import br.com.copa.model.Jogo;

public class JogoController {

    private JogoDAO dao = new JogoDAO();

    public void salvar(Jogo jogo) {
        dao.salvar(jogo);
    }

    public List<Jogo> listarTodos() {
        return dao.listarTodos();
    }

    public void atualizar(Jogo jogo) {
        dao.atualizar(jogo);
    }

    public void excluir(int id) {
        dao.excluir(id);
    }
}