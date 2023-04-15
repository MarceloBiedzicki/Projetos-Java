package bom.br.meuprojeto.gerenciadoraudio.model;

public abstract class Audio {
    private  String title;
    protected int plays;
    protected int likes;
    private int lenght;
    protected String format;


    public Audio(String nome) {
        this.title = nome;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        this.plays++;
    }

    public void like() {
        this.likes++;
    }

    public void setLenght(int time){
        lenght = time;
    }
    public int getLenght(){
        return lenght;
    }
    public int getPlays() {
        return plays;
    }

    public int getLikes() {
        return likes;
    }


    @Override
    public String toString() {
        return "Titulo: " + this.title + ".\n" +
                "Formato: " + this.format + ".\n" +
                "Duração: " + this.lenght + ".";
    }

    public abstract void getScorePlays();

    public abstract void getScoreLikes();

}
