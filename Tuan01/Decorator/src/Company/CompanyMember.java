package Company;
import Interface.Role;

public class CompanyMember {
    private String name;
    private Role role;

    public CompanyMember(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void showRoleTasks() {
        System.out.println(name + " có nhiệm vụ:");
        role.showTasks();
    }
}
