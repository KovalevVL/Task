//������:
//
//��������� ������ ��������� ������� � �������� ������������, ����������� � ������� ��������.
//
//��� ��������� ���������� ����� ����������� ����� Math.random(), ������� ���������� �������� � ���������� [0, 1].

public class MaxNumber {
    public static void main(String[] args) {
        int number = 100;
        double[] array = new double[number];
        for (int i = 0; i < array.length; i++) {
            array[number] = Math.random();
        }

    }
}
