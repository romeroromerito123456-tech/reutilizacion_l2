package py.edu.facitec.odonto.modelo.controladores;

import py.edu.facitec.odonto.componentes.interfaces.AccionesABM;
import py.edu.facitec.odonto.vista.VentanaEspecialidad;

public class VentanaEspecialidadController implements AccionesABM {
	
	//para hacer la conexion con la ventana de especialidad
	private VentanaEspecialidad vespecialidad;
	
	
	//constructor por defecto
	public VentanaEspecialidadController(VentanaEspecialidad vespecialidad) {
		this.vespecialidad = vespecialidad;
		this.vespecialidad.getMiToolbar().setAcciones(this);
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
		vespecialidad.dispose();
	}
	

}
