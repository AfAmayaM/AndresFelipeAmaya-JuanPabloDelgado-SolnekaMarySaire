package org.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
public enum Categoria {
    MAQUILLAJE,
    CUIDADO_CABELLO,
    CUIDADO_PIEL,
    FRAGANCIAS,
    CUIDADO_UNAS,
    ACCESORIOS_BELLEZA
}
