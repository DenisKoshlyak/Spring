package main;

import comment.Comment;
import config.ApplicConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main1 {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main1.class.getName());
        Comment comment = new Comment();
        comment.setAuthor("Den");
        comment.setText("Salam vsem");

        var context = new AnnotationConfigApplicationContext(ApplicConfig.class);

        context.getBean(CommentService.class).pushingComment(comment);
        context.getBean(CommentService.class).deleteComment(comment);
    }
}
