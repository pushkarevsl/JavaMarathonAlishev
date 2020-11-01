package day7_Players_x.task2;

public class Player {

    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;

    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
            System.out.println("Игрок выдохся, требуется замена");
        }
    }

    static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) +
                    " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}










