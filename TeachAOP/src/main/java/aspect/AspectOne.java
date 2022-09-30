package aspect;

import comment.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class AspectOne {
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        Comment comment = new Comment();
        comment.setAuthor("Den");
        comment.setText("By vsem loxi");
        logger.info("Before execute method");
        joinPoint.proceed();
    }
}
