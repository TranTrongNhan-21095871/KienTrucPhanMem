package Company;

import Interface.RoleState;

public class OfficeStaff implements RoleState{

	public void showTasks() {
        System.out.println("- Pha trà");
        System.out.println("- Pha cà phê");
    }

	@Override
	public void promote(CompanyMember member) {
		// TODO Auto-generated method stub
		
	}

}
