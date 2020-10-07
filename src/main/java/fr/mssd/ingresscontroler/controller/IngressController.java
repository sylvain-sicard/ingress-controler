package fr.mssd.ingresscontroler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.mssd.ingresscontroler.model.Ingress;
import fr.mssd.ingresscontroler.repository.IngressRepository;

@CrossOrigin
@Controller	
@RequestMapping(path="/ingress") 
public class IngressController extends AbstractController<Ingress, IngressRepository>{
	
}
