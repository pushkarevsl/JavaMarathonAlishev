package day6.task3;

import java.util.Random;

public class Teacher {

    private String teacherName;
    private String lesson;

    public void evaluate(Student student) {
        Random rnd = new Random();
        int value = rnd.nextInt(4) + 2;

        String estimation = "";
        switch (value) {
            case 2:
                estimation = "неудовлетворительно";
                break;
            case 3:
                estimation = "удовлетворительно";
                break;
            case 4:
                estimation = "хорошо";
                break;
            case 5:
                estimation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + student.getStudentName() +
                " по предмету " + lesson + " на оценку " + estimation + ".");

    }


    public Teacher() {
    }

    public Teacher(String teacherName, String lesson) {
        this.teacherName = teacherName;
        this.lesson = lesson;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
