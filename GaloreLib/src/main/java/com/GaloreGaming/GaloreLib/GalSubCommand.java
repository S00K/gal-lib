package com.GaloreGaming.GaloreLib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Parent class for all SubCommands to a GalCommand type.
 * 
 * @author MuffinScript
 *
 */
public abstract class GalSubCommand {
	
	/**
	 * Returns the name of the specified SubCommand
	 * 
	 * @return SubCommand name
	 */
	public abstract String getName();
	
	/**
	 * Returns the permissions of the specified SubCommand in String form
	 * 
	 * @return SubCommand Permissions
	 */
	public abstract String getPerm();
	
	/**
	 * Returns the message to be displayed if the user does not have permission for the SubCommand
	 * 
	 * @return No permission message
	 */
	public abstract String permMsg();
	
	/**
	 * Returns the minimum amount of arguments needed to run this SubCommand
	 * 
	 * @return Minimum arguments number
	 */
	public abstract int getMinArgs();
	
	/**
	 * Returns the message to be displayed if not enough arguments are included.
	 * 
	 * @return Not enough arguments message
	 */
	public abstract String minArgsMsg();
	
	/**
	 * Returns if the SubCommand can only be executed by a player
	 * 
	 * @return Is SubCommand player specific
	 */
	public abstract boolean isPlayerSpecific();
	
	/**
	 * Main executer for the SubCommand
	 * 
	 * @param sender  The CommandSender of the parent command
	 * @param label   The label of the parent command
	 * @param args    The arguments of the parent command
	 */
	public abstract void run(CommandSender sender, String label, String[] args);
	
	/**
	 * Executes checks before firing the run function
	 * 
	 * @param sender
	 * @param cmd
	 * @param label
	 * @param args
	 */
	public void onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		
		if (isPlayerSpecific() && !(sender instanceof Player))
		{
			
			// Send Player only cmd msg
			return;
			
		}
		
		if (getPerm() != null && !sender.hasPermission(getPerm()))
		{
			
			// send no perm msg
			return;
			
		}
		
		if (args.length - 1 < getMinArgs())
		{
			
			// send min args msg
			return;
			
		}
		
		run(sender, label, args);
		
	}
	
}
