import java.util.Scanner;
import Company.*;
import Interface.RoleBehavior;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập chức vụ (Đội trưởng, Giám đốc, Nhân viên VP, Nhân viên Xưởng, Kế toán trưởng): ");
        String role = scanner.nextLine().toLowerCase(); // Đưa về chữ thường để dễ so sánh

        // Xác định RoleBehavior phù hợp
        RoleBehavior roleBehavior;
        switch (role) {
            case "đội trưởng":
                roleBehavior = new TeamLeader();
                break;
            case "giám đốc":
                roleBehavior = new Director();
                break;
            case "nhân viên vp":
                roleBehavior = new OfficeStaff();
                break;
            case "nhân viên xưởng":
                roleBehavior = new FactoryWorker();
                break;
            case "kế toán trưởng":
                roleBehavior = new ChiefAccountant();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                return;
        }

        // Tạo đối tượng CompanyMember với RoleBehavior đã chọn
        CompanyMember member = new CompanyMember(name, roleBehavior);
        member.showRoleTasks();

        // Test thay đổi chức vụ (Strategy)
        System.out.println("\nNhập chức vụ mới để thay đổi: ");
        String newRole = scanner.nextLine().toLowerCase();

        switch (newRole) {
            case "đội trưởng":
                member.setRole(new TeamLeader());
                break;
            case "giám đốc":
                member.setRole(new Director());
                break;
            case "nhân viên vp":
                member.setRole(new OfficeStaff());
                break;
            case "nhân viên xưởng":
                member.setRole(new FactoryWorker());
                break;
            case "kế toán trưởng":
                member.setRole(new ChiefAccountant());
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                return;
        }

        System.out.println("\nSau khi thay đổi chức vụ:");
        member.showRoleTasks();
    }
}
