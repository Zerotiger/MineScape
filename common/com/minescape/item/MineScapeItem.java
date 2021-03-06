package com.minescape.item;

import com.minescape.MineScape;
import com.minescape.lib.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MineScapeItem extends Item {
	//Generic materials used in crafting and don't have any other uses
	
	public MineScapeItem(int par1) 
	{
		super(par1);
		setCreativeTab(MineScape.tabMineScapeItems);
		setMaxStackSize(1);
	}
	
	//Texture name = Unlocalized name
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

}
