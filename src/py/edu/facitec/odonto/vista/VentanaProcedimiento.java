package py.edu.facitec.odonto.vista;

import java.awt.EventQueue;

import javax.swing.JDialog;

import py.edu.facitec.odonto.componentes.ventana.VentanaGenerica;
import py.edu.facitec.odonto.modelo.controladores.VentanaEspecialidadController;
import py.edu.facitec.odonto.modelo.controladores.VentanaProcedimientoController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class VentanaProcedimiento extends VentanaGenerica {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblMonto;
	private JLabel lblDescripcin;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProcedimiento dialog = new VentanaProcedimiento();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					
					//para instanaciar el controlador 
					dialog.setUpController();
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//metodo para instanciar
	public VentanaProcedimientoController setUpController() {
		return new VentanaProcedimientoController(this);
	}

	/**
	 * Create the dialog.
	 */
	public VentanaProcedimiento() {
		getPanelFormulario().setBackground(SystemColor.info);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 52, 78, 14);
		getPanelFormulario().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(159, 49, 374, 20);
		getPanelFormulario().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(159, 90, 374, 20);
		getPanelFormulario().add(textField_1);
		
		lblDescripcin = new JLabel("Descripción");
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcin.setBounds(31, 93, 110, 14);
		getPanelFormulario().add(lblDescripcin);
		
		lblMonto = new JLabel("Monto");
		lblMonto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMonto.setBounds(31, 135, 78, 14);
		getPanelFormulario().add(lblMonto);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 132, 190, 20);
		getPanelFormulario().add(textField_2);
		

	}

	@Override
	protected String getTitulo() {
		// 
		return "REGISTRO DE PROCEDIMIENTOS";
	}

	@Override
	protected String getTituloFormulario() {
		// TODO Auto-generated method stub
		return "Datos del Procedimiento";
	}

}
