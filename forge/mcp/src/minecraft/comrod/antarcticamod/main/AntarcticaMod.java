package comrod.antarcticamod.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import comrod.antarcticamod.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "comrod.antarctica", name = "Antarctica Mod", version = "2.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class AntarcticaMod
{
	public static final String antModid = "comrod.antarctica";
	
	@Instance("comrod.antarctica")
	public static AntarcticaMod instance;
	
	@SidedProxy(clientSide="comrod.antarcticamod.client.AntarcticaModClientProxy", serverSide="comrod.antarcticamod.common.CommonProxy")
	public static CommonProxy proxy;
	
	//Blocks
	public static Block permaFrost;
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		//Permafrost
		permaFrost = new BlockPermafrost(671, Material.ground).setUnlocalizedName("Permafrost");
		GameRegistry.registerBlock(permaFrost, antModid + (permaFrost.getUnlocalizedName().substring(5)));
		LanguageRegistry.addName(permaFrost, "Permafrost");
		permaFrost.setTextureName("antarcticamod:permafrost.png");
		
		System.out.println("Antarctica Mod Initialized");
		
	}
	
}