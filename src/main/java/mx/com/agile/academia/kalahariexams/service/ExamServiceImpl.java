package mx.com.agile.academia.kalahariexams.service;

import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {

	@Override
	public String getTest() {
		return "Hola Mundo!";
	}

}
