package com.ccnu.library.data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "bookinfo", schema = "", catalog = "librarydatabase")
public class BookinfoEntity {
    private String bookName;
    private String bookPath;
    private int id;
    private Integer storage;
    private String rented;
    private String bookAuthor;
    private String bookInfo;
    private Collection<RequestEntity> requestsById;

    @Basic
    @Id
    @Column(name = "BookName", nullable = false, insertable = true, updatable = true, length = 50)
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "BookPath", nullable = false, insertable = true, updatable = true, length = 100)
    public String getBookPath() {
        return bookPath;
    }

    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookinfoEntity that = (BookinfoEntity) o;

        if (bookName != null ? !bookName.equals(that.bookName) : that.bookName != null) return false;
        if (bookPath != null ? !bookPath.equals(that.bookPath) : that.bookPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookName != null ? bookName.hashCode() : 0;
        result = 31 * result + (bookPath != null ? bookPath.hashCode() : 0);
        return result;
    }

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @OneToMany(mappedBy = "bookinfoByBookId")
    public Collection<RequestEntity> getRequestsById() {
        return requestsById;
    }

    public void setRequestsById(Collection<RequestEntity> requestsById) {
        this.requestsById = requestsById;
    }
}
