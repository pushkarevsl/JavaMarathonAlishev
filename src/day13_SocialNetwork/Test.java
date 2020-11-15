package day13_SocialNetwork;


public class Test {

    public static void main(String[] args) {
        User user1= new User("Tanya");
        User user2= new User("Vasia");
        User user3= new User("Sema");

        user1.sendMessage(user2, "Привет Vasia!");
        user1.sendMessage(user2, "Как дела?");
        user1.sendMessage(user2, "Черножопый!! Ты где кошака?");

        user2.sendMessage(user1, "Привет Tanya!");
        user2.sendMessage(user1, "Все супер, сегодня счетчик меняли, страшно было");


        user2.sendMessage(user3, "Привет, толстуша! Жрала!!!");
        user2.sendMessage(user3, "Ты спала или жрала?");

        user3.sendMessage(user2, "Кошке не принято такое говорить");
        user3.sendMessage(user2, "И спала и жрала");


        user1.sendMessage(user3, "Толстуша!! Ты жрать будешь?");

        user3.sendMessage(user1, "Да буду жрать, накладывай");

        MessageDatabase.showDialog(user2, user3);

    }
}
