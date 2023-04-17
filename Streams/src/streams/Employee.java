package streams;

import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private List<String> Project;

    public Employee(String firstName, String lastName, Double salary, List<String> Project) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.Project = Project;
    }

    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getProject() {
        return Project;
    }

    public void setProject(List<String> Project) {
        this.Project = Project;
    }

    @Override
    public String toString() {
        return "Teste{" + "firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", Project=" + Project + '}';
    }
   
}
