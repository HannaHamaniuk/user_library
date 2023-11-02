package by.home.controllers;

import by.home.model.entities.Library;
import by.home.model.repositories.LibraryRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LibraryController {
    LibraryRepository libraryRepository;

    public void setLibraryRepository(LibraryRepository repository){
        libraryRepository = repository;
    }

    @GetMapping
    public String getAll(Model model){
        List<Library>libraries = libraryRepository.findAll();
        model.addAttribute("libraries",libraries);
        return "index";

    }
}
