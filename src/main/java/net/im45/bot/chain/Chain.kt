package net.im45.bot.chain

import com.google.auto.service.AutoService
import net.mamoe.mirai.console.plugin.jvm.JvmPlugin
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin

@AutoService(JvmPlugin::class)
object Chain : KotlinPlugin(
    JvmPluginDescription(
        "net.im45.bot.chain",
        "0.1.0"
    )
) {
    override fun onEnable() {
        super.onEnable()
    }
}
