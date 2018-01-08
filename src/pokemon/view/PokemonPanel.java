package pokemon.view;
import java.awt.Color;

import javax.swing.JTextField;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private Jlabel healthLabel;
	private Jlabel attackLabel;
	private Jlabel nameLabel;
	private Jlabel numberlabel;
	private Jlabel evolveableLabel;
	private Jlabel iconLabel;
	
	private JCheckBox evovleableBox;
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
		
	}
	
	private void setupnel()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}

}
