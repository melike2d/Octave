package xyz.gnarbot.gnar

import xyz.gnarbot.gnar.utils.child
import java.io.File

class BotFiles {
    /** _data folder. */
    val data = File("data")
            .apply { if (!exists()) mkdir() }

    /** _data/hosts folder. */
    //    val hosts = data
//            .child("host")
//            .apply { if (!exists()) mkdir() }

    val admins = data
            .child("administrators.json")
            .apply { if (!exists()) throw IllegalStateException("`$path` do not exist.") }

    val blocked = data
            .child("blocked.json")
            .apply { if (!exists()) throw IllegalStateException("`$path` do not exist.") }
}