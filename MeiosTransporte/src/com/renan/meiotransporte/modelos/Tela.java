/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */

package com.renan.meiotransporte.modelos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.renan.meiotransporte.modelos.Aviao;
import com.renan.meiotransporte.modelos.Carro;
import com.renan.meiotransporte.modelos.Navio;
import com.renan.meiotransporte.modelos.MeioDeTransporte;
import javax.swing.SpringLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtCarroCapacidade;
	private JTextField txtCarroCombustivel;
	private JTextField txtQtdeRodas;
	private JTextField txtAviaoCapacidade;
	private JTextField txtAviaoCombustivel;
	private JTextField txtQtdeTurbinas;
	private JTextField txtNavioCapacidade;
	private JTextField txtNavioCombustivel;
	private JTextField txtQtdePes;

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
		setBounds(100, 100, 937, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblCapacidade = new JLabel("Capacidade:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCapacidade, 246, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblCapacidade, -490, SpringLayout.EAST, contentPane);
		lblCapacidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblCapacidade);
		
		txtCarroCapacidade = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtCarroCapacidade, 38, SpringLayout.EAST, lblCapacidade);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtCarroCapacidade, -234, SpringLayout.EAST, contentPane);
		txtCarroCapacidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCarroCapacidade.setColumns(10);
		contentPane.add(txtCarroCapacidade);
		
		JButton btnCarro = new JButton("Exibir");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCarro, -240, SpringLayout.EAST, contentPane);
		btnCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cCapacidade			= Integer.parseInt(txtCarroCapacidade.getText());
				String cCombustivel 	= txtCarroCombustivel.getText();
				int cQtdeRodas			= Integer.parseInt(txtQtdeRodas.getText());
								
				Carro cc = new Carro(cCapacidade, cCombustivel, cQtdeRodas);
				
				JOptionPane.showMessageDialog(null, cc.toString());
			}
		});
		btnCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnCarro);
		
		JLabel lblDadosDoTransporte = new JLabel("Dados do Carro");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtCarroCapacidade, 56, SpringLayout.SOUTH, lblDadosDoTransporte);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCapacidade, 59, SpringLayout.SOUTH, lblDadosDoTransporte);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDadosDoTransporte, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDadosDoTransporte, 404, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDadosDoTransporte, 44, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDadosDoTransporte, -311, SpringLayout.EAST, contentPane);
		lblDadosDoTransporte.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosDoTransporte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblDadosDoTransporte);
		
		JLabel lblTipoCombustivel = new JLabel("Tipo Combustivel:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTipoCombustivel, 246, SpringLayout.WEST, contentPane);
		lblTipoCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblTipoCombustivel);
		
		txtCarroCombustivel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTipoCombustivel, -38, SpringLayout.WEST, txtCarroCombustivel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtCarroCapacidade, -12, SpringLayout.NORTH, txtCarroCombustivel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtCarroCombustivel, -3, SpringLayout.NORTH, lblTipoCombustivel);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtCarroCombustivel, 0, SpringLayout.WEST, txtCarroCapacidade);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtCarroCombustivel, -234, SpringLayout.EAST, contentPane);
		txtCarroCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCarroCombustivel.setColumns(10);
		contentPane.add(txtCarroCombustivel);
		
		JLabel lblQtdeRodas = new JLabel("Qtde Rodas:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblQtdeRodas, 176, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblQtdeRodas, 246, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblTipoCombustivel, -16, SpringLayout.NORTH, lblQtdeRodas);
		lblQtdeRodas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblQtdeRodas);
		
		txtQtdeRodas = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCarro, 35, SpringLayout.SOUTH, txtQtdeRodas);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblQtdeRodas, -38, SpringLayout.WEST, txtQtdeRodas);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtQtdeRodas, 1, SpringLayout.NORTH, lblQtdeRodas);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtQtdeRodas, 0, SpringLayout.WEST, txtCarroCapacidade);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtQtdeRodas, -234, SpringLayout.EAST, contentPane);
		txtQtdeRodas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtQtdeRodas.setColumns(10);
		contentPane.add(txtQtdeRodas);
		
		JLabel lblDadosDoAvio = new JLabel("Dados do Avi\u00E3o");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDadosDoAvio, 317, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDadosDoAvio, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDadosDoAvio, 351, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDadosDoAvio, 228, SpringLayout.WEST, contentPane);
		lblDadosDoAvio.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosDoAvio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblDadosDoAvio);
		
		JLabel label = new JLabel("Capacidade:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 411, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label, 185, SpringLayout.WEST, contentPane);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label);
		
		txtAviaoCapacidade = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtAviaoCapacidade, 408, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtAviaoCapacidade, 195, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtAviaoCapacidade, 433, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtAviaoCapacidade, 413, SpringLayout.WEST, contentPane);
		txtAviaoCapacidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAviaoCapacidade.setColumns(10);
		contentPane.add(txtAviaoCapacidade);
		
		JLabel label_1 = new JLabel("Tipo Combustivel:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_1, 445, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_1, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_1, 185, SpringLayout.WEST, contentPane);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label_1);
		
		txtAviaoCombustivel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtAviaoCombustivel, 444, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtAviaoCombustivel, 195, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtAviaoCombustivel, 469, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtAviaoCombustivel, 413, SpringLayout.WEST, contentPane);
		txtAviaoCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAviaoCombustivel.setColumns(10);
		contentPane.add(txtAviaoCombustivel);
		
		JLabel lblQtdeTurbinas = new JLabel("Qtde Turbinas:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblQtdeTurbinas, 481, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblQtdeTurbinas, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblQtdeTurbinas, 185, SpringLayout.WEST, contentPane);
		lblQtdeTurbinas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblQtdeTurbinas);
		
		txtQtdeTurbinas = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtQtdeTurbinas, 480, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtQtdeTurbinas, 195, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtQtdeTurbinas, 505, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtQtdeTurbinas, 413, SpringLayout.WEST, contentPane);
		txtQtdeTurbinas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtQtdeTurbinas.setColumns(10);
		contentPane.add(txtQtdeTurbinas);
		
		JButton btnAviao = new JButton("Exibir");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAviao, 538, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAviao, 311, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAviao, 558, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAviao, 413, SpringLayout.WEST, contentPane);
		btnAviao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int aCapacidade			= Integer.parseInt(txtAviaoCapacidade.getText());
				String aCombustivel 	= txtAviaoCombustivel.getText();
				int aQtdeTurbinas		= Integer.parseInt(txtQtdeTurbinas.getText());
								
				Aviao ca = new Aviao(aCapacidade, aCombustivel, aQtdeTurbinas);
				
				JOptionPane.showMessageDialog(null, ca.toString());
			}
		});
		btnAviao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnAviao);
		
		JSeparator separator_1 = new JSeparator();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCarro, -46, SpringLayout.NORTH, separator_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, separator_1, 304, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, separator_1, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, separator_1, 913, SpringLayout.WEST, contentPane);
		contentPane.add(separator_1);
		
		JLabel lblDadosDoNavio = new JLabel("Dados do Navio");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDadosDoNavio, 316, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDadosDoNavio, 494, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDadosDoNavio, 350, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDadosDoNavio, 893, SpringLayout.WEST, contentPane);
		lblDadosDoNavio.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosDoNavio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblDadosDoNavio);
		
		JLabel label_3 = new JLabel("Capacidade:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_3, 411, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_3, 490, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_3, 665, SpringLayout.WEST, contentPane);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label_3);
		
		txtNavioCapacidade = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNavioCapacidade, 408, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNavioCapacidade, 675, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtNavioCapacidade, 433, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNavioCapacidade, 893, SpringLayout.WEST, contentPane);
		txtNavioCapacidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNavioCapacidade.setColumns(10);
		contentPane.add(txtNavioCapacidade);
		
		JLabel label_4 = new JLabel("Tipo Combustivel:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_4, 445, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_4, 490, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_4, 665, SpringLayout.WEST, contentPane);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label_4);
		
		txtNavioCombustivel = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNavioCombustivel, 445, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNavioCombustivel, 675, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtNavioCombustivel, 470, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNavioCombustivel, 893, SpringLayout.WEST, contentPane);
		txtNavioCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNavioCombustivel.setColumns(10);
		contentPane.add(txtNavioCombustivel);
		
		JLabel lblQtdePes = new JLabel("Qtde P\u00E9s:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblQtdePes, 481, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblQtdePes, 490, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblQtdePes, 665, SpringLayout.WEST, contentPane);
		lblQtdePes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblQtdePes);
		
		txtQtdePes = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtQtdePes, 481, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtQtdePes, 675, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtQtdePes, 506, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtQtdePes, 893, SpringLayout.WEST, contentPane);
		txtQtdePes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtQtdePes.setColumns(10);
		contentPane.add(txtQtdePes);
		
		JButton btnNavio = new JButton("Exibir");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNavio, 0, SpringLayout.NORTH, btnAviao);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNavio, 791, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNavio, 558, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNavio, 893, SpringLayout.WEST, contentPane);
		btnNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nCapacidade			= Integer.parseInt(txtNavioCapacidade.getText());
				String nCombustivel 	= txtNavioCombustivel.getText();
				int nQtdePes			= Integer.parseInt(txtQtdePes.getText());
								
				Navio cn = new Navio(nCapacidade, nCombustivel, nQtdePes);
				
				JOptionPane.showMessageDialog(null, cn.toString());
			}
		});
		btnNavio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNavio);
		
		JButton btnLimpar = new JButton("Limpar");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCarro, 221, SpringLayout.EAST, btnLimpar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLimpar, 65, SpringLayout.SOUTH, lblQtdeRodas);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLimpar, -563, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLimpar, 45, SpringLayout.SOUTH, lblQtdeRodas);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLimpar, 0, SpringLayout.WEST, lblCapacidade);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCarroCapacidade.setText("");
				txtCarroCombustivel.setText("");
				txtQtdeRodas.setText("");
				
			}
		});
		contentPane.add(btnLimpar);
		
		JButton btnLimparAviao = new JButton("Limpar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLimparAviao, 38, SpringLayout.SOUTH, lblQtdeTurbinas);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLimparAviao, 0, SpringLayout.WEST, lblDadosDoAvio);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLimparAviao, -29, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLimparAviao, 102, SpringLayout.WEST, lblDadosDoAvio);
		btnLimparAviao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimparAviao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAviaoCapacidade.setText("");
				txtAviaoCombustivel.setText("");
				txtQtdeTurbinas.setText("");
				
			}
		});
		contentPane.add(btnLimparAviao);
		
		JButton btnLimparNavio = new JButton("Limpar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLimparNavio, 1, SpringLayout.NORTH, btnAviao);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLimparNavio, 81, SpringLayout.EAST, btnAviao);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLimparNavio, 21, SpringLayout.NORTH, btnAviao);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLimparNavio, -200, SpringLayout.WEST, btnNavio);
		btnLimparNavio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimparNavio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNavioCapacidade.setText("");
				txtNavioCombustivel.setText("");
				txtQtdePes.setText("");
			}
		});
		contentPane.add(btnLimparNavio);
	}
}