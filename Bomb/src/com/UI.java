/**
 * 
 */
package com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * @author PC
 *
 */
public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField pathField;
	private JLabel lblExample;
	private JTextField textField;
	private JLabel lblItHasTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<String> arrayList =new ArrayList<String>();
		
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
		
		textField = new JTextField();
		textField.setBounds(290, 77, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		label.setIcon(new ImageIcon(UI.class.getResource("/com/icon.png")));
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
			}
		});
		btnSelectAll.setBounds(335, 118, 89, 23);
		contentPane.add(btnSelectAll);
		
		JButton btnDeselectAll = new JButton("deselect all");
		btnDeselectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeselectAll.setBounds(335, 144, 89, 23);
		contentPane.add(btnDeselectAll);
		
		JButton btnNuke = new JButton("Nuke");
		btnNuke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (chckbxtxt.isSelected()) {
					arrayList.add("");
				}
				if (rootPaneCheckingEnabled) {
					arrayList.add("");
				}
				if (rootPaneCheckingEnabled) {
					arrayList.add("");
				}
				
				

			}
		});
		btnNuke.setBounds(335, 227, 89, 23);
		contentPane.add(btnNuke);	
	}	
}
