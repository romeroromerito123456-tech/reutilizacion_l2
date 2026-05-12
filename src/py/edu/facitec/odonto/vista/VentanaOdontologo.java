package py.edu.facitec.odonto.vista;

import java.awt.EventQueue;

import javax.swing.JDialog;

import py.edu.facitec.odonto.componentes.ventana.VentanaGenerica;
import py.edu.facitec.odonto.modelo.controladores.VentanaOdontologoController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaOdontologo extends VentanaGenerica {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblEmail;
	private JLabel lblDocumento;
	private JLabel lblApellido;
	private JLabel lblNewLabel;
	private JLabel lblTelefono;
	private JLabel lblDireccin;
	private JLabel lblNroDeRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOdontologo dialog = new VentanaOdontologo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					
					//instanciamos el controlador antes de mostrar
					dialog.setUpController();
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//metodo que instancia el contralador para los botones
	public VentanaOdontologoController setUpController() {
		return new VentanaOdontologoController(this);
	}
	/**
	 * Create the dialog.
	 */
	public VentanaOdontologo() {
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(162, 158, 190, 20);
		getPanelFormulario().add(textField);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(34, 205, 78, 14);
		getPanelFormulario().add(lblEmail);
		
		lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDocumento.setBounds(34, 119, 78, 14);
		getPanelFormulario().add(lblDocumento);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido.setBounds(34, 77, 78, 14);
		getPanelFormulario().add(lblApellido);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(34, 36, 78, 14);
		getPanelFormulario().add(lblNewLabel);
		
		lblTelefono = new JLabel("telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefono.setBounds(34, 161, 78, 14);
		getPanelFormulario().add(lblTelefono);
		
		lblDireccin = new JLabel("Dirección");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDireccin.setBounds(34, 247, 78, 14);
		getPanelFormulario().add(lblDireccin);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 244, 374, 20);
		getPanelFormulario().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 202, 374, 20);
		getPanelFormulario().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 116, 190, 20);
		getPanelFormulario().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 74, 374, 20);
		getPanelFormulario().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(162, 33, 374, 20);
		getPanelFormulario().add(textField_5);
		
		lblNroDeRegistro = new JLabel("Nro de Registro");
		lblNroDeRegistro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNroDeRegistro.setBounds(34, 292, 118, 14);
		getPanelFormulario().add(lblNroDeRegistro);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 289, 190, 20);
		getPanelFormulario().add(textField_6);
		

	}

	@Override
	protected String getTitulo() {
		return "REGISTRO DE ODONTOLOGO";
	}

	@Override
	protected String getTituloFormulario() {
		return "Datos del Odontologo";
	}
}
