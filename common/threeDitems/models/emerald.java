package threeDitems.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class emerald extends ModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;

	public emerald()
	{
		textureWidth = 24;
		textureHeight = 15;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-1.5F, -1.5F, -2F, 3, 2, 4);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(24, 15);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 6);
		Shape2.addBox(-1.5F, -1F, -2.9F, 3, 1, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(24, 15);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 6);
		Shape3.addBox(-1.5F, -1F, 1.9F, 3, 1, 1);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(24, 15);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 14, 0);
		Shape4.addBox(-2.4F, -1F, -2F, 1, 1, 4);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(24, 15);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 8);
		Shape5.addBox(-1.5F, -1F, -1F, 3, 1, 1);
		Shape5.setRotationPoint(0F, -1.5F, -2F);
		Shape5.setTextureSize(24, 15);
		Shape5.mirror = true;
		setRotation(Shape5, 2.094395F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 8);
		Shape6.addBox(-1.5F, -1F, 0F, 3, 1, 1);
		Shape6.setRotationPoint(0F, -1.5F, 2F);
		Shape6.setTextureSize(24, 15);
		Shape6.mirror = true;
		setRotation(Shape6, -2.094395F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 14, 5);
		Shape7.addBox(0F, 0F, -2F, 1, 1, 4);
		Shape7.setRotationPoint(-1.5F, -1.5F, 0F);
		Shape7.setTextureSize(24, 15);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 1.082104F);
		Shape8 = new ModelRenderer(this, 0, 10);
		Shape8.addBox(-1.5F, 0F, -1F, 3, 1, 1);
		Shape8.setRotationPoint(0F, 0.5F, -2F);
		Shape8.setTextureSize(24, 15);
		Shape8.mirror = true;
		setRotation(Shape8, -2.094395F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 10);
		Shape9.addBox(-1.5F, 0F, 0F, 3, 1, 1);
		Shape9.setRotationPoint(0F, 0.5F, 2F);
		Shape9.setTextureSize(24, 15);
		Shape9.mirror = true;
		setRotation(Shape9, 2.094395F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 14, 10);
		Shape10.addBox(0F, 0F, -2F, 1, 1, 4);
		Shape10.setRotationPoint(-1.5F, 0.5F, 0F);
		Shape10.setTextureSize(24, 15);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, -2.6529F);
		Shape11 = new ModelRenderer(this, 14, 0);
		Shape11.addBox(1.4F, -1F, -2F, 1, 1, 4);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(24, 15);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 14, 5);
		Shape12.addBox(0F, 0F, -2F, 1, 1, 4);
		Shape12.setRotationPoint(1.5F, -1.5F, 0F);
		Shape12.setTextureSize(24, 15);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0.5235988F);
		Shape13 = new ModelRenderer(this, 14, 10);
		Shape13.addBox(0F, 0F, -2F, 1, 1, 4);
		Shape13.setRotationPoint(1.5F, 0.5F, 0F);
		Shape13.setTextureSize(24, 15);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, -2.094395F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5,entity);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}