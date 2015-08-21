import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

class App{

	public static void main(String[] args) {

       /*
       Adress adr1 = new Adress("Кирова", "6", "5");
		Geek geek = new Geek("Вася","Сергеев","+79085554477");
		Order ord1 = new Order(adr1,geek,"Чистка от пыли",500,"У клиента вкусный кофе=)");
       // ConnectDB con = new ConnectDB();
       */
        Order ord1 = new Order();
        ConnectDB con = new ConnectDB();
        try {
            con.connect();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("itGroup31 database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel(new Object[]{"id","adress", "date", "WTF", "$", "itMan","note"},0);
        JTable table = new JTable();
        table.setAutoResizeMode(1);
        table.setAutoCreateColumnsFromModel(true);
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);

        ResultSet rs = con.getResultSet();

        try {
            while(rs.next()){
                    ord1.readOrder(con.getResultSet());

                    model.addRow(new Object[]{ord1.getId(), ord1.getAdress(), ord1.getDate(), ord1.getReason(),
                            ord1.getRevenue(), ord1.getGeek(), ord1.getNote()});

                    table.setModel(model);

                }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }



        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);

        try {
            con.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}