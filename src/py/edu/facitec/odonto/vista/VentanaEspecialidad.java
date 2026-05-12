package py.edu.facitec.odonto.vista;

import java.awt.EventQueue;

import javax.swing.JDialog;

import py.edu.facitec.odonto.componentes.ventana.VentanaGenerica;
import py.edu.facitec.odonto.modelo.controladores.VentanaClienteController;
import py.edu.facitec.odonto.modelo.controladores.VentanaEspecialidadController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import py.edu.facitec.odonto.componentes.botones.toolbar.MiToolbar;

public class VentanaEspecialidad extends VentanaGenerica {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEspecialidad dialog = new VentanaEspecialidad();
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
	public VentanaEspecialidadController setUpController() {
		return new VentanaEspecialidadController(this);
	}
	/**
	 * Create the dialog.
	 */
	public VentanaEspecialidad() {
		
		lblNewLabel = new JLabel("Especialidad");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 49, 78, 14);
		getPanelFormulario().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 48, 190, 20);
		getPanelFormulario().add(textField);
		

	}

	@Override
	protected String getTitulo() {
		
		return "REGISTRO DE ESPECIALIDADES";
	}

	@Override
	protected String getTituloFormulario() {
		
		return "Datos de la Especialidad";
	}
}
