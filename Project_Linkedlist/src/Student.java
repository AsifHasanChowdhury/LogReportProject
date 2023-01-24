import java.util.ArrayList;

public class Student implements Comparable<Student>{
    public String studentName;
    public int sID;
    public String Dept;

    static ArrayList <Student> studentArrayList=new ArrayList<Student>();

    public ArrayList <Courses> studentEnrolled = new ArrayList<Courses>();

    public Student(String studentName,int sID,String Dept){
        this.studentName=studentName;
        this.sID=sID;
        this.Dept=Dept;
    }


    public void AddStudent(Student student){
        studentArrayList.add(student);
        System.out.println("Student is Added to the System");
    }


    public static void DeleteStudent(int id){
        for(int i=0; i<studentArrayList.size();i++){
            if(studentArrayList.get(i).sID==id){
                studentArrayList.remove(i);
                System.out.println("Student is Removed From the System");
            }
        }
    }

    public static void showAllstudents(){

        if(studentArrayList.size()>0) {

            for (int i = 0; i < studentArrayList.size(); i++) {
                System.out.println(studentArrayList.get(i).studentName);
                System.out.println(studentArrayList.get(i).sID);
                System.out.println(studentArrayList.get(i).Dept);
            }
        }
            else{
                System.out.println("No Student Available");
            }
        }


    @Override
    public int compareTo(Student o) {
        if(o.sID>sID){
            return -1;
        }
        else if(o.sID<sID){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void searchStudent(int id){
        boolean CheckStudent=false;

        for(int i=0; i<studentArrayList.size();i++){
            if(studentArrayList.get(i).sID==id){

                System.out.println("Student Name: "+studentArrayList.get(i).studentName);
                System.out.println("Student Name: "+studentArrayList.get(i).sID);
                System.out.println("Student Name: "+studentArrayList.get(i).Dept);
                CheckStudent=true;
            }


        }

        if(CheckStudent==false){
            System.out.println("No Student Found With This Record");
        }
    }


    public void AddCourse(String CourseName, String CourseID){
        if(Courses.CouserList.contains(Courses)){

        }
    }



}

