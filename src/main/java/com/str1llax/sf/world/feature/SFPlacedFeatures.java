package com.str1llax.sf.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class SFPlacedFeatures {
    //TREES
    //  HEVEA TREE
    public static final Holder<PlacedFeature> HEVEA_PLACED = PlacementUtils.register("hevea_placed",
            SFConfiguredFeatures.HEVEA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.5f, 1)));
    //  CHESTNUT TREE
    public static final Holder<PlacedFeature> CHESTNUT_PLACED = PlacementUtils.register("chestnut_placed",
            SFConfiguredFeatures.CHESTNUT_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.5f, 1)));
    //  SAKURA TREE
    public static final Holder<PlacedFeature> SAKURA_PLACED = PlacementUtils.register("sakura_placed",
            SFConfiguredFeatures.SAKURA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.5f, 1)));

    //FLOWERS
    //  PINK ROSE
    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            SFConfiguredFeatures.PINK_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


    //ORES
    //  #1 TIN ORE
    public static final Holder<PlacedFeature> TIN_ORE_PLACED = PlacementUtils.register("tin_ore_placed",
            SFConfiguredFeatures.TIN_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(90))));
    //  #2 TITANIUM ORE
    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            SFConfiguredFeatures.TITANIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));
    //  #3 VANADIUM ORE
    public static final Holder<PlacedFeature> VANADIUM_ORE_PLACED = PlacementUtils.register("vanadium_ore_placed",
            SFConfiguredFeatures.VANADIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));
    //  #4 CHROMIUM ORE
    public static final Holder<PlacedFeature> CHROMIUM_ORE_PLACED = PlacementUtils.register("chromium_ore_placed",
            SFConfiguredFeatures.CHROMIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #5 MANGANESE ORE
    public static final Holder<PlacedFeature> MANGANESE_ORE_PLACED = PlacementUtils.register("manganese_ore_placed",
            SFConfiguredFeatures.MANGANESE_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #6 COBALT ORE
    public static final Holder<PlacedFeature> COBALT_ORE_PLACED = PlacementUtils.register("cobalt_ore_placed",
            SFConfiguredFeatures.COBALT_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #7 NICKEL ORE
    public static final Holder<PlacedFeature> NICKEL_ORE_PLACED = PlacementUtils.register("nickel_ore_placed",
            SFConfiguredFeatures.NICKEL_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #8 ZINC ORE
    public static final Holder<PlacedFeature> ZINC_ORE_PLACED = PlacementUtils.register("zinc_ore_placed",
            SFConfiguredFeatures.ZINC_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #9 GERMANIUM ORE
    public static final Holder<PlacedFeature> GERMANIUM_ORE_PLACED = PlacementUtils.register("germanium_ore_placed",
            SFConfiguredFeatures.GERMANIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #10 ZIRCONIUM ORE
    public static final Holder<PlacedFeature> ZIRCONIUM_ORE_PLACED = PlacementUtils.register("zirconium_ore_placed",
            SFConfiguredFeatures.ZIRCONIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #11 PALLADIUM ORE
    public static final Holder<PlacedFeature> PALLADIUM_ORE_PLACED = PlacementUtils.register("palladium_ore_placed",
            SFConfiguredFeatures.PALLADIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #12 SILVER ORE
    public static final Holder<PlacedFeature> SILVER_ORE_PLACED = PlacementUtils.register("silver_ore_placed",
            SFConfiguredFeatures.SILVER_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #13 CADMIUM ORE
    public static final Holder<PlacedFeature> CADMIUM_ORE_PLACED = PlacementUtils.register("cadmium_ore_placed",
            SFConfiguredFeatures.CADMIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #14 INDIUM ORE
    public static final Holder<PlacedFeature> INDIUM_ORE_PLACED = PlacementUtils.register("indium_ore_placed",
            SFConfiguredFeatures.INDIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #15 TERBIUM ORE
    public static final Holder<PlacedFeature> TERBIUM_ORE_PLACED = PlacementUtils.register("terbium_ore_placed",
            SFConfiguredFeatures.TERBIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #16 HAFNIUM ORE
    public static final Holder<PlacedFeature> HAFNIUM_ORE_PLACED = PlacementUtils.register("hafnium_ore_placed",
            SFConfiguredFeatures.HAFNIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #17 TUNGSTEN ORE
    public static final Holder<PlacedFeature> TUNGSTEN_ORE_PLACED = PlacementUtils.register("tungsten_ore_placed",
            SFConfiguredFeatures.TUNGSTEN_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #18 RHENIUM ORE
    public static final Holder<PlacedFeature> RHENIUM_ORE_PLACED = PlacementUtils.register("rhenium_ore_placed",
            SFConfiguredFeatures.RHENIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #19 OSMIUM ORE
    public static final Holder<PlacedFeature> OSMIUM_ORE_PLACED = PlacementUtils.register("osmium_ore_placed",
            SFConfiguredFeatures.OSMIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #20 IRIDIUM ORE
    public static final Holder<PlacedFeature> IRIDIUM_ORE_PLACED = PlacementUtils.register("iridium_ore_placed",
            SFConfiguredFeatures.IRIDIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #21 PLATINUM ORE
    public static final Holder<PlacedFeature> PLATINUM_ORE_PLACED = PlacementUtils.register("platinum_ore_placed",
            SFConfiguredFeatures.PLATINUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #22 LEAD ORE
    public static final Holder<PlacedFeature> LEAD_ORE_PLACED = PlacementUtils.register("lead_ore_placed",
            SFConfiguredFeatures.LEAD_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #23 BISMUTH ORE
    public static final Holder<PlacedFeature> BISMUTH_ORE_PLACED = PlacementUtils.register("bismuth_ore_placed",
            SFConfiguredFeatures.BISMUTH_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  #24 URANIUM ORE
    public static final Holder<PlacedFeature> URANIUM_ORE_PLACED = PlacementUtils.register("uranium_ore_placed",
            SFConfiguredFeatures.URANIUM_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  RUBY ORE
    public static final Holder<PlacedFeature> RUBY_ORE_PLACED = PlacementUtils.register("ruby_ore_placed",
            SFConfiguredFeatures.RUBY_ORE, SFOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));
}