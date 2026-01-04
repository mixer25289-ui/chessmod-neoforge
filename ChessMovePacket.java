
package com.example.chessmod.network;

import net.minecraft.network.FriendlyByteBuf;

public record ChessMovePacket(int fx,int fy,int tx,int ty) {
    public static ChessMovePacket decode(FriendlyByteBuf buf){
        return new ChessMovePacket(buf.readInt(),buf.readInt(),buf.readInt(),buf.readInt());
    }
    public void encode(FriendlyByteBuf buf){
        buf.writeInt(fx);buf.writeInt(fy);buf.writeInt(tx);buf.writeInt(ty);
    }
}
