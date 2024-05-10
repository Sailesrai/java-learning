package ObjectWithArray;

public class Cow {

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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int id;
	private String name;
	private String color;
	private int price;
	@Override
	public String toString() {
		return "Cow [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
}
