package iuh.fit.ktruc.designpattern.singletonPattern;
/**
 * SingletonPattern
 * @author Admin
 *
 */
public class SingletonPattern {
	private String value; // tao bien luu gia tri
	private static SingletonPattern instance = null; // tao bien static de ben ngoai goi tới
	
	//constructer
	private SingletonPattern(String value) {
		this.value = value;
	}
	// ham static de ben ngooài goi tới
	public static SingletonPattern getInstance(String value) {
		if (instance == null) {
			instance = new SingletonPattern(value);
		}
		
		return instance;
	}
	
	//Xuát giá trị biến val
	public void printValue() {
		System.out.println("SingletonPattern: " + value);
	}
	
	
}
