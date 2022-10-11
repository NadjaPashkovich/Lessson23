package by.itstep.pashka.controller;

import by.itstep.pashka.model.entity.Student;
import by.itstep.pashka.view.Printer;

public class Main {
    public static void main(String args) {
        Student student = new Student();

        Printer.print(new String[]{"testing..."});
    }
}
