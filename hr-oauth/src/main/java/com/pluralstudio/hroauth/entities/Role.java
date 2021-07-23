package com.pluralstudio.hroauth.entities;


import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {


    private Long id;
    private String roleName;

    public Role(){

    }

    public Role(Long id,String roleName){
        super();
        this.id=id;
        this.roleName=roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName);
    }
}
