public class Student extends User{
    private int progressPercentage;
    private String[] chosenCourses;

    public Student(int id, String firstName, String lasName, String email,String password) {
        super(id, firstName, lasName, email,password);
    }

    public int getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public String[] getChosenCourses() {
        return chosenCourses;
    }

    public void setChosenCourses(String[] chosenCourses) {
        this.chosenCourses = chosenCourses;
    }
}
