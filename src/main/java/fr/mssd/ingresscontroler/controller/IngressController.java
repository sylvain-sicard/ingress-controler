package fr.mssd.ingresscontroler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.mssd.ingresscontroler.model.Ingress;
import fr.mssd.ingresscontroler.repository.IngressRepository;

@CrossOrigin
@Controller	
@RequestMapping(path="/ingress") 
public class IngressController extends AbstractController<Ingress, IngressRepository>{
	
	@GetMapping(path="/app/{code}")
	public @ResponseBody Ingress getById(@PathVariable("code") String appCode) {
		return repository.findByAppCode(appCode);
	}
	
}
