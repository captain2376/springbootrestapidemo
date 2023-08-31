package cgg.springbootapi.springbootrestapidemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {

   
    private int bookId;
    private String title;
    private String author;
}
