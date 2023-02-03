package classesPrincipal;

import java.time.LocalDateTime;

public class RegistroDePonto {
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private Projetos projeto;
    private Usuario usuario;

    public RegistroDePonto(LocalDateTime horaEntrada, LocalDateTime horaSaida, Projetos projeto, Usuario usuario) {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.projeto = projeto;
        this.usuario = usuario;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Projetos getProjeto() {
        return projeto;
    }

    public void setProjeto(Projetos projeto) {
        this.projeto = projeto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
