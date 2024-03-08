import java.util.*;

public class EmployeParent {
    int id ;
    String name ;
    long ph ;
    int salary ;
    int noOFDay;
    EmployeParent(int id, String name,long ph,int salary,int noOFDay){
       this.id =id;
       this.name=name;
       this.ph=ph;
       this.salary=salary;
       this.noOFDay=noOFDay;
    }

    void getSalary() {
        int getSalary = salary * noOFDay;
        System.out.println("salary" + getSalary);
    }

}

class staff extends EmployeParent {
    String role;
    int yearofexperience ;
    String dep  ;
     staff(String role,int yearofexperience, String dep,int id,String  name,long ph,int salary,int noOFDay){
        super(id,  name, ph, salary, noOFDay);
        this.role=role;
        this.yearofexperience=yearofexperience;
        this.dep = dep;


     } 
    

    void getDetails() {
       
        System.out.println("role" + role);
        System.out.println("year of experience" + yearofexperience);
        System.out.println("dep" + dep);
        getSalary();
    }

    public static void main(String[] args) {
        staff st = new staff("employee",5,"cse",21,"mahithosh",9360069781l,5000,30);
        st.getDetails();
    }

}
