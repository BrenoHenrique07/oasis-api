package br.com.api.oasis.dto;

import br.com.api.oasis.model.Paciente;

public record PacienteResponseDto(int id, String nome, int idade) {
    public PacienteResponseDto(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getIdade());
    }

}
