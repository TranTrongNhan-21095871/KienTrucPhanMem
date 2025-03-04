package Company;
import Interface.RoleBehavior;

public class CompanyMember {
    private String name;
    private RoleBehavior role;

    public CompanyMember(String name, RoleBehavior role) {
        this.name = name;
        this.role = role;
    }

    public void showRoleTasks() {
        System.out.println(name + " có nhiệm vụ:");
        role.showTasks();
    }

    // Cho phép thay đổi chiến lược (chức vụ)
    public void setRole(RoleBehavior newRole) {
        this.role = newRole;
    }
}
