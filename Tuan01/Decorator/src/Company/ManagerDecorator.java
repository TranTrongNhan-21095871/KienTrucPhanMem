package Company;

import Interface.Role;

public class ManagerDecorator extends RoleDecorator{

	public ManagerDecorator(Role decoratedRole) {
        super(decoratedRole);
    }

    @Override
    public void showTasks() {
        super.showTasks();
        System.out.println("- Giám sát nhân viên bổ sung");
    }
}
