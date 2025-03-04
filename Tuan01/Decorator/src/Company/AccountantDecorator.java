package Company;

import Interface.Role;

public class AccountantDecorator extends RoleDecorator{

	public AccountantDecorator(Role decoratedRole) {
		super(decoratedRole);
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    public void showTasks() {
	        super.showTasks();
	        System.out.println("- Quản lý tài chính bổ sung");
	    }

}
