package dk.gamingtutsdk.minescape.block;

import java.util.Random;

import dk.gamingtutsdk.minescape.MineScape;
import dk.gamingtutsdk.minescape.item.Items;
import dk.gamingtutsdk.minescape.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MineScapeMinedOre extends Block
{

	public MineScapeMinedOre(int ID, Material material) 
	{
		super(ID, material);
		setTickRandomly(true);
		setBlockUnbreakable();
	}
    
    public int tickRate(World par1World)
    {
        return 1;
    }
        
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (this.blockID == Blocks.minedCopper.blockID)
        {
           	world.setBlock(x, y, z, Blocks.oreCopper.blockID);
        }
        else if (this.blockID == Blocks.minedTin.blockID)
        {
            world.setBlock(x, y, z, Blocks.oreTin.blockID);
        }
    }
    
	@Override
	public void registerIcons(IconRegister iconRegister) 
	{
		//blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
		blockIcon = iconRegister.registerIcon("stone");
	}
}
