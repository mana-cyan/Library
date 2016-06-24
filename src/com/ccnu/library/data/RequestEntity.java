package com.ccnu.library.data;

import javax.persistence.*;

/**
 * Created by ikaros on 2016/6/24.
 */
@Entity
@Table(name = "request", schema = "", catalog = "librarydatabase")
public class RequestEntity {
    private int id;
    private int bookId;
    private int userId;
    private String fromDate;
    private String toDate;
    private boolean statu;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BookID", nullable = false, insertable = true, updatable = true)
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "UserID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "FromDate", nullable = false, insertable = true, updatable = true, length = 20)
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "ToDate", nullable = false, insertable = true, updatable = true, length = 20)
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "Statu", nullable = false, insertable = true, updatable = true)
    public boolean isStatu() {
        return statu;
    }

    public void setStatu(boolean statu) {
        this.statu = statu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestEntity that = (RequestEntity) o;

        if (bookId != that.bookId) return false;
        if (id != that.id) return false;
        if (statu != that.statu) return false;
        if (userId != that.userId) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + bookId;
        result = 31 * result + userId;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (statu ? 1 : 0);
        return result;
    }
}
