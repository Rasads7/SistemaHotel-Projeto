package entities;

public class Camareira extends Thread {
    
    // Métodos
    private void limparQuarto(Quarto quarto) { 
    	if (quarto.getPosseChave().equals(EnumPosseChave.HOTEL)) {
    		quarto.setPosseChave(EnumPosseChave.CAMAREIRA);
            System.out.println("A Camareira está limpando o quarto");
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            quarto.setPosseChave(EnumPosseChave.HOTEL);
    	}
    }
    
	//@Override
    //public void run() {
        //while (true) { //verifica se o quarto está ocupado e executa a limpeza
            //if (quarto != null && quarto.getDisponibilidade() == DisponibilidadeEnum.OCUPADO) {
                //limparQuarto();
            //}
        //}
    //}
}
