package bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import model.SimpleProperty;

@ManagedBean(name = "managerBB")
@ApplicationScoped
public class Manager {
  
//    @Inject
//    @Q1
//    IServiceBean ejb;
    
//    @Produces
    @Named
    private SimpleProperty property;
    
//    @Inject
//    Producer producer;
    
    private List<SimpleProperty> lista;
    
    private String clave;
    private String valor;
    
    
    public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public SimpleProperty getProperty() {
		return property;
	}

	public void setProperty(SimpleProperty property) {
		this.property = property;
	}

	public List<SimpleProperty> getLista() {
		return lista;
	}

	public void setLista(List<SimpleProperty> lista) {
		this.lista = lista;
	}

	@PostConstruct
    public void initNewProperty() {
		lista = new ArrayList<SimpleProperty>();
		
		property = new SimpleProperty();
    }
     
    public void save() throws Exception {
    	property.setKey(clave);
    	property.setValue(valor);
    	lista.add(property);
    	property = new SimpleProperty();
    }

//    public void clear(SimpleProperty property) {
//        ejb.delete(property);
//    }
 
    public void imprimirLista(){
    	for (SimpleProperty sp : lista) {
			System.out.println("Clave: "+sp.getKey());
			System.out.println("Valor: "+sp.getValue());
			System.out.println();
		}
    	
    }
    

}