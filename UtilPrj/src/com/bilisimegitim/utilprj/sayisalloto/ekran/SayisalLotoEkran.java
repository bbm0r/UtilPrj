package com.bilisimegitim.utilprj.sayisalloto.ekran;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bilisimegitim.utilprj.sayisalloto.SayisalLoto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SayisalLotoEkran extends JFrame {

	private JPanel contentPane;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayisalLotoEkran frame = new SayisalLotoEkran();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SayisalLotoEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaysalLoto = new JLabel("SAYISAL LOTO");
		lblSaysalLoto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSaysalLoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaysalLoto.setBounds(0, 47, 434, 14);
		contentPane.add(lblSaysalLoto);
		
		tf2 = new JTextField();
		tf2.setBounds(75, 72, 60, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(145, 72, 60, 20);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(215, 72, 60, 20);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(285, 72, 60, 20);
		contentPane.add(tf5);
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(355, 72, 60, 20);
		contentPane.add(tf6);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(10, 72, 60, 20);
		contentPane.add(tf1);
		
		JButton btnEvir = new JButton("\u00C7evir");
		btnEvir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SayisalLoto loto = new SayisalLoto();
				
				int[] sayilar = loto.arrayOlustur();
				
				tf1.setText(String.valueOf(sayilar[0]));
				tf2.setText(String.valueOf(sayilar[1]));
				tf3.setText(String.valueOf(sayilar[2]));
				tf4.setText(String.valueOf(sayilar[3]));
				tf5.setText(String.valueOf(sayilar[4]));
				tf6.setText(String.valueOf(sayilar[5]));
				
				
				
			}
		});
		btnEvir.setBounds(0, 137, 434, 23);
		contentPane.add(btnEvir);
	}
}
