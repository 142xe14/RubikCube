package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.StdCube;
import Model.StdRubikCube;

public class stdIhm {

	private JButton reset;
	private JButton case0;
	private JButton case1;
	private JButton case2;
	private JButton case3;
	private JButton case4;
	private JButton case5;
	private JButton case6;
	private JButton case7;
	private JButton case8;
	private JButton case9;
	private JButton case10;
	private JButton case11;
	private JButton case12;
	private JButton case13;
	private JButton case14;
	private JButton case15;
	private JButton case16;
	private JButton case17;
	private JButton case18;
	private JButton case19;
	private JButton case20;
	private JButton case21;
	private JButton case22;
	private JButton case23;
	private JButton rotateLeft;
	private JButton rotateRight;
	private JButton rotateUp;
	private JButton rotateDown;
	private JButton rotateFrontRight;
	private JButton rotateRearRight;
	private JButton ia;
	private JFrame frame;
	private Dimension preferredSize;
	private StdRubikCube pocketCube;
	
	stdIhm(){
		createModel();
		createView();
		placeComponent();
		setColor();
		display();
	}

	private void createModel() {
		pocketCube = new StdRubikCube();
		pocketCube.init();
	}

	private void createView() {
		reset = new JButton("M�lange");
		reset.addActionListener(new resetListener());
		ia = new JButton("Intelligence Artificielle");
		ia.addActionListener(new iaListener());
		rotateLeft = new JButton("rotateLeft");
		rotateLeft.addActionListener(new rotateLeftListener());
		rotateRight = new JButton("rotateRight");
		rotateRight.addActionListener(new rotateRightListener());
		rotateDown = new JButton("rotateDown");
		rotateDown.addActionListener(new rotateDownListener());
		rotateUp = new JButton("rotateUp");
		rotateUp.addActionListener(new rotateUpListener());
		rotateFrontRight = new JButton("rotateFrontRight");
		rotateFrontRight.addActionListener(new rotateFrontRightListener());
		rotateRearRight = new JButton("rotateRearRight");
		rotateRearRight.addActionListener(new rotateRearRightListener());
		preferredSize = new Dimension(40,40);
		case0 = new JButton();
		case1 = new JButton();
		case2 = new JButton();
		case3 = new JButton();
		case4 = new JButton();
		case5 = new JButton();
		case6 = new JButton();
		case7 = new JButton();
		case8 = new JButton();
		case9 = new JButton();
		case10 = new JButton();
		case11 = new JButton();
		case12 = new JButton();
		case13 = new JButton();
		case14 = new JButton();
		case15 = new JButton();
		case16 = new JButton();
		case17 = new JButton();
		case18 = new JButton();
		case19 = new JButton();
		case20 = new JButton();
		case21 = new JButton();
		case22 = new JButton();
		case23 = new JButton();
		case0.setPreferredSize(preferredSize);
		case1.setPreferredSize(preferredSize);
		case2.setPreferredSize(preferredSize);
		case3.setPreferredSize(preferredSize);
		case4.setPreferredSize(preferredSize);
		case5.setPreferredSize(preferredSize);
		case6.setPreferredSize(preferredSize);
		case7.setPreferredSize(preferredSize);
		case8.setPreferredSize(preferredSize);
		case9.setPreferredSize(preferredSize);
		case10.setPreferredSize(preferredSize);
		case11.setPreferredSize(preferredSize);
		case12.setPreferredSize(preferredSize);
		case13.setPreferredSize(preferredSize);
		case14.setPreferredSize(preferredSize);
		case15.setPreferredSize(preferredSize);
		case16.setPreferredSize(preferredSize);
		case17.setPreferredSize(preferredSize);
		case18.setPreferredSize(preferredSize);
		case19.setPreferredSize(preferredSize);
		case20.setPreferredSize(preferredSize);
		case21.setPreferredSize(preferredSize);
		case22.setPreferredSize(preferredSize);
		case23.setPreferredSize(preferredSize);
		frame = new JFrame();
	}

