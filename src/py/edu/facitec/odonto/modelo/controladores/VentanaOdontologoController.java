package py.edu.facitec.odonto.modelo.controladores;

import py.edu.facitec.odonto.componentes.interfaces.AccionesABM;
import py.edu.facitec.odonto.vista.VentanaOdontologo;

public class VentanaOdontologoController implements AccionesABM {
	
	//par ahacer conexion con la ventana de odontologo
	private VentanaOdontologo vodoltologo;
	
	
	//contractor por parametro 
	public VentanaOdontologoController(VentanaOdontologo vodoltologo) {
		this.vodoltologo = vodoltologo;
		this.vodoltologo.getMiToolbar().setAcciones(this);
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
		vodoltologo.dispose();
		
	}

}
