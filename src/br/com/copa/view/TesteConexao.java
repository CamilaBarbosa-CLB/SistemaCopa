package br.com.copa.view;

import java.sql.Connection;

import br.com.copa.factory.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {

		Connection conexao = ConnectionFactory.getConnection();

		System.out.println("Conectado com sucesso!");

	}

}