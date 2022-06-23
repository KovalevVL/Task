public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Ornella",34);
        person1.speakHello();
        person1.speak();
        int years1 = person1.calculateYears();
        Person person2 = new Person();
        person2.setNameAndAge("Vladimir",33);
        person2.speakHello();
        person2.speak();
        int years2 = person2.calculateYears();
        System.out.println("Первому человеку до пенсии - " + years1 + " Второму человеку до пенисии - " + years2);

    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

        void speak () {
            System.out.println("Меня зовут - " + name + ", мой возраст - " + age + " года");
        }

        void speakHello () {
            System.out.println("Привет - говорит " + name);
        }

        int calculateYears () {
            int years = 68 - age;
            return years;
        }

    }
