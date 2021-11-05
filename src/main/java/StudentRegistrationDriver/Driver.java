package StudentRegistrationDriver;

import StudentRegistrationSystem.Course;
import StudentRegistrationSystem.Student;
import StudentRegistrationSystem.Module;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        // Creating Students

        Student barry = new Student("Barry Cooper", 20, new DateTime(2000, 12, 1, 0, 0));
        Student kyle = new Student("Kyle McGrath", 19, new DateTime(2001, 11, 16, 0, 0));
        Student graham = new Student("Graham Thompson", 18, new DateTime(2003, 4, 19, 0, 0));
        Student conor = new Student("Conor Ward", 19, new DateTime(2002, 3, 22, 0, 0));
        Student josh = new Student("Josh Connors", 22, new DateTime(1999, 4, 11, 0, 0));
        Student lisa = new Student("Lisa Bell", 21, new DateTime(2000, 6, 8, 0, 0));
        Student mary = new Student("Mary King", 23, new DateTime(1998, 9, 9, 0, 0));
        Student gemma = new Student("Gemma Fleming", 23, new DateTime(1997, 12, 25, 0, 0));
        Student sarah = new Student("Sarah Walsh", 20, new DateTime(2000, 11, 30, 0, 0));

        // Adding Students to ArrayList

        ArrayList<Student> students = new ArrayList<>();
        students.add(barry);
        students.add(kyle);
        students.add(graham);
        students.add(conor);
        students.add(josh);
        students.add(lisa);
        students.add(mary);
        students.add(gemma);
        students.add(sarah);

        // Creating Courses

        Course bct = new Course("Computer Science", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 5, 31, 0, 0));
        Course beng = new Course("Undenominated Engineering", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 5, 31, 0, 0));
        Course bsci = new Course("General Science", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 5, 31, 0, 0));

        // Adding Courses to ArrayList

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(bct);
        courses.add(beng);
        courses.add(bsci);

        // Creating Modules

        Module ma180 = new Module("Maths", "MA180");
        Module ee117 = new Module("Electronic Engineering", "EE117");
        Module py111 = new Module("Physics", "PY111");
        Module ct516 = new Module("Software Engineering", "CT516");
        Module ma469 = new Module("Calculus", "MA469");

        // Adding Modules to Course A

        bct.addModule(ma180, true);
        bct.addModule(ee117, true);
        bct.addModule(ct516, true);

        // Adding Students to Course A

        bct.addStudent(barry, true);
        bct.addStudent(graham, true);
        bct.addStudent(conor, true);

        // Looping through Course A Students

        for(int i = 0; i < bct.getStudents().size(); i++){

            // Looping through Course A Modules

            for(int j = 0; j < bct.getModules().size(); j++){

                // Add Module to Student

                bct.getStudents().get(i).addModule(bct.getModules().get(j), true);

            }

        }

        // Adding Modules to Course B

        beng.addModule(py111, true);
        beng.addModule(ee117, true);
        beng.addModule(ma469, true);

        // Adding Students to Course B

        beng.addStudent(josh, true);
        beng.addStudent(sarah, true);
        beng.addStudent(kyle, true);

        // Loop through Course B Students

        for(int i = 0; i < beng.getStudents().size(); i++){

            // Loop through Course B Modules

            for(int j = 0; j < beng.getModules().size(); j++){

                // Add Module to Student

                beng.getStudents().get(i).addModule(beng.getModules().get(j), true);

            }

        }

        // Adding Modules to Course C

        bsci.addModule(ma180, true);
        bsci.addModule(py111, true);
        bsci.addModule(ma469, true);

        // Adding Students to Course C

        bsci.addStudent(lisa, true);
        bsci.addStudent(mary, true);
        bsci.addStudent(gemma, true);

        // Loop through Course C Students

        for(int i = 0; i < bsci.getStudents().size(); i++){

            // Loop through Course C Modules

            for(int j = 0; j < bsci.getModules().size(); j++){

                //Add Module to Student

                bsci.getStudents().get(i).addModule(bsci.getModules().get(j), true);

            }

        }

        // Print Out Course Information

        System.out.println("\n--- COLLEGE COURSES ---\n");

        // Loop through Courses

        for(int i = 0; i < courses.size(); i++){

            // Print out Data

            System.out.println("Course Name: "+courses.get(i).getName());
            System.out.println("Start Date: "+courses.get(i).getStartDate().toString(DateTimeFormat.longDate()));
            System.out.println("End Date: "+courses.get(i).getEndDate().toString(DateTimeFormat.longDate()));
            System.out.print("Modules: ");

            // Loop through Modules

            for(int j = 0; j < courses.get(i).getModules().size(); j++){

                // Print out Data

                System.out.print(courses.get(i).getModules().get(j).getName()+" ("+courses.get(i).getModules().get(j).getID()+"), ");

            }

            System.out.print("\nStudents: ");

            // Loop through Students

            for(int j = 0; j < courses.get(i).getStudents().size(); j++){

                // Print out Data

                System.out.print(courses.get(i).getStudents().get(j).getName()+" ("+courses.get(i).getStudents().get(j).getUsername()+"), ");

            }

            System.out.println("\n");

        }

        // Print out Student Information

        System.out.println("\n--- COLLEGE STUDENTS ---\n");

        // Loop through Students

        for(int i = 0; i < students.size(); i++){

            // Print out Data

            System.out.println("Name: "+students.get(i).getName());
            System.out.println("Username: "+students.get(i).getUsername());
            System.out.println("Date of Birth: "+students.get(i).getDOB().toString(DateTimeFormat.longDate())+" ("+students.get(i).getAge()+" years old)");
            System.out.print("Courses: ");

            // Loop through Courses

            for(int j = 0; j < students.get(i).getCourses().size(); j++){

                // Print out Data

                System.out.print(students.get(i).getCourses().get(j).getName());

            }

            System.out.print("\nModules: ");

            // Loop through Modules

            for(int j = 0; j < students.get(i).getModules().size(); j++){

                // Print out Data

                System.out.print(students.get(i).getModules().get(j).getName()+" ("+students.get(i).getModules().get(j).getID()+"), ");

            }

            System.out.println("\n");

        }

    }

}
