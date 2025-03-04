package Company;
import Interface.Role;

public class RoleDecorator implements Role {
    protected Role decoratedRole;

    public RoleDecorator(Role decoratedRole) {
        this.decoratedRole = decoratedRole;
    }

    @Override
    public void showTasks() {
        decoratedRole.showTasks(); // Gọi nhiệm vụ từ chức vụ gốc
    }
}
