class Adress extends Table{
	private String street;
	private String house;
	private String flat;

	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return this.street;
	}

	public void setHouse(String house){
		this.house = house;
	}
	public String getHouse(){
		return this.house;
	}

	public void setFlat(String flat){
		this.flat = flat;
	}
	public String getFlat(){
		return this.flat;
	}

	public Adress(String street, String house, String flat){
		setStreet(street);
		setHouse(house);
		setFlat(flat);
	}

	public Adress(String street, String house){
		setStreet(street);
		setHouse(house);
		setFlat("-");
	}

	public Adress(String street){
		setStreet(street);
		setHouse("-");
		setFlat("-");
	}

	public Adress(){
		setStreet("-");
		setHouse("-");
		setFlat("-");
	}
	
}