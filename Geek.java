class Geek extends Table{

	private String name;
	private String surname;
	private String phoneNum;


	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSurName(String surname){
		this.surname = surname;
	}
	public String getSurName(){
		return this.surname;
	}
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum(){
		return this.phoneNum;
	}

    public Geek(String name, String surname, String phoneNum){
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
    }
    public Geek(String name, String phoneNum){
        this.name = name;
        this.surname = "-";
        this.phoneNum = phoneNum;
    }
    public Geek(){
        this.name = "Немо";

    }
}