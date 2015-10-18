//package ejb;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import javax.enterprise.context.RequestScoped;
//import javax.interceptor.AroundInvoke;
//import javax.interceptor.InvocationContext;
//
//import model.SimpleProperty;
//import qualifiers.Q2;
//
//@RequestScoped
//@Q2
//public class ServiceBean2 implements IServiceBean {
//
//
////	@Inject
////	private Event<SimpleProperty> propEventSrc;
////
////	@Inject
////	private EntityManager em;
//	
//	public ServiceBean2() {
//		System.out.println("Este es el constructor de Service Bean 2");
//	}
//	
//	@PostConstruct
//	public void init(){
//		System.out.println("Este es el Post Construct");
//	}
//	
//	@PreDestroy
//	public void pre(){
//		System.out.println("Este es el Pre Destroy");
//	}
//
//	@Override
//	public void put(SimpleProperty p) throws Exception{
//		
//		System.out.println("Esta es una variante del Put de Service Bean");
//		throw new Exception();
//	}
//
//	@Override
//	public void delete(SimpleProperty p) {
//
//		System.out.println("Esta es una variante del Delete de ServiceBean");
//		
//
//	}
//	
//	@AroundInvoke
//	private Object logMethod(InvocationContext ic) throws Exception{
//		System.out.println("ANTES de entrar al método: \n");
//		System.out.println("Target ---> "+ic.getTarget().toString());
//		System.out.println("Name Method ---> "+ ic.getMethod().getName());
//		
//		try {
//			return ic.proceed();
//		} catch (Exception e) {
//			System.out.println("Se generó Error en -----------------> "+ic.getMethod().getName());
//			return null;
//		} finally {
//			System.out.println("DESPUES de salir del método: \n");
//			System.out.println("Target ---> "+ic.getTarget().toString());
//			System.out.println("Name Method ---> "+ ic.getMethod().getName());
//		}
//	}
//
//}