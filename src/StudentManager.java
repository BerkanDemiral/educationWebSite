public class StudentManager extends UserManager {
    public void joinCourse(Student student,  String[] newCourses) {
        System.out.println(student.getFirstName() + " kullanıcısı kursa kayıt oldu");
        student.setChosenCourses(newCourses);
    }

    public void progressPercentage(Student student) {
        student.setProgressPercentage(45); // 45 değeri rastgele verilmiştir, hesaplanması gerekmektedir.
    }

    public void showInfos(Student student) {
        System.out.println("Name Surname: " + student.getFirstName() + " " + student.getLasName());
        System.out.println("Email: " + student.getEmail());
        System.out.print("Courses: ");
        for (String course : student.getChosenCourses()) {
            System.out.print(course + ", ");
        }
    }

    @Override
    public void signingIn(User user) {
        System.out.println("Öğrenci için yetkilendirme kodları çalıştı");
    }
}
