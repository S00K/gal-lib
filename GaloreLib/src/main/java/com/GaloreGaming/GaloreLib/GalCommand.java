package com.GaloreGaming.GaloreLib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class GalCommand extends Command implements CommandExecutor {
	
	protected GalCommand(String name)
	{
		super(name);
	}
	
	public abstract String getName();
	
	public abstract String getPerm();
	
	public abstract String permMsg();
	
	public abstract int getMinArgs();
	
	public abstract String minArgsMsg();
	
	public abstract boolean isPlayerSpecific();
	
	public abstract GalSubCommand[] getSubCommands();
	
	public abstract void run(CommandSender sender, String label, String[] args);
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		
		if (isPlayerSpecific() && !(sender instanceof Player))
		{
			
			// Send Player only cmd msg
			return false;
			
		}
		
		if (args.length < getMinArgs())
		{
			
			// Send min args msg
			return false;
			
		}
		
		if (args.length != 0 && getSubCommands().length != 0)
		{
			for (GalSubCommand subCommand : getSubCommands())
			{
				if (args[0].equalsIgnoreCase(subCommand.getName()))
				{
					
					subCommand.onCommand(sender, cmd, label, args);
					return true;
					
				}
			}
		}
		
		run(sender, label, args);
		
		return true;
		
	}
	
	@Override
	public boolean execute(CommandSender sender, String label, String[] args)
	{
		
		onCommand(sender, this, label, args);
		return true;
	}
	
}
