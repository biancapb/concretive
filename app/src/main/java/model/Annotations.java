package model;

public class Annotations {
    private String title, description;

    //construtor vazio
    public Annotations(){

    }

    //construtor com parametros
    public Annotations(String titulo, String descricao) {
        this.title = titulo;
        this.description = descricao;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
