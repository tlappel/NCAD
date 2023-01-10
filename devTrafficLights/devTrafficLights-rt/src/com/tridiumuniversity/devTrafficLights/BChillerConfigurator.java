package com.tridiumuniversity.devTrafficLights;

import javax.baja.agent.BIAgent;
import javax.baja.nre.annotations.AgentOn;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BObject;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by R. Derek Otieno on October 29, 2021
 */

@NiagaraType (
        agent = @AgentOn(
                types = {"devTrafficLights:BGenericAHU", "devTrafficLights:BFirstComponent", "bajaui:Widget", "baja:Value"}
        )
)

public class BChillerConfigurator extends BObject implements BIAgent {

    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BChillerConfigurator(3541226757)1.0$ @*/
    /* Generated Wed Nov 07 16:47:49 EST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BChillerConfigurator.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}

