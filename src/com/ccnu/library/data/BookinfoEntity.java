package com.ccnu.library.data;

import javax.persistence.*;

/**
 * Created by ikaros on 2016/6/25.
 */
@Entity
@Table(name = "bookinfo", schema = "", catalog = "librarydatabase")
public class BookinfoEntity {
    private int id;
    private String bookName;
    private String bookAuthor;
    private String bookInfo;
    private String bookPath;
    private Integer storage;
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
    @Column(name = "BookName", nullable = false, insertable = true, updatable = true, length = 50)
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "BookAuthor", nullable = false, insertable = true, updatable = true, length = 20)
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Basic
    @Column(name = "BookInfo", nullable = false, insertable = true, updatable = true, length = 200)
    public String getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(String bookInfo) {
        this.bookInfo = bookInfo;
    }

    @Basic
    @Column(name = "BookPath", nullable = false, insertable = true, updatable = true, length = 100)
    public String getBookPath() {
        return bookPath;
    }

    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    @Basic
    @Column(name = "Storage", nullable = true, insertable = true, updatable = true)
    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    @Basic
    @Column(name = "Rented", nullable = true, insertable = true, updatable = true, length = 30)
    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookinfoEntity that = (BookinfoEntity) o;

        if (id != that.id) return false;
        if (bookAuthor != null ? !bookAuthor.equals(that.bookAuthor) : that.bookAuthor != null) return false;
        if (bookInfo != null ? !bookInfo.equals(that.bookInfo) : that.bookInfo != null) return false;
        if (bookName != null ? !bookName.equals(that.bookName) : that.bookName != null) return false;
        if (bookPath != null ? !bookPath.equals(that.bookPath) : that.bookPath != null) return false;
        if (rented != null ? !rented.equals(that.rented) : that.rented != null) return false;
        if (storage != null ? !storage.equals(that.storage) : that.storage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
        result = 31 * result + (bookInfo != null ? bookInfo.hashCode() : 0);
        result = 31 * result + (bookPath != null ? bookPath.hashCode() : 0);
        result = 31 * result + (storage != null ? storage.hashCode() : 0);
        result = 31 * result + (rented != null ? rented.hashCode() : 0);
        return result;
    }
}
