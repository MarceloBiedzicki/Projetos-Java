package bom.br.meuprojeto.gerenciadoraudio.main;

import bom.br.meuprojeto.gerenciadoraudio.model.Musica;
import bom.br.meuprojeto.gerenciadoraudio.model.Podcast;
import bom.br.meuprojeto.gerenciadoraudio.model.TimeSpendCalculator;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica("Alive");
        musica.setMusicGroup("Pearl Jam");
        musica.setLenght(4);
        musica.setAlbum("Ten (Redux)");
        musica.setGenre("rock");

        for(int i = 0; i < 100000; i++){
            musica.play();
        }
        for(int i = 0; i <1000; i++){
            musica.like();
        }

        System.out.println("------------------------------------------");
        Podcast podcast = new Podcast("Dormindo no ponto");
        podcast.setHost("Jovem nerd");
        podcast.setLenght(120);
        podcast.setDescription("Podcast que fala sobre a ciência do sono.");
        for(int i = 0; i < 20000; i++){
            podcast.play();
        }
        for(int i = 0; i <100; i++){
            podcast.like();
        }

        podcast.getScorePlays();
        podcast.getScoreLikes();

        musica.getScorePlays();
        musica.getScoreLikes();

        TimeSpendCalculator timecalc = new TimeSpendCalculator();
        timecalc.getSpendTime(podcast);
        timecalc.getSpendTime(musica);
    }
}
