package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Spotted Hyena (complex) - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelHyena extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer body2;
    public ModelRenderer neck;
    public ModelRenderer frontrightleg;
    public ModelRenderer frontleftleg;
    public ModelRenderer body2down;
    public ModelRenderer body3;
    public ModelRenderer tail;
    public ModelRenderer backrightleg;
    public ModelRenderer backleftleg;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer backrightleg2;
    public ModelRenderer backrightleg3;
    public ModelRenderer backrightfoot;
    public ModelRenderer backleftleg2;
    public ModelRenderer backleftleg3;
    public ModelRenderer backleftfoot;
    public ModelRenderer neck2;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape15_4;
    public ModelRenderer head;
    public ModelRenderer shape15_5;
    public ModelRenderer shape15_6;
    public ModelRenderer snouttop;
    public ModelRenderer rightear;
    public ModelRenderer leftear;
    public ModelRenderer snout;
    public ModelRenderer snoutdown;
    public ModelRenderer frontrightleg2;
    public ModelRenderer frontrightleg3;
    public ModelRenderer frontrightfoot;
    public ModelRenderer frontleftleg2;
    public ModelRenderer frontleftleg3;
    public ModelRenderer frontleftfoot;

    public ModelHyena() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape15_1 = new ModelRenderer(this, 28, 0);
        this.shape15_1.setRotationPoint(-0.4F, -5.4F, -3.2F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_1, -0.4553564018453205F, 0.0F, 0.0F);
        this.shape15_5 = new ModelRenderer(this, 0, 4);
        this.shape15_5.setRotationPoint(-0.4F, -4.4F, -2.0F);
        this.shape15_5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_5, -0.27314402793711257F, 0.0F, 0.0F);
        this.frontleftfoot = new ModelRenderer(this, 35, 68);
        this.frontleftfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.frontleftfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(frontleftfoot, 0.17453292519943295F, -0.017453292519943295F, 0.0F);
        this.snout = new ModelRenderer(this, 0, 60);
        this.snout.setRotationPoint(-3.0F, -0.1F, -0.4F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(snout, -0.22759093446006054F, 0.0F, 0.0F);
        this.frontleftleg2 = new ModelRenderer(this, 0, 67);
        this.frontleftleg2.setRotationPoint(1.4F, 8.5F, 2.0F);
        this.frontleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(frontleftleg2, 0.03490658503988659F, -0.0F, 0.0F);
        this.neck2 = new ModelRenderer(this, 7, 46);
        this.neck2.setRotationPoint(0.0F, -0.5F, -5.1F);
        this.neck2.addBox(-2.5F, -2.5F, -6.5F, 5, 7, 7, 0.0F);
        this.setRotateAngle(neck2, -0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg3 = new ModelRenderer(this, 15, 65);
        this.frontrightleg3.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.frontrightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontrightleg3, -0.17453292519943295F, -0.0F, 0.0F);
        this.snoutdown = new ModelRenderer(this, 45, 63);
        this.snoutdown.setRotationPoint(2.5F, 3.0F, 4.7F);
        this.snoutdown.addBox(-2.0F, 0.0F, -4.5F, 4, 1, 5, 0.0F);
        this.frontrightleg = new ModelRenderer(this, 24, 21);
        this.frontrightleg.setRotationPoint(-0.6F, 4.2F, 0.5F);
        this.frontrightleg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 5, 0.0F);
        this.backleftleg3 = new ModelRenderer(this, 0, 33);
        this.backleftleg3.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.backleftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(backleftleg3, -0.4553564018453205F, -0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 32, 0);
        this.body2.setRotationPoint(0.5F, 0.0F, 7.5F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 10, 11, 0.0F);
        this.setRotateAngle(body2, -0.045553093477052F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 24, 54);
        this.head.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.head.addBox(-3.0F, -3.0F, -7.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(head, 0.5462880558742251F, 0.0F, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 24, 3);
        this.shape15_3.setRotationPoint(-0.4F, -4.8F, -8.0F);
        this.shape15_3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_3, -0.31869712141416456F, 0.0F, 0.0F);
        this.leftear = new ModelRenderer(this, 18, 19);
        this.leftear.setRotationPoint(2.4F, -5.0F, -2.5F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(leftear, 0.0F, -0.40980330836826856F, 0.0F);
        this.rightear = new ModelRenderer(this, 68, 9);
        this.rightear.setRotationPoint(-5.0F, -5.0F, -1.3F);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(rightear, 0.0F, 0.40980330836826856F, 0.0F);
        this.tail2 = new ModelRenderer(this, 57, 0);
        this.tail2.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.tail2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail2, 0.045553093477052F, 0.0F, 0.0F);
        this.backleftleg2 = new ModelRenderer(this, 64, 45);
        this.backleftleg2.setRotationPoint(1.4F, 8.7F, 2.5F);
        this.backleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(backleftleg2, 0.4553564018453205F, -0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 56, 31);
        this.body3.setRotationPoint(0.5F, 0.0F, 10.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 6, 10, 4, 0.0F);
        this.setRotateAngle(body3, -0.091106186954104F, 0.0F, 0.0F);
        this.shape15_4 = new ModelRenderer(this, 28, 3);
        this.shape15_4.setRotationPoint(-0.4F, -4.7F, -9.2F);
        this.shape15_4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_4, -0.27314402793711257F, 0.0F, 0.0F);
        this.frontleftleg3 = new ModelRenderer(this, 25, 68);
        this.frontleftleg3.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.frontleftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontleftleg3, -0.17453292519943295F, -0.0F, 0.0F);
        this.backleftleg = new ModelRenderer(this, 46, 45);
        this.backleftleg.setRotationPoint(3.6F, 3.5F, -1.4F);
        this.backleftleg.addBox(0.0F, 0.0F, 0.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(backleftleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backrightfoot = new ModelRenderer(this, 23, 35);
        this.backrightfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.backrightfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(backrightfoot, 0.091106186954104F, -0.017453292519943295F, 0.0F);
        this.backleftfoot = new ModelRenderer(this, 0, 46);
        this.backleftfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.backleftfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(backleftfoot, 0.091106186954104F, -0.017453292519943295F, 0.0F);
        this.tail = new ModelRenderer(this, 32, 0);
        this.tail.setRotationPoint(3.0F, 0.6F, 4.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(tail, 0.22759093446006054F, 0.0F, 0.0F);
        this.backrightleg = new ModelRenderer(this, 34, 35);
        this.backrightleg.setRotationPoint(-0.6F, 3.5F, -1.4F);
        this.backrightleg.addBox(0.0F, 0.0F, 0.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(backrightleg, 0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg2 = new ModelRenderer(this, 63, 63);
        this.frontrightleg2.setRotationPoint(1.6F, 8.5F, 2.0F);
        this.frontrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(frontrightleg2, 0.03490658503988659F, -0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 19);
        this.neck.setRotationPoint(4.0F, 4.5F, 2.0F);
        this.neck.addBox(-3.0F, -3.5F, -5.8F, 6, 8, 6, 0.0F);
        this.setRotateAngle(neck, -0.36425021489121656F, 0.0F, 0.012566370614359173F);
        this.frontleftleg = new ModelRenderer(this, 42, 21);
        this.frontleftleg.setRotationPoint(5.5F, 4.3F, 0.5F);
        this.frontleftleg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 5, 0.0F);
        this.shape15_6 = new ModelRenderer(this, 4, 4);
        this.shape15_6.setRotationPoint(-0.4F, -4.4F, -0.9F);
        this.shape15_6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_6, -0.22759093446006054F, 0.0F, 0.0F);
        this.snouttop = new ModelRenderer(this, 59, 56);
        this.snouttop.setRotationPoint(0.5F, -0.5F, -10.2F);
        this.snouttop.addBox(-2.5F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(snouttop, 0.22759093446006054F, 0.0F, 0.0F);
        this.body2down = new ModelRenderer(this, 0, 33);
        this.body2down.setRotationPoint(0.5F, 9.1F, -0.5F);
        this.body2down.addBox(0.0F, 0.0F, 0.0F, 6, 2, 11, 0.0F);
        this.setRotateAngle(body2down, 0.045553093477052F, 0.0F, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 66, 0);
        this.shape15_2.setRotationPoint(-0.4F, -5.3F, -4.3F);
        this.shape15_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_2, -0.5009094953223726F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 0, 0);
        this.tail3.setRotationPoint(-0.5F, 4.1F, -1.5F);
        this.tail3.addBox(-0.5F, 0.0F, 0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-4.5F, 3.7F, -8.6F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F);
        this.backrightleg2 = new ModelRenderer(this, 64, 17);
        this.backrightleg2.setRotationPoint(1.6F, 8.7F, 2.5F);
        this.backrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(backrightleg2, 0.4553564018453205F, -0.0F, 0.0F);
        this.shape15 = new ModelRenderer(this, 24, 0);
        this.shape15.setRotationPoint(-0.4F, -5.3F, -2.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15, -0.36425021489121656F, 0.0F, 0.0F);
        this.backrightleg3 = new ModelRenderer(this, 69, 0);
        this.backrightleg3.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.backrightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(backrightleg3, -0.4553564018453205F, -0.0F, 0.0F);
        this.frontrightfoot = new ModelRenderer(this, 24, 47);
        this.frontrightfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.frontrightfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(frontrightfoot, 0.17453292519943295F, -0.017453292519943295F, 0.0F);
        this.neck.addChild(this.shape15_1);
        this.neck2.addChild(this.shape15_5);
        this.frontleftleg3.addChild(this.frontleftfoot);
        this.snouttop.addChild(this.snout);
        this.frontleftleg.addChild(this.frontleftleg2);
        this.neck.addChild(this.neck2);
        this.frontrightleg2.addChild(this.frontrightleg3);
        this.snout.addChild(this.snoutdown);
        this.body.addChild(this.frontrightleg);
        this.backleftleg2.addChild(this.backleftleg3);
        this.body.addChild(this.body2);
        this.neck2.addChild(this.head);
        this.neck.addChild(this.shape15_3);
        this.head.addChild(this.leftear);
        this.head.addChild(this.rightear);
        this.tail.addChild(this.tail2);
        this.backleftleg.addChild(this.backleftleg2);
        this.body2.addChild(this.body3);
        this.neck.addChild(this.shape15_4);
        this.frontleftleg2.addChild(this.frontleftleg3);
        this.body3.addChild(this.backleftleg);
        this.backrightleg3.addChild(this.backrightfoot);
        this.backleftleg3.addChild(this.backleftfoot);
        this.body3.addChild(this.tail);
        this.body3.addChild(this.backrightleg);
        this.frontrightleg.addChild(this.frontrightleg2);
        this.body.addChild(this.neck);
        this.body.addChild(this.frontleftleg);
        this.neck2.addChild(this.shape15_6);
        this.head.addChild(this.snouttop);
        this.body2.addChild(this.body2down);
        this.neck.addChild(this.shape15_2);
        this.tail2.addChild(this.tail3);
        this.backrightleg.addChild(this.backrightleg2);
        this.neck.addChild(this.shape15);
        this.backrightleg2.addChild(this.backrightleg3);
        this.frontrightleg3.addChild(this.frontrightfoot);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.body.offsetX, -this.body.offsetY, -this.body.offsetZ);
        GlStateManager.translate(-this.body.rotationPointX * f5, -this.body.rotationPointY * f5, -this.body.rotationPointZ * f5);
        this.body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
