package soap.cibertec.servicio;
import java.util.List;
import javax.jws.WebService;
import soap.cibertec.dao.ProductoDAOImpl;
import soap.cibertec.entidad.Producto;
import soap.cibertec.interfaces.ProductoDAO;
@WebService(name="servicioProducto", endpointInterface="soap.cibertec.interfaces.ProductoDAO")
public class ProductoServiceImpl implements ProductoDAO{
	private ProductoDAOImpl dao=new ProductoDAOImpl();
	
	@Override
	public int guardarProducto(Producto bean) {
		return dao.guardarProducto(bean);
	}
	
	@Override
	public List<Producto> listarProductosRangoPrecio(double minimo, double maximo) {
		return dao.listarProductosRangoPrecio(minimo, maximo);
	}


}

