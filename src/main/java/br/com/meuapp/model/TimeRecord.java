package br.com.meuapp.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "time_records")
public class TimeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private LocalTime horaDeEntrada;

    @Column(nullable = false)
    private LocalTime horaDeSaida;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public TimeRecord() {
    }

    public TimeRecord(LocalDate data, LocalTime horaDeEntrada, LocalTime horaDeSaida, User user) {
        this.data = data;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSaida = horaDeSaida;
        this.user = user;
    }
}
