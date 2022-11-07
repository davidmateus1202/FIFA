package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JSlider;
import java.awt.Canvas;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.LineBorder;

public class Torneo extends JFrame {

	private JPanel contentPane;


	public Torneo() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(10, 25, 100, 30);
		contentPane.add(p1);
		p1.setLayout(null);
		
		JPanel estado = new JPanel();
		estado.setBackground(new Color(255, 0, 0));
		estado.setBounds(90, 0, 10, 30);
		p1.add(estado);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(10, 60, 100, 30);
		contentPane.add(p2);
		
		JPanel estado_1 = new JPanel();
		estado_1.setBackground(Color.RED);
		estado_1.setBounds(90, 0, 10, 30);
		p2.add(estado_1);
		
		JPanel p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(10, 125, 100, 30);
		contentPane.add(p3);
		
		JPanel estado_2 = new JPanel();
		estado_2.setBackground(Color.RED);
		estado_2.setBounds(90, 0, 10, 30);
		p3.add(estado_2);
		
		JPanel p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(10, 160, 100, 30);
		contentPane.add(p4);
		
		JPanel estado_3 = new JPanel();
		estado_3.setBackground(Color.RED);
		estado_3.setBounds(90, 0, 10, 30);
		p4.add(estado_3);
		
		JPanel p5 = new JPanel();
		p5.setLayout(null);
		p5.setBounds(10, 225, 100, 30);
		contentPane.add(p5);
		
		JPanel estado_2_1 = new JPanel();
		estado_2_1.setBackground(Color.RED);
		estado_2_1.setBounds(90, 0, 10, 30);
		p5.add(estado_2_1);
		
		JPanel p6 = new JPanel();
		p6.setLayout(null);
		p6.setBounds(10, 260, 100, 30);
		contentPane.add(p6);
		
		JPanel estado_3_1 = new JPanel();
		estado_3_1.setBackground(Color.RED);
		estado_3_1.setBounds(90, 0, 10, 30);
		p6.add(estado_3_1);
		
		JPanel p7 = new JPanel();
		p7.setLayout(null);
		p7.setBounds(10, 325, 100, 30);
		contentPane.add(p7);
		
		JPanel estado_2_2 = new JPanel();
		estado_2_2.setBackground(Color.RED);
		estado_2_2.setBounds(90, 0, 10, 30);
		p7.add(estado_2_2);
		
		JPanel p8 = new JPanel();
		p8.setLayout(null);
		p8.setBounds(10, 360, 100, 30);
		contentPane.add(p8);
		
		JPanel estado_3_2 = new JPanel();
		estado_3_2.setBackground(Color.RED);
		estado_3_2.setBounds(90, 0, 10, 30);
		p8.add(estado_3_2);
		
		JPanel p9 = new JPanel();
		p9.setLayout(null);
		p9.setBounds(10, 425, 100, 30);
		contentPane.add(p9);
		
		JPanel estado_2_3 = new JPanel();
		estado_2_3.setBackground(Color.RED);
		estado_2_3.setBounds(90, 0, 10, 30);
		p9.add(estado_2_3);
		
		JPanel p10 = new JPanel();
		p10.setLayout(null);
		p10.setBounds(10, 460, 100, 30);
		contentPane.add(p10);
		
		JPanel estado_3_3 = new JPanel();
		estado_3_3.setBackground(Color.RED);
		estado_3_3.setBounds(90, 0, 10, 30);
		p10.add(estado_3_3);
		
		JPanel p11 = new JPanel();
		p11.setLayout(null);
		p11.setBounds(10, 525, 100, 30);
		contentPane.add(p11);
		
		JPanel estado_2_4 = new JPanel();
		estado_2_4.setBackground(Color.RED);
		estado_2_4.setBounds(90, 0, 10, 30);
		p11.add(estado_2_4);
		
		JPanel p12 = new JPanel();
		p12.setLayout(null);
		p12.setBounds(10, 560, 100, 30);
		contentPane.add(p12);
		
