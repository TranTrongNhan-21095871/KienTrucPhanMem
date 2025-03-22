package model;

import java.util.ArrayList;
import java.util.List;

import interfa.Observer;
import interfa.Subject;

public class Classroom implements Subject{
	
	private String name;
    private List<Observer> students = new ArrayList<>();

    public Classroom(String name) {
        this.name = name;
    }
    

	@Override
	public void attach(Observer observer) {
		students.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		students.remove(observer);
	}

	@Override
	public void notifyAllObservers(String message) {
		System.out.println("📢 Thông báo từ lớp " + name + ": " + message);
        for (Observer student : students) {
            student.update(message);
        }
	}
	
}
