package br.com.copa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.copa.factory.ConnectionFactory;
import br.com.copa.model.Jogo;

public class JogoDAO {

    public void salvar(Jogo jogo) {
        String sql = "INSERT INTO jogos(local_jogo, data_hora, time_a, time_b, gols_time_a, gols_time_b, escalacao_time_a, escalacao_time_b) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, jogo.getLocalJogo());
            stmt.setString(2, jogo.getDataHora());
            stmt.setString(3, jogo.getTimeA());
            stmt.setString(4, jogo.getTimeB());
            stmt.setInt(5, jogo.getGolsTimeA());
            stmt.setInt(6, jogo.getGolsTimeB());
            stmt.setString(7, jogo.getEscalacaoTimeA());
            stmt.setString(8, jogo.getEscalacaoTimeB());

            stmt.execute();
            stmt.close();
            conn.close();

            System.out.println("Jogo cadastrado!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar jogo: " + e.getMessage());
        }
    }

    public List<Jogo> listarTodos() {
        List<Jogo> lista = new ArrayList<>();

        String sql = "SELECT * FROM jogos";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Jogo jogo = new Jogo();

                jogo.setId(rs.getInt("id"));
                jogo.setLocalJogo(rs.getString("local_jogo"));
                jogo.setDataHora(rs.getString("data_hora"));
                jogo.setTimeA(rs.getString("time_a"));
                jogo.setTimeB(rs.getString("time_b"));
                jogo.setGolsTimeA(rs.getInt("gols_time_a"));
                jogo.setGolsTimeB(rs.getInt("gols_time_b"));
                jogo.setEscalacaoTimeA(rs.getString("escalacao_time_a"));
                jogo.setEscalacaoTimeB(rs.getString("escalacao_time_b"));

                lista.add(jogo);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Erro ao listar jogos: " + e.getMessage());
        }

        return lista;
    }

    public void atualizar(Jogo jogo) {
        String sql = "UPDATE jogos SET local_jogo = ?, data_hora = ?, time_a = ?, time_b = ?, gols_time_a = ?, gols_time_b = ?, escalacao_time_a = ?, escalacao_time_b = ? WHERE id = ?";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, jogo.getLocalJogo());
            stmt.setString(2, jogo.getDataHora());
            stmt.setString(3, jogo.getTimeA());
            stmt.setString(4, jogo.getTimeB());
            stmt.setInt(5, jogo.getGolsTimeA());
            stmt.setInt(6, jogo.getGolsTimeB());
            stmt.setString(7, jogo.getEscalacaoTimeA());
            stmt.setString(8, jogo.getEscalacaoTimeB());
            stmt.setInt(9, jogo.getId());

            stmt.executeUpdate();
            stmt.close();
            conn.close();

            System.out.println("Jogo atualizado!");

        } catch (Exception e) {
            System.out.println("Erro ao atualizar jogo: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM jogos WHERE id = ?";

        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();
            stmt.close();
            conn.close();

            System.out.println("Jogo excluído!");

        } catch (Exception e) {
            System.out.println("Erro ao excluir jogo: " + e.getMessage());
        }
    }
}