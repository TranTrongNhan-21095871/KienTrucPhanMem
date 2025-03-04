package Interface;

import Company.CompanyMember;

public interface RoleState {
    void showTasks(); // Chỉ khai báo, không có phần thực thi
    void promote(CompanyMember member);
}
