package org.example;

import org.example.model.Book;
import org.example.service.LibraryService;
import org.example.SingletonLazyBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);



        LibraryService defaultLibraryService = context.getBean(LibraryService.class);
        defaultLibraryService.addBook(new Book("Abay joly", "Mukhtar Auezov"));
        defaultLibraryService.addBook(new Book("Koshpendiler", "Ilyas Esenberlin"));
        defaultLibraryService.addBook(new Book("Qarash-Qarash oqigasy", "Mukhtar Auezov"));


        LibraryService premiumLibraryService = context.getBean("premiumLibraryService", LibraryService.class);
        premiumLibraryService.addBook(new Book("Bir el – bir kitap", "Saken Seyfullin"));
        premiumLibraryService.addBook(new Book("Mahabbat, qyzyq mol jyldar", "Azilkhan Nurshaikhov"));
        premiumLibraryService.addBook(new Book("Menin atym Qoja", "Berdibek Sokpakbaev"));




        System.out.println("\nBooks in Default Library:");
        defaultLibraryService.getBooks().forEach(book ->
                System.out.println(book.getTitle() + " by " + book.getAuthor())
        );



        System.out.println("\nBooks in Premium Library:");
        premiumLibraryService.getBooks().forEach(book ->
                System.out.println(book.getTitle() + " by " + book.getAuthor())
        );

        context.getBean(SingletonLazyBean.class);

    }
}
