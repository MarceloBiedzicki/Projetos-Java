package bom.br.meuprojeto.gerenciadoraudio.model;

public class TimeSpendCalculator {

    public void getSpendTime(Audio audio){
        long time = (long) audio.plays * audio.getLenght();
        double hours = time/60;
        double days = hours/24;
        if(audio instanceof Podcast){
            System.out.printf("""
                    O podcast %s de %s.
                    Tem o total de %.2f horas reproduzidas, o que vale a %.2f dias.
                    """,audio.getTitle(),((Podcast) audio).getHost(),hours,days);
        } else{
            System.out.printf("""
                    A música %s da banda %s.
                    Tem o total de %.2f horas reproduzidas, o que vale a %.2f dias.
                    """,audio.getTitle(),((Musica) audio).getMusicGroup(),hours,days);
        }
    }
}
