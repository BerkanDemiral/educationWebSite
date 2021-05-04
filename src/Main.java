public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Berkan","Demiral","brkn@gmail.com","brkn1234");
        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","engindemirog@gmail.com","engn1234");
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        instructorManager.createCourse(instructor1,new String[]{"Java Programlama","C# Programlama"});

        instructorManager.addHomework(instructor1);
        instructorManager.showInfos(instructor1);
        System.out.println("\n--------------------");
        UserManager userManager = new UserManager();
        userManager.signingIn(student1);
        userManager.signingIn(instructor1);
        System.out.println("--------------------");
        studentManager.joinCourse(student1,new String[]{"Java Programlama"});
        studentManager.progressPercentage(student1);
        studentManager.showInfos(student1);



    }
}
