package entities;

import java.util.ArrayList;
import java.util.List;

public class FolderListTask {

	private int id;
	private String name;
	private List<ListTask> content = new ArrayList<>();

	public FolderListTask(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public FolderListTask(int id, String name, List<ListTask> content) {

		this.id = id;
		this.name = name;
		this.content = content;
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

	public List<ListTask> getContent() {
		return content;
	}

	public ListTask getContent(int position) {
		return content.get(position);
	}

	public void setContent(List<ListTask> content) {
		this.content = content;
	}

}
