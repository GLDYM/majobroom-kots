package com.rcell.majobroom.client.renderer.armor;

import com.rcell.majobroom.MajoBroom;
import com.rcell.majobroom.item.armor.MajoBootsItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MajoBootsRenderer extends GeoArmorRenderer<MajoBootsItem> {
    public MajoBootsRenderer() {
        super(new DefaultedItemGeoModel<>(
            ResourceLocation.fromNamespaceAndPath(MajoBroom.MODID, "armor/majo_boots")
        ));
    }
}
