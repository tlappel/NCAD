package com.tridiumuniversity.devTrafficLights;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * Created by R. Derek Otieno on June 28, 2019.
 */

@NiagaraType

@NiagaraAction
        (
                name="renamePropertySlot",
                flags = Flags.SUMMARY
        )

public class BRenamingDynamicSlots extends BComponent
{
    /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
    /*@ $com.tridiumuniversity.devTrafficLights.BRenamingDynamicSlots(594475159)1.0$ @*/
    /* Generated Wed Nov 28 14:07:39 EST 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Action "renamePropertySlot"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code renamePropertySlot} action.
     * @see #renamePropertySlot()
     */
    public static final Action renamePropertySlot = newAction(Flags.SUMMARY, null);

    /**
     * Invoke the {@code renamePropertySlot} action.
     * @see #renamePropertySlot
     */
    public void renamePropertySlot() { invoke(renamePropertySlot, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BRenamingDynamicSlots.class);

    /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    public void doRenamePropertySlot()
    {
        //Invoke startOver() to dynamically create 5 slots.
        startOver();
        System.out.println("\n\n===============================");
        System.out.println("Original property slot names");
        displaySlots();

        Property[] props = getDynamicPropertiesArray(); //should get all existing dynamic properties
        displaySlots(props);
        for (int k = 0; k < props.length-1; k++)    //Exclude wsAnnotation slot
        {
            rename(props[k], "renamed_" + k);
        }

        System.out.println("\n=============================");
        System.out.println("Renamed property slots");
        displaySlots(props);
        System.out.println("=============================");
    }
    public void displaySlots(Property props [])
    {
        for (Property prop : props)
        {
            System.out.println(prop.getName() + " ==> " + get(prop));
        }
    }

    public void displaySlots()
    {
        Property[] props = getDynamicPropertiesArray(); //should get all existing dynamic properties
        for (Property prop : props)
        {
            System.out.println(get(prop));
        }
    }

    public void startOver()
    {
        Property[] props = getDynamicPropertiesArray();
        for (Property prop : props)
            remove(prop);

        for (int k = 0; k < 5; k++)
        {
            addNumber();
        }
    }

    public void addNumber()
    {
        try
        {
            add("NewNumber?",
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
    public void renamed(Property property, String oldName, Context cx)
    {
        //check if our property being renamed is a BComponent
        if( property.getType().is(BComponent.TYPE))
        {
            System.out.println("You have renamed a Component named: " + property.getName() + " with a value of: " +
                    get(property));
        }

        System.out.println("property named: " + property.getName() + " with a value of: " + get(property) +
                " has been renamed from your component");
    }

    /**
     * prompt the user that they are about to rename a property. Throw LocalizableRuntimeException to cancel.
     * @param prop
     * @param cx
     */

    public final void checkRename(Property prop, String name, Context cx)
    {
        if (!isRunning()) return;

        System.out.println("You are about to rename property slot named: " + prop.getName() +
                " whose value is " + get(prop) + " to a new name: " + name);

        return;
    }
}