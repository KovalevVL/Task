public class Lesson19 {
    public static void main(String[] args) {
        People people1 = new People();
        people1.setAge(19);
        people1.setName("Vladimir");
        people1.getInfo();
    }

}

class People {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + "," + age);
    }
}
