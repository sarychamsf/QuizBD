/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.dao;

import com.daniel.model.Cliente;
import com.daniel.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LabingXEON
 */
public class ClienteDao {
    private Connection connection;

	public ClienteDao() {
		connection = DbUtil.getConnection();
	}

	public void addCliente(Cliente cliente) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into Clientes(Num_Clie,Empresa,RepClie,Limite_Credito) values (?, ?, ?, ? )");
			// Parameters start with 1
			preparedStatement.setInt(1, cliente.getNum_Clie());
			preparedStatement.setString(2, cliente.getEmpresa());
			preparedStatement.setInt(3, cliente.getRepClie());
			preparedStatement.setFloat(4, cliente.getLimite_Credito());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int num_Clie) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from Clientes where Num_Clie=?");
			// Parameters start with 1
			preparedStatement.setInt(1, num_Clie);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(Cliente cliente) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("update Clientes set Empresa=?, RepClie=?, Limite_Credito=?" +
							"where Num_Clie=?");
			// Parameters start with 1
			preparedStatement.setString(1, cliente.getEmpresa());
			preparedStatement.setInt(2, cliente.getRepClie());
			preparedStatement.setFloat(3, cliente.getLimite_Credito());
			preparedStatement.setInt(4, cliente.getNum_Clie());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> getAllUsers() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
                      System.out.println("LLegue hasta aca");
			Statement statement = connection.createStatement();
                        
                        
			ResultSet rs = statement.executeQuery("select * from Clientes");
			while (rs.next()) {
				Cliente cliente1 = new Cliente();
				cliente1.setNum_Clie(rs.getInt("Num_Clie"));
				cliente1.setEmpresa(rs.getString("Empresa"));
				cliente1.setRepClie(rs.getInt("RepClie"));
				cliente1.setLimite_Credito(rs.getFloat("Limite_Credito"));
				clientes.add(cliente1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return clientes;
	}
	
	public Cliente getClienteById(int numClie) {
		Cliente cliente1 = new Cliente();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select * from Clientes where Num_Clie=?");
			preparedStatement.setInt(1, numClie);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				cliente1.setNum_Clie(rs.getInt("Num_Clie"));
				cliente1.setEmpresa(rs.getString("Empresa"));
				cliente1.setRepClie(rs.getInt("RepClie"));
				cliente1.setLimite_Credito(rs.getFloat("Limite_Credito"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cliente1;
	}
}
