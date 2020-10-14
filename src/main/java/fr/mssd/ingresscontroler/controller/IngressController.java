package fr.mssd.ingresscontroler.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.mssd.ingresscontroler.model.Code;
import fr.mssd.ingresscontroler.model.Ingress;
import fr.mssd.ingresscontroler.repository.CodeRepository;
import fr.mssd.ingresscontroler.repository.IngressRepository;

@CrossOrigin
@Controller	
@RequestMapping(path="/ingress") 
public class IngressController extends AbstractController<Ingress, IngressRepository>{
	
	@Autowired 
	protected CodeRepository codeRepository;
	
//	@GetMapping(path="/app/{code}")
//	public @ResponseBody Ingress getByApp(@PathVariable("code") String appCode) {
//		return repository.findByAppCode(appCode);
//	}
//	
//	@GetMapping(path="/route/{type}")
//	public @ResponseBody Ingress getByRoute(@PathVariable("type") String routeType) {
//		return repository.findByRouteType(routeType);
//	}
	
	@GetMapping(path="/search/{type}/{code}")
	public @ResponseBody Ingress search(@PathVariable("type") String routeType, @PathVariable("code") String code) {
		Collection<Ingress> ingresses = repository.findByRouteType(routeType);
		Ingress ingress = ingresses.stream()
		.filter(i -> routeType.equals(i.getRouteType()))
		.findAny().orElse(null);
		if(ingress == null) {
			Code c = codeRepository.findById(Integer.decode(code)).get();
			ingress = repository.findByAppCode(c.getAppCode());
		}
		ingress.setNbAccess(ingress.getNbAccess()+1);
		return repository.save(ingress);
	}
}
