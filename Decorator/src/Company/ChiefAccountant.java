package Company;

import Interface.Role;

public class ChiefAccountant implements Role{

	@Override
	public void showTasks() {
        System.out.println("- Kiểm tra sổ sách");
        System.out.println("- Lập báo cáo tài chính");
    }

}
