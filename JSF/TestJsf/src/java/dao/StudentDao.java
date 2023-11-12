/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author user
 */
public class StudentDao {
    
    public boolean addStudent(Student s){
        
        Transaction t = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
        t = session.beginTransaction();
        session.save(s);
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
    
    
    public void deleteStudent (int id){
        Transaction t = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            t = session.beginTransaction();
            Student stud = (Student) session.load(Student.class, new Integer(id));
            session.delete(stud);
            t.commit();  
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public List<Student> getByID(int id){
        
        Student student = new Student();
        List<Student> sList = new ArrayList<Student>();
        
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            trans = session.beginTransaction();

            Query query = session.createQuery("from student where id= :id");
            query.setInteger("id", id);
            student = (Student) query.uniqueResult();
            sList = query.list();

            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sList;
    } 
    
    
    
    public List<Student> viewAllStudent(){
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Student> sList = session.createQuery("SELECT s FROM Student s").list();
        
        sList.toString();        
   
        return sList;
        
        
       
//        allList=new ArrayList();        
//        Student stud=new Student();
//        
//        Transaction trans=null;
//        
//        Session session=HibernateUtil.getSessionFactory().openSession();
//        try
//        {
//            trans=session.beginTransaction();
//            Query query=session.createQuery("from student");
//            
//            allList=query.list();
//            
//            allList.add(stud.getGivenName());
//            allList.add(stud.getLastName());
//            allList.add(stud.getSubject());
//            allList.add(stud.getGender());           
//         
//            trans.commit();
//            
//        }
//        catch(Exception e)
//        {
//            
//        }
//        return allList;
        
    }
        
    
        public void updateStudent(Student student){
        
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(student);
            trans.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
    }   
}
