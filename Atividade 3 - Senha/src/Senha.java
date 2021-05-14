public class Senha extends Thread {

    public static String senha;

    public Senha (String senha) {

        Senha.senha = senha;

    }


    public void run () {

        try {
        	
        	String tentativa = "";

            boolean s = true;

            try {
                while (s) {

                    for (int t = 0; t < 999999; t++) {

                        tentativa = Integer.toString(t);

                        if (tentativa.equals (senha)){
                            if (tentativa.length() == 6) {

                                System.out.println("Senha: " + senha);

                                System.out.println(String.format("Senha correta: %s", senha));


                            }else if(tentativa.length() > 6){

                                System.out.println("Senha com mais de 6 digitos");

                            } else if(tentativa.length() < 6){

                                System.out.println("Senha com menos de 6 digitos");

                            }else{

                                System.out.println("Senha Inválida");
                            }
                        }

                        s = false;
                    }
                }

            } catch (NumberFormatException ex) {

                ex.printStackTrace();
            }


            
          

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main (String [] args) {

        Senha s = new Senha ("1234567");
      //Senha t = new Senha ("12345");
      //Senha u = new Senha ("12345a");

        s.start();
    }
}