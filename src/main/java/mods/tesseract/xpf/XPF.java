package mods.tesseract.xpf;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = XPF.MODID, name = XPF.NAME, version = XPF.VERSION)
public class XPF
{
    public static final String MODID = "xpf";
    public static final String NAME = "Xp Formula";
    public static final String VERSION = "1.0";
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        Config.sync(e.getSuggestedConfigurationFile());
    }
}
