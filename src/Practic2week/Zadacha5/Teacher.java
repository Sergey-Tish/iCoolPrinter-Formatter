package Practic2week.Zadacha5;

public class Teacher extends People{

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }
}
