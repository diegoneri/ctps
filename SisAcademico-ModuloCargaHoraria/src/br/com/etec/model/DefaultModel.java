/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;

/**
 *
 * @author dfelix3
 */
public abstract class DefaultModel<K> {

    protected transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    protected final transient VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

    public abstract K getId();

    public abstract void setNullId();
    
    public DefaultModel() {
    }
   
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
