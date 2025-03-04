package Company;

import Interface.RoleBehavior;

public class ChiefAccountant implements RoleBehavior{

	@Override
	public void showTasks() {
        System.out.println("- Kiểm tra sổ sách");
        System.out.println("- Lập báo cáo tài chính");
    }

}
