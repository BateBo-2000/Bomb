package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;
import java.util.Random;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		String path = JOptionPane.showInputDialog("Where to drop the bomb? \nExample:C:\\Users\\PC\\Desktop");
		if (path!=null && path.length()>1) {
			
		
		int damage = Integer.parseInt(JOptionPane.showInputDialog("HOW MUCH"));
		
		
		
		String trollMessage[] = {
				"Yo mama's so fat, when she fell I didn't laugh, but the sidewalk cracked up.\r\n", 
				"Yo mama's so fat, when she skips a meal, the stock market drops.\r\n" ,
				"Yo mama's so fat, it took me two buses and a train to get to her good side.\r\n" , 
				"Yo mama's so fat, when she goes camping, the bears hide their food.\r\n" ,
				"Yo mama's so fat, if she buys a fur coat, a whole species will become extinct.\r\n" , 
				"Yo mama's so fat, she stepped on a scale and it said: \"To be continued.\"\r\n" ,
				"Yo mama's so fat, I swerved to miss her in my car and ran out of gas.\r\n" ,
				"Yo mama's so fat, when she wears high heels, she strikes oil.\r\n" ,
				"Yo mama's so fat, she was overthrown by a small militia group, and now she's known as the Republic of Yo Mama.\r\n" , 
				"Yo mama's so fat, when she sits around the house, she SITS AROUND the house.\r\n" ,
				"Yo mama's so fat, her car has stretch marks.\r\n" ,
				"Yo mama's so fat, she can't even jump to a conclusion.\r\n" , 
				"Yo mama's so fat, her blood type is Ragu.\r\n" ,
				"Yo mama's so fat, if she was a Star Wars character, her name would be Admiral Snackbar.\r\n" , 
				"Yo mama's so fat, she brought a spoon to the Super Bowl.\r\n" ,
				"Yo mama's so stupid, she stared at a cup of orange juice for 12 hours because it said \"concentrate.\"\r\n" ,
				"Yo mama's so stupid when they said it was chilly outside, she grabbed a bowl.\r\n" ,
				"Yo mama's so stupid, she put lipstick on her forehead to make up her mind.\r\n" ,
				"Yo mama's so stupid, when they said, \"Order in the court,\" she asked for fries and a shake.\r\n" ,
				"Yo mama's so stupid, she thought a quarterback was a refund.\r\n" ,
				"Yo mama's so stupid, she thought a quarterback was a refund.\r\n" , 
				"Yo mama's so stupid, she got hit by a parked car.\r\n" ,
				"Yo mama's so stupid, when I told her that she lost her mind, she went looking for it\r\n" ,
				"Yo mama's so stupid when thieves broke into her house and stole the TV, she chased after them shouting \"Wait, you forgot the remote!\"\r\n" ,
				"Yo mama's so stupid, she went to the dentist to get a Bluetooth.\r\n" ,
				"Yo mama's so stupid, she took a ruler to bed to see how long she slept.\r\n" ,
				"Yo mama's so stupid, she got locked in the grocery store and starved to death.\r\n" ,
				"Yo mama's so stupid, when I said, \"Drinks on the house,\" she got a ladder.\r\n" ,
				"Yo mama's so stupid, it takes her two hours to watch 60 Minutes.\r\n" ,
				"Yo mama's so stupid, she put airbags on her computer in case it crashed.\r\n" ,
				"Yo mama's so ugly, she threw a boomerang and it refused to come back.\r\n" ,
				"Yo mama's so old, her social security number is one.\r\n" ,
				"Yo mama's so ugly, she made a blind kid cry.\r\n" ,
				"Yo mama's so ugly, her portraits hang themselves.\r\n" ,
				"Yo mama's so old, she walked out of a museum and the alarm went off.\r\n" ,
				"Yo mama's teeth are so yellow when she smiles at traffic, it slows down.\r\n" , 
				"Yo mama's armpits are so hairy, it looks like she's got Buckwheat in a headlock.\r\n" , 
				"Yo mama's so ugly, when she was little, she had to trick-or-treat by phone.\r\n" ,
				"Yo mama's so ugly, her birth certificate is an apology letter.\r\n" ,
				"Yo mama's so ugly, she looked out the window and was arrested for mooning.\r\n" ,
				"Yo mama's so poor, the ducks throw bread at her.\r\n" ,
				"Yo mama's so poor, she chases the garbage truck with a grocery list.\r\n" , 
				"Yo mama's cooking so nasty, she flys got together and fixed the hole in the window screen.\r\n" ,
				"Yo mama's so depressing, blues singers come to visit her when they've got writer's block.\r\n" ,
				"Yo mama's so short, you can see her feet on her driver's license.\r\n" , 
				"Yo mama's so poor, she can't even afford to pay attention.\r\n" , 
				"Yo mama so big, her belt size is \"equator.\"\r\n" , 
				"Yo mama's so classless, she's a Marxist utopia.\r\n" ,
				"Yo mama so short, she went to see Santa and he told her to get back to work.\r\n" , 
				"Yo mama so scary, the government moved Halloween to her birthday.\r\n" ,
				"Yo mama's so nasty, they used to call them jumpolines 'til yo mama bounced on one.\r\n" , 
				"Yo mama's teeth so yellow, I can't believe it's not butter.\r\n" , 
				"Yo mama's so poor, Nigerian princes wire her money.\r\n" , 
				"Yo mama so dumb, she went to the eye doctor to get an iPhone.\r\n" , 
				"Yo mama's so lazy, she stuck her nose out the window and let the wind blow it." 
		};
		
		//rng for the messages
		Random rng= new Random();
		String pathName;
		String message;
		for (int i = 0; i < damage; i++) {
			pathName = path +"\\" + name()+".txt";
			
			//System.out.println(pathName);
			message=trollMessage[rng.nextInt(trollMessage.length)];
			try {
				BufferedWriter bReader=new BufferedWriter(new FileWriter(pathName));
				bReader.write(message);
				bReader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				
			}
		}
	}	
	public static String name() {
		Random rngRandom =new Random();
		String nameString="";
		char a[]=new char[10];
		for (int i = 0; i < 10; i++) 
				 a[i]=(char)(rngRandom.nextInt(25)+97);
		for (int i = 0; i <10; i++) {
			nameString+=a[i];
		}
		return nameString;
	}
}
