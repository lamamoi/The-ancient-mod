
package net.mcreator.theancientmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.theancientmod.entity.DugkEntity;
import net.mcreator.theancientmod.client.model.Modelcustom_model;

public class DugkRenderer extends MobRenderer<DugkEntity, Modelcustom_model<DugkEntity>> {
	public DugkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(DugkEntity entity) {
		return new ResourceLocation("the_ancient_mod:textures/dugk.png");
	}
}
