package PQR.XYZ.ABC;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	/*
    	
    	Identity name = new Identity();
    	name.setFirstname("jatin");
    	name.setLastname("agarwal");
    	
    	Alien object = new Alien();
    	
    	object.setAid(100);
    	object.setAlienname(name);
    	object.setColor("green");
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);    	
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    //	SessionFactory sf = con.buildSessionFactory();
    	
    	SessionFactory sf = con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(object);
    	
    	tx.commit();
    	
    	//System.out.println(object);
    
    	*/
    	
    	
    	/*
    	
    	Laptop laptop = new Laptop();
    	laptop.setLid(100);
    	laptop.setLname("mac-book");
    	
    	
    	Student student = new Student();
    	student.setSid(125);
    	student.setSname("mohit");
    	student.setMarks(100);
    	
//		one to one    	
//    	student.setLaptop(laptop);
  
//		one to many    	
    	student.getLaptop().add(laptop);

//		many to many    	
//    	laptop.getStudent().add(student);
  
// 		many to one
    	laptop.setStudent(student);
    	
    	*/
    	
    	/*
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);    	
//    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf = con.buildSessionFactory(reg);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	
//    	session.save(laptop);
//   	session.save(student);
  

//		eager and lazy fetch
    	
      	Student s = (Student) session.get(Student.class, 125);
    	
    	List<Laptop> laps = s.getLaptop();
    	for(Laptop l : laps)
    	{	
    		System.out.println(l);
    	}
		
    	
    	// the method will not fetch list of foriegn element itsel lazy fetch 
    	
    	// the method will fetch all element by itself will be eager fetch
    	
    	
    	session.getTransaction().commit();

		*/
    	
//    	Alien object = new Alien();
  
//    	Alien object = null;
    	
//   	object.setAid(150);
//   	object.setAname("radha");
//   	object.setColor("green");
    	
    	/*
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	
//    	session1.save(object);
  
    	object = (Alien) session1.get(Alien.class, 125);
    	System.out.println(object);

//    	object = (Alien) session1.get(Alien.class, 125);
//    	System.out.println(object);

    	
    	session1.getTransaction().commit();
    	session1.close();
    	
    	Session session2 = sf.openSession();
    	session2.beginTransaction();

    	
    	object = (Alien) session2.get(Alien.class, 125);
    	System.out.println(object);

//    	session1.getTransaction().commit();
    	session2.getTransaction().commit();
    	session2.close();
    
    	*/
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	session.beginTransaction();

    	// HQL
    	
    	/*
    	
    	for(int i=1;i<=10;i++)
    	{
    		Alien a = new Alien();
    		a.setAid(i);
    		a.setAname("alien_" + i);
    		a.setColor("green");
    		session.save(a);
    		
    	}
    	
    	*/
    	
    	/*
    	
//    	Query q = session.createQuery("from Alien");
//    	Query q = session.createQuery("from Alien where aid = 125");
//    	Query q = session.createQuery("select aid,aname,color from Alien where aid = 125");
//    	Query q = session.createQuery("select aid,aname,color from Alien");
//    	Query q = session.createQuery("select aid,aname,color from Alien a where a.aid = 125");
    	Query q = session.createQuery("select sum(aid) from Alien a where a.color = 'green'");

//    	int m = 5
//    	Query q = session.createQuery("select aid,aname,color from Alien a where a.aid = m");
//    	q.setParameter("m", m);
    	
//    	List<Alien> alien = q.list();  // q.uniqueResult() ;
//    	Object[] alien = (Object[]) q.uniqueResult(); 
//    	List<Object[]> alien = (List<Object[]>) q.list();
    	Long aid = (Long) q.uniqueResult();
    	
//    	System.out.println(alien[0] + " " + alien[1] + " " + alien[2]);
    	System.out.println(aid);
    	
    	
//    	for(Alien a : alien)
//    	for(Object o : alien)
    	
    	
    	
		for(Object[] o : alien)
    	{
//    		System.out.println(o);
    		System.out.println(o[0] + " " + o[1] + " " + o[2]);
    	}
    	
    	
    	
    	session.getTransaction().commit();
    
    	*/
    }
}
