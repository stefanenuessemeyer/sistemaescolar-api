package com.sistemaescolar.api;

import com.sistemaescolar.api.entity.Materia;
import com.sistemaescolar.api.entity.dto.MateriaDTO;
import com.sistemaescolar.api.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materia")
public class MateriaController {

    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping
    public List<MateriaDTO> listaTudo() {
        List<Materia> materiaList = materiaRepository.findAll();
        return MateriaDTO.converter(materiaList);
    }

    @PostMapping
    public void cadastrar(@RequestBody String nomeDaMateria) {
        Materia m = new Materia();
        m.setNomeDaMateria(nomeDaMateria);

        materiaRepository.save(m);
    }
}
