package practiceAlishev.day9.task1;

public class Student extends Human {

    private String traineeGroup;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }

    public Student(String name, String traineeGroup) {
        super(name);
        this.traineeGroup = traineeGroup;
    }

    public String getTraineeGroup() {
        return traineeGroup;
    }

    public void setTraineeGroup(String traineeGroup) {
        this.traineeGroup = traineeGroup;
    }
}
