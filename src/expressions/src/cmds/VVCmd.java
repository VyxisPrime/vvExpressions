package expressions.src.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import expressions.src.Main;

public class VVCmd implements CommandExecutor {
	Main main = Main.getInstance();

	public VVCmd(Main main) {
		this.main = main;
	}

	public boolean onCommand(CommandSender s, Command c, String l, String[] args) {
		if (l.equalsIgnoreCase("vv")) {
			if ((s instanceof Player)) {
				Player p = (Player) s;
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("created")) {
						this.main.msg(p, this.main.getCmdMsg("Created"));
						return true;
					}
					if (args[0].equalsIgnoreCase("reload")) {
						this.main.msg(p, color("&c Reloading config!"));
						this.main.reloadConfig();
						this.main.msg(p, color("&a Config reloaded!"));
					}
				} else {
					if (p.hasPermission("expressions.express.low")) {
						p.sendMessage(ChatColor.GREEN + "VV Expressions Pack" + ChatColor.GOLD + "+" + ChatColor.RED +

								"-------------------------------------------" + ChatColor.GOLD + "+");
						p.sendMessage(ChatColor.RED + "/join - Tell ps how to join expressionscraft");
						p.sendMessage(ChatColor.RED + "/rankup - Tell ps how to rank up in Creative");
						p.sendMessage(ChatColor.GREEN + "Low" + ChatColor.GOLD + "+");
						p.sendMessage(ChatColor.RED + "/hug <name> - Lets you hug someone out of pure love");
						p.sendMessage(ChatColor.RED + "/love - Show someone some love");
						p.sendMessage(ChatColor.RED + "/kiss <name> - Lets you kiss someone out of pure love");
						p.sendMessage(ChatColor.RED + "/welcome <name> - Lets you welcome someone new to the server");
						p.sendMessage(ChatColor.RED + "/cuddle <name> - Lets you cuddle with someone");
						p.sendMessage(ChatColor.RED + "/congrat <name> - Lets you congratulate someone");
						p.sendMessage(ChatColor.RED + "/clap <name> - Lets you clap for someone");
						p.sendMessage(ChatColor.RED + "/dance <name> - Lets you dance with someone");
						p.sendMessage(ChatColor.RED + "/wave <name> - Lets you wave at someone");
						p.sendMessage(ChatColor.RED + "/blush - Lets you blush");
					}
					if (p.hasPermission("expressions.express.mid")) {
						p.sendMessage(ChatColor.GREEN + "Mid" + ChatColor.GOLD + "+" + ChatColor.RED
								+ "-------------------------------------------" + ChatColor.GOLD + "+");
						p.sendMessage(ChatColor.RED + "/flip <name> - Lets you hug flip someone");
						p.sendMessage(ChatColor.RED + "/highfive <name> - highfives with someone");
						p.sendMessage(ChatColor.RED + "/stahp <name> - makes you stahp someone");
						p.sendMessage(ChatColor.RED + "/cry <name> - makes you cry because of someone");
						p.sendMessage(ChatColor.RED + "/annoy <name> - makes you annoy someone");
						p.sendMessage(ChatColor.RED + "/beg <name> - makes you beg of someone");
					}
					if (p.hasPermission("expressions.express.high")) {
						p.sendMessage(ChatColor.GREEN + "High" + ChatColor.GOLD + "+" + ChatColor.RED +

								"-------------------------------------------" + ChatColor.GOLD + "+");
						p.sendMessage(ChatColor.RED + "/snap <name> - makes you snap at someone");
						p.sendMessage(ChatColor.RED + "/murder <name> - Lets you murder someone");
						p.sendMessage(ChatColor.RED + "/slap <name> - makes you slap someone");
						p.sendMessage(ChatColor.RED + "/punch <name> - Lets you punch someone");
						p.sendMessage(ChatColor.RED + "/flick <name> - Lets you flick someone");
						p.sendMessage(ChatColor.RED + "/arrow <name> - Lets you shoot someone");
						p.sendMessage(ChatColor.RED + "/risen <name> - Lets you raise someone from the dead");
						p.sendMessage(ChatColor.RED + "/revive <name> - Lets you revive someone");
						p.sendMessage(ChatColor.RED + "/heal <name> - Lets you heal someone");
						p.sendMessage(ChatColor.RED + "/cast <name> - Lets you cast a spell at someone");
						p.sendMessage(ChatColor.RED + "/poke <name> - Lets you pokesomeone");
					}
					if ((p.hasPermission("expressions.general.join")) && (p.hasPermission("expressions.general.rankup"))
							&& (p.hasPermission("expressions.general.rules"))) {
						p.sendMessage(ChatColor.GREEN + "Gnrl" + ChatColor.GOLD + "+" + ChatColor.RED
								+ "-------------------------------------------" + ChatColor.GOLD + "+");
						p.sendMessage(ChatColor.RED + "/join - Tell someone how to join expressions!");
						p.sendMessage(ChatColor.RED + "/rankup - Tell someone how rankup!");
						p.sendMessage(ChatColor.RED + "/rules - Tell someone where the rules are!");
						p.sendMessage(
								ChatColor.GOLD + "+" + ChatColor.RED + "-------------------------------------------"
										+ ChatColor.GREEN + "expressionsEXP" + ChatColor.GOLD + "+");
					}
				}
			}
		} else {
			this.main.log(this.main.getPermissions("console"));
			return true;
		}
		return false;
	}

	public String color(String color) {
		ChatColor.translateAlternateColorCodes('&', color);
		return color;
	}
}
