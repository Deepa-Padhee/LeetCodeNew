import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public final class JTableDemo extends JFrame {

    String[] colNames = {"Name", "Surname"};
    String[][] data = {{"Nation", "Chirara"}, {"Bill", "Thompson"}};
    String [][] newRow={{"",""},{"",""}};
    JTable table;
    JScrollPane sp;

    JTableDemo(String title){
        super(title);
        this.setSize(300, 300);
        this.setVisible(true);

        Container con= this.getContentPane();
        this.createTable();
        con.add(sp);


    }
    public void createTable(){
        DefaultTableModel tm = new DefaultTableModel(data, colNames);
        table= new JTable(tm);
        sp= new JScrollPane(table);
        table.getModel().addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent tme) {

                TableModel tm=table.getModel();
                DefaultTableModel dtm=(DefaultTableModel)tm;
                dtm.addRow(newRow);
            }
        });


    }
    public static void main(String [] args){
        JTableDemo jtd= new JTableDemo("My Table");

    }

}