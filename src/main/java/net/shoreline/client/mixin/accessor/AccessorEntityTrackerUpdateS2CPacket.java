package net.shoreline.client.mixin.accessor;

import net.minecraft.entity.data.DataTracker;
import net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(EntityTrackerUpdateS2CPacket.class)
public interface AccessorEntityTrackerUpdateS2CPacket
{
    @Accessor("trackedValues")
    @Mutable
    void hookSetTrackedValues(List<DataTracker.SerializedEntry<?>> trackedValues);
}