		JPanel estado_3_4 = new JPanel();
		estado_3_4.setBackground(Color.RED);
		estado_3_4.setBounds(90, 0, 10, 30);
		p12.add(estado_3_4);
		
		JPanel p13 = new JPanel();
		p13.setLayout(null);
		p13.setBounds(10, 625, 100, 30);
		contentPane.add(p13);
		
		JPanel estado_2_5 = new JPanel();
		estado_2_5.setBackground(Color.RED);
		estado_2_5.setBounds(90, 0, 10, 30);
		p13.add(estado_2_5);
		
		JPanel p14 = new JPanel();
		p14.setLayout(null);
		p14.setBounds(10, 660, 100, 30);
		contentPane.add(p14);
		
		JPanel estado_3_5 = new JPanel();
		estado_3_5.setBackground(Color.RED);
		estado_3_5.setBounds(90, 0, 10, 30);
		p14.add(estado_3_5);
		
		JPanel p15 = new JPanel();
		p15.setLayout(null);
		p15.setBounds(10, 725, 100, 30);
		contentPane.add(p15);
		
		JPanel estado_2_6 = new JPanel();
		estado_2_6.setBackground(Color.RED);
		estado_2_6.setBounds(90, 0, 10, 30);
		p15.add(estado_2_6);
		
		JPanel p16 = new JPanel();
		p16.setLayout(null);
		p16.setBounds(10, 760, 100, 30);
		contentPane.add(p16);
		
		JPanel estado_3_6 = new JPanel();
		estado_3_6.setBackground(Color.RED);
		estado_3_6.setBounds(90, 0, 10, 30);
		p16.add(estado_3_6);
		
		JPanel oct1 = new JPanel();
		oct1.setLayout(null);
		oct1.setBounds(147, 41, 100, 30);
		contentPane.add(oct1);
		
		JPanel estado_1_1 = new JPanel();
		estado_1_1.setBackground(Color.RED);
		estado_1_1.setBounds(90, 0, 10, 30);
		oct1.add(estado_1_1);
		
		JPanel oct2 = new JPanel();
		oct2.setLayout(null);
		oct2.setBounds(147, 140, 100, 30);
		contentPane.add(oct2);
		
		JPanel estado_1_1_1 = new JPanel();
		estado_1_1_1.setBackground(Color.RED);
		estado_1_1_1.setBounds(90, 0, 10, 30);
		oct2.add(estado_1_1_1);
		
		JPanel oct3 = new JPanel();
		oct3.setLayout(null);
		oct3.setBounds(147, 236, 100, 30);
		contentPane.add(oct3);
		
		JPanel estado_1_1_2 = new JPanel();
		estado_1_1_2.setBackground(Color.RED);
		estado_1_1_2.setBounds(90, 0, 10, 30);
		oct3.add(estado_1_1_2);
		
		JPanel oct4 = new JPanel();
		oct4.setLayout(null);
		oct4.setBounds(147, 342, 100, 30);
		contentPane.add(oct4);
		
		JPanel estado_1_1_3 = new JPanel();
		estado_1_1_3.setBackground(Color.RED);
		estado_1_1_3.setBounds(90, 0, 10, 30);
		oct4.add(estado_1_1_3);
		
		JPanel oct5 = new JPanel();
		oct5.setLayout(null);
		oct5.setBounds(147, 442, 100, 30);
		contentPane.add(oct5);
		
		JPanel estado_1_1_4 = new JPanel();
		estado_1_1_4.setBackground(Color.RED);
		estado_1_1_4.setBounds(90, 0, 10, 30);
		oct5.add(estado_1_1_4);
		
		JPanel oct6 = new JPanel();
		oct6.setLayout(null);
		oct6.setBounds(147, 543, 100, 30);
		contentPane.add(oct6);
		
		JPanel estado_1_1_5 = new JPanel();
		estado_1_1_5.setBackground(Color.RED);
		estado_1_1_5.setBounds(90, 0, 10, 30);
		oct6.add(estado_1_1_5);
		
