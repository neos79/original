package designPattern.builder;
/**
 * @author naveen.singh
 *
 * 
 */
public class MyBuilderDesignPattern {
	public static void main(String[] args) {
		Bike bike1=new Bike.BikeBuilder("MRF","Flat").build();
		System.out.println("bike contains :"+bike1.getSeat()+bike1.getTyres());
		Bike bike2=new Bike.BikeBuilder("MRF","Flat").setAutomaticBased(true).build();
		bike2.setGearBased(true);
		
		System.out.println("bike contains :"+bike2.isGearBased());
		Bike bike3=new Bike.BikeBuilder("MRF","Flat").setAutomaticBased(true).setGearBased(true).build();
		System.out.println(bike3.getSeat()+bike3.getTyres()+bike3.isAutomaticBased()+bike3.isGearBased());
	}
	
	
}
 
class Bike{
	private String tyres;
	private String seat;
	private boolean automaticBased;
	private boolean gearBased;
	
	public Bike(BikeBuilder builder) {
		this.tyres = builder.tyres;
		this.seat = builder.seat;
		this.automaticBased = builder.automaticBased;
		this.gearBased = builder.gearBased;
	}
	
	
	public static class BikeBuilder{
		//required Parameters
		private String tyres;
		private String seat;
		
		//optional parameters
		private boolean automaticBased;
		private boolean gearBased;
		
		public BikeBuilder(String tyres, String seat) {
			this.tyres = tyres;
			this.seat = seat;
		}

		public BikeBuilder setAutomaticBased(boolean automaticBased) {
			this.automaticBased = automaticBased;
			return this;
		}

		public BikeBuilder setGearBased(boolean gearBased) {
			this.gearBased = gearBased;
			return this;
		}
		
		public Bike build(){
			return new Bike(this);
		}
		
		
		
	}

	
	
	
	public String getTyres() {
		return tyres;
	}
	public void setTyres(String tyres) {
		this.tyres = tyres;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}


	public boolean isAutomaticBased() {
		return automaticBased;
	}


	public void setAutomaticBased(boolean automaticBased) {
		this.automaticBased = automaticBased;
	}


	public boolean isGearBased() {
		return gearBased;
	}


	public void setGearBased(boolean gearBased) {
		this.gearBased = gearBased;
	}
	
	
}
