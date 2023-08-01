package jan.komi.telopakola;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Pakola implements ModInitializer {
    public static final TeloPakolaItem TELO_PAKOLA_ITEM = new TeloPakolaItem(new FabricItemSettings().maxCount(1).food(FoodComponents.SWEET_BERRIES).recipeRemainder(Items.GLASS_BOTTLE));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("pakola", "telo_pakola"), TELO_PAKOLA_ITEM);
    }
}
