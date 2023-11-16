/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author user
 */
public class EmployeeDao {
    
    
    public boolean addEmployee(Employee s){
        
        Transaction t = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
        t = session.beginTransaction();
        session.saveOrUpdate(s);
        t.commit();
        
        return true;
        
        } 
        catch(Exception e){
          e.printStackTrace();
          t.rollback();
        }
        
        finally{
            
            session.close();
        }
        return false;
    }
    
    
    
    public boolean deleteEmployee (int id){
        Transaction t = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            t = session.beginTransaction();
            Employee stud = (Employee) session.load(Employee.class, new Integer(id));
            session.delete(stud);
            t.commit();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            session.close();
        }
        
        return false;
    }
    

    
    public java.util.List<Employee> viewAllEmployee(){
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
//        List<Employee> sList = session.createQuery("SELETE e FROM Employee e").list();
        java.util.List<Employee> sList = session.createQuery("SELECT e FROM Employee e").list();
        
        sList.toString();
        
        return sList;
        
    }
    
//    public List<Student> viewAllStudent() {
//
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        Session session = factory.openSession();
//        List<Student> sList = session.createQuery("SELECT s FROM Student s").list();
//
//        sList.toString();
//
//        return sList;
//
//    }
    
    
    
    public void updateStudent(Employee employee){
        
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(employee);
            trans.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            trans.rollback();
        }
        finally{
            session.close();
        }
    }
    
    
    
    public Employee getEmployeeById(int id){
    	System.out.println("Get employee by Id = " +id+ "\n.....................");
        Session session = null;
        Employee stu = null;
        try {
        	
            session = HibernateUtil.getSessionFactory().openSession();
            stu = (Employee) session.get(Employee.class, id);
 
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return stu;
    }
    
    
}
