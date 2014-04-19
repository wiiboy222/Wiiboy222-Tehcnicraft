package wiiboy.mod.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import wiiboy222.mod.lib.ProxyCommon;
import wiiboy222.mod.lib.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=References.MODID, name="Technicraft", version=References.MODID)

public class Main {
	
	//items
	public static Item ultraGem;
	public static Item rubyGem;
	public static Item sapphireGem;
	public static Item amethystGem;
	public static Item topazGem;
	public static Item copperMetal;
	public static Item tinMetal;
	public static Item leadMetal;
	public static Item aluminiumMetal;
	public static Item copperDust;
	public static Item tinDust;
	public static Item leadDust;
	public static Item aluminiumDust;
	public static Item ironDust;
	public static Item goldDust;
	
	
	//Blocks
	
	
	public static CreativeTabs Technicraft = new CreativeTabs("Technicraft"){
		public Item getTabIconItem() {
			return ultraGem;
		}
	};
	
	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	public static ProxyCommon proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	
		//Gems
		ultraGem = new Item().setUnlocalizedName("UltraGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_ultra");
		GameRegistry.registerItem(ultraGem, "Ultra Gem");
		rubyGem = new Item().setUnlocalizedName("RubyGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_ruby");
		GameRegistry.registerItem(rubyGem, "Ruby Gem");
		sapphireGem = new Item().setUnlocalizedName("SapphireGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_sapphire");
		GameRegistry.registerItem(sapphireGem, "Sapphire Gem");
		amethystGem = new Item().setUnlocalizedName("AmethystGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_amethyst");
		GameRegistry.registerItem(amethystGem, "Amethyst Gem");
		topazGem = new Item().setUnlocalizedName("TopazGem").setCreativeTab(Technicraft).setTextureName("technicraft:gem_topaz");
		GameRegistry.registerItem(topazGem, "Topaz Gem");
		
		//Ingots
		copperMetal = new Item().setUnlocalizedName("CopperIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_copper");
		GameRegistry.registerItem(copperMetal, "Copper Ingot");
		tinMetal = new Item().setUnlocalizedName("TinIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_tin");
		GameRegistry.registerItem(tinMetal, "Tin Ingot");
		leadMetal = new Item().setUnlocalizedName("LeadIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_lead");
		GameRegistry.registerItem(leadMetal, "Lead Ingot");
		aluminiumMetal = new Item().setUnlocalizedName("AluminiumIngot").setCreativeTab(Technicraft).setTextureName("technicraft:ingot_aluminium");
		GameRegistry.registerItem(aluminiumMetal, "Aluminium Ingot");
		
		//Dusts
		copperDust = new Item().setUnlocalizedName("CopperDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_copper");
		GameRegistry.registerItem(copperDust, "Copper Dust");
		tinDust = new Item().setUnlocalizedName("TinDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_tin");
		GameRegistry.registerItem(tinDust, "Tin Dust");
		leadDust = new Item().setUnlocalizedName("LeadDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_lead");
		GameRegistry.registerItem(leadDust, "Lead Dust");
		aluminiumDust = new Item().setUnlocalizedName("AluminiumDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_aluminium");
		GameRegistry.registerItem(aluminiumDust, "Aluminium Dust");
		goldDust = new Item().setUnlocalizedName("GoldDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_gold");
		GameRegistry.registerItem(goldDust, "Gold Dust");
		ironDust = new Item().setUnlocalizedName("IronDust").setCreativeTab(Technicraft).setTextureName("technicraft:dust_iron");
		GameRegistry.registerItem(ironDust, "Iron Dust");
		//Misc
		
		//Ores
		
		//Compressed Blocks
		
		//Machnines
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
