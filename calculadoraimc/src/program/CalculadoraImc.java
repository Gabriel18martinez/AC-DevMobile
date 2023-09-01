package program;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {
        double imc = peso / (altura * altura);
        String msg = "";

        if (idade > 0 && idade <= 65) {
            if (imc < 16) {
                msg = "Baixo peso muito grave";
            } else if (imc >= 16 && imc <= 16.999) {
                msg = "Baixo peso grave";
            } else if (imc >= 17 && imc <= 18.499) {
                msg = "Baixo peso";
            } else if (imc >= 18.5 && imc <= 24.999) {
                msg = "Peso normal";
            } else if (imc >= 25 && imc <= 29.999) {
                msg = "Sobrepeso";
            } else if (imc >= 30 && imc <= 34.999) {
                msg = "Obesidade grau 1";
            } else if (imc >= 35 && imc <= 39.999) {
                msg = "Obesidade grau 2";
            } else if (imc >= 40) {
                msg = "Obesidade grau 3 (Obesidade mórbida)";
            }
        } else if (idade > 65) {
            if (sexo.equals("masculino")) {
                if (imc < 21.9) {
                    msg = "Baixo peso";
                } else if (imc >= 22 && imc <= 27) {
                    msg = "Peso normal";
                } else if (imc >= 27.1 && imc <= 30) {
                    msg = "Sobrepeso";
                } else if (imc >= 30.1 && imc <= 35) {
                    msg = "Obesidade grau 1";
                } else if (imc >= 35.1 && imc <= 39.9) {
                    msg = "Obesidade grau 2";
                } else if (imc >= 40) {
                    msg = "Obesidade grau 3 (Obesidade mórbida)";
                }
            }

            if (sexo.equals("feminino")) {
                if (imc < 21.9) {
                     msg = "Baixo peso";
                } else if (imc >= 22 && imc <= 27) {
                    msg = "Peso normal";
                } else if (imc >= 27.1 && imc <= 32) {
                    msg = "Sobrepeso";
                } else if (imc >= 32.1 && imc <= 37) {
                    msg = "Obesidade grau 1";
                } else if (imc >= 37.1 && imc <= 41.99) {
                    msg = "Obesidade grau 2";
                } else if (imc >= 42) {
                    msg = "Obesidade grau 3 (Obesidade mórbida)";
                }
            }

        } else msg = "Dados inválidos";
        return msg;
    }
}
