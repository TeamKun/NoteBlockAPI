package com.xxmicloxx.NoteBlockAPI.event;

import com.xxmicloxx.NoteBlockAPI.songplayer.SongPlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SongNextEvent extends Event
{

    private static final HandlerList handlers = new HandlerList();
    private final SongPlayer song;

    public SongNextEvent(SongPlayer song)
    {
        this.song = song;
    }

    public static HandlerList getHandlerList()
    {
        return handlers;
    }

    /**
     * Returns SongPlayer which is going to play next song in playlist
     *
     * @return SongPlayer
     */
    public SongPlayer getSongPlayer()
    {
        return song;
    }

    public HandlerList getHandlers()
    {
        return handlers;
    }

}
