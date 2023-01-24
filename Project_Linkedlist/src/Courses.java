import java.util.ArrayList;
import java.util.HashSet;

public class Courses {
    String courseName;
    String courseID;
    private int seatStatus=4;

    private ArrayList<Courses> CouserList=new ArrayList<>();

    public Courses(String cName, String cID){
        if(CouserList.contains(cName)|| CouserList.contains(cID)){
            System.out.println("Course is Already Available Just Enroll Yourself");
        }
        else{
            courseName=cName;
            courseID=cID;
        }
    }

    public void MasterCourseList(Courses course){
        CouserList.add(course);
    }

    public void MasterCourseListCheck(Courses course){

    }


}
