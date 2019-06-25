package _9_composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	private String title;
	private String level;

	public Worker(String name, String title, String level) {
		System.out.println(name + " - " + title + " - " + level);
		this.name = name;
		this.title = title;
		this.level = level;
		subordinates = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	private List<Worker> subordinates;

	public void add(Worker w) {
		subordinates.add(w);
	}

	public void remove(Worker w){
		subordinates.remove(w);
	}

	public List<Worker> list(){
		return subordinates;
	}

	public void show(){
		System.out.println(this.toString());
		for (Worker w:subordinates) {
			w.show();
		}
	}

	@Override
	public String toString() {
		return "Worker{" +
						"name='" + name + '\'' +
						", title='" + title + '\'' +
						", level='" + level + '\'' +
						", subordinates=" + subordinates +
						'}';
	}
}
