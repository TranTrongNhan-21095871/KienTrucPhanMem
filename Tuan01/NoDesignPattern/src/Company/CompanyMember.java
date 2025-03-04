package Company;

public class CompanyMember {
	 private String name;
	    private String role;

	    public CompanyMember(String name, String role) {
	        this.name = name;
	        this.role = role;
	    }

	    public void showRoleTasks() {
	        System.out.println(name + " có nhiệm vụ:");
	        switch (role.toLowerCase()) {
	            case "đội trưởng":
	                System.out.println("- Đi tuần");
	                System.out.println("- Gán việc nhân viên");
	                break;
	            case "giám đốc":
	                System.out.println("- Ra quyết định");
	                System.out.println("- Quản lý công ty");
	                break;
	            case "nhân viên vp":
	                System.out.println("- Pha trà");
	                System.out.println("- Pha cà phê");
	                break;
	            case "nhân viên xưởng":
	                System.out.println("- Sản xuất hàng hóa");
	                System.out.println("- Kiểm tra chất lượng");
	                break;
	            case "kế toán trưởng":
	                System.out.println("- Kiểm tra sổ sách");
	                System.out.println("- Lập báo cáo tài chính");
	                break;
	            default:
	                System.out.println("Chức vụ không hợp lệ!");
	        }
	    }
}
