package CommServ;

import DBComm.DBCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService2 {
    private DBCommentRepository dbc;

    @Autowired
    public CommentService2(DBCommentRepository dbComm){
        dbc = dbComm;
    }

    public DBCommentRepository getDbc(){
        return dbc;
    }
}
