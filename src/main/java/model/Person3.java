package model;

public class Person3 {
	private Integer id;
	private String name;

	public Person3() {
	    }

	public Person3(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
