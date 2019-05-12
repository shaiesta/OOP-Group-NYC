package fproject;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends Inventory {
	JFrame window;
	Container con;
	JPanel titlePanel, welcomePanel, startPanel, mainTextPanel, choiceButtonPanel, playerPanel, playerPanel2;
	JLabel titleName, inventoryLabel, inventory, timeLabel, time;
	Font titleFont = new Font("Helvetica", Font.BOLD + Font.ITALIC, 80);
	Font regFont = new Font("Helvetica", Font.PLAIN, 25);
	JButton startButton, choiceA, choiceB, choiceC, choiceD;
	JTextArea welcomeMessage, mainTextArea;
	String position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();

	}
	public GUI() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.cyan);
		window.setLayout(null);
		//custom layout
		con = window.getContentPane();
		
		
		titlePanel = new JPanel();
		titlePanel.setBounds(100, 100, 600, 200);
		titlePanel.setBackground(Color.cyan);
		//main screen text background color
		titleName = new JLabel("OOP's I'm Lost");
		titleName.setForeground(Color.black);
		//main screen text color
		titleName.setFont(titleFont);
		
		welcomePanel = new JPanel();
		welcomePanel.setBounds(150, 200, 600, 100);
		welcomePanel.setBackground(Color.cyan);
		con.add(welcomePanel);
		
		welcomeMessage = new JTextArea();
		welcomeMessage.setBounds(150, 200, 600, 100); 
		welcomeMessage.setBackground(Color.cyan);
		welcomeMessage.setForeground(Color.black);
		welcomeMessage.setFont(regFont);
		welcomeMessage.setLineWrap(true);
		welcomePanel.add(welcomeMessage);
		welcomeMessage.setText("It’s a beautiful morning and the first day of your internship! Congratulations!"
				+ "\nAs an ITI student at Rutgers, you decided to expand your horizons and accept an offer in NYC."
				+ "\nExcited for the day ahead, you look at the clock that now reads 5:00 a.m."
				+ "\nWork starts at 8:00 a.m. so you better get ready and head out soon to reach midtown Manhattan on time!"
				+ "\nAs you get ready, you excitedly think about the day to come."
				+ "\nYou did some research last night on how to get to work and found a few options."
				+ "\nOnce you reach Penn Station at NYC, you can:"
				+ "\nTake the subway - which was a reasonable option,"
				+ "\nGrab a taxi - which seemed like the fastest, yet pricey option,"
				+ "n\Or take a walk and enjoy the city air."
				+ "\nYou glance at the clock once more and notice that it’s nearly 6:00 a.m.!"
				+ "n\No time to grab breakfast… maybe you’ll get something in the city."
				+ "n\It’s time to start your journey!");
		//add text to panel
		
		startPanel = new JPanel();
		startPanel.setBounds(300, 400, 200, 100);
		startPanel.setBackground(Color.cyan);
		startButton = new JButton("Start");
		startButton.setFont(regFont);
		startButton.addActionListener(tsHandler);
		//action for button
		
		
		titlePanel.add(titleName);
		startPanel.add(startButton);
		
		con.add(titlePanel);
		con.add(startPanel);
		window.setVisible(true);
	}
	
	public void gameScreen() {
		
		titlePanel.setVisible(false);
		startPanel.setVisible(false);
		welcomePanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 150, 600, 250);
		mainTextPanel.setBackground(Color.cyan);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100, 150, 600, 250); 
		mainTextArea.setBackground(Color.cyan);
		mainTextArea.setForeground(Color.black);
		mainTextArea.setFont(regFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		//add text to panel
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 400, 300, 150);
		choiceButtonPanel.setBackground(Color.cyan);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		//4 button in one colomn 
		con.add(choiceButtonPanel);
		
		choiceA = new JButton("A");
		choiceA.setFont(regFont);
		choiceA.addActionListener(choiceHandler);
		choiceA.setActionCommand("cA");
		//set difference between buttons
		choiceButtonPanel.add(choiceA);
		
		
		choiceB = new JButton("B");
		choiceB.setFont(regFont);
		choiceB.addActionListener(choiceHandler);
		choiceB.setActionCommand("cB");
		choiceButtonPanel.add(choiceB);

		choiceC = new JButton("C");
		choiceC.setFont(regFont);
		choiceC.addActionListener(choiceHandler);
		choiceC.setActionCommand("cC");
		choiceButtonPanel.add(choiceC);
		
		choiceD = new JButton("D");
		choiceD.setFont(regFont);
		choiceD.addActionListener(choiceHandler);
		choiceD.setActionCommand("cD");
		choiceButtonPanel.add(choiceD);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.cyan);
		playerPanel.setLayout(new GridLayout (1,4));
		con.add(playerPanel);
		
		playerPanel2 = new JPanel();
		playerPanel2.setBounds(100, 75, 600, 50);
		playerPanel2.setBackground(Color.cyan);
		playerPanel2.setLayout(new GridLayout (1,4));
		con.add(playerPanel2);
		
		inventoryLabel = new JLabel("Inventory: ");
		inventoryLabel.setFont(regFont);
		inventoryLabel.setForeground(Color.black);
		playerPanel.add(inventoryLabel);
		inventory = new JLabel();
		inventory.setFont(regFont);
		inventory.setForeground(Color.black);
		playerPanel.add(inventory);
		
		
		playerSetup();
		bedroom();
	}
	
	public void playerSetup() {
		Inventory myObj = new Inventory();
		inventory.setText(myObj.print().toString());
		
	}
	//inventory method 
	//see if we can put welcome message then continue then ask what you wass get from bedroom 
	//put methods in different class?
	public void bedroom() {
		position = "bedroom";
		super.item.clear();
		inventory.setText(item.toString());
		playerPanel.setVisible(false);
		playerPanel2.setVisible(false);
		BedroomText myObj = new BedroomText();
		mainTextArea.setText(myObj.getText());	
		choiceA.setText("Money and Watch");
		choiceB.setText("Food and Money");
		choiceC.setText("Charger and Laptop");
		choiceD.setText("Jacket and Bookbag");
		
	}
	
	public void goodChoice() {
		position = "goodChoice";
		playerPanel.setVisible(true);
		playerPanel2.setVisible(true);
		BedroomText myObj = new BedroomText();
		mainTextArea.setText(myObj.getText2());
		choiceA.setText("Continue");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		super.money = 30;
		super.item.add("$" + money);
		super.item.add("Watch");
		inventory.setText(item.toString());
		
		timeLabel = new JLabel("Time: ");
		timeLabel.setFont(regFont);
		timeLabel.setForeground(Color.black);
		playerPanel2.add(timeLabel);
		time = new JLabel("5:30am");
		time.setFont(regFont);
		time.setForeground(Color.black);
		playerPanel2.add(time);
	}
	
	public void badChoice() {
		position = "badChoice";
		BedroomText myObj = new BedroomText();
		mainTextArea.setText(myObj.getText3());
		choiceA.setText("Try Again");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
	}
	public void nbStation() {
		position = "station";
		time.setText("5:45am");
		TrainText myObj = new TrainText();
		mainTextArea.setText(myObj.getText());
		choiceA.setText("Train");
		choiceB.setText("Bus");
		choiceC.setText("");
		choiceD.setText("");		
	}
	
	public void train() {
		position = "train";
		time.setText("7:00am");
		TrainText myObj = new TrainText();
		mainTextArea.setText(myObj.getText2());
		choiceA.setText("Continue");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 14;
		super.item.set(0, "$" + money);
		inventory.setText(item.toString());
		
	}
	
	public void bus() {
		position = "bus";
		time.setText("7:00am");
		TrainText myObj = new TrainText();
		mainTextArea.setText(myObj.getText3());
		choiceA.setText("continue");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 11.5;
		super.item.set(0, "$" + money);
		inventory.setText(item.toString());
	}
	
	public void city() {
		position = "city";
		time.setText("7:00am");
		CityText myObj = new CityText();
		mainTextArea.setText(myObj.getText());
		choiceA.setText("Take a Taxi");
		choiceB.setText("Take the Subway");
		choiceC.setText("Walk");
		choiceD.setText("");
	}
	public void taxi() {
		position = "taxi";
		time.setText("7:45am");
		CityText myObj = new CityText();
		mainTextArea.setText(myObj.getText2());
		choiceA.setText("Start Over");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		//game over for picking taxi
		//start over 
		//close game
	}
	public void subway() {
		position = "subway";
		time.setText("7:15am");
		CityText myObj = new CityText();
		mainTextArea.setText(myObj.getText3());
		choiceA.setText("Get Food");
		choiceB.setText("Walk the Park");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 2.75;
		super.item.set(0, "$" + money);
		inventory.setText(item.toString());
	}
	public void walk() {
		position = "walk";
		time.setText("7:20am");
		CityText myObj = new CityText();
		mainTextArea.setText(myObj.getText4());
		choiceA.setText("Get Food");
		choiceB.setText("Walk the Park");
		choiceC.setText("");
		choiceD.setText("");
		
	}
	public void food() {
		position = "food";
		ParkText myObj = new ParkText();
		mainTextArea.setText(myObj.getText());
		choiceA.setText("Donut");
		choiceB.setText("Coffee");
		choiceC.setText("");
		choiceD.setText("");
	}
	public void park() {
		position = "park";
		time.setText("7:50am");
		ParkText myObj = new ParkText();
		mainTextArea.setText(myObj.getText2());
		choiceA.setText("Start Over");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
	}
	public void donut() {
		position = "donut";
		time.setText("7:35am");
		ParkText myObj = new ParkText();
		mainTextArea.setText(myObj.getText3());
		choiceA.setText("Walk");
		choiceB.setText("Taxi");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 3;
		super.item.set(0, "$" + money);
		super.item.add("Donut");
		inventory.setText(item.toString());
	}
	public void coffee() {
		position = "coffee";
		time.setText("7:00am");
		ParkText myObj = new ParkText();
		mainTextArea.setText(myObj.getText4());
		choiceA.setText("Walk");
		choiceB.setText("Taxi");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 8;
		super.item.set(0, "$" + money);
		super.item.add("Coffee");
		inventory.setText(item.toString());
	}
	public void donutWalk() {
		position = "donutWalk";
		time.setText("8:10am");
		WorkText myObj = new WorkText();
		mainTextArea.setText(myObj.getText());
		choiceA.setText("Start Over");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		
	}
	public void donutTaxi() {
		position = "donutTaxi";
		time.setText("8:00am");
		WorkText myObj = new WorkText();
		mainTextArea.setText(myObj.getText2());
		choiceA.setText("");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 10;
		super.item.set(0, "$" + money);
		inventory.setText(item.toString());
	}
	public void coffeeWalk() {
		position = "coffeeWalk";
		time.setText("7:30am");
		WorkText myObj = new WorkText();
		mainTextArea.setText(myObj.getText3());
		choiceA.setText("");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		
	}
	public void coffeeTaxi() {
		position = "coffeeTaxi";
		WorkText myObj = new WorkText();
		mainTextArea.setText(myObj.getText4());
		choiceA.setText("Start Over");
		choiceB.setText("");
		choiceC.setText("");
		choiceD.setText("");
		money = money - 10;
		super.item.set(0, "$" + money);
		inventory.setText(item.toString());
		
	}
	
	
	
	
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			gameScreen();		
			
		}
	}
	
	public class ChoiceHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			//correlates to button pressed cA...
			switch (position) {
			case "bedroom":
				switch(yourChoice) {
				case "cA": 
					goodChoice();
					break;
				case "cB": 
					badChoice();
					break;
				case "cC": 
					badChoice();
					break;
				case "cD": 
					badChoice();
					break;
				}
				break;
			case "badChoice":
				switch(yourChoice) {
				case "cA": 
					bedroom();
					break;
					//back to bedroom since wrong choice 
				}
				break;
			case "goodChoice":
				switch(yourChoice) {
				case "cA": 
					nbStation();
					break;
					//new brunswick station
				}
				break;
			case "station":
				switch(yourChoice) {
				case "cA": 
					train();
					break;
				case "cB" : 
					bus();
					break;
				}
				break;
			case "train":
			case "bus":
				switch(yourChoice) {
				case "cA": 
					city();
					break;
				}
				break;
			case "city" :
				switch(yourChoice) {
				case "cA": 
					taxi();
					break;
				case "cB": 
					subway();
					break;
				case "cC": 
					walk();
					break;
				}
				break;
			case "taxi" :
				switch(yourChoice) {
				case "cA":
					new GUI();
					//lose
					break;
				}
				break;
			case "subway" :
			case "walk" :
				switch(yourChoice) {
				case "cA" : 
					food();
					break;
				case "cB" : 
					park();
					break;
				}
				break;
			case "park" :
				switch(yourChoice) {
				case "cA": 
					new GUI();
					//lose
					break;
				}
				break;
			case "food" :
				switch(yourChoice) {
				case "cA": 
					donut();
					break;
				case "cB": 
					coffee();
					break;
				}
				break;
			case "donut" :
				switch(yourChoice) {
				case "cA": 
					donutWalk();
					break;
				case "cB": 
					donutTaxi();
					break;
				}
				break;
			case "donutWalk":
				switch(yourChoice) {
				case "cA": 
					new GUI();
					//lose
					break;
				}
				break;
			case "coffee":
				switch(yourChoice) {
				case "cA": 
					coffeeWalk();
					break;
				case "cB": 
					coffeeTaxi();
					break;
				}
				break;
			case "coffeeTaxi":
				switch(yourChoice) {
				case "cA" : 
					new GUI();
					//lose
					break;
				}
				break;
			}
			
		}
	}

}
