package net.atlantis.noplugincommand

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IgnoreCommandsTest {

    @Test
    fun isIgnored() {
        Assertions.assertFalse(IgnoreCommands.isIgnored(null))
        Assertions.assertFalse(IgnoreCommands.isIgnored("example"))
        Assertions.assertTrue(IgnoreCommands.isIgnored("plugins"))
    }
}