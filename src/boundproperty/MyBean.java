/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author thana
 */
public class MyBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "Footballscore";
    
    private String Footballscore;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getvalue() {
        return Footballscore;
    }
    
    public void setFootballScore(String value) {
        String oldValue = Footballscore;
        this.Footballscore = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, Footballscore);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
