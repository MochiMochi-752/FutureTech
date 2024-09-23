package future_tech.datagen;

import future_tech.common.registers.FutureTechItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModSmeltingRecipeProvider extends RecipeProvider {

    public ModSmeltingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        List<ItemLike> ingredients = List.of(
                FutureTechItems.BRONZE_DUST.get()
        );

        oreSmelting(recipeOutput, ingredients, RecipeCategory.MISC, FutureTechItems.BRONZE_INGOT.get(), 0.5F, 200, "bronze");
        oreBlasting(recipeOutput, ingredients, RecipeCategory.MISC, FutureTechItems.BRONZE_INGOT.get(), 0.5F, 100, "bronze");
    }

}
