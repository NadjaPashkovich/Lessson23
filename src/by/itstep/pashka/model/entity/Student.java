package by.itstep.pashka.model.entity;

public class Student {
    public static final int MIN_AGE = 16;
    public static final int MAX_AGE = 100;

    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private String name;
    private int age;
    private double mark;
    private boolean alive;

    //default constructor
    public Student() {
    }

    //full constructor with params
    public Student(String name, int age, double mark, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;
    }

    public Student(Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }


    //Getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > MIN_AGE && age < MAX_AGE) {
            this.age = age;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }

    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}

