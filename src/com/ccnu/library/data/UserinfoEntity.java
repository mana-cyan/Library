package com.ccnu.library.data;

import javax.persistence.*;

@Entity
@Table(name = "userinfo", schema = "", catalog = "librarydatabase")
public class UserinfoEntity {
    private int id;
    private String username;
    private String password;
    private String rented;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserinfoEntity that = (UserinfoEntity) o;

        if (id != that.id) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "Rented", nullable = true, insertable = true, updatable = true, length = 30)
    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }
}
