package bom.br.meuprojeto.gerenciadoraudio.model;

public class Podcast extends Audio {
    private String host;
    private String description;

    public Podcast(String nome) {
        super(nome);
        format = "Podcast";
    }

    @Override
    public void getScorePlays() {
        System.out.print("Baseado apenas em plays a classificação do podcast é ");
        if (this.plays >= 1000000) {
            System.out.println("**EXCELENTE**");
        } else if (this.plays >= 10000 && this.plays < 1000000) {
            System.out.println("**POPULAR**");
        } else {
            System.out.println("**NICHO**");
        }
    }

    @Override
    public void getScoreLikes() {
        System.out.print("Baseado apenas em likes a classificação do podcast é ");
        if (this.likes >= 10000) {
            System.out.println("**CONSAGRADO**");
        } else if (this.likes >= 1000 && this.likes < 10000) {
            System.out.println("**POPULAR**");
        } else {
            System.out.println("**NICHO**");
        }
    }
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
