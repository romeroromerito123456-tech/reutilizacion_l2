package py.edu.facitec.odonto.vista;

import java.awt.EventQueue;

import javax.swing.JDialog;

import py.edu.facitec.odonto.componentes.ventana.VentanaGenerica;
import py.edu.facitec.odonto.modelo.controladores.VentanaClienteController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.github.lgooddatepicker.optionalusertools.PickerUtilities;
import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

public class VentanaPaciente extends VentanaGenerica {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel;
	private JLabel lblApellido;
	private JLabel lblDocumento;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblDireccin;
	private JLabel lblGenero;
	private JLabel lblProfesion;
	private JLabel lblFechaDeRegistro;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPaciente dialog = new VentanaPaciente();
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
	
	
	
	//metodo que instancia el controlador para los botones 
	public VentanaClienteController setUpController() {
		return new VentanaClienteController(this);
	}
	
	/**
	 * Create the dialog.
	 */
	public VentanaPaciente() {
		getPanelFormulario().setBackground(Color.ORANGE);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 44, 78, 14);
		getPanelFormulario().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(153, 41, 374, 20);
		getPanelFormulario().add(textField);
		textField.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellido.setBounds(25, 85, 78, 14);
		getPanelFormulario().add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 82, 374, 20);
		getPanelFormulario().add(textField_1);
		
		lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDocumento.setBounds(25, 127, 78, 14);
		getPanelFormulario().add(lblDocumento);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 124, 190, 20);
		getPanelFormulario().add(textField_2);
		
		lblTelefono = new JLabel("telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelefono.setBounds(25, 169, 78, 14);
		getPanelFormulario().add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 166, 190, 20);
		getPanelFormulario().add(textField_3);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(25, 213, 78, 14);
		getPanelFormulario().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 210, 374, 20);
		getPanelFormulario().add(textField_4);
		
		lblDireccin = new JLabel("Dirección");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDireccin.setBounds(25, 255, 78, 14);
		getPanelFormulario().add(lblDireccin);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(153, 252, 374, 20);
		getPanelFormulario().add(textField_5);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGenero.setBounds(25, 297, 78, 14);
		getPanelFormulario().add(lblGenero);
		
		lblProfesion = new JLabel("Profesion");
		lblProfesion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfesion.setBounds(25, 344, 78, 14);
		getPanelFormulario().add(lblProfesion);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Masculino", "Femenino"}));
		comboBox.setBounds(154, 295, 189, 22);
		getPanelFormulario().add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Abogado", "Medico", "Ing.", "Lic.", "Profesor", "Vendedor", "Func. Publico", "Otro"}));
		comboBox_1.setBounds(153, 342, 190, 22);
		getPanelFormulario().add(comboBox_1);
		
		DatePicker datePicker = new DatePicker();
		datePicker.setBounds(153, 399, 190, 20);
		getPanelFormulario().add(datePicker);
		
		lblFechaDeRegistro = new JLabel("Fecha de Registro");
		lblFechaDeRegistro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaDeRegistro.setBounds(25, 399, 136, 14);
		getPanelFormulario().add(lblFechaDeRegistro);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(379, 399, 198, 20);
		getPanelFormulario().add(dateChooser);
		

	}

	@Override
	protected String getTitulo() {
	
		return "REGISTRO DE PACIENTE";
	}

	@Override
	protected String getTituloFormulario() {
		
		return "Datos del Paciente";
	}
}
