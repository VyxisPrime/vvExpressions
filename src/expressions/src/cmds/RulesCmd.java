package expressions.src.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import expressions.src.Main;

public class RulesCmd implements CommandExecutor {
	Main main = Main.getInstance();

	public RulesCmd(Main main) {
		this.main = main;
	}

	public boolean onCommand(CommandSender s, Command c, String l, String[] args) {
		if (l.equalsIgnoreCase("rules")) {
			if ((s instanceof Player)) {
				Player p = (Player) s;
				if (args.length == 0) {
					this.main.broadcast(
							ChatColor.translateAlternateColorCodes('&', "&8[&3VV&8] ") + this.main.getCmdMsg("Rules"));
					return true;
				}
				if (args.length < 0) {
					this.main.msg(p, "&cToo many arguments!");
				}
			} else {
				this.main.log(this.main.getPermissions("console"));
				return true;
			}
		}
		return false;
	}
}