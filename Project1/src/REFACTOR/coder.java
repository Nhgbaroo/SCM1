package REFACTOR;
class Employee {
    String Name;
    String ID;
    public int computeSalary() {
        System.out.println("The salary of Employee");
		return 0;
    }
}

class Coder extends Employee {
    int level;
}

class Manager extends Employee {
    public int computeSalary() {
        return 20000000;
    }
}

