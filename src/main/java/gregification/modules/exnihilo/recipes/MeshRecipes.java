package gregification.modules.exnihilo.recipes;

import exnihilocreatio.ModBlocks;
import exnihilocreatio.ModItems;
import gregification.modules.exnihilo.ExNihiloConfig;
import gregification.modules.exnihilo.ExNihiloModule;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.ore.StoneType;
import gregtech.api.unification.ore.StoneTypes;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.blocks.StoneVariantBlock;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gregtech.api.recipes.RecipeMaps.FORGE_HAMMER_RECIPES;

public class MeshRecipes {

    public static void init() {
        if (ExNihiloConfig.harderMeshes) {
            ModHandler.removeRecipeByName("exnihilocreatio:item_mesh_2");
            ModHandler.addShapedRecipe("bronze_mesh", new ItemStack(ModItems.mesh, 1, 2), "TST", "STS", "TST",
                    'T', new UnificationEntry(OrePrefix.stick, Materials.Bronze),
                    'S', new ItemStack(Items.STRING)
            );
            ModHandler.removeRecipeByName("exnihilocreatio:item_mesh_3");
            ModHandler.addShapedRecipe("steel_mesh", new ItemStack(ModItems.mesh, 1, 3), "TST", "STS", "TST",
                    'T', new UnificationEntry(OrePrefix.stick, Materials.Steel),
                    'S', new ItemStack(Items.STRING)
            );
            ModHandler.removeRecipeByName("exnihilocreatio:item_mesh_4");
            ModHandler.addShapedRecipe("aluminium_mesh", new ItemStack(ModItems.mesh, 1, 4), "TST", "STS", "TST",
                    'T', new UnificationEntry(OrePrefix.stick, Materials.Aluminium),
                    'S', new ItemStack(Items.STRING)
            );
        }
        ModHandler.addMirroredShapedRecipe("basalt", new ItemStack(StoneTypes.BASALT.stone.get().getBlock()), "PP", "PP", 'P', new ItemStack(ExNihiloModule.gtPebble, 1, 0));
        ModHandler.addMirroredShapedRecipe("basalt", new ItemStack(StoneTypes.BLACK_GRANITE.stone.get().getBlock()), "PP", "PP", 'P', new ItemStack(ExNihiloModule.gtPebble, 1, 1));
        ModHandler.addMirroredShapedRecipe("basalt", new ItemStack(StoneTypes.MARBLE.stone.get().getBlock()), "PP", "PP", 'P', new ItemStack(ExNihiloModule.gtPebble, 1, 2));
        ModHandler.addMirroredShapedRecipe("basalt", new ItemStack(StoneTypes.RED_GRANITE.stone.get().getBlock()), "PP", "PP", 'P', new ItemStack(ExNihiloModule.gtPebble, 1, 3));

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .duration(10).EUt(16)
                .input(Blocks.SAND)
                .output(ModBlocks.dust)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .duration(10).EUt(16)
                .inputs(new ItemStack(Blocks.STONE, 1, 1))
                .output(ModBlocks.crushedGranite)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .duration(10).EUt(16)
                .inputs(new ItemStack(Blocks.STONE, 1, 3))
                .output(ModBlocks.crushedDiorite)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .duration(10).EUt(16)
                .inputs(new ItemStack(Blocks.STONE, 1, 5))
                .output(ModBlocks.crushedAndesite)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .duration(10).EUt(16)
                .input(Blocks.NETHERRACK)
                .output(ModBlocks.netherrackCrushed)
                .buildAndRegister();

        FORGE_HAMMER_RECIPES.recipeBuilder()
                .duration(10).EUt(16)
                .input(Blocks.END_STONE)
                .output(ModBlocks.endstoneCrushed)
                .buildAndRegister();
    }
}
