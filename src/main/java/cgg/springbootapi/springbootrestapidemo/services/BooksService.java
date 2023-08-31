package cgg.springbootapi.springbootrestapidemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import cgg.springbootapi.springbootrestapidemo.entities.Book;

@Component
public class BooksService {
        private static  List<Book> books=new ArrayList<>();
        
        static{
            books.add(new Book(1,"Juen","Wayne"));
            books.add(new Book(2,"Blue","Gorg"));
            books.add(new Book(3,"pilko","okla"));
        }
        //get all books
        public List<Book> getBooks(){
            return books;
        }
        //get book by int id-single book id
        public Book getBookById(int id) {
           Book book= books.stream().filter(b->b.getBookId()==id).findFirst().get();
            return book;
        }
        //adding a book 
        public Book addBook(Book book) {
            books.add(book);
            return book;
        }
        //update book
        public List<Book> updateBook(Book book, int id) {
            books=books.stream().map(b->{
                if(b.getBookId()==id){
                    b.setAuthor(book.getAuthor());
                    b.setTitle(book.getTitle());
                }
                return b;
            }).collect(Collectors.toList());
            return books;
        }
        public void deleteBook(int id) {
           books= books.stream().filter(b->(b.getBookId()!=id)).collect(Collectors.toList());
            
        }

        
        
}
