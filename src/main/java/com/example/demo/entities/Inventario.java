package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Inventário")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String users;
    String sectors;
    String hostnames;
    String pcInfos;
    String otherEquips;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsers() {
        return users;
    }
    public void setUsers(String users) {
        this.users = users;
    }
    public String getSectors() {
        return sectors;
    }
    public void setSectors(String sectors) {
        this.sectors = sectors;
    }
    public String getHostnames() {
        return hostnames;
    }
    public void setHostnames(String hostnames) {
        this.hostnames = hostnames;
    }
    public String getPcInfos() {
        return pcInfos;
    }
    public void setPcInfos(String pcInfos) {
        this.pcInfos = pcInfos;
    }
    public String getOtherEquips() {
        return otherEquips;
    }
    public void setOtherEquips(String otherEquips) {
        this.otherEquips = otherEquips;
    }
    public Inventario() {
    }
    public Inventario(Long id, String users, String sectors, String hostnames, String pcInfos, String otherEquips) {
        this.id = id;
        this.users = users;
        this.sectors = sectors;
        this.hostnames = hostnames;
        this.pcInfos = pcInfos;
        this.otherEquips = otherEquips;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((users == null) ? 0 : users.hashCode());
        result = prime * result + ((sectors == null) ? 0 : sectors.hashCode());
        result = prime * result + ((hostnames == null) ? 0 : hostnames.hashCode());
        result = prime * result + ((pcInfos == null) ? 0 : pcInfos.hashCode());
        result = prime * result + ((otherEquips == null) ? 0 : otherEquips.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Inventario other = (Inventario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (users == null) {
            if (other.users != null)
                return false;
        } else if (!users.equals(other.users))
            return false;
        if (sectors == null) {
            if (other.sectors != null)
                return false;
        } else if (!sectors.equals(other.sectors))
            return false;
        if (hostnames == null) {
            if (other.hostnames != null)
                return false;
        } else if (!hostnames.equals(other.hostnames))
            return false;
        if (pcInfos == null) {
            if (other.pcInfos != null)
                return false;
        } else if (!pcInfos.equals(other.pcInfos))
            return false;
        if (otherEquips == null) {
            if (other.otherEquips != null)
                return false;
        } else if (!otherEquips.equals(other.otherEquips))
            return false;
        return true;
    }

    

}
