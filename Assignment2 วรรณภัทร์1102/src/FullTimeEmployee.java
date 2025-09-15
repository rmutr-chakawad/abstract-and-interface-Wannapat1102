class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name, salary) ;
    }

    @Override
    public double calculateSalary() {
        return this.salary ;
    }
}