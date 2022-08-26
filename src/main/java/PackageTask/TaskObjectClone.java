package PackageTask;

// реализуется интерфейс Cloneable и определяется метод cloneTest ( ) , вызывающий метод clone ( ) из класса Object

class TaskObjectClone implements Cloneable {
    int a;
    double b;

    TaskObjectClone clonTest() {
        try {
            return (TaskObjectClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Копирование не возможно!");
            return this;
        }
    }

}
