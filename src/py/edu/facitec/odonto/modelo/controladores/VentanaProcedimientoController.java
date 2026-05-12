package py.edu.facitec.odonto.modelo.controladores;

import py.edu.facitec.odonto.componentes.interfaces.AccionesABM;
import py.edu.facitec.odonto.vista.VentanaProcedimiento;

public class VentanaProcedimientoController implements AccionesABM {
	
	//para hacer la conexion con procedimiento
	private VentanaProcedimiento vprocedimiento;
	
	

	public VentanaProcedimientoController(VentanaProcedimiento vprocedimiento) {
		this.vprocedimiento = vprocedimiento;
		this.vprocedimiento.getMiToolbar().setAcciones(this);
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
		vprocedimiento.dispose();
	}
	

}
