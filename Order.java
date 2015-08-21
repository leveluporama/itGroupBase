import java.sql.*;
import java.util.Date;
import java.util.Properties;

class Order extends Table{

    private static final String dbClassName = "com.mysql.jdbc.Driver";

    private static final String CONNECTION =
            "jdbc:mysql://127.0.0.1/baseITG";



    private Date date;
	private int adress;
	private String reason; //Причина вызова
	private double revenue; //money, cash
	private int geek;
	private String note; //Примечание о заказе
    private boolean exist; //Существование объекта



    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate(){
		return this.date;
	}
	
	public void setAdress(int adress){
		this.adress = adress;
	}
	public int getAdress(){
		return this.adress;
	} 
	
	public void setReason(String reason){
		this.reason = reason;
	}
	public String getReason(){
		return this.reason;
	}

	public void setRevenue(double revenue){
		this.revenue = revenue;
	}
	public double getRevenue(){
		return this.revenue;
	}

	public void setGeek(int geek){
		this.geek = geek;
	}
	public int getGeek(){
		return this.geek;
	}

	public void setNote(String note){
		this.note = note;
	}

	public String getNote(){
		return this.note;
	}

    public void readOrder(ResultSet rs) throws
            ClassNotFoundException,SQLException{




                this.setAdress(rs.getInt("adress"));
                this.setNote(rs.getString("note"));
                this.setId(rs.getInt("id"));
                this.setGeek(rs.getInt("geek"));
                this.setReason(rs.getString("reason"));
                this.setRevenue(rs.getDouble("revenue"));
                this.setDate(rs.getDate("date"));

                System.out.println(this.getNote());

               // c.close();
            }

    public void writeOrder()throws
            ClassNotFoundException,SQLException
    {


    }

	//Конструктор
	public Order(int adress, int geek, String reason, double revenue, String note){
        this.date = new Date();
        this.adress = adress;
		this.geek = geek;
        this.reason = reason;
        this.revenue = revenue;
        this.note = note;
        this.exist = true;
    }
    public Order(int adress, int geek, String reason, double revenue){
        this.date = new Date();
        this.adress = adress;
        this.geek = geek;
        this.reason = reason;
        this.revenue = revenue;
        this.note = "";
        this.exist = true;
    }
    public Order(int adress, int geek, String reason){
        this.date = new Date();
        this.adress = adress;
        this.geek = geek;
        this.reason = reason;
        this.revenue = 0;
        this.note = "";
        this.exist = true;
    }
    public Order(int adress, int geek, double revenue){
        this.date = new Date();
        this.adress = adress;
        this.geek = geek;
        this.reason = "";
        this.revenue = revenue;
        this.note = "";
        this.exist = true;
    }

    public Order(){
        this.exist = true;
    };

}

