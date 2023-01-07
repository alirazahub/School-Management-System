import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectTest extends InvalidIDException{

    public static List<Student> students = new ArrayList<Student>();
    public static List<Teacher> teachers = new ArrayList<Teacher>();

    public static void main(String[] args)
    {
        int id,st,age,houseNo;
        String name,country,city,gender,subject;
        Address address;

        Scanner input = new Scanner(System.in);

        System.out.println("          SCHOOL MANAGEMENT SYSTEM          ");
        System.out.printf("1.Admin\n2.Teacher\n3.Student\n4.Exit\n Select your choice: ");
        int opr = input.nextInt();

        while(opr < 1 || opr > 4)
        {
            System.out.printf("Invalid Choice(1-4)\n Enter again;");
            opr = input.nextInt();
        }

        while(opr != 4)
        {

            switch(opr)
            {
                case 1:	// Admin Functionality
                    System.out.printf("\n\n1.Enroll Student\n" +
                            "2.Disenroll Student\n" +
                            "3.Update Student Information\n" +
                            "4.View Student Information\n" +
                            "5.Enroll Teacher\n" +
                            "6.Disenroll Teacher\n" +
                            "7.Update Teacher Information\n" +
                            "8.View Teacher Information\n" +
                            "9.Go Back" +
                            "select your choice: ");
                    int ah = input.nextInt();

                    while(ah < 1 || ah > 9)
                    {
                        System.out.printf("     Invalid Choice(1-9)\n" +
                                "enter again:");
                        ah = input.nextInt();
                    }

                    while(ah != 9)
                    {
                        switch(ah)
                        {
                            case 1: // Enroll Students
                                System.out.printf("Enter Student ID: ");
                                try{
                                    id = input.nextInt();
                                    st = isStudent(id);
                                    if(st == -1)
                                    {
                                        System.out.printf("Enter name: ");
                                        name = input.next();

                                        System.out.printf("Enter age: ");
                                        age = input.nextInt();

                                        System.out.printf("Enter gender: ");
                                        gender = input.next();

                                        System.out.printf("Enter County name: ");
                                        country = input.next();

                                        System.out.printf("Enter City name: ");
                                        city = input.next();

                                        System.out.printf("Enter House.no: ");
                                        houseNo = input.nextInt();

                                        address = new Address(city , country , houseNo);
                                        students.add(new Student(id , name , age , gender , address));
                                    }
                                }
                                catch(InvalidIDException e ){

                                    {
                                        System.out.println("Invalid Id");
                                    }
                                }

                                break;

                            case 2: // Disenroll Students
                                if(students.isEmpty())
                                {
                                    System.out.printf("There are no Students currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                System.out.printf("Enter Student ID: ");
                                id = input.nextInt();
                                st = isStudent(id);
                                while(st == -1 || st != -2)
                                {
                                    System.out.printf("This Id does not exist in the database!\n" +
                                            "Please Try again(Press -2 to exit): ");
                                    id = input.nextInt();
                                    st = isStudent(id);
                                }
                                if(st == -2)
                                {
                                    break;
                                }
                                students.remove(st);
                                break;

                            case 3: // Update Student Information
                                if(students.isEmpty())
                                {
                                    System.out.printf("There are no Students currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                System.out.printf("Enter Student ID: ");
                                id = input.nextInt();
                                st = isStudent(id);
                                while(st == -1 || st != -2)
                                {
                                    System.out.printf("This Id does not exist in the database!\n" +
                                            "Please Try again(Press -2 to exit): ");
                                    id = input.nextInt();
                                    st = isStudent(id);
                                }
                                if(st == -2)
                                {
                                    break;
                                }

                                System.out.printf("Enter name: ");
                                name = input.next();

                                System.out.printf("Enter age: ");
                                age = input.nextInt();

                                System.out.printf("Enter gender: ");
                                gender = input.next();

                                System.out.printf("Enter County name: ");
                                country = input.next();

                                System.out.printf("Enter City name: ");
                                city = input.next();

                                System.out.printf("Enter House.no: ");
                                houseNo = input.nextInt();

                                address = new Address(city , country , houseNo);
                                students.get(st).setAdd(address);
                                students.get(st).setName(name);
                                students.get(st).setAge(age);
                                students.get(st).setGender(gender);

                                break;

                            case 4: // View Student Information
                                if(students.isEmpty())
                                {
                                    System.out.printf("There are no Students currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                displayStudents();
                                break;

                            case 5: // Enroll Teachers
                                System.out.printf("Enter Teacher ID: ");
                                id = input.nextInt();
                                st = isTeacher(id);

                                if(st == -1)
                                {
                                    System.out.printf("Enter name: ");
                                    name = input.next();

                                    System.out.printf("Enter age: ");
                                    age = input.nextInt();

                                    System.out.printf("Enter gender: ");
                                    gender = input.next();

                                    System.out.printf("Enter subject: ");
                                    subject = input.next();

                                    System.out.printf("Enter County name: ");
                                    country = input.next();

                                    System.out.printf("Enter City name: ");
                                    city = input.next();

                                    System.out.printf("Enter House.no: ");
                                    houseNo = input.nextInt();

                                    address = new Address(city , country , houseNo);
                                    teachers.add(new Teacher(id , name , age , gender , subject , address));
                                }

                                break;

                            case 6: // Disenroll Teachers
                                if(teachers.isEmpty())
                                {
                                    System.out.printf("There are no Teachers currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                System.out.printf("Enter Teacher ID: ");
                                id = input.nextInt();
                                st = isTeacher(id);
                                while(st == -1 || st != -2)
                                {
                                    System.out.printf("This Id does not exist in the database!\n" +
                                            "Please Try again(Press -2 to exit): ");
                                    id = input.nextInt();
                                    st = isTeacher(id);
                                }
                                if(st == -2)
                                {
                                    break;
                                }
                                teachers.remove(st);
                                break;

                            case 7: // Update Teachers Information
                                if(teachers.isEmpty())
                                {
                                    System.out.printf("There are no Teachers currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                System.out.printf("Enter Teacher ID: ");
                                id = input.nextInt();
                                st = isTeacher(id);
                                while(st == -1 || st != -2)
                                {
                                    System.out.printf("This Id does not exist in the database!\n" +
                                            "Please Try again(Press -2 to exit): ");
                                    id = input.nextInt();
                                    st = isTeacher(id);
                                }
                                if(st == -2)
                                {
                                    break;
                                }

                                System.out.printf("Enter name: ");
                                name = input.next();

                                System.out.printf("Enter age: ");
                                age = input.nextInt();

                                System.out.printf("Enter gender: ");
                                gender = input.next();

                                System.out.printf("Enter subject: ");
                                subject = input.next();

                                System.out.printf("Enter County name: ");
                                country = input.next();

                                System.out.printf("Enter City name: ");
                                city = input.next();

                                System.out.printf("Enter House.no: ");
                                houseNo = input.nextInt();

                                address = new Address(city , country , houseNo);
                                teachers.get(st).setAdd(address);
                                teachers.get(st).setName(name);
                                teachers.get(st).setAge(age);
                                teachers.get(st).setGender(gender);
                                teachers.get(st).setTeacherSubject(subject);

                                break;

                            case 8: // View Teachers Information
                                if(teachers.isEmpty())
                                {
                                    System.out.printf("There are no Teachers currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                displayTeachers();
                                break;
                        }
                        System.out.printf("\n\n1.Enroll Student\n" +
                                "2.Disenroll Student\n" +
                                "3.Update Student Information\n" +
                                "4.View Student Information\n5.Enroll Teacher\n" +
                                "6.Disenroll Teacher\n" +
                                "7.Update Teacher Information\n" +
                                "8.View Teacher Information\n" +
                                "9.Go Back\n" +
                                "select your choice: ");
                        ah = input.nextInt();

                        while(ah < 1 || ah > 9)
                        {
                            System.out.printf("\nInvalid Choice(1-9)\n" +
                                    "enter again:");
                            ah = input.nextInt();
                        }
                    }
                    break;

                case 2: // Teacher Functionality
                    if(teachers.isEmpty())
                    {
                        System.out.printf("There are no Teachers currently Enrolled!\n" +
                                "Please ask the admin for admission\n" +
                                "Thank You!!!\n");
                        break;
                    }
                    System.out.printf("Enter Teacher ID: ");
                    id = input.nextInt();
                    st = isTeacher(id);
                    while(st == -1 || st != -2)
                    {
                        System.out.printf("This Id does not exist in the database!\n" +
                                "Please Try again(Press -2 to exit): ");
                        id = input.nextInt();
                        st = isTeacher(id);
                    }
                    if(st == -2)
                    {
                        break;
                    }

                    System.out.printf("\n\n\tName: %s\t\tID: %d\n\n",
                            teachers.get(st).getName() , teachers.get(st).getTeacherId());
                    System.out.printf("1.Update Student Marks\n" +
                            "2.View Complete Student Information\n" +
                            "3.Go Back");
                    int th = input.nextInt();
                    while(th < 1 || th > 3)
                    {
                        System.out.printf("Invalid Choice(1-3)\nEnter again:");
                        th = input.nextInt();
                    }

                    while(th != 3)
                    {
                        switch(th)
                        {
                            case 1: // Update Student Marks
                                if(students.isEmpty())
                                {
                                    System.out.printf("There are no Students currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                System.out.printf("Enter Student ID: ");
                                id = input.nextInt();
                                st = isStudent(id);
                                while(st == -1 || st != -2)
                                {
                                    System.out.printf("This Id does not exist in the database!\n" +
                                            "Please Try again(Press -2 to exit): ");
                                    id = input.nextInt();
                                    st = isStudent(id);
                                }
                                if(st == -2)
                                {
                                    break;
                                }

                                System.out.printf("Enter Marks Obtained:-\n\nQuiz\n");
                                double quiz[] = new double[4];
                                double assignment[] = new double[4];
                                for(int j = 0; j < 4; j++)
                                {
                                    System.out.printf("Quiz %d: ", j+1);
                                    quiz[j] = input.nextDouble();
                                    while(quiz[j] < 0 && quiz[j] > 2.5)
                                    {
                                        System.out.printf("(0-2.5) : ");
                                        quiz[j] = input.nextDouble();
                                    }
                                }
                                System.out.printf("\n\nAssignments\n");
                                for(int k = 0; k < 4; k++)
                                {
                                    System.out.printf("Assignment %d: ", k+1);
                                    assignment[k] = input.nextDouble();
                                    while(assignment[k] < 0 && assignment[k] > 3.75)
                                    {
                                        System.out.printf("(0-3.75) : ");
                                        assignment[k] = input.nextDouble();
                                    }
                                }

                                System.out.printf("\n\nMid-Term: ");
                                double mid_term_exam = input.nextDouble();
                                while(mid_term_exam > 25)
                                {
                                    System.out.printf("(0-25) : ");
                                    mid_term_exam = input.nextDouble();
                                }

                                System.out.printf("\nTerminal Exam: ");
                                double terminal_exam = input.nextDouble();
                                while(terminal_exam > 50)
                                {
                                    System.out.printf("(0-50) : ");
                                    terminal_exam = input.nextDouble();
                                }
                                Assessments assessment = new Assessments(quiz , assignment , mid_term_exam , terminal_exam);
                                students.get(st).setAssessment(assessment);
                                break;

                            case 2: // View Complete Student Information
                                if(students.isEmpty())
                                {
                                    System.out.printf("There are no Students currently Enrolled!\n" +
                                            "Please ask the admin for admission\nThank You!!!\n");
                                    break;
                                }
                                System.out.printf("Enter Student ID: ");
                                id = input.nextInt();
                                st = isStudent(id);
                                while(st == -1 || st != -2)
                                {
                                    System.out.printf("This Id does not exist in the database!\n" +
                                            "Please Try again(Press -2 to exit): ");
                                    id = input.nextInt();
                                    st = isStudent(id);
                                }
                                if(st == -2)
                                {
                                    break;
                                }
                                System.out.printf("%s\n" , students.get(st));
                                break;
                        }

                        System.out.printf("\n\nName: %s\t\tID: %d\n\n",
                                teachers.get(st).getName() , teachers.get(st).getTeacherId());
                        System.out.printf("1.Update Student Marks\n" +
                                "2.View Student Result\n" +
                                "3.Go Back");
                        th = input.nextInt();
                        while(th < 1 || th > 3)
                        {
                            System.out.printf("Invalid Choice(1-3)\nenter again:");
                            th = input.nextInt();
                        }
                    }

                    break;

                case 3: // Student Functionality
                    if(students.isEmpty())
                    {
                        System.out.printf("There are no Students currently Enrolled!\n" +
                                "Please ask the admin for admission\nThank You!!!\n");
                        break;
                    }
                    System.out.printf("Enter your Student ID: ");
                    id = input.nextInt();
                    st = isStudent(id);
                    while(st == -1 || st != -2)
                    {
                        System.out.printf("This Id does not exist in the database!\n" +
                                "Please Try again(Press -2 to exit): ");
                        id = input.nextInt();
                        st = isStudent(id);
                    }
                    if(st == -2)
                    {
                        break;
                    }
                    System.out.printf("\n\n1.See result\n" +
                            "2.See Status\n" +
                            "3.See Quiz Marks\n" +
                            "4.See Assignment Marks\n" +
                            "5.See Midterm Marks\n" +
                            "6.See Terminal Marks\n" +
                            "7.Go Back\n" +
                            "enter your choice:");
                    int ch = input.nextInt();
                    while(ch < 1 || ch > 7)
                    {
                        System.out.printf("Invalid Choice(1-7)\nenter again:");
                        ch = input.nextInt();
                    }

                    while(ch != 7)
                    {

                        switch(ch)
                        {
                            case 1:
                                System.out.printf("\n%s's Result: " , students.get(st).getName());
                                double result = students.get(st).assessment.calculate_total();
                                System.out.printf("%.2f/100", result);
                                break;

                            case 2:
                                System.out.printf("\n%s's Status: %s\n",
                                        students.get(st).getName(), students.get(st).getStatus());
                                break;

                            case 3:
                                double Q_marks = students.get(st).assessment.Quiz_total();
                                System.out.printf("\n%s's Quiz Marks: %.2f/10.00\n%s\n",
                                        students.get(st).getName(),Q_marks , students.get(st).assessment.getQuiz());
                                break;

                            case 4:
                                double A_marks = students.get(st).assessment.Assignment_total();
                                System.out.printf("\n%s's Assignment Marks: %.2f/15\n%s\n",
                                        students.get(st).getName() , A_marks , students.get(st).assessment.getAssignment());
                                break;

                            case 5:
                                System.out.printf("\n%s's Mid-Term Marks: " , students.get(st).getName());
                                double Mid_result = students.get(st).assessment.getMid_term_exam();
                                System.out.printf("%.2f/25.00", Mid_result);
                                break;

                            case 6:
                                System.out.printf("\n%s's Terminal Marks: " , students.get(st).getName());
                                double Terminal_result = students.get(st).assessment.getTerminal_exam();
                                System.out.printf("%.2f/50.00", Terminal_result);
                                break;

                        }

                        System.out.printf("\n\n1.See result\n" +
                                "2.See Status\n" +
                                "3.See Quiz Marks\n" +
                                "4.See Assignment Marks\n" +
                                "5.See Midterm Marks\n" +
                                "6.See Terminal Marks\n" +
                                "7.Go Back\n" +
                                "Select your option:");
                        ch = input.nextInt();
                        while(ch < 1 || ch > 7)
                        {
                            System.out.printf("Invalid Choice(1-7)\n" +
                                    "enter again:");
                            ch = input.nextInt();
                        }
                    }

                    break;
            }
            System.out.printf("              SCHOOL MANAGEMENT SYSTEM          ");
            System.out.printf("\n\n1.Admin\n2.Teacher\n3.Student\n4.Exit\nSelect your choice: ");
            opr = input.nextInt();
            while(opr < 1 || opr > 4)
            {
                System.out.printf("Invalid Choice(1-4)\n" +
                        "enter again;");
                opr = input.nextInt();
            }

        }

    }

    public static int isStudent(int id)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(id == students.get(i).getId())
            {
                return i;
            }
        }

        return -1;
    }

    public static int isTeacher(int id)
    {
        for(int i = 0; i < teachers.size(); i++)
        {
            if(id == teachers.get(i).getTeacherId())
            {
                return i;
            }
        }

        return -1;
    }

    public static void displayStudents()
    {
        int pass = 0, fail = 0;
        Collections.sort(students);// sort students by compareTo method
        System.out.printf("  ID\t|\tName\t|\tAge\t|\tGender");
        System.out.printf("\n--------------------------------------------------------\n");
        for(int i = 0 ; i < students.size(); i++)
        {
            System.out.printf("  %d\t  |\t%s\t|\t%d\t|\t%s\n" , students.get(i).getId(),
                    students.get(i).getName(), students.get(i).getAge(), students.get(i).getGender());

        }

        System.out.printf("\n\nTotal Students: %d\n", students.size());

    }
    public static void displayTeachers()
    {
        Collections.sort(teachers);// sort teachers by compareTo method
        System.out.printf("  ID\t|\tName\t|\tAge\t|\tGender\t|\tSubject");
        System.out.printf("\n-------------------------------------------------------------------\n");
        for(int i = 0; i < teachers.size(); i++)
        {
            System.out.printf("  %d\t|\t%s\t|\t%d\t|\t%s\n" ,
                    teachers.get(i).getTeacherId(), teachers.get(i).getName(), teachers.get(i).getAge(),
                    teachers.get(i).getGender(), teachers.get(i).getTeacherSubject());
        }
    }
}