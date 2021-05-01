public class InstructorManager extends UserManager{
    public void createCourse(Instructor instructor, String[] newCourses){
        System.out.println(instructor.getFirstName()+ " yeni bir kurs oluşturdu");
        instructor.setCoursesGiven(newCourses);
    }

    public void addHomework(Instructor instructor){
        System.out.println(instructor.getFirstName()+" yeni bir ödev ekledi");
    }

    public void addQuiz(Instructor instructor){
        System.out.println(instructor.getFirstName()+" yeni bir quiz ekledi");
    }
    public void updateCourse(Instructor instructor){
        System.out.println(instructor.getFirstName()+ "kurs üzerinde güncelleme işlemi gerçekleştirdi");
    }
    public void showInfos(Instructor instructor){
        System.out.println("Name Surname: "+ instructor.getFirstName()+" "+instructor.getLasName());
        System.out.println("Email: "+instructor.getEmail());
        System.out.print("Courses: ");
        for(String course : instructor.getCoursesTaught()){
            System.out.print(course + ", ");
        }
    }

    @Override
    public void signingIn(User user){
        System.out.println("Eğitmen için gerekli yetkilendirme kodları çalıştı");
    }

}
