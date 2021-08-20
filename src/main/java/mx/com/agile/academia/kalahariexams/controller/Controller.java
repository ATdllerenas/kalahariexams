package mx.com.agile.academia.kalahariexams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mx.com.agile.academia.kalahariexams.service.ExamService;

@RestController
@RequestMapping("/kalahari/exams/")
public class Controller {
	@Autowired
	private ExamService examServiceImpl;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/test", produces = "application/json")
	public String getById() {
		return examServiceImpl.getTest();
	}
}
