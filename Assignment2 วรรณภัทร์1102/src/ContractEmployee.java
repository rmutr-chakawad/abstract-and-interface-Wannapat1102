class ContractEmployee extends Employee {
    private int hoursWorked ;
    private double hourlyRate ;


    public ContractEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, 0) ;
        this.hoursWorked = hoursWorked ;
        this.hourlyRate = hourlyRate ;
    }

    @Override
    public double calculateSalary() {
        return this.hoursWorked * this.hourlyRate ;
    }
}