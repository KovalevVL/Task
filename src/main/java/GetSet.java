public class GetSet {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setUsername("Какое-то имя");
        human1.setYears(50);
        System.out.println("Выводим значение в майнметоде: " + human1.getUsername());
        System.out.println("Выводим значение в майнметоде: " + human1.getYears());


    }
}

class Human {
    private String name;
    private int years;

    public void setUsername(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое поле");
        } else {
            name = userName;
        }
    }

    public String getUsername() {
        return name;
    }

    public void setYears(int userYears) {
        if (userYears < 0) {
            System.out.println("Возраст должен быть положительным");

        } else {
            years = userYears;
        }
    }

    public int getYears() {
        return years;
    }
}
