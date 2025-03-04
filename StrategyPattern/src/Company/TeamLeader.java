package Company;

import Interface.RoleBehavior;

public class TeamLeader implements RoleBehavior{

	@Override
	public void showTasks() {
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc nhân viên");
    }

}
