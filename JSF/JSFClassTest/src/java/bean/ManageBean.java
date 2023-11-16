/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.EmployeeDao;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import model.Employee;

/**
 *
 * @author user
 */
@ManagedBean
@SessionScoped

public class ManageBean {
    
    private Employee employee = new Employee();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    public String saveEmployee() {
        EmployeeDao dao = new EmployeeDao();
        boolean status = dao.addEmployee(employee);

        if (status) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            return "index.xhtml?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Data Not Saved", ""));
        }
        return null;
    }
    
    
    
    public List<Employee> showAllEmployee(){
        
        EmployeeDao dao = new EmployeeDao();
        
        List<Employee> stlist = dao.viewAllEmployee();
        
        return stlist;
    }
    
//    public List<Employee> showAllEmployee() {
//        EmployeeDao dao = new EmployeeDao();
//        
//        
////        List<Employee> stlist =dao.viewAllEmployee();
//       
//        return stlist;
//    }
    
    
    
     public void delete(int id) {
        EmployeeDao dao = new EmployeeDao();
        boolean status = dao.deleteEmployee(id);

        if (status) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete Successfully", null));

            try {
                ExternalContext externalcontext = FacesContext.getCurrentInstance().getExternalContext();
                externalcontext.redirect("index.xhtml");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Delete Failed", null));
        }
    }
    
     
     
     public String editEmployee(int id) {
        EmployeeDao dao = new EmployeeDao();
        employee= dao.getEmployeeById(id);

        if (employee != null) {
            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("employee", employee);
            return "update.xhtml?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Product not found", ""));
            return null;
        }
    }
}
