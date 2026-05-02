package net.carti;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class CartiMod implements ModInitializer {
    // Register the sound event using your specific filename
    public static final SoundEvent PISSY_PAMPER_EVENT = SoundEvent.of(new Identifier("cartimod", "music_disc.pissy_pamper"));

    public static final Item PISSY_PAMPER_DISC = new MusicDiscItem(15, PISSY_PAMPER_EVENT, new Item.Settings().maxCount(1).rarity(Rarity.EPIC), 167);

    @Override
    public void onInitialize() {
        Registry.register(Registries.SOUND_EVENT, new Identifier("cartimod", "music_disc.pissy_pamper"), PISSY_PAMPER_EVENT);
        Registry.register(Registries.ITEM, new Identifier("cartimod", "pissy_pamper_disc"), PISSY_PAMPER_DISC);
    }
}
