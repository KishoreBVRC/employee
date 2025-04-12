class employee2{
    private int id;
    private String emp_name;
    private double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    private String department;
}


 class Main {
    public static void main(String[] args) {
        employee2 emp = new employee2();
        emp.setId(100);
        emp.setEmp_name("mounika");
        emp.setSalary(200000);
        emp.setDepartment("it");

        System.out.println(emp.getId());
        System.out.println(emp.getEmp_name());
        System.out.println(emp.getDepartment());
        System.out.println(emp.getSalary());

    }
}
    





