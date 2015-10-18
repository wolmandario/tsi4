//package ejb;
//
//import javax.ejb.Stateless;
//import javax.enterprise.event.Event;
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import model.SimpleProperty;
//import qualifiers.Q1;
//
//@Stateless
//@Q1
//public class ServiceBean implements IServiceBean { 
//
//	@Inject
//	private Event<SimpleProperty> propEventSrc;
//
//	@Inject
//	private EntityManager em;
//
//	@Override
//	public void put(SimpleProperty p) throws Exception {
//
//		em.persist(p);
//		propEventSrc.fire(p);
//	}
//
//	@Override
//	public void delete(SimpleProperty p) {
//
//		Query query = em.createQuery("delete FROM model.SimpleProperty p where p.key='" + p.getKey() + "'");
//
//		query.executeUpdate();
//		propEventSrc.fire(p);
//
//	}
//
//}