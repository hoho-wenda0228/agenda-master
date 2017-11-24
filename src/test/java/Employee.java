/**
 * Created by 90750 on 2017/11/18.
 */
public class Employee {
    private String name;
    private int employeeId;
    private String departmentName;
    private float salary;
    private String position;

    private String leader;

    Employee(String position){
        if(position != "supervisor"){
            System.out.println("请设置Manager");
        }
    }

    Employee(String position,Employee manager){
        this.setPosition(position);
        this.setLeader(manager);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
