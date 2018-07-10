package com.ikerleon.naturalfaunamod.init;

import java.util.ArrayList;
import java.util.List;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.items.ItemDagger;
import com.ikerleon.naturalfaunamod.init.items.ItemFeather;
import com.ikerleon.naturalfaunamod.init.items.ItemNaturalFauna;

import net.minecraft.item.Item;

public class ItemInit {
	  public static final List<Item> ITEMS = new ArrayList<Item>();

	  public static ItemFeather MALE_CAPERCAILLIE_FEATHER = new ItemFeather("feather_capercaillie_male", SoundHandler.MALE_CAPERCAILLIE_STREAM);
	  public static ItemFeather FEMALE_CAPERCAILLIE_FEATHER = new ItemFeather("feather_capercaillie_female", SoundHandler.FEMALE_CAPERCAILLIE_STREAM);
	  public static ItemFeather AVOCET_FEATHER = new ItemFeather("feather_avocet", SoundHandler.AVOCET_STREAM);
	  public static ItemFeather COURSER_FEATHER = new ItemFeather("feather_courser", SoundHandler.COURSER_STREAM);
	  public static ItemFeather KORIBUSTARD_FEATHER = new ItemFeather("feather_kori_bustard", SoundHandler.KORIBUSTARD_STREAM);
	  public static ItemFeather LITTLEBUSTARD_FEATHER = new ItemFeather("feather_little_bustard", SoundHandler.LITTLEBUSTARD_STREAM);
	  public static ItemFeather OSTRICH_FEATHER = new ItemFeather("feather_ostrich", SoundHandler.OSTRICH_STREAM);
	  public static ItemFeather PUFFIN_FEATHER = new ItemFeather("feather_puffin", SoundHandler.PUFFIN_STREAM);
	  public static Item HORN_DAGGER = new ItemDagger("dagger_horn");
	  public static Item TOOTH_DAGGER = new ItemDagger("dagger_tooth");
	  public static Item CARNIVORE_TOOTH = new ItemNaturalFauna("tooth_carnivore");
	  public static Item HORN = new ItemNaturalFauna("horn");
	  public static Item CHEETAH_FUR = new ItemNaturalFauna("fur_cheetah");
	  public static Item GNU_HIDE = new ItemNaturalFauna("hide_gnu");
	  public static Item HYENA_FUR = new ItemNaturalFauna("fur_hyena");
	  public static Item GAZELLE_HIDE = new ItemNaturalFauna("hide_gazelle");
}
