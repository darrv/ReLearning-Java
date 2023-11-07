
public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model, int year) {
//		this.make = make; not needed, replaced with below
		this.setMake(make);
//		this.model = model;
		this.setModel(model);
//		this.year = year;
		this.setYear(year);
	}
	
	Car(Car x) {
		this.copy(x);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
}
