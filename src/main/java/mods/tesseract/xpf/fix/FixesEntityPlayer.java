package mods.tesseract.xpf.fix;

import mods.tesseract.xpf.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.tclproject.mysteriumlib.asm.annotations.EnumReturnSetting;
import net.tclproject.mysteriumlib.asm.annotations.Fix;

public class FixesEntityPlayer {
    @Fix(returnSetting = EnumReturnSetting.ALWAYS)
    public static int xpBarCap(EntityPlayer c) {
        for (int i = 0; i < Config.xpFormula.length; i += 3) {
            if (c.experienceLevel >= Config.xpFormula[i])
                return c.experienceLevel * Config.xpFormula[i + 1] + Config.xpFormula[i + 2];
        }
        return 47;
    }
}
