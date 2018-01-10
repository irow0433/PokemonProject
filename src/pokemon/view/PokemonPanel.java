package pokemon.view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemon.controller.PokemonController;
//import pokemon.model.Blastoise;


	public PokedexPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel();
		
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		pokedexDropdown = new JComboBox();
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		
		descriptionArea = new JTextArea(5, 10);
		typeArea = new JTextArea(4, 15);
		
		setupComboBox();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	})
	
	public class PokemonPanel extends JPanel
	{
		private PokemonController appController;
		private SpringLayout appLayout;
		
		private JLabel healthLabel;
		private JLabel attackLabel;
		private JLabel nameLabel;
		private JLabel numberLabel;
		private JLabel evolvableLabel;
		private JLabel modifierLabel;
		private JLabel iconLabel;
		
		private JCheckBox evolvableBox;
		private JTextField nameField;
		private JTextField numberField;
		private JTextField attackField;
		private JTextField healthField;
		private JTextField modifierField;
		
		private JTextArea descriptionArea;
		private JTextArea typeArea;
		
		private JButton saveButton;
		private JButton clearButton;
		private JComboBox pokedexDropdown;
		
		private JPanel firstType;
		private JPanel secondType;
		private JPanel thirdType;
		private JPanel fourthType;
		
	
	
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
	}
	private void setupScrollPane()
	{
		this.setLayout(appLayout);
		
		this.setBackground(Color.CYAN);
		this.add(iconLabel);
		this.add(attackLabel);
		this.add(attackField);
		this.add(healthLabel);
		this.add(healthField);
		this.add(modifierField);
		this.add(modifierLabel);
		this.add(nameLabel);
		this.add(nameField);
		this.add(numberLabel);
		this.add(numberField);
		this.add(evolvableLabel);
		this.add(evolvableBox);
		this.add(pokedexDropDown);
		this.add(clearButton);
		this.add(saveButton);
		
		this.add(descriptionArea);
		this.add(typeArea);
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexDropDown.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent Selection)
			{
				int selectedPokemonIndex = pokedexDropDown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage(); 
				updateTypePanels();
				repaint();
			}
				
	
	
	private void setupLayout()
	{
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		
	}
	
	private void updateImage()
	{
		
	}
	
	private void updateTypepanels()
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex().getPokemonTypes();
		
		//change this to match  your 3 minimum types in your pokede
		if(types[0].equals("water"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		else if(types[0].equals("Flying"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else if(types[0].equals("Ground"))
		{
			firstType.setBackground(Color.BLACK);
		}
		else 
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if(types[1].equals("water"))
		{
			secondType.setBackground(Color.YELLOW);
		}
		else if(types[1].equals("Flying"))
		{
			secondType.setBackground(Color.GRAY);
		}
		else if(types[1].equals("Ground"))
		{
			secondType.setBackground(Color.BLACK);
		}
		else 
		{
			secondType.setBackground(Color.WHITE);
		}
	}
				
	
				
	
