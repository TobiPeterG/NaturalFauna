package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * dromadaire - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCamel extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer shape18;
    public BookwormModelRenderer shape17;
    public BookwormModelRenderer shape21;
    public BookwormModelRenderer shape22;
    public BookwormModelRenderer shape8;
    public BookwormModelRenderer shape10;
    public BookwormModelRenderer shape9;
    public BookwormModelRenderer shape11;
    public BookwormModelRenderer tails;
    public BookwormModelRenderer shape19;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape15;
    public BookwormModelRenderer shape13;
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer head2;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape4;

    public ModelCamel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape21 = new BookwormModelRenderer(this, 92, 69, "shape21");
        this.shape21.setRotationPoint(0.8F, -2.6F, 14.9F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 8, 3, 4, 0.0F);
        this.setRotateAngle(shape21, -1.0522590060273813F, 0.0F, 0.0F);
        this.tails = new BookwormModelRenderer(this, 80, 80, "tails");
        this.tails.setRotationPoint(5.0F, 2.7F, 17.0F);
        this.tails.addBox(-1.1F, -0.5F, 0.1F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tails, -1.3566444275751923F, 0.0F, 0.0F);
        this.shape12 = new BookwormModelRenderer(this, 72, 2, "shape12");
        this.shape12.setRotationPoint(-2.3F, 2.4F, 0.0F);
        this.shape12.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape22 = new BookwormModelRenderer(this, 103, 53, "shape22");
        this.shape22.setRotationPoint(0.9F, -2.0F, 6.7F);
        this.shape22.addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        this.shape19 = new BookwormModelRenderer(this, 38, 95, "shape19");
        this.shape19.setRotationPoint(0.5F, 9.0F, 0.1F);
        this.shape19.addBox(0.0F, 0.0F, 0.0F, 9, 5, 7, 0.0F);
        this.setRotateAngle(shape19, 2.1945770014576698F, 0.01658062789394613F, 0.0F);
        this.shape17 = new BookwormModelRenderer(this, 20, 69, "shape17");
        this.shape17.setRotationPoint(0.9F, -2.9F, 8.2F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 8, 3, 7, 0.0F);
        this.shape15 = new BookwormModelRenderer(this, 55, 2, "shape15");
        this.shape15.setRotationPoint(2.3F, 2.4F, 0.0F);
        this.shape15.addBox(-2.0F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape13 = new BookwormModelRenderer(this, 20, 2, "shape13");
        this.shape13.setRotationPoint(2.9F, 3.9F, 0.0F);
        this.shape13.addBox(-2.3F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 102, 20, "shape2");
        this.shape2.setRotationPoint(4.7F, 2.4F, 11.2F);
        this.shape2.addBox(-3.0F, -6.0F, -3.5F, 5, 11, 5, 0.0F);
        this.setRotateAngle(shape2, 1.4203489452729852F, 0.0F, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 90, 5, "shape4");
        this.shape4.setRotationPoint(1.4F, 3.0F, -7.7F);
        this.shape4.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape4, -0.6045820528908358F, 0.02565634000431664F, -0.4241150082346221F);
        this.shape9 = new BookwormModelRenderer(this, 51, 24, "shape9");
        this.shape9.setRotationPoint(7.8F, 5.8F, 3.6F);
        this.shape9.addBox(-0.6F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(shape9, 0.0F, 0.0F, -2.3252456653390877E-17F);
        this.shape14 = new BookwormModelRenderer(this, 38, 2, "shape14");
        this.shape14.setRotationPoint(-2.3F, 2.4F, 0.0F);
        this.shape14.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape10 = new BookwormModelRenderer(this, 33, 24, "shape10");
        this.shape10.setRotationPoint(3.0F, 5.8F, 14.0F);
        this.shape10.addBox(-4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape11 = new BookwormModelRenderer(this, 15, 25, "shape11");
        this.shape11.setRotationPoint(7.1F, 4.3F, 14.1F);
        this.shape11.addBox(0.0F, -0.5F, -2.0F, 4, 6, 4, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 90, 12, "shape5");
        this.shape5.setRotationPoint(-3.8F, 3.1F, -7.3F);
        this.shape5.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape5, -0.3993313328563026F, 0.0F, 0.5462880558742251F);
        this.head2 = new BookwormModelRenderer(this, 10, 50, "head2");
        this.head2.setRotationPoint(-0.1F, -6.7F, 1.7F);
        this.head2.addBox(-3.0F, -3.9F, -6.8F, 4, 3, 5, 0.0F);
        this.setRotateAngle(head2, 1.8994418249454288F, 0.0F, 0.0F);
        this.shape18 = new BookwormModelRenderer(this, 53, 69, "shape18");
        this.shape18.setRotationPoint(0.9F, -2.8F, 0.8F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 8, 3, 6, 0.0F);
        this.body = new BookwormModelRenderer(this, 58, 95, "body");
        this.body.setRotationPoint(0.7F, 2.9F, 1.3F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 10, 9, 17, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.01658062789394613F, 0.0F);
        this.head = new BookwormModelRenderer(this, 101, 3, "head");
        this.head.setRotationPoint(0.5F, 7.4F, 3.6F);
        this.head.addBox(-3.0F, -3.9F, -6.8F, 4, 5, 7, 0.0F);
        this.setRotateAngle(head, -0.4635594493296939F, 0.0F, 0.0F);
        this.shape8 = new BookwormModelRenderer(this, 71, 24, "shape8");
        this.shape8.setRotationPoint(3.1F, 5.6F, 3.2F);
        this.shape8.addBox(-4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.body.addChild(this.shape21);
        this.body.addChild(this.tails);
        this.shape8.addChild(this.shape12);
        this.body.addChild(this.shape22);
        this.body.addChild(this.shape19);
        this.body.addChild(this.shape17);
        this.shape9.addChild(this.shape15);
        this.shape11.addChild(this.shape13);
        this.shape19.addChild(this.shape2);
        this.head.addChild(this.shape4);
        this.body.addChild(this.shape9);
        this.shape10.addChild(this.shape14);
        this.body.addChild(this.shape10);
        this.body.addChild(this.shape11);
        this.head.addChild(this.shape5);
        this.head.addChild(this.head2);
        this.body.addChild(this.shape18);
        this.shape2.addChild(this.head);
        this.body.addChild(this.shape8);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
     	if(this.isChild) {
     		float scaleFactor= 0.7F;
	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.body.render(f5);
    	    GlStateManager.popMatrix();
     	}
     	else {
     		float scaleFactor= 1.5F;
	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.body.render(f5);
    	    GlStateManager.popMatrix();
        }
    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	reset();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1F;

    	this.shape9.rotateAngleX = 1f * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
    	this.shape8.rotateAngleX = -1f * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
    	this.shape11.rotateAngleX = 1f * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
    	this.shape10.rotateAngleX = -1f * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
    	this.shape2.rotateAngleX = -1f * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 2.5f) + 1.4203489452729852F;

        this.shape2.rotateAngleX = 1f * 0.5F * (0.06f * globalDegree) * MathHelper.cos(entity.ticksExisted * (0.1f * globalSpeed) + 2.5f) + 1.4203489452729852F;


        this.tails.rotateAngleZ = -1f * (MathHelper.cos(entity.ticksExisted * (0.2f * globalSpeed) + 0f) * (0.2f * globalDegree) * 0.5F) + (0f * 0.5F);

    }
}
