package soap.cibertec.interfaces;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import soap.cibertec.entidad.Producto;

@WebService(name="servicio")
public interface ProductoDAO {
	@WebMethod
	public int guardarProducto(Producto bean);
	@WebMethod
	public List<Producto> listarProductosRangoPrecio(double minimo, double maximo);
}


