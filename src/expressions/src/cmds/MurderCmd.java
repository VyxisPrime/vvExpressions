package expressions.src.cmds;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import expressions.src.Main;

public class MurderCmd implements CommandExecutor {
	Main main = Main.getInstance();

	public MurderCmd(Main main) {
		this.main = main;
	}

	public boolean onCommand(CommandSender s, Command c, String l, String[] args) {
		if (l.equalsIgnoreCase("murder")) {
			if ((s instanceof Player)) {
				Player p = (Player) s;
				if (args.length == 0) {
					this.main.broadcast(p.getDisplayName() + this.main.getCmdMsg("Murder.single"));
					return true;
				}
				if (args.length == 1) {
					Player tp = Bukkit.getServer().getPlayer(args[0].toString());
					if (tp == null) {
						this.main.msg(p, this.main.color(this.main.getPermissions("playernotfound")));
						return true;
					}
					this.main.broadcast(
							p.getDisplayName() + this.main.getCmdMsg("Murder.targeted") + tp.getDisplayName());
					return true;
				}
			} else {
				this.main.log(this.main.getPermissions("console"));
				return true;
			}
		}
		return false;
	}
}
