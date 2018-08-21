package com.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.app.entity.Estudiante;
import com.crud.app.service.EstudianteService;

@Controller
@RequestMapping("/")
public class EstudianteController {

	@Autowired
	EstudianteService estudianteService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model){
		List<Estudiante> list = estudianteService.getAll();
		list.stream().forEach(System.out::println);
		model.addAttribute("obj", new Estudiante());
		model.addAttribute("list", list);
		return "index";
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute Estudiante est){
		estudianteService.save(est);
		return "redirect:/getAll";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable Integer id){		
		estudianteService.borrar(id);
		return "redirect:/getAll";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(Model model, @PathVariable Integer id){		
		model.addAttribute("obj", estudianteService.findOne(id));
		return "editar";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Estudiante est		
			){
		estudianteService.save(est);
		return "redirect:/getAll";
	}

	@GetMapping("/nuevo")
	public String nuevo(Model model){
		model.addAttribute("obj", new Estudiante());
		return "nuevo";
	}
}
