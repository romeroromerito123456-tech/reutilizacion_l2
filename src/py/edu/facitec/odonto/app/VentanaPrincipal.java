package py.edu.facitec.odonto.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import py.edu.facitec.odonto.componentes.paneles.PanelFondo;
import py.edu.facitec.odonto.vista.VentanaPaciente;
import py.edu.facitec.odonto.componentes.botones.Miboton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private VentanaPaciente vPaciente;
	private final Miboton mbtnSisodonto = new Miboton();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600); 
		// maximizar
		setExtendedState(MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirRegistroCliente();
			}
		});
		mnArchivo.add(mntmNewMenuItem);
		
		JMenu mnTransacciones = new JMenu("Transacciones");
		menuBar.add(mnTransacciones);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar, BorderLayout.WEST);
		
		Miboton mbtnCliente = new Miboton();
		mbtnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirRegistroCliente();
			}
		});
		mbtnCliente.setBackground(Color.YELLOW);
		mbtnCliente.setFont(new Font("Dialog", Font.PLAIN, 13));
		mbtnCliente.setText("Paciente");
		toolBar.add(mbtnCliente);
		mbtnSisodonto.setBackground(new Color(249, 240, 107));
		toolBar.add(mbtnSisodonto);
		
		Miboton mbtnSisodonto_1 = new Miboton();
		toolBar.add(mbtnSisodonto_1);
		
		Miboton mbtnOdontologo = new Miboton();
		mbtnOdontologo.setBackground(Color.YELLOW);
		mbtnOdontologo.setFont(new Font("Dialog", Font.PLAIN, 12));
		mbtnOdontologo.setText("Odontologo");
		toolBar.add(mbtnOdontologo);
		
		PanelFondo panelFondo = new PanelFondo();
		panelFondo.setFondo("fondo3.jpg");
		contentPane.add(panelFondo, BorderLayout.CENTER);

	}
	
	private  void abrirRegistroCliente() {
	vPaciente = new VentanaPaciente();
	vPaciente.setUpController();
	vPaciente.setVisible(true);
	}

	private  void abrirRegistroProducto() {
		
	}
}
