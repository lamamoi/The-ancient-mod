
package net.mcreator.theancientmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.theancientmod.entity.RedskeletonEntity;
import net.mcreator.theancientmod.client.model.Modelcustom_model;

public class RedskeletonRenderer extends MobRenderer<RedskeletonEntity, Modelcustom_model<RedskeletonEntity>> {
	public RedskeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedskeletonEntity entity) {
		return new ResourceLocation("the_ancient_mod:textures/texturered.png");
	}
}
