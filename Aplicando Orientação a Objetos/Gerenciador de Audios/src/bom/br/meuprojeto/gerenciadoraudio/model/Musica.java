package bom.br.meuprojeto.gerenciadoraudio.model;

public class Musica extends Audio {
    private String album;
    private String musicGroup;
    private String genre;

    public Musica(String nome) {
        super(nome);
        this.format = "Música";
    }

    @Override
    public void getScorePlays() {
        System.out.print("Baseado apenas em plays a classificação desta Música é ");
        if (this.plays >= 1000000) {
            System.out.println("**SUCESSO**");
        } else if (this.plays >= 10000 && this.plays < 1000000) {
            System.out.println("**PROMISSORA**");
        } else {
            System.out.println("**NICHO**");
        }
    }
    @Override
    public void getScoreLikes() {
        System.out.print("Baseado apenas em likes a classificação da Música é ");
        if (this.likes >= 10000) {
            System.out.println("**MUITO POPULAR**");
        } else if (this.likes >= 1000 && this.likes < 10000) {
            System.out.println("**MODERADA**");
        } else {
            System.out.println("**INDIE**");
        }
    }
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getMusicGroup() {
        return musicGroup;
    }

    public void setMusicGroup(String musicGroup) {
        this.musicGroup = musicGroup;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
