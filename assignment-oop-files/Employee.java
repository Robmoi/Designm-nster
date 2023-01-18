import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles;
  
    public Employee(String name, String department){
    this.name = name;
    this.department = department;
  }
  
  public Employee(String name, String department, Role initialRole) {
      roles = new ArrayList<>();
      this.name = name;
      this.department = department;
      addRole(initialRole);
  }
  
  public void addRole(Role newRole) {
      this.roles.add(newRole);
  }
  
  public String name(){ return name; }
  
  public String department(){ return department; }
  
  @Override
  public String toString(){
    return String.format("%s at %s, roles are %s", name, department, roles);
  }
}