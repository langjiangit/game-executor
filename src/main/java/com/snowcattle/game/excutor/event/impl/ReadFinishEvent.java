package com.snowcattle.game.excutor.event.impl;

import com.snowcattle.game.excutor.event.CycleEvent;
import com.snowcattle.game.excutor.event.EventParam;
import com.snowcattle.game.excutor.event.EventType;

/**
 * Created by jiangwenping on 17/1/16.
 */
public class ReadFinishEvent extends CycleEvent {

    public ReadFinishEvent(EventType eventType,long eventId, EventParam... parms){
        super(eventType, eventId, parms);
    }

    public void call() {

    }
}