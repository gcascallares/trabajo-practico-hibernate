package ar.edu.unlam.tallerweb1.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorCadenaCaracteres {

	
	
	@RequestMapping("/pasarMayuscula/{caracteres}")
	public ModelAndView pasarAMayuscula(@PathVariable String caracteres)
	{
		ModelMap modelo = new ModelMap();
		modelo.put("caracteres1", caracteres);
		String resultado=(caracteres.toUpperCase()); 
		modelo.put("resultado", resultado);
		modelo.put("operacion", "Pasar a mayuscula");
		return new ModelAndView("vistaTp", modelo);
	}
	
	@RequestMapping("/pasarMinuscula/{caracteres}")
	public ModelAndView pasarAMinuscula(@PathVariable String caracteres)
	{
		ModelMap modelo = new ModelMap();
		modelo.put("caracteres1", caracteres);
		String resultado=(caracteres.toLowerCase()); 
		modelo.put("resultado", resultado);
		modelo.put("operacion", "Pasar a minuscula");
		return new ModelAndView("vistaTp", modelo);
	}

	@RequestMapping("/verCantidadCaracteres/{caracteres}")
	public ModelAndView verCantidadDeCaracteres(@PathVariable String caracteres)
	{
		ModelMap modelo = new ModelMap();
		modelo.put("caracteres1", caracteres);
		Integer resultado=(caracteres.length()); 
		modelo.put("resultado", resultado);
		modelo.put("operacion", "ver cantidad de caracteres");
		return new ModelAndView("vistaTp", modelo);
	}
	
	@RequestMapping("/invertirCaracteres/{caracteres}")
	public ModelAndView invertirLosCaracteres(@PathVariable String caracteres)
	{
		ModelMap modelo = new ModelMap();
		modelo.put("caracteres1", caracteres);
		String cadenaInvertida = "";
		
		for (int x=caracteres.length()-1;x>=0;x--){
		
			cadenaInvertida = cadenaInvertida + caracteres.charAt(x);
		
		}
		
		modelo.put("resultado", cadenaInvertida);
		modelo.put("operacion", "invertir caracteres");
		return new ModelAndView("vistaTp", modelo);
	}
	
}
