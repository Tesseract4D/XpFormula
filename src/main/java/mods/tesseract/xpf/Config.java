package mods.tesseract.xpf;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static int[] xpFormula;

    public static void sync(File configFile) {
        Configuration c = new Configuration(configFile);
        xpFormula = c.get(Configuration.CATEGORY_GENERAL, "xpFormula", new int[]{30, 9, -158, 15, 5, -38, 0, 2, 7}, "The experience calculation formula can be divided into multiple segments, each consisting of three numbers. Within each segment, the experience required for a player to level up is given by y = kx + b, where x is the player's level. The first number in each segment indicates from which level onwards this formula applies, the second number represents the value of k, and the third number represents the value of b. Formulas for higher-level experiences should be listed earlier. If there is no calculation formula for a certain level, it defaults to 47 experience points, which is approximately the average experience from level one to level thirty. You can delete all the numbers in this list, so you always only need 47 experience points to level up.").getIntList();
        if (c.hasChanged()) {
            c.save();
        }
    }
}
