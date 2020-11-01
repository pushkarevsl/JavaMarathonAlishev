package day9.task1;

public class Teacher extends Human {

    private String nameLesson;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }

    public Teacher(String name, String nameLesson) {
        super(name);
        this.nameLesson = nameLesson;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }
}
