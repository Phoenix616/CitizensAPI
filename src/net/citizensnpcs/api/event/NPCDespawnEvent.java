package net.citizensnpcs.api.event;

import org.bukkit.event.HandlerList;

import net.citizensnpcs.api.npc.NPC;

/**
 * Called when an NPC despawns
 */
public class NPCDespawnEvent extends NPCEvent {
    private static final long serialVersionUID = -6104193791185001957L;
    private static final HandlerList handlers = new HandlerList();

    public NPCDespawnEvent(NPC npc) {
        super("NPCDespawnEvent", npc);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}