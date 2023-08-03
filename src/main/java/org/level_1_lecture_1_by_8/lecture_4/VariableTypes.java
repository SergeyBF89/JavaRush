package org.level_1_lecture_1_by_8.lecture_4;

public class VariableTypes {
    public static void main(String[] args) {
        // ���� ����������
        String str; // ���������� str ����� ������� �����
        int x; // ���������� � ����� ������� ����� �����
        double y; // ���������� � ����� ������� ������� �����
        str = "Hello World";
        x = 5;
        y = 3.14;
        System.out.println(str + ", " + x + ", " + y); // Hello World, 5, 3.14
        System.out.println(str + ", " + x + " + " + y + " = " + x + y); // Hello World, 5 + 3.14 = 53.14
        String str2 = "Hello";
        String str3 = "Sergey";
        System.out.println(str2 + " " + str3); // Hello Sergey
        int age = 34;
        System.out.println(str2 + " " + str3 + ", age = " + age); // Hello Sergey, age = 34

        // ������ ���������� a, b ���� int.
        //����� �� � ������ ���������� ������� �� ������ ��������.
        //���������� ����� ���� ����� ����� �����.
        int a = 4, b = 5;
        System.out.println(a + " " + b); // 4 5

        // ������ 3126 ���. ��� ���� ������� 8 ��� �����.
        //�������� ���������, ��������� �� ����� ��� �������� ����� �����.
        int ageFriend = 3126 - 8;
        System.out.println(ageFriend); // 3118
    }
}
