
package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class Main extends JFrame {
	
	private JPanel contentPane;
	private JTextField pathField;
	private JLabel lblExample;
	private JTextField textdmg;
	private JLabel lblItHasTo;

	
	public boolean useFolders = false, allXDmg = false;
	ArrayList<String> extentions =new ArrayList<String>();
	public static String path="";
	public static int damage=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQ = new JLabel("Where to drop the bomb?");
		lblQ.setFont(new Font("Consolas", Font.BOLD, 15));
		lblQ.setBounds(10, 59, 221, 14);
		contentPane.add(lblQ);
		
		pathField = new JTextField();
		pathField.setBounds(10, 77, 189, 20);
		contentPane.add(pathField);
		pathField.setColumns(10);
		
		lblExample = new JLabel(" Example:C:\\\\Users\\\\PC\\\\Desktop");
		lblExample.setBounds(10, 97, 179, 14);
		contentPane.add(lblExample);
		
		textdmg = new JTextField();
		textdmg.setBounds(290, 77, 134, 20);
		contentPane.add(textdmg);
		textdmg.setColumns(10);
		
		JLabel lblDamage = new JLabel("Damage?");
		lblDamage.setFont(new Font("Consolas", Font.BOLD, 15));
		lblDamage.setBounds(290, 59, 86, 14);
		contentPane.add(lblDamage);
		
		lblItHasTo = new JLabel("it has to be a number");
		lblItHasTo.setBounds(290, 97, 115, 14);
		contentPane.add(lblItHasTo);
		
		JCheckBox chckbxtxt = new JCheckBox(".txt+jomama");
		chckbxtxt.setBounds(6, 118, 97, 23);
		contentPane.add(chckbxtxt);
		
		JCheckBox chckbxFolders = new JCheckBox("folders");
		chckbxFolders.setBounds(6, 144, 97, 23);
		contentPane.add(chckbxFolders);
		
		JCheckBox chckbxJs = new JCheckBox(".js");
		chckbxJs.setBounds(6, 170, 97, 23);
		contentPane.add(chckbxJs);
		
		JCheckBox chckbxBat = new JCheckBox(".bat");
		chckbxBat.setBounds(6, 196, 97, 23);
		contentPane.add(chckbxBat);
		
		JCheckBox chckbxwebp = new JCheckBox(".webp");
		chckbxwebp.setBounds(6, 222, 97, 23);
		contentPane.add(chckbxwebp);
		
		JCheckBox chckbxDocxAndDoc = new JCheckBox("docx and doc");
		chckbxDocxAndDoc.setBounds(105, 118, 97, 23);
		contentPane.add(chckbxDocxAndDoc);
		
		JCheckBox chckbxPdf = new JCheckBox("pdf");
		chckbxPdf.setBounds(105, 144, 97, 23);
		contentPane.add(chckbxPdf);
		
		JCheckBox chckbxcpp = new JCheckBox(" .cpp and .cs");
		chckbxcpp.setBounds(105, 170, 97, 23);
		contentPane.add(chckbxcpp);
		
		JCheckBox chckbxexe = new JCheckBox(".exe");
		chckbxexe.setBounds(105, 196, 97, 23);
		contentPane.add(chckbxexe);
		
		JCheckBox chckbxmkv = new JCheckBox(".mkv");
		chckbxmkv.setBounds(105, 222, 97, 23);
		contentPane.add(chckbxmkv);
		
		JLabel lblTitle = new JLabel("Bomb 2.0");
		lblTitle.setFont(new Font("Consolas", Font.BOLD, 25));
		lblTitle.setBounds(10, 11, 414, 37);
		contentPane.add(lblTitle);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/com/icon.png")));
		label.setBounds(131, 2, 54, 46);
		contentPane.add(label);		
		
		JCheckBox chckbxAll = new JCheckBox("all x dmg\r\n");
		chckbxAll.setBounds(335, 182, 97, 23);
		contentPane.add(chckbxAll);
		
		JLabel lblSelectIfYou = new JLabel("default :all = dmg\r\n");
		lblSelectIfYou.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblSelectIfYou.setBounds(335, 210, 99, 14);
		contentPane.add(lblSelectIfYou);
		
		JButton btnSelectAll = new JButton("select all");
		btnSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				chckbxtxt.setSelected(true);
				chckbxmkv.setSelected(true);
				chckbxexe.setSelected(true);
				chckbxcpp.setSelected(true);
				chckbxPdf.setSelected(true);
				chckbxDocxAndDoc.setSelected(true);
				chckbxwebp.setSelected(true);
				chckbxBat.setSelected(true);
				chckbxJs.setSelected(true);
				chckbxFolders.setSelected(true);
				
			}
			
		});
		btnSelectAll.setBounds(335, 118, 89, 23);
		contentPane.add(btnSelectAll);
		
		JButton btnDeselectAll = new JButton("deselect all");
		btnDeselectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chckbxtxt.setSelected(false);
				chckbxmkv.setSelected(false);
				chckbxexe.setSelected(false);
				chckbxcpp.setSelected(false);
				chckbxPdf.setSelected(false);
				chckbxDocxAndDoc.setSelected(false);
				chckbxwebp.setSelected(false);
				chckbxBat.setSelected(false);
				chckbxJs.setSelected(false);
				chckbxFolders.setSelected(false);
				
			}
		});
		btnDeselectAll.setBounds(335, 144, 89, 23);
		contentPane.add(btnDeselectAll);
		
		JButton btnNuke = new JButton("Nuke");
		btnNuke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//safety mechanism
				String safety=JOptionPane.showInputDialog("type:CONFIRM");
				if (safety!=null) 
				if (safety.equals("CONFIRM")) {	
					if (chckbxtxt.isSelected()) {
						extentions.add(".txt");
					}
					if (chckbxJs.isSelected()) {
						extentions.add(".js");
					}
					if (chckbxBat.isSelected()) {
						extentions.add(".bat");
					}
					if (chckbxwebp.isSelected()) {
						extentions.add(".webp");
					}
					if (chckbxDocxAndDoc.isSelected()) {
						extentions.add(".docx");
						extentions.add(".doc");
					}
					if (chckbxPdf.isSelected()) {
						extentions.add(".pdf");
					}
					if (chckbxcpp.isSelected()) {
						extentions.add(".cpp");
						extentions.add(".cs");
					}
					if (chckbxexe.isSelected()) {
						extentions.add(".exe");
					}
					if (chckbxmkv.isSelected()) {
						extentions.add(".mkv");
					}
					if (chckbxFolders.isSelected()) {
						useFolders=true;
					}
					if (rootPaneCheckingEnabled) {
						allXDmg=true;
					}
					//closes the window after clicking next
					dispose();
					path = pathField.getText();
					try {	
						damage = Integer.parseInt(textdmg.getText());
					} catch (Exception e2) {
						System.out.println("incorrect number");
					}
					
					System.out.println("Boom!");
					
				}
			}
		});
		btnNuke.setBounds(335, 227, 89, 23);
		contentPane.add(btnNuke);
	}	
}
