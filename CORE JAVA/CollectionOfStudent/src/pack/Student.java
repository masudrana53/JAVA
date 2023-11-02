
package pack;


public class Student {
    
    private int id;
    private String name;
    private String phone;
    private String email;

    
    
    public Student() {
    }
    
    public Student(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
//        return "Student{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + '}';
        return "Student ID= "+id+ ", Student Name= " +name+ ", Phone No= " +phone+ ", Email= " + email;
    }
    
    
    
    
    
    
    
}
