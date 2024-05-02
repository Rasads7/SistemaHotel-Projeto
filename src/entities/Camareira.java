package entities;

public class Camareira extends Thread {

    private Quarto quarto; //referencia o quarto que a camareira está

    public Camareira() {
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    private void limparQuarto() { //método para a limpeza do quarto
        // realiza a limpeza
        System.out.println("A Camareira está limpando o quarto: " + quarto);
        // Tempo de limpeza
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Mudando o estado do quarto
        quarto.setDisponibilidade(DisponibilidadeEnum.VAGO);
    }

    @Override
    public void run() {
        while (true) { //verifica se o quarto está ocupado e executa a limpeza
            if (quarto != null && quarto.getDisponibilidade() == DisponibilidadeEnum.OCUPADO) {
                limparQuarto();
            }
        }
    }
}
