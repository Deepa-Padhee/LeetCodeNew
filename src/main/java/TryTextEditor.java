import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TryTextEditor extends JFrame implements ActionListener
{
    JMenu file, edit, exit ;
    JMenuItem new1, open, save, edit1, font, exit1 ;
    JTextArea textArea ;
    JFileChooser chooser ;
    FileInputStream fis ;
    BufferedReader br ;
    FileOutputStream fos ;
    BufferedWriter bwriter ;
    static TryTextEditor app ;
    public TryTextEditor()
    {
        super( "Java Text Editor Application" ) ;

        Container c = getContentPane() ;
        c.setLayout( new BorderLayout() ) ;
        c.setBackground( Color.green ) ;
        c.setForeground( Color.blue ) ;
        JMenuBar bar = new JMenuBar() ;
        bar.setFont( new Font( "Arial" , Font.BOLD , 14 ) ) ;
        file = new JMenu(" File ") ;
        new1 = new JMenuItem( " New     ") ;
        new1.addActionListener( this ) ;
        open = new JMenuItem( " Open... ") ;
        open.addActionListener( this ) ;
        save = new JMenuItem( " Save... ") ;
        save.addActionListener( this ) ;
        file.add( new1 ) ;
        file.add( open ) ;
        file.add( save ) ;
        bar.add(  file ) ;
        edit  = new JMenu(" Edit ") ;
        edit1 = new JMenuItem( " Edit... ") ;
        font  = new JMenuItem( " Font... ") ;
        edit.add( edit1 ) ;
        edit.add( font ) ;
        bar.add( edit ) ;
        exit = new JMenu(" Exit ") ;
        exit1 = new JMenuItem( "Exit Your App" ) ;

        exit.add( exit1 ) ;
        bar.add( exit ) ;
        c.add( bar , BorderLayout.NORTH) ;
        textArea = new JTextArea( 20 , 18 ) ;
        textArea.setFont( new Font( "Arial" , Font.BOLD , 14 ) ) ;
        JScrollPane scrollPane = new JScrollPane( textArea ) ;
        //scrollPane.setLayout( BorderLayout.CENTER ) ;
        c.add( scrollPane , BorderLayout.CENTER ) ;
        scrollPane.revalidate() ;
        setVisible( true ) ;
        setSize( 750 , 580 ) ;
    }
    public void actionPerformed( ActionEvent event )
    {
        Object obj = event.getSource() ;
        chooser = new JFileChooser() ;
        if ( chooser.showOpenDialog( app ) ==
                JFileChooser.APPROVE_OPTION )
            if ( obj == open )
            {
                try
                {
                    fis = new FileInputStream(
                            chooser.getSelectedFile() ) ;
                    br  = new BufferedReader(
                            new InputStreamReader( fis ) ) ;
                    String read ;
                    StringBuffer text = new StringBuffer() ;
                    while( ( read = br.readLine() ) != null )
                    {
                        text.append( read ).append( "\n" ) ;
                    }
                    textArea.setText( text.toString() ) ;
                }
                catch( IOException e )
                {
                    JOptionPane.showMessageDialog( this ,
                            "Error in File Operation" ,
                            "Error in File Operation" ,
                            JOptionPane.INFORMATION_MESSAGE) ;
                }
            }
    }
    public static void main( String[] args )
    {
        app = new TryTextEditor() ;

        app.setDefaultCloseOperation( EXIT_ON_CLOSE ) ;
    }
}