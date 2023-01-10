package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;


/**
 * Created by R. Derek Otieno on June 30, 2019.
 * BComponentWithJavaPrimitives
 * -boolean
 * -byte
 * -char
 * -short
 *
 * incovertible types: cannot cast javax.baja.sys.BValue to:XX
 * short
 * char
 * byte
 *
 * -int
 * -long
 * -float
 * -double
 *
 * How do the primitive values behaive when values, which exceed their limits are assigned?
 */

@NiagaraType

@NiagaraProperty
        (
                name="enrolled",
                type="boolean",
                flags= Flags.SUMMARY,
                defaultValue="false"
        )

@NiagaraProperty
        (
                name="intValues",
                type="int",
                flags= Flags.SUMMARY,
                defaultValue="12345"
        )

@NiagaraProperty
        (
                name="longValues",
                type="long",
                flags= Flags.SUMMARY,
                defaultValue="54321L"
        )

@NiagaraProperty
        (
                name="floatValues",
                type="float",
                flags= Flags.SUMMARY,
                defaultValue="123.0f"
        )

@NiagaraProperty
        (
                name="doubleValues",
                type="double",
                flags= Flags.SUMMARY,
                defaultValue="321.0"
        )

@NiagaraAction
        (
                name="displayAssignedValues",
                flags= Flags.SUMMARY
        )

@NiagaraAction
        (
                name="assignNewValues",
                flags= Flags.SUMMARY
        )

public class BComponentWithJavaPrimitives extends BComponent {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.tridiumuniversity.devTrafficLights.BComponentWithJavaPrimitives(729208275)1.0$ @*/
/* Generated Thu Dec 22 17:43:00 CST 2022 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "enrolled"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code enrolled} property.
   * @see #getEnrolled
   * @see #setEnrolled
   */
  public static final Property enrolled = newProperty(Flags.SUMMARY, false, null);
  
  /**
   * Get the {@code enrolled} property.
   * @see #enrolled
   */
  public boolean getEnrolled() { return getBoolean(enrolled); }
  
  /**
   * Set the {@code enrolled} property.
   * @see #enrolled
   */
  public void setEnrolled(boolean v) { setBoolean(enrolled, v, null); }

////////////////////////////////////////////////////////////////
// Property "intValues"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code intValues} property.
   * @see #getIntValues
   * @see #setIntValues
   */
  public static final Property intValues = newProperty(Flags.SUMMARY, 12345, null);
  
  /**
   * Get the {@code intValues} property.
   * @see #intValues
   */
  public int getIntValues() { return getInt(intValues); }
  
  /**
   * Set the {@code intValues} property.
   * @see #intValues
   */
  public void setIntValues(int v) { setInt(intValues, v, null); }

////////////////////////////////////////////////////////////////
// Property "longValues"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code longValues} property.
   * @see #getLongValues
   * @see #setLongValues
   */
  public static final Property longValues = newProperty(Flags.SUMMARY, 54321L, null);
  
  /**
   * Get the {@code longValues} property.
   * @see #longValues
   */
  public long getLongValues() { return getLong(longValues); }
  
  /**
   * Set the {@code longValues} property.
   * @see #longValues
   */
  public void setLongValues(long v) { setLong(longValues, v, null); }

////////////////////////////////////////////////////////////////
// Property "floatValues"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code floatValues} property.
   * @see #getFloatValues
   * @see #setFloatValues
   */
  public static final Property floatValues = newProperty(Flags.SUMMARY, 123.0f, null);
  
  /**
   * Get the {@code floatValues} property.
   * @see #floatValues
   */
  public float getFloatValues() { return getFloat(floatValues); }
  
  /**
   * Set the {@code floatValues} property.
   * @see #floatValues
   */
  public void setFloatValues(float v) { setFloat(floatValues, v, null); }

////////////////////////////////////////////////////////////////
// Property "doubleValues"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code doubleValues} property.
   * @see #getDoubleValues
   * @see #setDoubleValues
   */
  public static final Property doubleValues = newProperty(Flags.SUMMARY, 321.0, null);
  
  /**
   * Get the {@code doubleValues} property.
   * @see #doubleValues
   */
  public double getDoubleValues() { return getDouble(doubleValues); }
  
  /**
   * Set the {@code doubleValues} property.
   * @see #doubleValues
   */
  public void setDoubleValues(double v) { setDouble(doubleValues, v, null); }

////////////////////////////////////////////////////////////////
// Action "displayAssignedValues"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code displayAssignedValues} action.
   * @see #displayAssignedValues()
   */
  public static final Action displayAssignedValues = newAction(Flags.SUMMARY, null);
  
  /**
   * Invoke the {@code displayAssignedValues} action.
   * @see #displayAssignedValues
   */
  public void displayAssignedValues() { invoke(displayAssignedValues, null, null); }

////////////////////////////////////////////////////////////////
// Action "assignNewValues"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code assignNewValues} action.
   * @see #assignNewValues()
   */
  public static final Action assignNewValues = newAction(Flags.SUMMARY, null);
  
  /**
   * Invoke the {@code assignNewValues} action.
   * @see #assignNewValues
   */
  public void assignNewValues() { invoke(assignNewValues, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BComponentWithJavaPrimitives.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    public void doDisplayAssignedValues()
    {
        System.out.println("\n\n================= " + BAbsTime.now() + " ================");
        System.out.println("enrolled (boolean): " + getEnrolled());
        System.out.println("intValues (int): " + getIntValues());
        System.out.println("longValues (long): " + getLongValues());
        System.out.println("floatValues (float): " + getFloatValues());
        System.out.println("doubleValues (double): " + getDoubleValues());
        System.out.println("=============================================");
    }

    public void doAssignNewValues()
    {
        setEnrolled(true);
        setIntValues(Integer.MAX_VALUE);
        setLongValues(Long.MAX_VALUE);
        setFloatValues(Float.MAX_VALUE);
        setDoubleValues(Double.MAX_VALUE);

        System.out.println("==================maximum values===========================");
        System.out.println("enrolled (boolean): " + getEnrolled());
        System.out.println("intValues (MAX VALUE): " + getIntValues());
        setIntValues( getIntValues() + 1);
        System.out.println("intValues (MAX VALUE) + 1: " + getIntValues() );

        System.out.println("longValues (MAX VALUE): " + getLongValues());
        setLongValues(getLongValues() + 1);
        System.out.println("longValues (MAX VALUE + 1): " + getLongValues());

        System.out.println("floatValues (MAX VALUE): " + getFloatValues());

        setFloatValues(getFloatValues() * 10);
        System.out.println("floatValues (MAX VALUE * 10): " + getFloatValues());

        System.out.println("doubleValues (MAX VALUE): " + getDoubleValues());
        setDoubleValues(getDoubleValues() * 10);
        System.out.println("doubleValues (MAX VALUE * 10): " + getDoubleValues());
        System.out.println("==================Observe themaximum values displayed=============");
    }
}