	private void placeComponent() {
		JPanel p = new JPanel();{
			p.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			//GAUCHE
			c.gridx=0;
			c.gridy=2;
			p.add(case12, c);
			c.gridx=1;
			c.gridy=2;
			p.add(case13, c);
			c.gridx=0;
			c.gridy=3;
			p.add(case14, c);
			c.gridx=1;
			c.gridy=3;
			p.add(case15, c);
			c.gridx=2;
			c.gridy=0;
			//HAUT
			p.add(case16, c);
			c.gridx=3;
			c.gridy=0;
			p.add(case17, c);
			c.gridx=2;
			c.gridy=1;
			p.add(case18, c);
			c.gridx=3;
			c.gridy=1;
			p.add(case19, c);
			c.gridx=2;
			c.gridy=2;
			//AVANT
			p.add(case0, c);
			c.gridx=3;
			c.gridy=2;
			p.add(case1, c);
			c.gridx=2;
			c.gridy=3;
			p.add(case2, c);
			c.gridx=3;
			c.gridy=3;
			p.add(case3, c);
			//DROIT
			c.gridx=4;
			c.gridy=2;
			p.add(case4, c);
			c.gridx=5;
			c.gridy=2;
			p.add(case5, c);
			c.gridx=4;
			c.gridy=3;
			p.add(case6, c);
			c.gridx=5;
			c.gridy=3;
			p.add(case7, c);
			//ARRIERE
			c.gridx=6;
			c.gridy=2;
			p.add(case8, c);
			c.gridx=7;
			c.gridy=2;
			p.add(case9, c);
			c.gridx=6;
			c.gridy=3;
			p.add(case10, c);
			c.gridx=7;
			c.gridy=3;
			p.add(case11, c);
			//BAS
			c.gridx=2;
			c.gridy=4;
			p.add(case20, c);
			c.gridx=3;
			c.gridy=4;
			p.add(case21, c);
			c.gridx=2;
			c.gridy=5;
			p.add(case22, c);
			c.gridx=3;
			c.gridy=5;
			p.add(case23, c);
		}
		frame.add(p, BorderLayout.CENTER);
		p = new JPanel();{
			GridLayout gl = new GridLayout(3,2);
			p.setLayout(gl);
			p.add(rotateLeft);
			p.add(rotateRight);
			p.add(rotateUp);
			p.add(rotateDown);
			p.add(rotateFrontRight);
			p.add(rotateRearRight);
		}
		frame.add(p, BorderLayout.SOUTH);
		p = new JPanel();{
			p.add(reset);
			p.add(ia);
		}
		frame.add(p, BorderLayout.NORTH);
	}
	
	private void setColor() {
		case0.setBackground(StdRubikCube.tabCube.get(0).getColor());
		case1.setBackground(StdRubikCube.tabCube.get(1).getColor());
		case2.setBackground(StdRubikCube.tabCube.get(2).getColor());
		case3.setBackground(StdRubikCube.tabCube.get(3).getColor());
		case4.setBackground(StdRubikCube.tabCube.get(4).getColor());
		case5.setBackground(StdRubikCube.tabCube.get(5).getColor());
		case6.setBackground(StdRubikCube.tabCube.get(6).getColor());
		case7.setBackground(StdRubikCube.tabCube.get(7).getColor());
		case8.setBackground(StdRubikCube.tabCube.get(8).getColor());
		case9.setBackground(StdRubikCube.tabCube.get(9).getColor());
		case10.setBackground(StdRubikCube.tabCube.get(10).getColor());
		case11.setBackground(StdRubikCube.tabCube.get(11).getColor());
		case12.setBackground(StdRubikCube.tabCube.get(12).getColor());
		case13.setBackground(StdRubikCube.tabCube.get(13).getColor());
		case14.setBackground(StdRubikCube.tabCube.get(14).getColor());
		case15.setBackground(StdRubikCube.tabCube.get(15).getColor());
		case16.setBackground(StdRubikCube.tabCube.get(16).getColor());
		case17.setBackground(StdRubikCube.tabCube.get(17).getColor());
		case18.setBackground(StdRubikCube.tabCube.get(18).getColor());
		case19.setBackground(StdRubikCube.tabCube.get(19).getColor());
		case20.setBackground(StdRubikCube.tabCube.get(20).getColor());
		case21.setBackground(StdRubikCube.tabCube.get(21).getColor());
		case22.setBackground(StdRubikCube.tabCube.get(22).getColor());
		case23.setBackground(StdRubikCube.tabCube.get(23).getColor());;
		frame.revalidate();
	}
	
	private void display(){
		frame.setSize(1024, 768);
		frame.setTitle("Pocket Cube");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	class resetListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//pocketCube = new StdRubikCube();
			//Collections.shuffle(StdRubikCube.tabCube);
			pocketCube.melange();
			setColor();
		}
	}
	
	class iaListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//pocketCube = new StdRubikCube();
			//Collections.shuffle(StdRubikCube.tabCube);
			pocketCube.IA();
			setColor();
		}
	}
	
	class rotateLeftListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			pocketCube.rotateLeft();
			pocketCube.solution.add('l');
			setColor();
		}
	}
	
	class rotateRightListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			pocketCube.rotateRight();
			pocketCube.solution.add('r');
			setColor();
		}
	}
	
	class rotateDownListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			pocketCube.rotateDown();
			pocketCube.solution.add('d');
			setColor();
		}
	}
	
	class rotateUpListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			pocketCube.rotateUp();	
			pocketCube.solution.add('u');
			setColor();
		}
	}
	
	class rotateFrontRightListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			pocketCube.rotateFrontRight();	
			pocketCube.solution.add('f');
			setColor();
		}
	}
	
	class rotateRearRightListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			pocketCube.rotateRearRight();	
			pocketCube.solution.add('o');
			setColor();
		}
	}
	
	public static void main(String args[]){
		stdIhm ihm = new stdIhm();
	}
}
