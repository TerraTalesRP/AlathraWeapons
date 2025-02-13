package me.ShermansWorld.AlathraWeapons;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main instance;

	public static ArrayList<Weapon2> weaponsMasterList2 = new ArrayList<Weapon2>();

	public static Main getInstance() {
		return instance;
	}

	public static void initWeapons() {
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Katana", 30));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Spear", 31));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Flanged Mace", 230));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Naginata", 32));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Pike", 33));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Dagger", 34));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Morning Star", 231));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Zweihander", 35));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Warhammer", 232));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Shortsword", 36));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Quarterstaff", 37));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Hatchet", 233));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Battleaxe", 234));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Combat Axe", 235));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Halberd", 236));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Legendary Katana", 130));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Spear", 131));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Flanged Mace", 430));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Naginata", 132));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Pike", 133));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Dagger", 134));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Morning Star", 431));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Zweihander", 135));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Warhammer", 432));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Shortsword", 136));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Quarterstaff", 137));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Hatchet", 433));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Battleaxe", 434));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Combat Axe", 435));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Halberd", 436));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Kunai", 38));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Sabre", 39));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Twin Blade", 40));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Kunai", 138));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Sabre", 139));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Twin Blade", 140));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Battle Hoe", 237));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Battle Hoe", 437));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Scimitar", 41));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Scimitar", 141));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Rapier", 42));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Rapier", 142));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Scythe", 239));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Scythe", 439));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Katana", 330));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Spear", 331));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Naginata", 332));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Pike", 333));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Dagger", 334));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Zweihander", 335));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Shortsword", 336));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Quarterstaff", 337));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Kunai", 338));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Sabre", 339));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Twin Blade", 340));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Scimitar", 341));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Rapier", 342));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Flanged Mace", 530));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Morning Star", 531));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Warhammer", 532));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Hatchet", 533));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Battleaxe", 534));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Combat Axe", 535));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Halberd", 536));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Battle Hoe", 537));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Scythe", 539));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Hook", 43));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Hook", 343));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Hook", 143));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Mace", 44));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Mace", 344));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Mace", 144));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Greatsword", 45));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Greatsword", 345));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Greatsword", 145));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Bident", 46));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Bident", 346));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Bident", 146));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Giant Sword", 329));
		weaponsMasterList2.add(new Weapon2("iron", "axe", "Iron Dane Axe", 240));
		weaponsMasterList2.add(new Weapon2("diamond", "axe", "Diamond Dane Axe", 540));
		weaponsMasterList2.add(new Weapon2("netherite", "axe", "Netherite Dane Axe", 440));
		weaponsMasterList2.add(new Weapon2("iron", "sword", "Iron Antler Staff", 28));
		weaponsMasterList2.add(new Weapon2("diamond", "sword", "Diamond Antler Staff", 328));
		weaponsMasterList2.add(new Weapon2("netherite", "sword", "Netherite Antler Staff", 129));
		weaponsMasterList2.add(new Weapon2("null", "crossbow", "Faebow", 14914));
		

	}

	public void onEnable() {
		instance = this;
		initWeapons();
		new WeaponsCommands(this);
		getCommand("weapons").setTabCompleter(new WeaponsTabCompletion());
		CraftingRecipes customRecipes = new CraftingRecipes();
		customRecipes.katanaRecipe();
		customRecipes.ironQuarterStaffRecipe();
		customRecipes.ironPikeRecipe();
		customRecipes.ironSpearRecipe();
		customRecipes.ironNaginataRecipe();
		customRecipes.ironFlangedMaceRecipe();
		customRecipes.ironDaggerRecipe();
		customRecipes.ironMorningStarRecipe();
		customRecipes.ironZweihanderRecipe();
		customRecipes.ironWarHammerRecipe();
		customRecipes.ironShortswordRecipe();
		customRecipes.ironHatchetRecipe();
		customRecipes.ironBattleaxeRecipe();
		customRecipes.ironCombatAxeRecipe();
		customRecipes.ironHalberdRecipe();
		customRecipes.legendaryKatanaRecipe();
		customRecipes.netheriteQuarterStaffRecipe();
		customRecipes.netheritePikeRecipe();
		customRecipes.netheriteSpearRecipe();
		customRecipes.netheriteNaginataRecipe();
		customRecipes.netheriteFlangedMaceRecipe();
		customRecipes.netheriteMorningStarRecipe();
		customRecipes.netheriteDaggerRecipe();
		customRecipes.netheriteZweihanderRecipe();
		customRecipes.netheriteWarHammerRecipe();
		customRecipes.netheriteShortswordRecipe();
		customRecipes.netheriteHatchetRecipe();
		customRecipes.netheriteBattleaxeRecipe();
		customRecipes.netheriteCombatAxeRecipe();
		customRecipes.netheriteHalberdRecipe();
		customRecipes.ironKunaiRecipe();
		customRecipes.netheriteKunaiRecipe();
		customRecipes.ironSabreRecipe();
		customRecipes.netheriteSabreRecipe();
		customRecipes.ironTwinBladeRecipe();
		customRecipes.netheriteTwinBladeRecipe();
		customRecipes.ironBattleHoeRecipe();
		customRecipes.netheriteBattleHoeRecipe();
		customRecipes.ironScimitarRecipe();
		customRecipes.netheriteScimitarRecipe();
		customRecipes.ironRapierRecipe();
		customRecipes.netheriteRapierRecipe();
		customRecipes.ironScytheRecipe();
		customRecipes.netheriteScytheRecipe();
		customRecipes.diamondKatanaRecipe();
		customRecipes.diamondSpearRecipe();
		customRecipes.diamondNaginataRecipe();
		customRecipes.diamondPikeRecipe();
		customRecipes.diamondDaggerRecipe();
		customRecipes.diamondZweihanderRecipe();
		customRecipes.dimamondShortswordRecipe();
		customRecipes.diamondQuarterStaffRecipe();
		customRecipes.diamondKunaiRecipe();
		customRecipes.diamondSabreRecipe();
		customRecipes.diamondTwinBladeRecipe();
		customRecipes.diamondScimitarRecipe();
		customRecipes.diamondRapierRecipe();
		customRecipes.diamondFlangedMaceRecipe();
		customRecipes.diamondMorningStarRecipe();
		customRecipes.diamondWarHammerRecipe();
		customRecipes.diamondHatchetRecipe();
		customRecipes.diamondBattleaxeRecipe();
		customRecipes.diamondCombatAxeRecipe();
		customRecipes.diamondHalberdRecipe();
		customRecipes.diamondBattleHoeRecipe();
		customRecipes.diamondScytheRecipe();
		customRecipes.ironHookRecipe();
		customRecipes.diamondHookRecipe();
		customRecipes.netheriteHookRecipe();
		customRecipes.ironMaceRecipe();
		customRecipes.diamondMaceRecipe();
		customRecipes.netheriteMaceRecipe();
		customRecipes.ironGreatswordRecipe();
		customRecipes.diamondGreatswordRecipe();
		customRecipes.netheriteGreatswordRecipe();
		customRecipes.ironBidentRecipe();
		customRecipes.diamondBidentRecipe();
		customRecipes.netheriteBidentRecipe();
		customRecipes.diamondGiantSwordRecipe();
		customRecipes.ironDaneAxeRecipe();
		customRecipes.diamondDaneAxeRecipe();
		customRecipes.netheriteDaneAxeRecipe();
		customRecipes.ironAntlerStaffRecipe();
		customRecipes.diamondAntlerStaffRecipe();
		customRecipes.netheriteAntlerStaffRecipe();
		customRecipes.faeBowRecipe();
	}

	public void onDisable() {
	}
}
