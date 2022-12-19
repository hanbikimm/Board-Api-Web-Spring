package heyoom.first.board.repository;

import java.util.List;
import java.util.Optional;

import heyoom.first.board.domain.Board;

public interface BoardRepository {
	
	List<Board> getQuestions();
	List<Board> getAnswers(Long id);
	Optional<Board> getBoard(Long bbdId, Long ansId);
	Board postQuestion(Board board);
	Board postAnswer(Board board);
	String deleteBoard(Long bbdId, Long ansId);
	Board updateBoard(Board board);
	

}
