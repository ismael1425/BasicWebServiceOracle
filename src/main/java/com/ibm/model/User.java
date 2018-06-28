
package com.ibm.model;

/**
 *
 * @author MayoIsmaelDiazCandel
 */
public class User {
    private int id;
    private String name;
    private String registered;

    public User() {
    }

    public User(String name, String registered) {
        this.name = name;
        this.registered = registered;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", registered=" + registered + '}';
    }
    
    
}
