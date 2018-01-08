package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.Crobat;
import pokemon.model.Dartrix;
import pokemon.model.MagiKarp;
import pokemon.model.Rowlet;
import pokemon.model.Squirtle;
import pokemon.model.Totodile;

public class PokemonController 
{
	
	//public void start() {
		
	//}
	
	private List<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
		pokedex.add(new Crobat());
		pokedex.add(new Dartrix());
		pokedex.add(new MagiKarp());
		pokedex.add(new Rowlet());
		pokedex.add(new Squirtle());
		pokedex.add(new Totodile());
		
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			valid = false;
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			valid = false;
		}
		
		return valid;
	}
	}
