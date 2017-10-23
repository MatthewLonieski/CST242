package duckExample;

public class Duck {
	private String name;
	private int id;
	private static int idCounter = 0;
	public Duck(String name, int id) {
		super();
		this.name = name;
		this.id = idCounter++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Duck [name=" + name + ", id=" + id + "]";
	}
	
	

}
