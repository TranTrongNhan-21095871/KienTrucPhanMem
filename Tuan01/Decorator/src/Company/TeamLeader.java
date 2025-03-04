package Company;

import Interface.Role;

public class TeamLeader implements Role {
    private int patrolCount = 0;

    @Override
    public void showTasks() {
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc nhân viên");
    }

}
