
public class Role {
    private String roleName;
    public Role(String name){
        this.roleName = name;
    }
    public String getRoleName(){
        return roleName;
    }
    @Override
    public String toString() {
        return String.format("%s", roleName);
    }
}