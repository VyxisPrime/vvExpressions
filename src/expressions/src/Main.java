package expressions.src;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import expressions.src.cmds.AnnoyCmd;
import expressions.src.cmds.ApologizeCmd;
import expressions.src.cmds.ArrowCmd;
import expressions.src.cmds.BegCmd;
import expressions.src.cmds.BlushCmd;
import expressions.src.cmds.CastCmd;
import expressions.src.cmds.ClapCmd;
import expressions.src.cmds.CryCmd;
import expressions.src.cmds.CuddleCmd;
import expressions.src.cmds.DanceCmd;
import expressions.src.cmds.EyePokeCmd;
import expressions.src.cmds.FistbumpCmd;
import expressions.src.cmds.FlickCmd;
import expressions.src.cmds.FlipCmd;
import expressions.src.cmds.HeadbangCmd;
import expressions.src.cmds.HealCmd;
import expressions.src.cmds.HighFiveCmd;
import expressions.src.cmds.HugCmd;
import expressions.src.cmds.JoinCmd;
import expressions.src.cmds.KissCmd;
import expressions.src.cmds.LoveCmd;
import expressions.src.cmds.MurderCmd;
import expressions.src.cmds.PokeCmd;
import expressions.src.cmds.PunchCmd;
import expressions.src.cmds.RankupCmd;
import expressions.src.cmds.ReviveCmd;
import expressions.src.cmds.RisenCmd;
import expressions.src.cmds.RulesCmd;
import expressions.src.cmds.SlapCmd;
import expressions.src.cmds.SnapCmd;
import expressions.src.cmds.StahpCmd;
import expressions.src.cmds.TackleCmd;
import expressions.src.cmds.TeabagCmd;
import expressions.src.cmds.VVCmd;
import expressions.src.cmds.WaveCmd;
import expressions.src.cmds.WelcomeCmd;
import expressions.src.cmds.YolobattCmd;

public class Main extends JavaPlugin {

	static Main main;
	static String prefix = "&8[&vvExpressions&8]&r";

	public static Main getInstance() {
		return main;
	}

	public void onEnable() {
		log("Checking/Creating config");
		addDefaultConfig();
		log("Getting Commands");
		getCommand("annoy").setExecutor(new AnnoyCmd(this));
		getCommand("apologize").setExecutor(new ApologizeCmd(this));
		getCommand("arrow").setExecutor(new ArrowCmd(this));
		getCommand("beg").setExecutor(new BegCmd(this));
		getCommand("blush").setExecutor(new BlushCmd(this));
		getCommand("cast").setExecutor(new CastCmd(this));
		getCommand("clap").setExecutor(new ClapCmd(this));
		// getCommand("congrats").setExecutor(new CongratCmd(this));
		getCommand("cry").setExecutor(new CryCmd(this));
		getCommand("cuddle").setExecutor(new CuddleCmd(this));
		getCommand("dance").setExecutor(new DanceCmd(this));
		getCommand("eyepoke").setExecutor(new EyePokeCmd(this));
		getCommand("fistbump").setExecutor(new FistbumpCmd(this));
		getCommand("flick").setExecutor(new FlickCmd(this));
		getCommand("flip").setExecutor(new FlipCmd(this));
		getCommand("headbang").setExecutor(new HeadbangCmd(this));
		getCommand("heal").setExecutor(new HealCmd(this));
		getCommand("highfive").setExecutor(new HighFiveCmd(this));
		getCommand("hug").setExecutor(new HugCmd(this));
		getCommand("join").setExecutor(new JoinCmd(this));
		getCommand("kiss").setExecutor(new KissCmd(this));
		getCommand("love").setExecutor(new LoveCmd(this));
		getCommand("murder").setExecutor(new MurderCmd(this));
		getCommand("poke").setExecutor(new PokeCmd(this));
		getCommand("punch").setExecutor(new PunchCmd(this));
		getCommand("rankup").setExecutor(new RankupCmd(this));
		getCommand("revive").setExecutor(new ReviveCmd(this));
		getCommand("risen").setExecutor(new RisenCmd(this));
		getCommand("rules").setExecutor(new RulesCmd(this));
		getCommand("slap").setExecutor(new SlapCmd(this));
		getCommand("snap").setExecutor(new SnapCmd(this));
		getCommand("stahp").setExecutor(new StahpCmd(this));
		getCommand("tackle").setExecutor(new TackleCmd(this));
		getCommand("teabag").setExecutor(new TeabagCmd(this));
		getCommand("vv").setExecutor(new VVCmd(this));
		getCommand("wave").setExecutor(new WaveCmd(this));
		getCommand("welcome").setExecutor(new WelcomeCmd(this));
		getCommand("yolobatt").setExecutor(new YolobattCmd(this));
	}

