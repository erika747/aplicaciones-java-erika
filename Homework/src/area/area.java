package area;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class area {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					area window = new area();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public area() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1202, 790);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnsquare = new JButton("Square");
		btnsquare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String asquare = JOptionPane.showInputDialog("Introduce the height of the square");
				String dsquare = JOptionPane.showInputDialog("Introduce the units");
				double bsquare = Double.parseDouble(asquare);
				double csquare = bsquare*bsquare;
				JOptionPane.showMessageDialog(null, "The area is: " + csquare + dsquare + " squared.");
			}
		});
		btnsquare.setBounds(73, 208, 148, 39);
		frame.getContentPane().add(btnsquare);
		
		JButton btnrectangle = new JButton("Rectangle");
		btnrectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arect = JOptionPane.showInputDialog("Introduce the height of the rectangle");
				String brect = JOptionPane.showInputDialog("Introduce the base length of the rectangle");
				String crect = JOptionPane.showInputDialog("Introduce the units");
				double drect = Double.parseDouble(arect);
				double eforrect = Double.parseDouble(brect);
				double frect = drect*eforrect;
				JOptionPane.showMessageDialog(null, "The area is: " + frect + crect + " squared.");
			}
		});
		btnrectangle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnrectangle.setBounds(279, 208, 141, 39);
		frame.getContentPane().add(btnrectangle);
		
		JButton btntriangle = new JButton("Triangle");
		btntriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String atri = JOptionPane.showInputDialog("Introduce the height of the triangle");
				String btri = JOptionPane.showInputDialog("Introduce the base length of the triangle");
				String ctri = JOptionPane.showInputDialog("Introduce the units");
				double dtri = Double.parseDouble(atri);
				double etri = Double.parseDouble(btri);
				double ftri = dtri*etri;
				double gtri = ftri/2;
				JOptionPane.showMessageDialog(null, "The area is: " + gtri + ctri + " squared.");
				
			}
		});
		btntriangle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btntriangle.setBounds(474, 208, 141, 39);
		frame.getContentPane().add(btntriangle);
		
		JButton btnparallelogram = new JButton("Parallelogram");
		btnparallelogram.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnparallelogram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String apara = JOptionPane.showInputDialog("Introduce the height of the parallelogram");
				String bpara = JOptionPane.showInputDialog("Introduce the base lenght of the parallelogram");
				String cpara = JOptionPane.showInputDialog("Introduce the units");
				double dpara = Double.parseDouble(apara);
				double epara = Double.parseDouble(bpara);
				double fpara = dpara*epara;
				JOptionPane.showMessageDialog(null, "The area is: " + fpara + cpara + " squared.");
			}
		});
		btnparallelogram.setBounds(662, 208, 181, 39);
		frame.getContentPane().add(btnparallelogram);
		
		JButton btntrapezium = new JButton("Trapezium");
		btntrapezium.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btntrapezium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String atrape = JOptionPane.showInputDialog("Introduce the base length of the trapezium");
				String btrape = JOptionPane.showInputDialog("Introduce the top length of the trapezium");
				String ctrape = JOptionPane.showInputDialog("Inrtoduce the height of the trapezium");
				String dtrape = JOptionPane.showInputDialog("Introduce the units");
				double etrape = Double.parseDouble(atrape);
				double ftrape = Double.parseDouble(btrape);
				double gtrape = Double.parseDouble(ctrape);
				double htrape = etrape+ftrape;
				double itrape = htrape/2;
				double jtrape = itrape*gtrape;
				JOptionPane.showMessageDialog(null, "The area is: " + jtrape + dtrape + " squared.");
			}
		});
		btntrapezium.setBounds(896, 208, 169, 39);
		frame.getContentPane().add(btntrapezium);
		
		JButton btncircle = new JButton("Circle");
		btncircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String acirc = JOptionPane.showInputDialog("Introduce the radius");
				String bcirc = JOptionPane.showInputDialog("Introduce the units");
				double ccirc = Double.parseDouble(acirc);
				double dcirc = ccirc*ccirc;
				double ecirc = dcirc*3.1416;
				JOptionPane.showMessageDialog(null, "The area is: " + ecirc + bcirc + " squared.");
			}
		});
		btncircle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btncircle.setBounds(73, 282, 148, 39);
		frame.getContentPane().add(btncircle);
		
		JLabel lblChooseTheShape = new JLabel("Choose the shape you want the area of");
		lblChooseTheShape.setBounds(262, 53, 529, 45);
		frame.getContentPane().add(lblChooseTheShape);
	}
}
