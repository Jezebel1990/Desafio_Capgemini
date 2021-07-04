package classes.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import classes.dao.AnuncioDAO;
import classes.modelo.Anuncio;
import javax.swing.SwingConstants;

public class AnuncioGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeanuncio;
	private JTextField txtCliente;
	private JTextField txtTermino;
	private JTextField txtInicio;
	private JTextField txtInvestimento;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnuncioGUI frame = new AnuncioGUI();
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
	public AnuncioGUI() {
		setResizable(false);
		setTitle("Tela de Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 268);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de An\u00FAncios");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(164, 10, 227, 33);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(23, 50, 490, 157);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do an\u00FAncio:");
		lblNewLabel_2.setForeground(new Color(153, 204, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(8, 21, 99, 13);
		panel.add(lblNewLabel_2);
		
		txtNomeanuncio = new JTextField();
		txtNomeanuncio.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomeanuncio.setForeground(new Color(128, 128, 128));
		txtNomeanuncio.setText("Campanha Fulado de Tal ");
		txtNomeanuncio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeanuncio.setBounds(115, 18, 147, 19);
		panel.add(txtNomeanuncio);
		txtNomeanuncio.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cliente:");
		lblNewLabel_3.setForeground(new Color(153, 204, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(339, 65, 40, 13);
		panel.add(lblNewLabel_3);
		
		txtCliente = new JTextField();
		txtCliente.setHorizontalAlignment(SwingConstants.CENTER);
		txtCliente.setForeground(new Color(128, 128, 128));
		txtCliente.setText("Fulano");
		txtCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCliente.setBounds(387, 61, 99, 22);
		panel.add(txtCliente);
		txtCliente.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data Inicio:");
		lblNewLabel_4.setForeground(new Color(153, 204, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(8, 59, 76, 13);
		panel.add(lblNewLabel_4);
		
		txtTermino = new JTextField();
		txtTermino.setHorizontalAlignment(SwingConstants.CENTER);
		txtTermino.setForeground(new Color(128, 128, 128));
		txtTermino.setText("dd-MM-yyyy");
		txtTermino.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTermino.setBounds(243, 58, 79, 22);
		panel.add(txtTermino);
		txtTermino.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Data T\u00E9rmino:");
		lblNewLabel_5.setForeground(new Color(153, 204, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(163, 62, 99, 13);
		panel.add(lblNewLabel_5);
		
		txtInicio = new JTextField();
		txtInicio.setHorizontalAlignment(SwingConstants.CENTER);
		txtInicio.setForeground(new Color(128, 128, 128));
		txtInicio.setText("dd-MM-yyyy");
		txtInicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtInicio.setBounds(71, 58, 76, 21);
		panel.add(txtInicio);
		
		JLabel lblNewLabel_6 = new JLabel("Investimento/dia:");
		lblNewLabel_6.setForeground(new Color(153, 204, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(280, 21, 99, 13);
		panel.add(lblNewLabel_6);
		
		txtInvestimento = new JTextField();
		txtInvestimento.setForeground(new Color(128, 128, 128));
		txtInvestimento.setHorizontalAlignment(SwingConstants.CENTER);
		txtInvestimento.setText("R$ 9999,99");
		txtInvestimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtInvestimento.setBounds(383, 18, 99, 19);
		panel.add(txtInvestimento);
		txtInvestimento.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 102, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Anuncio anuncios = new Anuncio();
				anuncios.setNomeanuncio(txtNomeanuncio.getText());
				anuncios.setCliente(txtCliente.getText());
				anuncios.setInicio(txtInicio.getText());
				anuncios.setTermino(txtTermino.getText());
				anuncios.setInvestimento(txtInvestimento.getText());

				// fazendo a validação dos dados
				if ((txtNomeanuncio.getText().isEmpty()) || (txtCliente.getText().isEmpty()) || (txtInicio.getText().isEmpty()) || (txtTermino.getText().isEmpty()) || (txtInvestimento.getText().isEmpty())) {
				   JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				}
				else {

				    // instanciando a classe  do pacote dao e cria seu objeto dao
				    AnuncioDAO dao = new AnuncioDAO();
				    try {
						dao.adicionar(anuncios);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    JOptionPane.showMessageDialog(null, "Anuncio "+txtNomeanuncio.getText()+" inserido com sucesso! ");
				}

				// apaga os dados preenchidos nos campos de texto
				txtNomeanuncio.setText("");
				txtCliente.setText("");
				txtInicio.setText("");
				txtTermino.setText("");
				txtInvestimento.setText("");
				

				
			}
		});
		btnNewButton.setBounds(8, 102, 117, 28);
		panel.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(135, 206, 250));
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNomeanuncio.setText("");
				txtCliente.setText("");
				txtInicio.setText("");
				txtTermino.setText("");
				txtInvestimento.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpar.setBounds(258, 102, 89, 28);
		panel.add(btnLimpar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBackground(new Color(102, 51, 255));
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setBounds(148, 102, 89, 28);
		panel.add(btnSair);
		
		JButton btnRelatorio = new JButton("Relat\u00F3rio");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Relatório do Anúncio");
				StringBuilder sb = new StringBuilder("");
				sb.append("Valor total investido: \r\n");
				sb.append("Quantidade Máxima de Visualizações: \r\n");
				sb.append("Quantidade Máxima de Cliques: \r\n");
				sb.append("Quantidade Máxima de Compartilhamentos: \r\n");
				JOptionPane.showMessageDialog(null, sb);
				
			}
		});
		btnRelatorio.setBackground(new Color(153, 51, 204));
		btnRelatorio.setForeground(Color.WHITE);
		btnRelatorio.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRelatorio.setBounds(369, 103, 117, 27);
		panel.add(btnRelatorio);
	}
}
