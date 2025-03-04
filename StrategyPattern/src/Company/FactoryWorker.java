package Company;

import Interface.RoleBehavior;

public class FactoryWorker implements RoleBehavior{

	@Override
	public void showTasks() {
        System.out.println("- Sản xuất hàng hóa");
        System.out.println("- Kiểm tra chất lượng");
    }

}
