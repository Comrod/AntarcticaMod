package comrod.antarcticamod.main;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPermafrost extends Block
{

	public BlockPermafrost(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.8F);
		this.setResistance(5.0F);
		this.setStepSound(soundSnowFootstep);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return AntarcticaMod.permaFrost.blockID;
	}
	
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

}
