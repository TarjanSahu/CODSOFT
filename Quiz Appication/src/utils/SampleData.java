package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Question;

import exception.InvalidInputException;

public class SampleData {

	public static List<Question> populateQuestionList() throws InvalidInputException {

		List<Question> questionList = new ArrayList<>();
		// String question, List<String> option, int currectOption
		questionList.add(new Question("What is the capital of France?",
				List.of("A. London", "B. Paris", "C. Rome", "D. Madrid"), 2));
		questionList.add(new Question("Which planet is known as the Red Planet?",
				List.of("A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"), 2));
		questionList.add(new Question("What is the chemical symbol for water?",
				List.of("A. H2O", "B. CO2", "C. O2", "D. H2SO4"), 1));

		return questionList;

	}

}
