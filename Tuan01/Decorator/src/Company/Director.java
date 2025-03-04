package Company;

import Interface.Role;

public class Director implements Role {
    @Override
    public void showTasks() {
        System.out.println("- Ra quyết định");
        System.out.println("- Quản lý công ty");
    }


}
