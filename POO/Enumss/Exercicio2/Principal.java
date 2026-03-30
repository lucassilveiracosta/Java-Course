package POO.Enumss.Exercicio2;

import POO.Enumss.Exercicio2.Entities.Comment;
import POO.Enumss.Exercicio2.Entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {


    public static void main(String[] args) {

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("WOW! that's awesome!");
        LocalDateTime date1 = LocalDateTime.of(2026, 1, 10, 8, 30);

        Post post1 = new Post(date1, "Travelling to the Beach", "Visiting", 12);

        post1.addComment(comment1);
        post1.addComment(comment2);

        Comment comment3 = new Comment("Good night!");
        Comment comment4 = new Comment("May the force be with you!");
        LocalDateTime date2 = LocalDateTime.of(2026, 3, 10, 21, 30);

        Post post2 = new Post(date2, "Sleep Time", "good night", 8);

        post2.addComment(comment3);
        post2.addComment(comment4);


        post1.printPost();
        System.out.println();
        post2.printPost();

    }
}
