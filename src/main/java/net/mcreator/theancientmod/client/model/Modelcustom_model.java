package net.mcreator.theancientmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("the_ancient_mod", "modelcustom_model"),
			"main");
	public final ModelPart group;
	public final ModelPart leftArm;
	public final ModelPart bone;

	public Modelcustom_model(ModelPart root) {
		this.group = root.getChild("group");
		this.leftArm = root.getChild("leftArm");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition head = group.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 48).addBox(-12.0F, -8.0F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, -16.0F, -8.0F));
		PartDefinition body = group.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(40, 48).addBox(-12.0F, 0.0F, 6.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, -16.0F, -8.0F));
		PartDefinition leftLeg = group.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(48, 14).addBox(-9.0F, 0.0F, 7.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -4.0F, -8.0F));
		PartDefinition rightLeg = group.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(56, 14).addBox(-9.0F, 0.0F, 7.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, -4.0F, -8.0F));
		PartDefinition rightArm = group.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(48, 0).addBox(-9.0F, -2.0F, 7.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, -14.0F, -8.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(56, 0).addBox(-9.0F, -2.0F, 7.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 2.0F, -8.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(46, 42).addBox(3.0F, -25.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 18.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
