package br.com.api.oasis.controller;

import br.com.api.oasis.dto.PacienteResponseDto;
import br.com.api.oasis.model.Paciente;
import br.com.api.oasis.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/pacientes")
public class pacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponseDto> getPaciente(@PathVariable int id) {

        Optional<Paciente> paciente = pacienteService.getPaciente(id);
        if(paciente.isEmpty()) {

        }

        PacienteResponseDto pacienteResponseDto = new PacienteResponseDto(paciente.get());
        return new ResponseEntity<>(pacienteResponseDto, HttpStatus.OK);

    }

}
