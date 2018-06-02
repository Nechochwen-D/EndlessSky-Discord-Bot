package me.mcofficer.james.commands.lookup;


import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import me.mcofficer.james.Lookups;

public class Showdata extends Command {

    final Lookups lookups;

    public Showdata(Lookups lookups) {
        this.name = "showdata";
        this.help = "Outputs the data associated with <query>.";
        this.arguments = "<query>";
        this.lookups = lookups;
    }

    @Override
    protected void execute(CommandEvent event) {
        event.getChannel().sendMessage("```" +
                lookups.getNodeAsText(lookups.getNodeByString(event.getArgs()))
        + "```").queue();
    }
}
