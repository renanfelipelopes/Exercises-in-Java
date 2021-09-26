/*
* Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
* Curso: CST em Análise e Desenvolvimento de Sistemas 
* Polo: São Bernardo do Campo (Rudge Ramos)
 */


package com.renanlopes.veiculo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.renanlopes.veiculo.Comodidade;
import com.renanlopes.veiculo.Tecnologia;
import com.renanlopes.veiculo.TipoVeiculo;
import com.renanlopes.veiculo.Veiculo;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtCarroceria;
	private JTextField txtPortas;
	private JTextField txtAssentos;
	private JTextField txtTransmissao;
	private JTextField txtFreios;
	private JTextField txtRodas;
	private JTextField txtCombustivel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCaractersticasDoVeculo = new JLabel("Caracter\u00EDsticas do Ve\u00EDculo");
		lblCaractersticasDoVeculo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCaractersticasDoVeculo.setBounds(24, 26, 199, 27);
		contentPane.add(lblCaractersticasDoVeculo);
		
		JLabel lblDigiteAsInformaes = new JLabel("Digite as informa\u00E7\u00F5es do seu ve\u00EDculo.");
		lblDigiteAsInformaes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDigiteAsInformaes.setBounds(24, 64, 209, 21);
		contentPane.add(lblDigiteAsInformaes);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarca.setBounds(24, 169, 117, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(261, 167, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblCarroceria = new JLabel("Carroceria");
		lblCarroceria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCarroceria.setBounds(24, 204, 117, 14);
		contentPane.add(lblCarroceria);
		
		txtCarroceria = new JTextField();
		txtCarroceria.setBounds(261, 201, 86, 20);
		contentPane.add(txtCarroceria);
		txtCarroceria.setColumns(10);
		
		JLabel lblPortas = new JLabel("Quantidade de portas");
		lblPortas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPortas.setBounds(24, 232, 144, 14);
		contentPane.add(lblPortas);
		
		txtPortas = new JTextField();
		txtPortas.setBounds(261, 229, 86, 20);
		contentPane.add(txtPortas);
		txtPortas.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantidade assentos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(24, 267, 199, 14);
		contentPane.add(lblNewLabel);
		
		txtAssentos = new JTextField();
		txtAssentos.setBounds(261, 264, 86, 20);
		contentPane.add(txtAssentos);
		txtAssentos.setColumns(10);
		
		JLabel lblTransmissao = new JLabel("Tipo de transmiss\u00E3o");
		lblTransmissao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTransmissao.setBounds(24, 295, 144, 14);
		contentPane.add(lblTransmissao);
		
		txtTransmissao = new JTextField();
		txtTransmissao.setBounds(261, 292, 86, 20);
		contentPane.add(txtTransmissao);
		txtTransmissao.setColumns(10);
		
		JLabel lblSistemaDeFrenagem = new JLabel("Sistema de frenagem");
		lblSistemaDeFrenagem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSistemaDeFrenagem.setBounds(24, 327, 144, 14);
		contentPane.add(lblSistemaDeFrenagem);
		
		txtFreios = new JTextField();
		txtFreios.setBounds(261, 323, 86, 20);
		contentPane.add(txtFreios);
		txtFreios.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar ");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMarca.setText("");
				txtCarroceria.setText("");
				txtPortas.setText("");
				txtAssentos.setText("");
				txtTransmissao.setText("");
				txtFreios.setText("");
				txtRodas.setText("");
				txtCombustivel.setText("");	
			}
		});
		btnLimpar.setBounds(24, 368, 89, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblRodas = new JLabel("Quantidade de rodas");
		lblRodas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRodas.setBounds(24, 140, 144, 14);
		contentPane.add(lblRodas);
		
		txtRodas = new JTextField();
		txtRodas.setBounds(261, 137, 86, 20);
		contentPane.add(txtRodas);
		txtRodas.setColumns(10);
		
		JLabel lblCombustivel = new JLabel("Combustivel");
		lblCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCombustivel.setBounds(24, 109, 117, 14);
		contentPane.add(lblCombustivel);
		
		txtCombustivel = new JTextField();
		txtCombustivel.setBounds(261, 106, 86, 20);
		contentPane.add(txtCombustivel);
		txtCombustivel.setColumns(10);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String combustivel		= txtCombustivel.getText();
				int qtdRodas			= Integer.parseInt(txtRodas.getText());
				String marca 			= txtMarca.getText();
				String tipoCarroceria 	= txtCarroceria.getText();
				int vPortas				= Integer.parseInt(txtPortas.getText());
				int vAssentos			= Integer.parseInt(txtAssentos.getText()); //convetido para String
				String vTransmissao		= txtTransmissao.getText();
				String vFrenagem		= txtFreios.getText();
				
				Veiculo ve 			= new Veiculo (qtdRodas, combustivel);
				TipoVeiculo tipo 	= new TipoVeiculo(qtdRodas, combustivel, marca, tipoCarroceria);
				Tecnologia tec 		= new Tecnologia(qtdRodas, combustivel, vTransmissao, vFrenagem);
				Comodidade comod 	= new Comodidade(qtdRodas, combustivel, vPortas, vAssentos);
						
				JOptionPane.showMessageDialog(null, ve.dizerInformacoes());
				JOptionPane.showMessageDialog(null, tipo.InformacoesCompletas());
				JOptionPane.showMessageDialog(null, comod.InformacoesCompletas());
				JOptionPane.showMessageDialog(null, tec.InformacoesCompletas());
			}
		});
		btnExibir.setBounds(258, 368, 89, 23);
		contentPane.add(btnExibir);
	}
}
