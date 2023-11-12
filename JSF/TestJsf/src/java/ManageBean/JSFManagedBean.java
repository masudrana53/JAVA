/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBean;

import dao.StudentDao;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Student;

/**
 *
 * @author user
 */
@ManagedBean
@SessionScoped
public class JSFManagedBean {
    
    private Student student = new Student();
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
    
    public void saveStudent(){
        StudentDao dao=new StudentDao();
        boolean status = dao.addStudent(student);
        
        if(status){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            
        }
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data Not Saved", ""));
        }
        
    }
 
    
    
    public List<Student> showAllStudent(){
        StudentDao dao=new StudentDao();
        List<Student> stlist = dao.viewAllStudent();
        return stlist;
    }
    
    
    public JSFManagedBean() {
    }
    
}
