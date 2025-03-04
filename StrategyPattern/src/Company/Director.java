package Company;

import Interface.RoleBehavior;

public class Director implements RoleBehavior{

	@Override
	public void showTasks() {
        System.out.println("- Ra quyết định");
        System.out.println("- Quản lý công ty");
    }

}
