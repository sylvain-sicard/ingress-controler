package fr.mssd.ingresscontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.mssd.ingresscontroller.model.Code;
import fr.mssd.ingresscontroller.repository.CodeRepository;

@CrossOrigin
@Controller	
@RequestMapping(path="/code") 
public class CodeController extends AbstractController<Code, CodeRepository>{
	
}
