package Company;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tên nhân viên: ");
	        String name = scanner.nextLine();
	        System.out.print("Nhập chức vụ: ");
	        String role = scanner.nextLine();

	        CompanyMember member = new CompanyMember(name, role);
	        member.showRoleTasks();
	}
}
