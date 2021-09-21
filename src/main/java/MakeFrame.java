import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

class MakeFrame
{
    public MakeFrame()
    {
        JFrame frame = new JFrame("File Chooser");
        JPanel pane = new JPanel();
        pane.setLayout(null);
        MenuBarMaker menu = new MenuBarMaker(frame , pane);
        ToolBarMaker toolbar = new ToolBarMaker(frame , pane);
        frame.getContentPane().add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Main Window");
        frame.setSize(500 ,500);
        frame.setVisible(true);
    }

    public static void main(String args[])
    {
        new MakeFrame();
    }
}

/*----------------------MenuMaker Class------------------------*/
class MenuBarMaker
{
    private JFrame frame;
    private JPanel pane;
    public MenuBarMaker(JFrame aFrame ,JPanel apane )
    {
        frame= aFrame;
        pane = apane ;
        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        menu1.setMnemonic(KeyEvent.VK_I);
        menu1.getAccessibleContext().setAccessibleDescription("");
        JMenuItem item1 = new JMenuItem("Open");
        item1.setMnemonic(KeyEvent.VK_D);
        item1.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        JFileChooser fc = new JFileChooser();
                        fc.setCurrentDirectory( new File( System.getProperty( "user.dir" ) ) );
                        int rsp = fc.showOpenDialog( frame );
                        if( rsp == JFileChooser.APPROVE_OPTION )
                        {
                            try
                            {
                                File f = fc.getSelectedFile();
                                FileReader fr = new FileReader( f );
                                BufferedReader br = new BufferedReader( fr );
                                String line = br.readLine();
                                if( line.equals( "Avin Property File" ) )
                                {
                                    // Clear current contents of pane.
                                    pane.removeAll();
                                    while( (line = br.readLine()) != null )
                                    {
                                        StringTokenizer st = new StringTokenizer( line, "," );
                                        if( st.countTokens() == 5)
                                        {
                                            MoveableButton b = new MoveableButton( st.nextToken().trim() );
                                            int xLoc = Integer.parseInt( st.nextToken().trim() );
                                            int yLoc = Integer.parseInt( st.nextToken().trim() );
                                            int w = Integer.parseInt( st.nextToken().trim() );
                                            int h = Integer.parseInt( st.nextToken().trim() );
                                            b.setBounds( xLoc, yLoc, w, h );
                                            pane.add( b );
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println( "Unsupport file format!" );
                                }
                                br.close();
                                fr.close();
                            }
                            catch( IOException ioe )
                            {};
                        }
                    }
                });
        JMenuItem item2 = new JMenuItem( "Save" );
        item2.setMnemonic(KeyEvent.VK_D);
        item2.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        //what happens when pressed
                        JFileChooser fc = new JFileChooser();
                        fc.setCurrentDirectory( new File( System.getProperty( "user.dir" ) ) );
                        int rsp = fc.showSaveDialog( frame );
                        if( rsp == JFileChooser.APPROVE_OPTION )
                        {
                            try
                            {
                                File f = fc.getSelectedFile();
                                FileWriter fw = new FileWriter( f );
                                PrintWriter pw = new PrintWriter( fw );
                                Component[] comps = pane.getComponents();
                                pw.println( "Avin Property File" );
                                for( int i = 0; i < comps.length; ++i )
                                {
                                    JButton b = (JButton)comps[i];
                                    Dimension dim = b.getSize();
                                    Point loc = b.getLocation();
                                    pw.println( b.getText() + ", " +
                                            loc.x + ", " + loc.y + ", " +
                                            dim.width + ", " + dim.height );
                                }
                                pw.close();
                                fw.close();
                            }
                            catch( IOException ioe ) {};
                        }
                    }
                });
        menu1.add(item1);
        menu1.add(item2);
        menubar.add(menu1);
        frame.setJMenuBar(menubar);
    }
}

/*---------------------------------------------------------*/
class ToolBarMaker
{
    private JFrame frame;
    private JPanel pane;
    public ToolBarMaker(JFrame aFrame , JPanel apane)
    {
        frame = aFrame ;
        pane = apane;
        JToolBar toolbar = new JToolBar(JToolBar.HORIZONTAL);
        toolbar.addSeparator();
        JButton button = new JButton("Click to add Button to JPanel");
        toolbar.add(button);
        button.setMnemonic(KeyEvent.VK_D);
        button.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        pane.add( new MoveableButton( pane.getComponentCount() ) );
                        pane.repaint();
                    }
                });
        frame.getContentPane().add("North", toolbar);
    }
}

/*---------------------------------------------------------*/
/* this class makes the added button moveable!!!*/
class MoveableButton extends JButton
{
    private int xOffset, yOffset;
    public MoveableButton( int labelNumber )
    {
        this( ("" + labelNumber) );
    }
    public MoveableButton( String label )
    {
        super( label );
        System.out.println( "Creating ..." + label );
        addMouseListener(
                new MouseAdapter()
                {
                    public void mousePressed(MouseEvent e)
                    {
                        xOffset = e.getX();
                        yOffset = e.getY();
                    }
                });
        addMouseMotionListener(
                new MouseMotionAdapter()
                {
                    public void mousePressed(MouseEvent mee)
                    {
                        // store cursor-position relative to active component
                    }
                    public void mouseDragged(MouseEvent mee)
                    {
          /*Minus the offset so that the curser does not jump to the 
          upper left hand side of button when dragging it. However it does not work*/
                        int x1 = mee.getComponent().getX() + mee.getX() - xOffset;
                        int y1 = mee.getComponent().getY() + mee.getY() - yOffset;
                        setLocation( x1, y1 );
                    }
                });
        setBounds( 10,15,100,40 );
    }
}
