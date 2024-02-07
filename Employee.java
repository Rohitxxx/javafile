class Employee{
    private int employeeID;
    private String employeeName;
    private int employeeAge;
    private String employeeAddress;
    private float salary;
    public Employee(){
        employeeID=123;
        employeeName="Rohit";
        employeeAge=20;
        employeeAddress="Bhaktinagar Colony Varanasi";
        salary=100000.00f;
    }
    public void display(){
        System.out.println(employeeID);
        System.out.println(employeeName);
        System.out.println(employeeAge);
        System.out.println(employeeAddress);
        System.out.println(salary);

    }
    public static void main(String args[]){
        Employee e=new Employee();
        e.display();
    }
}