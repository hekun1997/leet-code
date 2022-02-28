package org.example.object;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Queue<T> {
    private int queryCount = 0;
    private Map<String, Object> map = new HashMap<>();
    public String key;
    public void  processEvent(Event event){
        queryCount ++;
    }
    public void output(){
        String query = (String) this.getKeyValue().get(key);
        //do something.
    }

    public Map<String, Object> getKeyValue(){
        return map;
    }
}
