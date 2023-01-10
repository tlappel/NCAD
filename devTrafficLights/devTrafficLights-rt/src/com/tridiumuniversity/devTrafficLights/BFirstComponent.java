package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.*;
import javax.baja.sys.*;
@NiagaraType

@NiagaraProperty
        (
                name="timeExecuted",
                type="BAbsTime",
                flags= Flags.READONLY | Flags.SUMMARY,
                defaultValue="BAbsTime.now()")
@NiagaraProperty
        (
                name="alarmType",
                type="String",
                flags=Flags.SUMMARY | Flags.READONLY,
                defaultValue = "Heating Coil: BFirstComponent Default value"
        )

@NiagaraAction
        (
                name="execute",
                flags=Flags.SUMMARY
        )
public class BFirstComponent extends BComponent {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BFirstComponent(1053484680)1.0$ @*/
/* Generated Fri Dec 23 11:03:41 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "timeExecuted"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code timeExecuted} property.
   * @see #getTimeExecuted
   * @see #setTimeExecuted
   */
  public static final Property timeExecuted = newProperty(Flags.READONLY | Flags.SUMMARY, BAbsTime.now(), null);
  
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
  public static final Property alarmType = newProperty(Flags.SUMMARY | Flags.READONLY, "Heating Coil: BFirstComponent Default value", null);
  
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
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFirstComponent.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doExecute()
    {
        System.out.println("Alarm Type: " + getAlarmType());
        setTimeExecuted(BAbsTime.now());
        System.out.println("Updated timeExecuted NOW: " + getTimeExecuted());
    }
}