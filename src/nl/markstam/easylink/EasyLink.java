package nl.markstam.easylink;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EasyLink extends JavaPlugin{

	@Override
	public void onEnable(){
	getLogger().info("EasyLink Enabled.");
	}
	@Override
	public void onDisable(){
	getLogger().info("EasyLink Disabled");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("link"))
		{
			if(!(sender instanceof Player))
					    {
				         sender.sendMessage("Only players can execute this command!");
				
					    }
			else
			{
		   if(args.length == 0)
		   {
			   sender.sendMessage(ChatColor.RED + "Usage: /link <URL>");
			   
			   
		   }
		   else if(args.length > 1)
	{
	sender.sendMessage(ChatColor.RED + "Usage: /link <URL>");		   
    }
		   
		   else
		       {

			Player player = (Player)sender;
			   
			   player.chat(ChatColor.AQUA + "" + ChatColor.UNDERLINE + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + args[0]);
		       }  
			   
			}
		}
		return true;	
	   }
	 }
	
	
	
	

