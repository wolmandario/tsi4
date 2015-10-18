//package repository;
//
//import java.util.List;
//
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import model.SimpleProperty;
//
//@SuppressWarnings("unchecked")
//public class RepositoryManager {
//	 
//    @Inject
//    private EntityManager em;
//
//	public List<SimpleProperty>  queryCache(){
//        Query query = em.createQuery("select sp FROM model.SimpleProperty sp");
//
//        List<SimpleProperty> list = query.getResultList();
//        
//        return list;          
//    }
//}