package br.com.api.oasis.service;

import br.com.api.oasis.model.Paciente;
import br.com.api.oasis.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Optional<Paciente> getPaciente(int id){
        return pacienteRepository.findById(id);
    }

}
