abstract class salary {
    abstract void getcompanyName();

    abstract void getsalary();

    void getdetails() {
        String name = "mahithosh";
        String dept = "CSE";
        int salary = 1000;
    }

    abstract protected int getWorkingdays();
}
    class departmentstaff extends salary {
        void getsalary() {
            int salary = 12000;
            System.out.println(salary);
        }

        void getcompanyName() {
            String company_name = "zoho";
            System.out.println(company_name);

        }

        void detailstaf() {
            String teacher_name = "harsha sir";
            System.out.println(teacher_name);

        }

        protected int getWorkingdays() {
            int days = 12;
            System.out.println("working days " + days);
            return days;
        }
    }

    class nontechstaff extends salary {
        void getsalary() {
            int salary = 12000;
            System.out.println(salary);
        }

        void getcompanyName() {
            System.out.println("intel");
        }

        protected int getWorkingdays() {
            int days = 12;
            System.out.println("working days " + days);
            return days;
        }
    }

    class storemanagement extends salary {
        void getsalary() {
            int salary = 12000;
            System.out.println(salary);
        }

        void getcompanyName() {
            System.out.println("asus");
        }

        protected int getWorkingdays() {
            int days = 12;
            System.out.println("working days " + days);
            return days;
        }
    }

public class inheritance {
    public static void main(String[] args) {
        salary obj = new departmentstaff();
        obj.getsalary();
        obj.getcompanyName();
        obj.getWorkingdays();
        salary obj1 = new nontechstaff();
        obj1.getsalary();
        obj1.getcompanyName();
        salary obj2 = new storemanagement();
        obj2.getsalary();
        obj2.getcompanyName();
    }

}