	public void addDefaultConfig() {
		log("adding command messages!");
		getConfig().addDefault("Messages.Commands.Hug.single", "&d wants a hug!");
		getConfig().addDefault("Messages.Commands.Hug.targeted", "&d hugs &r");
		getConfig().addDefault("Messages.Commands.Love.single", "&c wants some love!");
		getConfig().addDefault("Messages.Commands.Love.targeted", "&c love &r");
		getConfig().addDefault("Messages.Commands.Kiss.single", "&c wants a kiss!");
		getConfig().addDefault("Messages.Commands.Kiss.targeted", "&c kisses &r");
		getConfig().addDefault("Messages.Commands.Welcome.single", "&3 says welcome ");
		getConfig().addDefault("Messages.Commands.Welcome.targeted.first_half", "&3 welcomes &r");
		getConfig().addDefault("Messages.Commands.Welcome.targeted.second_half", " &3 to the server");
		getConfig().addDefault("Messages.Commands.Cuddle.single", "&d wants to cuddle!");
		getConfig().addDefault("Messages.Commands.Cuddle.targeted", "&d cuddles &r");
		getConfig().addDefault("Messages.Commands.Congratulate.single", "&3 congratulates!");
		getConfig().addDefault("Messages.Commands.Congratulate.targeted", "&3 congratualtes &r");
		getConfig().addDefault("Messages.Commands.Apologize.single", "&e apologisez for his behaviour.");
		getConfig().addDefault("Messages.Commands.Apologize.target", "&e apologizes to &r");
		getConfig().addDefault("Messages.Commands.Clap.single", "&a claps");
		getConfig().addDefault("Messages.Commands.Clap.targeted", "&a claps at &r");
		getConfig().addDefault("Messages.Commands.Dance.single", "&9 dances to the beat!");
		getConfig().addDefault("Messages.Commands.Dance.targeted", "&9 dances with &r");
		getConfig().addDefault("Messages.Commands.Wave.single", "&b waves!");
		getConfig().addDefault("Messages.Commands.Wave.targeted", "&b waves at &r");
		getConfig().addDefault("Messages.Commands.Blush.single", "&b blushes!");
		getConfig().addDefault("Messages.Commands.Blush.targeted", "&b blushes at &r");
		getConfig().addDefault("Messages.Commands.Flip.single", "&9 flips!");
		getConfig().addDefault("Messages.Commands.Flip.targeted", "&9 flips at &r");
		getConfig().addDefault("Messages.Commands.Highfive.single", "&9 wants a highfive!");
		getConfig().addDefault("Messages.Commands.Highfive.targeted", "&9 highfives with &r");
		getConfig().addDefault("Messages.Commands.Stahp.single", "&r wants everyone to &cSTAHP!");
		getConfig().addDefault("Messages.Commands.Stahp.targeted.first_half", "&r wants ");
		getConfig().addDefault("Messages.Commands.Stahp.targeted.second_half", "&r to &cSTAHP ");
		getConfig().addDefault("Messages.Commands.Cry.single", "&9 starts to cry!");
		getConfig().addDefault("Messages.Commands.Cry.targeted", "&9 cries at &r");
		getConfig().addDefault("Messages.Commands.Annoy.single", "&c is starting to annoy!");
		getConfig().addDefault("Messages.Commands.Annoy.targeted", "&c is annoyed by &r");
		getConfig().addDefault("Messages.Commands.Beg.single", "&b begs!");
		getConfig().addDefault("Messages.Commands.Beg.targeted", "&b begs at &r");
		getConfig().addDefault("Messages.Commands.Snap.single", "&9 snaps!");
		getConfig().addDefault("Messages.Commands.Snap.targeted", "&9 snaps at &r");
		getConfig().addDefault("Messages.Commands.Murder.single", "&c feels an urge to murder!");
		getConfig().addDefault("Messages.Commands.Murder.targeted", "&c murders &r");
		getConfig().addDefault("Messages.Commands.Slap.single", "&9 has an urg to slap someone!");
		getConfig().addDefault("Messages.Commands.Slap.targeted", "&9 slaps &r");
		getConfig().addDefault("Messages.Commands.Punch.single", "&c wants to punch someone in the face!");
		getConfig().addDefault("Messages.Commands.Punch.targeted", "&c punches &r");
		getConfig().addDefault("Messages.Commands.Flick.single", "&9 flicks!");
		getConfig().addDefault("Messages.Commands.Flick.targeted", "&9 flicks at &r");
		getConfig().addDefault("Messages.Commands.Arrow.single", "&4 mentions an arrow to the knee");
		getConfig().addDefault("Messages.Commands.Arrow.targeted", "&4 shoots an arrow in the knee of &r");
		getConfig().addDefault("Messages.Commands.Risen.single", "&9 starts rises people from the dead!");
		getConfig().addDefault("Messages.Commands.Risen.targeted.first_half", "&9 rises &r");
		getConfig().addDefault("Messages.Commands.Risen.targeted.second_half", "&9 from the dead &r");
		getConfig().addDefault("Messages.Commands.Revive.single", "&1 casts revive");
		getConfig().addDefault("Messages.Commands.Revive.targeted", "&1 revives ");
		getConfig().addDefault("Messages.Commands.Heal.single", "&3 starts to cast a heal spell!");
		getConfig().addDefault("Messages.Commands.Heal.targeted", "&3 heals &r");
		getConfig().addDefault("Messages.Commands.Cast.single", "&6 starts to cast a spell!");
		getConfig().addDefault("Messages.Commands.Cast.targeted", "&6 casts a spell on &r");
		getConfig().addDefault("Messages.Commands.Poke.single", "&3 wants to poke someone!");
		getConfig().addDefault("Messages.Commands.Poke.targeted", "&3 pokes &r");
		getConfig().addDefault("Messages.Commands.Teabag.single", "&5 scratches the bag of tea!");
		getConfig().addDefault("Messages.Commands.Teabag.targeted", "&5 teabags &r");
		getConfig().addDefault("Messages.Commands.Tackle.single", "&e in the mood to tackle some people!");
		getConfig().addDefault("Messages.Commands.Tackle.targeted.first_half", "&e tackles");
		getConfig().addDefault("Messages.Commands.Tackle.targeted.second_half", "&e with love");
		getConfig().addDefault("Messages.Commands.Eyepoke.single", "&6 wants to poke someones eyes out!");
		getConfig().addDefault("Messages.Commands.Eyepoke.targeted.first_half", "&6 pokes &r");
		getConfig().addDefault("Messages.Commands.Eyepoke.targeted.second_half", "&6 in the eye!");
		getConfig().addDefault("Messages.Commands.Headbang.single", "&3 starts to headbang!");
		getConfig().addDefault("Messages.Commands.Headbang.targeted", "&3 headbangs with &r");
		getConfig().addDefault("Messages.Commands.Fistbump.single", "&c raises his fist!");
		getConfig().addDefault("Messages.Commands.Fistbump.targeted", "&c fistbumps with &r");
		getConfig().addDefault("Messages.Commands.Join",
				"To become a member create a &cbuild&r and let it be &breviewed&r by one of the &cStaff Members&r.");
		getConfig().addDefault("Messages.Commands.Rankup",
				"To &6rank&r up, have your completed build &breviewed&r by &cStaff&r.");
		getConfig().addDefault("Messages.Commands.Rules",
				"Our rules are stated at the &brulesboa&r via the &aRules Portal&r at &cSpawn&r.");
		getConfig().addDefault("Messages.Commands.Created",
				"&6vvExpressions was created by: &6Flakes&r, Also known as &bMichaJDev&r.");
		log("adding permission messages!");
		getConfig().addDefault("Messages.Permissions.self_command",
				prefix + "&c You can not use expressions on yourself use /<expression>");
		getConfig().addDefault("Messages.Permissions.nopermission",
				prefix + "&c You do not have permissions to use this command!");
		getConfig().addDefault("Messages.Permissions.console", "Console can not cast this command");
		getConfig().addDefault("Messages.Permissions.playernotfound",
				prefix + "&c Player not found, probably offline!");
		getConfig().options().copyDefaults(true);
		log("saving config!");
		saveConfig();
	}

	public void getCommands() {

	}

	public void log(String msg) {
		getLogger().info(msg);
	}

	public String color(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}

	public String getMessage(String type) {
		String message = "";
		message = getConfig().getString("Messages." + type);
		message = ChatColor.translateAlternateColorCodes('&', message);
		return message;
	}

	public String getPermissions(String type) {
		String message = "";
		message = getConfig().getString("Messages.Permissions." + type);
		message = ChatColor.translateAlternateColorCodes('&', message);
		return message;
	}

	public String getCmdMsg(String type) {
		String message = "";
		message = getConfig().getString("Messages.Commands." + type);
		message = ChatColor.translateAlternateColorCodes('&', message);
		return message;
	}

	public String getPermission(String type) {
		String perm = "";
		perm = "LumiaExpressions." + type;
		return perm;
	}

	public void msg(Player p, String msg) {
		p.sendMessage(msg);
	}

	public void broadcast(String msg) {
		Bukkit.broadcastMessage(msg);
	}
}
