package com.ccnu.library.data;

import javax.persistence.*;

/**
 * Created by ikaros on 2016/6/23.
 */
@Entity
@Table(name = "request", schema = "", catalog = "librarydatabase")
public class RequestEntity {
    private Integer bookId;
    private Integer userId;
    private String fromDate;
    private String toDate;
    private boolean statu;
    private BookinfoEntity bookinfoByBookId;
    private UserinfoEntity userinfoByUserId;
    private int id;

    @Basic
    @Column(name = "BookID", nullable = true, insertable = true, updatable = true)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "UserID", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

        if (statu != that.statu) return false;
        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (statu ? 1 : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "BookID", referencedColumnName = "ID")
    public BookinfoEntity getBookinfoByBookId() {
        return bookinfoByBookId;
    }

    public void setBookinfoByBookId(BookinfoEntity bookinfoByBookId) {
        this.bookinfoByBookId = bookinfoByBookId;
    }

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "ID")
    public UserinfoEntity getUserinfoByUserId() {
        return userinfoByUserId;
    }

    public void setUserinfoByUserId(UserinfoEntity userinfoByUserId) {
        this.userinfoByUserId = userinfoByUserId;
    }

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
