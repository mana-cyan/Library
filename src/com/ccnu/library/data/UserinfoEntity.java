package com.ccnu.library.data;

import javax.persistence.*;

/**
 * Created by ikaros on 2016/6/24.
 */
@Entity
@Table(name = "userinfo", schema = "", catalog = "librarydatabase")
public class UserinfoEntity {
    private int id;
    private String username;
    private String password;
    private String rented;
    private int admin;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Username", nullable = false, insertable = true, updatable = true, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Password", nullable = false, insertable = true, updatable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Rented", nullable = true, insertable = true, updatable = true, length = 30)
    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }

    @Basic
    @Column(name = "Admin", nullable = false, insertable = true, updatable = true)
    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserinfoEntity that = (UserinfoEntity) o;

        if (admin != that.admin) return false;
        if (id != that.id) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (rented != null ? !rented.equals(that.rented) : that.rented != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (rented != null ? rented.hashCode() : 0);
        result = 31 * result + admin;
        return result;
    }
}
