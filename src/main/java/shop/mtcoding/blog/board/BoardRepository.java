package shop.mtcoding.blog.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BoardRepository {

    private final EntityManager em;

    public Board findById(int id){
        Query query = em.createNativeQuery("select * from board_tb bt inner join user_tb ut where bt.id = ?", Board.class);
        query.setParameter(1, id);

        Board board = (Board)query.getSingleResult();
        return board;
    }
}
