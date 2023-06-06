public class Main {


    public static void main(String[] args){


        ComputerScienceStudent paulCS = new ComputerScienceStudent();
        System.out.println(paulCS);


        System.out.println(paulCS.name);
        System.out.println(paulCS.id);
        paulCS.addStudent("Herbert", "1");
        paulCS.removeStudent("Herbert", "1");

        System.out.println(paulCS.subject);


        Student klaus = new ComputerScienceStudentFirstYear();
        System.out.println(klaus.name);
        System.out.println(klaus.id);

        Student hilde = new ComputerScienceStudent();
        hilde.addStudent("Hilde", "2");
        hilde.removeStudent("Hilde", "2");





    }


}
