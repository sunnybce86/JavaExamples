package JavaExaplePractice.JavaExaplePractice;

public class Address {

	
	private String street;
    private int pin;
    
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}
	
	
    
    
}
