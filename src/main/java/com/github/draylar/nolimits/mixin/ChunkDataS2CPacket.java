package com.github.draylar.nolimits.mixin;

import net.minecraft.util.PacketByteBuf;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(net.minecraft.client.network.packet.ChunkDataS2CPacket.class)
public abstract class ChunkDataS2CPacket {

    @Shadow public abstract boolean isFullChunk();

    public int writeData(PacketByteBuf packetByteBuf, WorldChunk chunk, int includedSectionsMask) {
        int i = 0;
        ChunkSection[] chunkSections = chunk.getSectionArray();
        int j = 0;

        for(int k = chunkSections.length; j < k; ++j) {
            ChunkSection chunkSection = chunkSections[j];
            if (chunkSection != WorldChunk.EMPTY_SECTION && (!this.isFullChunk() || !chunkSection.isEmpty())) {
                i |= 1 << j;
                chunkSection.toPacket(packetByteBuf);
            }
        }

        return i;
    }

    public int getDataSize(WorldChunk chunk, int includedSectionsMark) {
        int i = 0;
        ChunkSection[] chunkSections = chunk.getSectionArray();
        int j = 0;

        for(int k = chunkSections.length; j < k; ++j) {
            ChunkSection chunkSection = chunkSections[j];
            if (chunkSection != WorldChunk.EMPTY_SECTION && (!this.isFullChunk() || !chunkSection.isEmpty())) {
                i += chunkSection.getPacketSize();
            }
        }

        return i;
    }
}
