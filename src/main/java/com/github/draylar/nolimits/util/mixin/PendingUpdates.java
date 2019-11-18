package com.github.draylar.nolimits.util.mixin;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public class PendingUpdates extends Long2ByteOpenHashMap {

    private int expectedTotalSize;

    public PendingUpdates(int expectedTotalSize) {
        super(expectedTotalSize, 0.5f);
        this.expectedTotalSize = expectedTotalSize;
    }

    @Override
    protected void rehash(int newN) {
        if (newN > expectedTotalSize) {
            super.rehash(newN);
        }
    }
}
