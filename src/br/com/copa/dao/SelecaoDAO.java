package br.com.copa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.copa.factory.ConnectionFactory;
import br.com.copa.model.Selecao;

public class SelecaoDAO {

    public void salvar(Selecao selecao) {

        String sql = "INSERT INTO selecoes(nome, pontos) VALUES (?, ?)";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, selecao.getNome());
            stmt.setInt(2, selecao.getPontos());

            stmt.execute();

            stmt.close();
            conn.close();

            System.out.println("Seleção cadastrada!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar seleção: " + e.getMessage());
        }
    }

    public List<Selecao> listarTodos() {

        List<Selecao> lista = new ArrayList<>();

        String sql = "SELECT * FROM selecoes";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Selecao selecao = new Selecao();

                selecao.setId(rs.getInt("id"));
                selecao.setNome(rs.getString("nome"));
                selecao.setPontos(rs.getInt("pontos"));

                lista.add(selecao);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar seleções: " + e.getMessage());
        }

        return lista;
    }

    public void atualizar(Selecao selecao) {

        String sql = "UPDATE selecoes SET nome = ?, pontos = ? WHERE id = ?";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, selecao.getNome());
            stmt.setInt(2, selecao.getPontos());
            stmt.setInt(3, selecao.getId());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            System.out.println("Seleção atualizada!");

        } catch (Exception e) {
            System.out.println("Erro ao atualizar seleção: " + e.getMessage());
        }
    }

    public void excluir(int id) {

        String sql = "DELETE FROM selecoes WHERE id = ?";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            System.out.println("Seleção excluída!");

        } catch (Exception e) {
            System.out.println("Erro ao excluir seleção: " + e.getMessage());
        }
    }
}