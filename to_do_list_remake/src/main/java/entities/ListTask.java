package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListTask {
	private int id;
	private String name;
	private List<Task> content = new ArrayList<>();

	public ListTask(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Task> getContent() {
		return content.stream().collect(Collectors.toList());
	}

	public Task getContent(int position) {
		return content.get(position);
	}
	
	public void addContent(Task content) {
		this.content.add(content);
	}

	public void removeContent(Task content) {
		this.content.remove(content);
	}

}
