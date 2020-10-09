package fr.mssd.ingresscontroler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.mssd.ingresscontroler.model.Code;
import fr.mssd.ingresscontroler.repository.CodeRepository;

@CrossOrigin
@Controller	
@RequestMapping(path="/code") 
public class CodeController extends AbstractController<Code, CodeRepository>{
	
}
