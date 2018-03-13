package expressions.src.cmds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import expressions.src.Main;

public class YolobattCmd implements CommandExecutor {
	private Main main = Main.getInstance();

	public YolobattCmd(Main main) {
		this.main = main;
	}

	public boolean onCommand(CommandSender s, Command c, String l, String[] args) {
		Player p = (Player) s;
		if ((l.equalsIgnoreCase("yolobatt")) && (p.hasPermission("expressions.general.admin"))) {
			if (args.length == 0) {
				this.main.broadcast(p.getDisplayName() + this.main.getCmdMsg("Welcome.single"));
				return true;
			}
			if (args.length == 1) {
				Player tp = Bukkit.getServer().getPlayer(args[0].toString());
				if (tp == null) {
					this.main.msg(p, this.main.color(this.main.getPermissions("playernotfound")));
					return true;
				}
				if (tp.getName() == p.getName()) {
					this.main.broadcast(
							p.getDisplayName() + color("&6 struck him self out of the server with the yolobatt!"));
					p.kickPlayer(
							color("&cGoodbye ") + p.getDisplayName() + color("&c see you in a bit! \n &r - Flakes"));
				} else {
					this.main.broadcast(
							tp.getDisplayName() + color(new StringBuilder(" &6was hit with the yolobatt by&r ")
									.append(p.getDisplayName()).toString()));
					tp.kickPlayer(
							color("&cYou have been struck by ") + p.getDisplayName() + color("  &cwith the yolobat"));
					return true;
				}
			}
		}
		return false;
	}

	public String color(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
}