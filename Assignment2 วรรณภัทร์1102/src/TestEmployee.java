public class TestEmployee {
    public static void main(String[] args) {

        Employee fullTimeEmp = new FullTimeEmployee("วรรณภัทร์ สายไตร", 55000) ;
        Employee contractEmp = new ContractEmployee("ไข่เค็ม แต่เต็มใจ", 150, 400) ;

        System.out.println("--- Full-time Employee Details ---") ;
        fullTimeEmp.showSalary() ;

        System.out.println("\n--- Contract Employee Details ---") ;
        contractEmp.showSalary() ;
    }
}