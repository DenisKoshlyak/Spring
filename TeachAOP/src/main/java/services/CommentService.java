package services;

import aspect.ToLog;
import comment.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    public Logger logger = Logger.getLogger(this.getClass().getName());

    public void pushingComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText() + " from " + comment.getAuthor());
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleted comment: " + comment);
    }
}
