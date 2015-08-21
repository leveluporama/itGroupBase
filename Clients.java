class Clients extends Table{

private Adress adress;
private String phoneNum;
private String name;


public void setAdress(Adress adress){
		this.adress = adress;
	}
public Adress getAdress(){
	return this.adress;
	}

public void setPhoneNum(String phoneNum){
	this.phoneNum = phoneNum;
	}
public String getPhoneNum(){
	return this.phoneNum;	
	}

public void setName(String name){
	this.name = name;
}
public String getName(){
	return this.name;
}

}
