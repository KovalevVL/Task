package PackageTask;

public class TaskObjectCloneDemo {
    public static void main(String[] args) {
        TaskObjectClone x1 = new TaskObjectClone();
        TaskObjectClone x2;
        x1.a = 231;
        x1.b = 22.22;
        x2 = x1.clonTest();     //клонируем обьект x1
        System.out.println("x1 = " + x1.a + " " + x1.b);
        System.out.println("x2 = " + x2.a + " " + x2.b);
    }
}
