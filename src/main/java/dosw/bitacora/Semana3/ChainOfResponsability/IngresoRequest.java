package dosw.bitacora.Semana3.ChainOfResponsability;

public class IngresoRequest {

    private boolean pasaporteValido;
    private boolean antecedentes;
    private boolean motivoBalido;
    private boolean aprobado;

    public IngresoRequest(boolean pasaporteValido, boolean antecedentes, boolean motivoBalido ) {
        this.pasaporteValido = pasaporteValido;
        this.antecedentes = antecedentes;
        this.motivoBalido = motivoBalido;
    }

    public boolean isPasaporteValido() {
        return pasaporteValido;
    }

    public void setPasaporteValido(boolean pasaporteValido) {
        this.pasaporteValido = pasaporteValido;
    }

    public boolean isAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(boolean antecedentes) {
        this.antecedentes = antecedentes;
    }

    public boolean isMotivoBalido() {
        return motivoBalido;
    }

    public void setMotivoBalido(boolean motivoBalido) {
        this.motivoBalido = motivoBalido;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
}
