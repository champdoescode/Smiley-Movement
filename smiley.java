import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class smiley extends JPanel
{
    private int x = 125;
    private int y = 100;

    private int moveRight ;

    public smiley() 
    {
	JButton prava = new JButton("Left");
	prava.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(final ActionEvent e) 
		{
	 		int moveRight = 1;
	          	x = x - 10;
	          	repaint();
		}
	});
	add(prava);


	JButton leva = new JButton("Right");
	leva.addActionListener(new ActionListener()
	{
		@Override
 		public void actionPerformed(final ActionEvent e) 
		{

 			int moveRight = 2;
 			x = x + 10;
 			repaint();
		}
	});
	add(leva);


	JButton down = new JButton("down");
	down.addActionListener(new ActionListener()
	{
		@Override
 		public void actionPerformed(final ActionEvent e) 
		{

 			int moveRight = 3;
 			y = y + 10;
 			repaint();
		}
	});
	add(down);

	JButton up = new JButton("up");
	up.addActionListener(new ActionListener()
	{
		@Override
 		public void actionPerformed(final ActionEvent e) 
		{

 			int moveRight = 4;
 			y = y - 10;
 			repaint();
		}
	});
	add(up);
}



    @Override
    public void paintComponent(final Graphics g) {

        super.paintComponent(g);

        if (moveRight==1) {

            tank_cerveny(g);
        } 
	else if (moveRight==2){

            tank_modry(g);
        } 
	else if (moveRight==3){

            tank_down(g);
        } 
	else if (moveRight==4){

            tank_up(g);
        }
	else
	{

            tank_modry(g);
        }
    }



    public void tank_cerveny(final Graphics g) {

          g.setColor(Color.YELLOW);
          
	g.fillOval(x-15, y + 20, 67, 67);
	g.setColor(Color.BLACK);
	g.drawArc(x-5,y+50, 50, 20, 180, 180);
	g.setColor(Color.BLACK);
	g.fillOval(x, y + 40, 30, 30);
	g.fillOval(x+25, y + 40, 10, 10);

	
    }

    public void tank_modry(final Graphics g) {

          g.setColor(Color.YELLOW);
          
	g.fillOval(x-15, y + 20, 67, 67);
	g.setColor(Color.BLACK);
	g.drawArc(x-5,y+50, 50, 20, 180, 180);
	g.setColor(Color.BLACK);
	g.fillOval(x, y + 40, 10, 10);
	g.fillOval(x+25, y + 40, 10, 10);

    }

 public void tank_up(final Graphics g) {

          g.setColor(Color.YELLOW);
		  
	g.fillOval(x-15, y + 20, 67, 67);
	g.setColor(Color.BLACK);
	g.drawArc(x-5,y+50, 50, 20, 180, 180);
	g.setColor(Color.BLACK);
	g.fillOval(x, y + 40, 30, 30);
	g.fillOval(x+25, y + 40, 10, 10);
    }

 public void tank_down(final Graphics g) 
{
          g.setColor(Color.YELLOW);
          
		g.fillOval(x-15, y + 20, 67, 67);
		g.setColor(Color.BLACK);
		g.drawArc(x-5,y+50, 50, 20, 180, 180);
		g.setColor(Color.BLACK);
	g.fillOval(x, y + 40, 30, 30);
	g.fillOval(x+25, y + 40, 10, 10);
	
 }

public static void main(final String[] args) 
{
        smiley hra = new smiley();
        JFrame frame = new JFrame();
        frame.setContentPane(hra);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}