		JPanel oct7 = new JPanel();
		oct7.setLayout(null);
		oct7.setBounds(147, 644, 100, 30);
		contentPane.add(oct7);
		
		JPanel estado_1_1_6 = new JPanel();
		estado_1_1_6.setBackground(Color.RED);
		estado_1_1_6.setBounds(90, 0, 10, 30);
		oct7.add(estado_1_1_6);
		
		JPanel oct8 = new JPanel();
		oct8.setLayout(null);
		oct8.setBounds(147, 742, 100, 30);
		contentPane.add(oct8);
		
		JPanel estado_1_1_7 = new JPanel();
		estado_1_1_7.setBackground(Color.RED);
		estado_1_1_7.setBounds(90, 0, 10, 30);
		oct8.add(estado_1_1_7);
		
		JPanel cuart1 = new JPanel();
		cuart1.setLayout(null);
		cuart1.setBounds(319, 88, 100, 30);
		contentPane.add(cuart1);
		
		JPanel estado_1_1_8 = new JPanel();
		estado_1_1_8.setBackground(Color.RED);
		estado_1_1_8.setBounds(90, 0, 10, 30);
		cuart1.add(estado_1_1_8);
		
		JPanel cuart2 = new JPanel();
		cuart2.setLayout(null);
		cuart2.setBounds(319, 289, 100, 30);
		contentPane.add(cuart2);
		
		JPanel estado_1_1_8_1 = new JPanel();
		estado_1_1_8_1.setBackground(Color.RED);
		estado_1_1_8_1.setBounds(90, 0, 10, 30);
		cuart2.add(estado_1_1_8_1);
		
		JPanel cuart3 = new JPanel();
		cuart3.setLayout(null);
		cuart3.setBounds(319, 494, 100, 30);
		contentPane.add(cuart3);
		
		JPanel estado_1_1_8_3 = new JPanel();
		estado_1_1_8_3.setBackground(Color.RED);
		estado_1_1_8_3.setBounds(90, 0, 10, 30);
		cuart3.add(estado_1_1_8_3);
		
		JLabel lblTrofeo = new JLabel("");
		lblTrofeo.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/23f1e2d191fc3913058f730feecb149b (2).png")));
		lblTrofeo.setBounds(678, 41, 200, 303);
		contentPane.add(lblTrofeo);
		
		JPanel cuart4 = new JPanel();
		cuart4.setLayout(null);
		cuart4.setBounds(319, 697, 100, 30);
		contentPane.add(cuart4);
		
		JPanel estado_1_1_8_3_1 = new JPanel();
		estado_1_1_8_3_1.setBackground(Color.RED);
		estado_1_1_8_3_1.setBounds(90, 0, 10, 30);
		cuart4.add(estado_1_1_8_3_1);
		
		JPanel semi1 = new JPanel();
		semi1.setLayout(null);
		semi1.setBounds(504, 183, 100, 30);
		contentPane.add(semi1);
		
		JPanel estado_1_1_8_2 = new JPanel();
		estado_1_1_8_2.setBackground(Color.RED);
		estado_1_1_8_2.setBounds(90, 0, 10, 30);
		semi1.add(estado_1_1_8_2);
		
		JPanel semi2 = new JPanel();
		semi2.setLayout(null);
		semi2.setBounds(504, 596, 100, 30);
		contentPane.add(semi2);
		
		JPanel estado_1_1_8_4 = new JPanel();
		estado_1_1_8_4.setBackground(Color.RED);
		estado_1_1_8_4.setBounds(90, 0, 10, 30);
		semi2.add(estado_1_1_8_4);
		
		JPanel finalista = new JPanel();
		finalista.setLayout(null);
		finalista.setBounds(725, 342, 100, 30);
		contentPane.add(finalista);
		
		JPanel estado_1_1_8_5 = new JPanel();
		estado_1_1_8_5.setBackground(Color.RED);
		estado_1_1_8_5.setBounds(90, 0, 10, 30);
		finalista.add(estado_1_1_8_5);
	}
}
