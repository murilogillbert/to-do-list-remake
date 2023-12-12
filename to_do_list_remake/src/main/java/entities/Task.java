package entities;

public class Task {
	private int id;
	private String name;
	private boolean done;
	private String content;

	public Task(int id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.done = false;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public boolean getDone() {
		return this.done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
