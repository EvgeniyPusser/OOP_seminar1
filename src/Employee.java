public class Employee {
    private long id;
    private String name;
    private Address address;
    private int countOfChildren;
    private double salary;

    public Employee(String name, double mysalary) {
        this(name);
        this.salary = mysalary;
    }

    private Employee(String name){
        this.name = name;
    }
    Employee(String name, double mysalary, int countOfChildren){
        this(name, mysalary);
        this.countOfChildren = countOfChildren;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
