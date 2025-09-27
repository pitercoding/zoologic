package model.enums;

public enum TipoSom {
    Vocalização_Aguda("Vocalizações agudas"),
    Vocalização_Grave("Vocalizações graves"),
    Cantoria_Assobio("Cantorias e assobios"),
    Sons_Suaves("Sons suaves ou discretos"),
    Silêncio("Silêncio ou quase inaudível"),
    Comunicação_Humana("Fala");

    private final String descricao;

    TipoSom(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
