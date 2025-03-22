package interfa;

public interface Subject {
	void attach(Observer observer);  // Thêm sinh viên vào danh sách
	void detach(Observer observer);  // Xóa sinh viên khỏi danh sách
	void notifyAllObservers(String message); // Gửi thông báo
}
