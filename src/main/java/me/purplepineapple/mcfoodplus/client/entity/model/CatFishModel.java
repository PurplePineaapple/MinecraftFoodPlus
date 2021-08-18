package me.purplepineapple.mcfoodplus.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.purplepineapple.mcfoodplus.common.entities.CatFishEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CatFishModel<T extends CatFishEntity> extends EntityModel<T> {
    private final ModelRenderer body_front;
    private final ModelRenderer body_back;
    private final ModelRenderer head;
    private final ModelRenderer tail;
    private final ModelRenderer whisker_front_left;
    private final ModelRenderer whisker_front_right;
    private final ModelRenderer whisker_bottom_right;
    private final ModelRenderer whisker_bottom_left;
    private final ModelRenderer front_right_fin;
    private final ModelRenderer front_left_fin;
    private final ModelRenderer top_fin;
    private final ModelRenderer back_right_fin;
    private final ModelRenderer back_right_fin_r1;
    private final ModelRenderer back_left_fin;
    private final ModelRenderer back_left_fin_r1;

    public CatFishModel() {
        texWidth = 32;
        texHeight = 32;

        body_front = new ModelRenderer(this);
        body_front.setPos(0.0F, 18.0F, -4.0F);
        body_front.texOffs(0, 0).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);

        body_back = new ModelRenderer(this);
        body_back.setPos(0.0F, 18.0F, 4.0F);
        body_back.texOffs(0, 12).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 18.0F, -4.0F);
        head.texOffs(15, 17).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 18.0F, 12.0F);
        tail.texOffs(0, 0).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        tail.texOffs(6, 3).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        tail.texOffs(13, 13).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

        whisker_front_left = new ModelRenderer(this);
        whisker_front_left.setPos(1.0F, 19.5F, -6.5F);
        setRotationAngle(whisker_front_left, 0.0F, 0.0F, -0.4363F);
        whisker_front_left.texOffs(6, 6).addBox(1.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        whisker_front_right = new ModelRenderer(this);
        whisker_front_right.setPos(-1.0F, 19.5F, -6.5F);
        setRotationAngle(whisker_front_right, 0.0F, 0.0F, 0.4363F);
        whisker_front_right.texOffs(6, 0).addBox(-1.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        whisker_bottom_right = new ModelRenderer(this);
        whisker_bottom_right.setPos(-1.0F, 20.0F, -5.5F);
        whisker_bottom_right.texOffs(17, 13).addBox(-1.0F, -1.0F, 0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

        whisker_bottom_left = new ModelRenderer(this);
        whisker_bottom_left.setPos(1.0F, 20.0F, -5.5F);
        whisker_bottom_left.texOffs(15, 13).addBox(1.0F, -1.0F, 0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

        front_right_fin = new ModelRenderer(this);
        front_right_fin.setPos(-2.0F, 18.0F, -1.5F);
        setRotationAngle(front_right_fin, 0.0F, -0.3491F, 0.0F);
        front_right_fin.texOffs(0, 3).addBox(-1.1888F, 0.0F, -0.3415F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        front_left_fin = new ModelRenderer(this);
        front_left_fin.setPos(2.0F, 18.0F, -1.5F);
        setRotationAngle(front_left_fin, 0.0F, 0.3491F, 0.0F);
        front_left_fin.texOffs(0, 1).addBox(1.1888F, 0.0F, -0.3415F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        top_fin = new ModelRenderer(this);
        top_fin.setPos(0.0F, 15.0F, 0.0F);
        top_fin.texOffs(0, 0).addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        top_fin.texOffs(2, 14).addBox(0.0F, -1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        top_fin.texOffs(0, 14).addBox(0.0F, -1.0F, 1.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        top_fin.texOffs(2, 11).addBox(0.0F, -2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        top_fin.texOffs(0, 11).addBox(0.0F, -2.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);

        back_right_fin = new ModelRenderer(this);
        back_right_fin.setPos(-2.0F, 20.5F, 7.5F);
        setRotationAngle(back_right_fin, 0.0F, 0.0F, 0.9599F);


        back_right_fin_r1 = new ModelRenderer(this);
        back_right_fin_r1.setPos(-0.9063F, -0.5774F, 0.0F);
        back_right_fin.addChild(back_right_fin_r1);
        setRotationAngle(back_right_fin_r1, 0.0F, 0.0F, -0.4363F);
        back_right_fin_r1.texOffs(13, 10).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        back_left_fin = new ModelRenderer(this);
        back_left_fin.setPos(2.0F, 20.5F, 7.5F);
        setRotationAngle(back_left_fin, 0.0F, 0.0F, -0.9599F);


        back_left_fin_r1 = new ModelRenderer(this);
        back_left_fin_r1.setPos(0.9063F, -0.5774F, 0.0F);
        back_left_fin.addChild(back_left_fin_r1);
        setRotationAngle(back_left_fin_r1, 0.0F, 0.0F, 0.4363F);
        back_left_fin_r1.texOffs(13, 9).addBox(0.0F, -0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(CatFishEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body_front.render(matrixStack, buffer, packedLight, packedOverlay);
        body_back.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
        whisker_front_left.render(matrixStack, buffer, packedLight, packedOverlay);
        whisker_front_right.render(matrixStack, buffer, packedLight, packedOverlay);
        whisker_bottom_right.render(matrixStack, buffer, packedLight, packedOverlay);
        whisker_bottom_left.render(matrixStack, buffer, packedLight, packedOverlay);
        front_right_fin.render(matrixStack, buffer, packedLight, packedOverlay);
        front_left_fin.render(matrixStack, buffer, packedLight, packedOverlay);
        top_fin.render(matrixStack, buffer, packedLight, packedOverlay);
        back_right_fin.render(matrixStack, buffer, packedLight, packedOverlay);
        back_left_fin.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }


}
