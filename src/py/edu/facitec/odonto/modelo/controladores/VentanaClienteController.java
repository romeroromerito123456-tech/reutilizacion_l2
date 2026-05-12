package py.edu.facitec.odonto.modelo.controladores;

import py.edu.facitec.odonto.componentes.interfaces.AccionesABM;
import py.edu.facitec.odonto.vista.VentanaPaciente;

public class VentanaClienteController implements AccionesABM{

	//para hacer conexion con la ventana de clientes
	private VentanaPaciente vcliente;
	
	
	//constructor por parametro 
	public VentanaClienteController(VentanaPaciente vcliente) {
		this.vcliente = vcliente;
		this.vcliente.getMiToolbar().setAcciones(this);
	}


	@Override
	public void nuevo() {
		System.out.println("nuevo cliente");
	}


	@Override
	public void modificar() {
		System.out.println("la modificacion funciona ");
	}


	@Override
	public void eliminar() {
		System.out.println("eliminar funciona ");
	}


	@Override
	public void guardar() {
		System.out.println("guardar ok ");
	}


	@Override
	public void cancelar() {
		System.out.println("cancelar ok");
	}


	@Override
	public void salir() {
		vcliente.dispose();
	}
	
	
	
}
