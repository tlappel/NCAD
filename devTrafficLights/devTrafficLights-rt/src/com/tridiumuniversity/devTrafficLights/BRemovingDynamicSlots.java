package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 29, 2019.
 */

@NiagaraAction(
        name="addSlot",
        flags = Flags.SUMMARY
)

@NiagaraAction(
        name="removeSlot",
        flags = Flags.SUMMARY
)

@NiagaraAction(
        name="removeAllSlots",
        flags = Flags.SUMMARY
)

@NiagaraType

public class BRemovingDynamicSlots extends BComponent {
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BRemovingDynamicSlots(2101941263)1.0$ @*/
    /* Generated Tue Nov 13 15:33:51 EST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "addSlot"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code addSlot} action.
     * @see #addSlot()
     */
    public static final Action addSlot = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code addSlot} action.
     * @see #addSlot
     */
    public void addSlot() { invoke(addSlot, null, null); }

////////////////////////////////////////////////////////////////
// Action "removeSlot"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code removeSlot} action.
     * @see #removeSlot()
     */
    public static final Action removeSlot = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code removeSlot} action.
     * @see #removeSlot
     */
    public void removeSlot() { invoke(removeSlot, null, null); }

////////////////////////////////////////////////////////////////
// Action "removeAllSlots"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code removeAllSlots} action.
     * @see #removeAllSlots()
     */
    public static final Action removeAllSlots = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code removeAllSlots} action.
     * @see #removeAllSlots
     */
    public void removeAllSlots() { invoke(removeAllSlots, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BRemovingDynamicSlots.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doAddSlot()
    {
        //remove existing dynamic properties and create 5 new ones.
        Property[] props = getDynamicPropertiesArray();
        for (Property prop : props)
            remove(prop);

        //Add 5 new dynamic slots. Just as an example
        for (int k = 0; k < 5; k++)
        {
            doAddNewNumber();
        }
    }

    public void doRemoveSlot()
    {
        Property[] props = getDynamicPropertiesArray();
        if (props.length > 0)
        {
            doRemoveSlot(props[0]);   //Remove the first slot
        }
        else
        {
            throw new BajaRuntimeException("There are no more dynamic Slots");
        }
    }

    public void doRemoveSlot(Property propName)
    {
        //Demonstrate getting relevant information from the dynamic slot.
        int propValue = 0;
        int product = 10;
        System.out.println("\n\n===================================");
        System.out.println("Relevant information from our dynamic slot being removed");
        System.out.println("propName.getDefaultValue(): "+propName.getDefaultValue());
        System.out.println("product: " + product);
        System.out.println("propName.toString(): "+propName.toString());
        System.out.println("propName.getName(): "+propName.getName());
        System.out.println("propName.getType(): "+propName.getType());

        propValue = BInteger.make(propName.getDefaultValue().toString()).getInt();
        product = 10 * propValue;
        System.out.println("product-> 10 * propValue: " + product);
        System.out.println("===================================");

        try
        {
            this.remove(propName);
        }
        catch(Exception e)//check for exception if slot doesn't exist
        {
            throw new BajaRuntimeException("Slot does not exist: " + propName);
        }
    }

    public void doRemoveAllSlots()
    {
        this.removeAll();
    }

    public void doAddNewNumber()
    {
        try
        {
            add("example?",
                    nextRandomNumber(), Flags.SUMMARY | Flags.READONLY| Flags.TRANSIENT);
        }
        catch(DuplicateSlotException dse)
        {
            System.out.println("Cannot create slot with same name. " + dse.getLocalizedMessage());
        }
        catch(OutOfMemoryError oome)
        {
            System.out.println("Cannot add another slot - out of memory" + oome.getLocalizedMessage());
        }
    }

    public BInteger nextRandomNumber(){
        int newNumber = (int)(Math.random() * 100) + 1;

        BInteger nextNum = BInteger.make(newNumber);
        return nextNum;
    }

    public void removed(Property prop, BValue val, Context cx)
    {
        System.out.println("property named: " + prop.getName() + " with a value of: " + get(prop) +
                " has been removed from your component");
    }

    /**
     * prompt the user that they are about to remove a property. Throw LocalizableRuntimeException to cancel.
     * @param prop
     * @param cx
     */

    public final void checkRemove(Property prop, Context cx)
    {
        if (!isRunning()) return;

        System.out.println("You are about to remove property slot named: " + prop.getName() +
                " whose value is " + get(prop));
        return;
    }
}