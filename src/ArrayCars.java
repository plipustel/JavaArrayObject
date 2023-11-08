/**
 * 
 * ARRAY OBEJCT IN JAVA
 * @author: Plipus Telaumbanua
 * @created: 09 Nov 2023
 * 
 */

/* Car Object */
class Car {
	
	/* Attributes */
	public String model;
	public String brand;
	public int year;
	public Audio audio;
	
	/* Constructor method
	 * */
	public Car(String Model, String Brand, int Year, Audio Audio) {
		this.model = Model;
		this.brand = Brand;
		this.year = Year;
		this.audio = Audio;
	}
	
	public String getCarList() {
		return (this.model + ", " + this.brand + ", " + this.year + ", Audios: " + this.audio.getListAudio());
	}
}

/** Threat audio also as an object
 * */
class Audio {
	
	public String usb;
	public String bluetooth;
	public String radio;
	
	public Audio(String usb, String bluetooh, String radio) {
		this.usb = usb;
		this.bluetooth = bluetooh;
		this.radio = radio;
	}
	
	// Overload method, in Java cannot pass optional parameters
	public Audio(String usb, String bluetooh) {
		this.usb = usb;
		this.bluetooth = bluetooh;
	}
	
	public Audio(String usb) {
		this.usb = usb;
	}
	
	public String getListAudio() {	    
	   return (this.usb + ", " + this.bluetooth + ", " + this.radio); //this will print null
	}
}


public class ArrayCars {
	
	public static void main(String[] args) {
		
		/* Create severals object Cars
		 * **/
		
		Audio audios1 = new Audio("usb", "bluetooth");
		Audio audios2 = new Audio("usb", "bluetooth", "radio");
		Audio audios3 = new Audio("usb");
		
		Car car1 = new Car("SUV", "Toyota", 2013, audios1) ;
		Car car2 = new Car("Jeep", "Rubicon", 2018, audios2);
		Car car3 = new Car("Sport Car", "Ferrari", 2022, audios3);
		
		Car[] MyCarList = {car1, car2, car3};
		
		for(int i = 0; i < MyCarList.length; i++) {
			//System.out.println(MyCarList[i].model + "," + MyCarList[i].brand + "," + MyCarList[i].year);
			System.out.println((i + 1) + "."+ MyCarList[i].getCarList());
			
		}
		
		
	}

}
