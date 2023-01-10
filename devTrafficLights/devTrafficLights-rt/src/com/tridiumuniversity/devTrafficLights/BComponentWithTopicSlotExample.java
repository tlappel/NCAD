package com.tridiumuniversity.devTrafficLights;
import javax.baja.nre.annotations.*;
import javax.baja.sys.*;
import javax.baja.timezone.BTimeZone;

/**
 * Created by R. Derek Otieno on June 29, 2019.
 */

@NiagaraType

@NiagaraProperty
        (
                name="timeExecuted",
                type="BAbsTime",
                flags= Flags.READONLY | Flags.SUMMARY,
                //Any facets that the property may have.  The facet annotation works as a name-value pair.
                facets =
                        {
                                @Facet(name = "BFacets.SHOW_SECONDS", value = "BBoolean.TRUE"),
                                @Facet(name = "BFacets.TIME_ZONE", value = "BTimeZone.UTC")
                        },
                defaultValue="BAbsTime.DEFAULT"
        )

@NiagaraProperty
        (
                name="alarmType",
                type="String",
                flags=0,
                facets =
                        {
                                @Facet(name = "BFacets.FIELD_EDITOR", value = "BString.make(\"alarm:AlarmClassFE\")" )
                        },
                defaultValue = ""
        )

@NiagaraAction
        (
                name="execute",
                flags= Flags.SUMMARY
        )

@NiagaraTopic
        (
                name="statusTopic",
                eventType = "BDouble",
                flags= Flags.SUMMARY
        )

public class BComponentWithTopicSlotExample extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BComponentWithTopicSlotExample(3480027539)1.0$ @*/
    /* Generated Tue Nov 27 12:28:06 EST 2019 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "timeExecuted"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code timeExecuted} property.
     * @see #getTimeExecuted
     * @see #setTimeExecuted
     */
    public static final Property timeExecuted =
            newProperty(Flags.READONLY | Flags.SUMMARY, BAbsTime.DEFAULT,
                    BFacets.make(BFacets.make(BFacets.SHOW_SECONDS, BBoolean.TRUE),
                            BFacets.make(BFacets.TIME_ZONE, BTimeZone.UTC)));

    /**
     * Get the {@code timeExecuted} property.
     * @see #timeExecuted
     */
    public BAbsTime getTimeExecuted() { return (BAbsTime)get(timeExecuted); }

    /**
     * Set the {@code timeExecuted} property.
     * @see #timeExecuted
     */
    public void setTimeExecuted(BAbsTime v) { set(timeExecuted, v, null); }

////////////////////////////////////////////////////////////////
// Property "alarmType"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code alarmType} property.
     * @see #getAlarmType
     * @see #setAlarmType
     */
    public static final Property alarmType = newProperty(0, "",
            BFacets.make(BFacets.FIELD_EDITOR,
                    BString.make("alarm:AlarmClassFE")));

    /**
     * Get the {@code alarmType} property.
     * @see #alarmType
     */
    public String getAlarmType() { return getString(alarmType); }

    /**
     * Set the {@code alarmType} property.
     * @see #alarmType
     */
    public void setAlarmType(String v) { setString(alarmType, v, null); }

////////////////////////////////////////////////////////////////
// Action "execute"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code execute} action.
     * @see #execute()
     */
    public static final Action execute = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code execute} action.
     * @see #execute
     */
    public void execute() { invoke(execute, null, null); }

////////////////////////////////////////////////////////////////
// Topic "statusTopic"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code statusTopic} topic.
     * @see #fireStatusTopic
     */

    public static final Topic statusTopic = newTopic(Flags.SUMMARY, null);

    /**
     * Fire an event for the {@code statusTopic} topic.
     * @see #statusTopic
     */
    public void fireStatusTopic(BDouble event) { fire(statusTopic, event, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BComponentWithTopicSlotExample.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    public void doExecute()
    {
        BAbsTime myTime = BAbsTime.now();
        System.out.println("Alarm Type: " + getAlarmType());
        System.out.println("Current time from myTime.toString(): " + myTime.toString());
        fireStatusTopic(BDouble.make(myTime.getMillis()));
        setTimeExecuted(BAbsTime.now());
        System.out.println("Updated timeExecuted NOW: " + getTimeExecuted());
    }

    @Override
    public void started() throws Exception
    {
        Sys.getStation().linkTo(this, statusTopic, BStation.save);
    }
}