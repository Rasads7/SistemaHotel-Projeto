package entities;

public class Hospede extends Thread {

    private Quarto quarto;

    public Hospede() {
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    private void saidaPasseio() {
        // saída do hóspede
        System.out.println("Hóspede " + this.getId() + " foi passear.");
        // tempo do passeio (3 segundos)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // mostra o estado do hóspede
        while (true) {
            if (quarto != null) {
            	// mostra o hóspede dentro do quarto
            	System.out.println("Hóspede " + this.getId() + " se encontra quarto: " + quarto);
                
            	//método para o passeio
            	saidaPasseio();

                // mostra o retorno
                System.out.println("Hóspede " + this.getId() + " voltou do passeio");
                // espera 5 segundos para poder sair de novo
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

