import java.util.Scanner;
import Company.*;
import Interface.Role;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên nhân viên
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        // Nhập chức vụ
        System.out.print("Nhập chức vụ (Đội trưởng, Giám đốc, Nhân viên VP, Nhân viên Xưởng, Kế toán trưởng): ");
        String roleInput = scanner.nextLine().toLowerCase();

        Role role;
        switch (roleInput) {
            case "đội trưởng":
                role = new TeamLeader();
                break;
            case "giám đốc":
                role = new Director();
                break;
            case "nhân viên vp":
                role = new OfficeStaff();
                break;
            case "nhân viên xưởng":
                role = new FactoryWorker();
                break;
            case "kế toán trưởng":
                role = new ChiefAccountant();
                break;
            default:
                System.out.println("❌ Chức vụ không hợp lệ!");
                return;
        }

        // Hỏi có muốn thêm trách nhiệm không
        System.out.print("Nhân viên này có thêm vai trò kế toán không? (yes/no): ");
        String extraRole = scanner.nextLine().toLowerCase();
        if (extraRole.equals("yes")) {
            role = new AccountantDecorator(role);
        }

        System.out.print("Nhân viên này có thêm vai trò quản lý không? (yes/no): ");
        String extraManager = scanner.nextLine().toLowerCase();
        if (extraManager.equals("yes")) {
            role = new ManagerDecorator(role);
        }

        // Tạo nhân viên với vai trò đã được trang trí
        CompanyMember member = new CompanyMember(name, role);
        member.showRoleTasks();
    }
}
