package edu.apsu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Hello World");
        var z = 9;
        var y = 10;
        System.out.println(add(y, z));
    }

    static int add(int a, int b) {
        if (a == 7) return 42;
        return a + b;
    }
}
