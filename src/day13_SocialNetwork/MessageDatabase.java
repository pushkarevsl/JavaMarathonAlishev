package day13_SocialNetwork;

import java.util.ArrayList;
import java.util.List;

/**
 * public static void sendMessage(User u1, User u2, String text)
 * - этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.Отправка в
 * нашем контексте означает добавление сообщения в нашу “базу данных”.
 * - public static List<Message> getMessages()- возвращает список всех сообщений в “базе данных”.
 * - public static void showDialog(User u1, User u2)- этот метод должен вывести цепочку сообщений (диалог)
 * пользователей u1 и u2. Формат вывода должен быть таким:
 */

public class MessageDatabase {

    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)
                    ||
                    message.getSender().equals(u2) && message.getReceiver().equals(u1)) {
                System.out.println(message.getSender() + ": " + message.getReceiver());
            }
        }
    }
}
