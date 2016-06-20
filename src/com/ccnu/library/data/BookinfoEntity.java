package com.ccnu.library.data;

import javax.persistence.*;

@Entity
@Table(name = "bookinfo", schema = "", catalog = "librarydatabase")
public class BookinfoEntity {
    private String bookName;
    private String bookPath;

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
}
