// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Dugk;

	public Modelcustom_model(ModelPart root) {
		this.Dugk = root.getChild("Dugk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Dugk = partdefinition.addOrReplaceChild("Dugk",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.0F, -5.0F, -2.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 8)
						.addBox(3.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-4.0F, -4.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition legs = Dugk.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(-2.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Dugk.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Dugk.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Dugk.xRot = headPitch / (180F / (float) Math.PI);
	}
}