package Main;

import model.Classroom;
import model.Student;

public class Demo {
	public static void main(String[] args) {
        // Tạo lớp học
        Classroom classroom = new Classroom("Lớp Java");

        // Tạo sinh viên
        Student student1 = new Student("Nguyễn Văn A");
        Student student2 = new Student("Trần Thị B");
        Student student3 = new Student("Lê Văn C");

        // Lớp học thêm sinh viên vào danh sách nhận thông báo
        classroom.attach(student1);
        classroom.attach(student2);
        classroom.attach(student3);

        // Lớp trưởng gửi thông báo
        classroom.notifyAllObservers("Lớp sẽ kiểm tra vào thứ 6!");

        // Một sinh viên rời khỏi danh sách nhận thông báo
        classroom.detach(student2);

        // Gửi thông báo tiếp theo
        classroom.notifyAllObservers("Học bù vào thứ 7!");
    }
}
