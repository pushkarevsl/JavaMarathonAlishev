package tasks.lambdaSpesialist;

public class Radio implements ElectricityConsumer {

    public void radioPlays(){
        System.out.println("Радио играет");
    }

    @Override
    public void electricityOn() {
        radioPlays();
    }
}
