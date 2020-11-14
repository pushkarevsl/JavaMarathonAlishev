package day13_SocialNetwork;

import java.util.ArrayList;
import java.util.List;

/**
 * public void subscribe(User user)- подписывает пользователя на пользователя user
 * - public boolean isSubscribed(User user)- возвращает True, если пользователь подписан на
 * пользователя user и False, если не подписан.
 * - public boolean isFriend(User user) - возвращает True, если пользователь user является другом и False,
 * если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
 * - public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user.
 * Здесь должен использоваться статический метод из MessageDatabase.
 * - public String toString()- возвращает строковое представление пользователя (имя пользователя).
 */
public class User {

    private String userName;
    private List<User> subscriptions;

    //Создание нового пользователя и список его подписок
    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    //у текущего пользователя вызываем его список подписок и добавляем в него юзера user
    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    // Прохожу по списку подписок для текущего юзера,
    //если имя совпадает то возвразщаю тру
    public boolean isSubscribed(User user) {
        for (User currentUser : subscriptions) {
            if (currentUser.getUserName().equals(user)) {
                return true;
            }
        }
        return false;
    }

    //если текущий юзер this (у которого вызывается метод) подписан и в ответ user подписан на текущего,
    // то и возвращает метод.
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
//TODO
    }

    public String toString(){
        return userName;
    }


    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}
