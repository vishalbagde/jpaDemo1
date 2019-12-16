package demo;

import model.*;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.PersonName;
/*
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String os() default "symbian";
	int version();
}

@SmartPhone(os="android",version=6)
class A
{
	public void show()
	{
		
	}
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("in A");
	}
	
}
class B extends A
{
	@Override
	@SuppressWarnings("unchecked")
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("in A");
	}
	
	@Deprecated
	public void show()
	{
		
	}
}
*/
public class Main {
	/*
	public enum operation {
		INSERT(1), UPDATE(2), DELETE(3), DISPLAY(4), EXIT(5), IDLE(6);

		private int value;

		private operation(int value) {
			this.value = value;
		}

		public void setOperation(int value) {
			this.value = value;
		}

		public int getOperation() {
			return this.value;
		}

	}
	 */
	public static void main(String src[]) {
		
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		 EntityManager em = emf.createEntityManager();
		
//		 CriteriaBuilder cb =em.getCriteriaBuilder();
//		 CriteriaQuery<Person> createQuery= cb.createQuery(Person.class);
//		 Root<Person> from= createQuery.from(Person.class);
//		 createQuery.select(from);		 
//		 TypedQuery<Person> typedQuery= em.createQuery(createQuery);
//		 
//		 List<Person> list =typedQuery.getResultList();
//		 for(Person p:list)
//		 {
//			 System.out.println(p.toString());
//		 }
//
//		 List<Object[]> persons=em.createNativeQuery("select * from person").getResultList();
//		 persons.forEach((o)->System.out.println(o[1]));
		
		 em.getTransaction().begin();
		 
		 Contact c=new Contact();
		 	 
		  Query query =em.createQuery("update Contact set phone_no = '9898989898' where contact_id = 13");
	      query.executeUpdate();
	     
	     em.getTransaction().commit();
		
		
		 
		 emf.close();	
		 em.close();
		 
		 
		 
		 
		 
	
		/*
		A a=new A();
		Class x=a.getClass();
		Annotation an=x.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone) an;
		System.out.println(s.os());
		
		*/
		
		
		
		/*
		operation op = operation.IDLE;

		do {
			Scanner in = new Scanner(System.in);
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.DISPLAY");
			System.out.println("5.EXIT");
			System.out.print("Select Option:");
			int ch = in.nextInt();
			
			op.setOperation(ch);
			System.out.println(op.getOperation());
			
			if(op.equals(operation.INSERT))
				System.out.println("insert op");
			
			switch (op) {
			case INSERT:
				System.out.println("INSERT");
				break;
			case UPDATE:
				break;
			case DELETE:
				break;
			case DISPLAY:
				break;
			case EXIT:
				System.out.println("Exit");
				break;
			default:

			}

		} while (op == operation.EXIT);
		
		*/

		/*
		 * 
		 * EntityManagerFactory creEmp = Persistence.createEntityManagerFactory("pu");
		 * EntityManager em = creEmp.createEntityManager(); em.getTransaction().begin();
		 * PersonName pn = new PersonName(); pn.setFname("vishal");
		 * pn.setMname("govind"); pn.setLname("bagde");
		 * 
		 * em.persist(pn); em.getTransaction().commit(); em.close(); creEmp.close();
		 * 
		 */

	}

}
