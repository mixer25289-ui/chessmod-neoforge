
package com.example.chessmod.client;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import com.mojang.blaze3d.systems.RenderSystem;

public class ChessScreen extends Screen {
    public ChessScreen() { super(Component.literal("Chess Board")); }

    @Override
    public void render(net.minecraft.client.gui.GuiGraphics g, int mx, int my, float pt) {
        this.renderBackground(g);
        g.drawString(this.font, "Chess vs AI", this.width/2-30, 10, 0xFFFFFF);
        super.render(g,mx,my,pt);
    }
}
