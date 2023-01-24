import java.util.Collections;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int input;
    for(;;){
            System.out.println("Press 1 to Add a Student");

            System.out.println("Press 2 to Delete a Student");

            System.out.println("Press 3 to Search a Student");

            System.out.println("Press 4 to Show All Student List");

            System.out.println("Press 5 to Add a Course");

            System.out.println("Press 6 to Drop a Course");

            System.out.println("Stop the Program");

            input=sc.nextInt();

            if(input==1){
                System.out.println("Please Give Student Name");
                String Name=sc.next();
                sc.nextLine();
                System.out.println("Please Give Student ID");
                int sID=sc.nextInt();
                System.out.println("Please Give Student Dept");
                String Dept=sc.next();

                Student student=new Student(Name,sID,Dept);
                student.AddStudent(student);
                Collections.sort(Student.studentArrayList);

            }

            else if(input==2){

                System.out.println("Please Give Student ID");
                int sID=sc.nextInt();
                Student.DeleteStudent(sID);
            }

            else if(input==3){
                System.out.println("Please Give Student ID");
                int sID=sc.nextInt();
                Student.searchStudent(sID);
            }

            else if(input==4){
                Student.showAllstudents();
            }

        }
    }
}
