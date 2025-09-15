abstract class Employee {
    protected String name ;
    protected double salary ;

    public Employee(String name, double salary) {
        this.name = name ;
        this.salary = salary ;
    }

    public abstract double calculateSalary() ;

    public void showSalary() {
        System.out.println("Name: " + this.name) ;
        System.out.println("Salary: " + this.calculateSalary() + " Baht") ;
    }
}