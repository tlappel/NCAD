package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.units.BUnit;
import javax.baja.util.BNotification;

/**
 * Created by R. Derek Otieno on June 29, 2019.
 */

@NiagaraAction(
        name="displayDynamicSlotValues",
        flags = Flags.SUMMARY
)

@NiagaraAction(
        name="loadDynamicSlots",
        flags = Flags.SUMMARY
)

@NiagaraType
public class BAddingDynamicSlots extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BAddingDynamicSlots(3376838907)1.0$ @*/
    /* Generated Tue Nov 13 14:50:11 EST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "displayDynamicSlotValues"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code displayDynamicSlotValues} action.
     * @see #displayDynamicSlotValues()
     */
    public static final Action displayDynamicSlotValues = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code displayDynamicSlotValues} action.
     * @see #displayDynamicSlotValues
     */
    public void displayDynamicSlotValues() { invoke(displayDynamicSlotValues, null, null); }

////////////////////////////////////////////////////////////////
// Action "loadDynamicSlots"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code loadDynamicSlots} action.
     * @see #loadDynamicSlots()
     */
    public static final Action loadDynamicSlots = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code loadDynamicSlots} action.
     * @see #loadDynamicSlots
     */
    public void loadDynamicSlots() { invoke(loadDynamicSlots, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BAddingDynamicSlots.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doDisplayDynamicSlotValues()
    {
        System.out.println("Values of dynamic property slots including wsAnnotation Property slot: ");
        displayList();
    }

    public void doLoadDynamicSlots()
    {
        try
        {
            System.out.println("\n\n=======unnamed dynamic slot with different BValues===================");
            //Unnamed dynamic property slot on the current component
            Property propName = add(null, BString.make("Value of an unamed dynamic Property slot"),Flags.SUMMARY);
            //How do I access the value of the unnamed dynamic property slot?
            BValue valueOfUnnamesPropertSlot = get(propName);
            //Display the value of the unnamed dynamic propery slot
            System.out.println("unnamed dynamic property of type BString: " + valueOfUnnamesPropertSlot);
            //Unnamed dynamic property slot on the current component
            propName = add(null, BInteger.make(12345),Flags.SUMMARY);
            //How do I access the value of the unnamed dynamic property slot?
            valueOfUnnamesPropertSlot = get(propName);
            //Display the value of the unnamed dynamic propery slot
            System.out.println("unnamed dynamic property of type BInteger: " + valueOfUnnamesPropertSlot);
            //Unnamed dynamic property slot on the current component
            propName = add(null, BDouble.make(5432.77),Flags.SUMMARY);
            //How do I access the value of the unnamed dynamic property slot?
            valueOfUnnamesPropertSlot = get(propName);
            //Display the value of the unnamed dynamic propery slot
            System.out.println("unnamed dynamic property of type BDouble: " + valueOfUnnamesPropertSlot);
            add("concreteName", BDouble.make(8787.55),Flags.SUMMARY);
            add("newSlot?", new BComponentWithBStructProperties(),Flags.SUMMARY);
            add("newSlot?", new BNestedBStructPropertyComponent(),Flags.SUMMARY);
            add("newSlot?",BBoolean.make(true),Flags.SUMMARY);
            add("newSlot?",BBoolean.make(false),Flags.SUMMARY);
            BFacets unitFacets = BFacets.makeNumeric(BUnit.getUnit("fahrenheit"), 2);
            add("newSlot?",BDouble.make(66),Flags.SUMMARY, unitFacets);
            unitFacets = BFacets.makeNumeric(BUnit.getUnit("celsius"), 2);
            add("newSlot?",BInteger.make(40),Flags.SUMMARY, unitFacets);
            add("newSlot?",BString.make("String slot"),Flags.SUMMARY);
        }
        catch(DuplicateSlotException dse)
        {
            System.out.println("Cannot create slot with same name. " + dse.getLocalizedMessage());
        }
        catch(OutOfMemoryError oome)
        {
            System.out.println("Cannot add another slot - out of memory" + oome.getLocalizedMessage());
        }
        System.out.println("\n\nloadDynamics finished: \n\n");
        return;
    }

    public void displayList()
    {
        Property [] props = getPropertiesArray();
        System.out.println("\n\n==============================================");
        for (Property prop : props)
        {
            System.out.println(get(prop));
        }

        //Subtract 1 to exclude the slot, which contains the location of the component, i.e. 47,11,13
        System.out.println("Total number of dynamic property slots added excluding wsAnnotation slot: " + (props.length-1));
        System.out.println("==============================================");
    }
}