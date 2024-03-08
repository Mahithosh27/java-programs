public class StudentMarks {
    
    String name;
    int marks;
     StudentMarks(String name,int marks){
        this.name=name;
        this.marks=marks;

     }

     char calc(){
        if(marks>90){
            return 'A';
        }
        else if (marks>80) {
            return 'B';
        }
        else if(marks>70){
            return 'C';

        }
        else{
            return 'f';
        }
     }
     public String getName() {
         return name;
     }
     public static void main(String[] args) {
        StudentMarks s =new StudentMarks("mahithosh",98);
        System.out.println(s.name+" and marks he scored "+s.calc());
        
     }

      
}
