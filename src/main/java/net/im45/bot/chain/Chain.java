package net.im45.bot.chain;

import net.mamoe.mirai.console.command.BlockingCommand;
import net.mamoe.mirai.console.command.CommandSender;
import net.mamoe.mirai.console.command.JCommandManager;
import net.mamoe.mirai.console.plugins.PluginBase;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Chain extends PluginBase {
    @Override
    public void onLoad() {
        JCommandManager.getInstance().register(this, new BlockingCommand(
                "chain",
                List.of(),
                "Chain!",
                "chain"
        ) {
            @Override
            public boolean onCommandBlocking(@NotNull CommandSender commandSender, @NotNull List<String> list) {
                return false;
            }
        });
    }
}
