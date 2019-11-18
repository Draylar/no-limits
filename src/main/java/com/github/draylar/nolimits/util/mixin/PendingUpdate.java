package com.github.draylar.nolimits.util.mixin;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class PendingUpdate extends LongLinkedOpenHashSet {

    private int expectedLevelSize;

    public PendingUpdate(int expected) {
        super(expected, 0.5f);
        this.expectedLevelSize = expected;
    }

    @Override
    protected void rehash(int newN) {
        if (newN > expectedLevelSize) {
            super.rehash(newN);
        }
    }
}
