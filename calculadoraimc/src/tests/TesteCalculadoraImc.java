package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import program.CalculadoraImc;

public class TesteCalculadoraImc {
    CalculadoraImc calc;

    @Before
    public void setup() {
        calc = new CalculadoraImc();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(49, 1.751, 19, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveMin() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(47.0, 1.71, 19, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveMax() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(55.0, 1.7999, 19, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoMin() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(55, 1.798,19, "masculino"));
    }
    @Test
    public void testeAdultoBaixoPesoMax() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(55, 1.725,19, "masculino"));
    }
    @Test
    public void testeAdultoPesoNormalMin() {
        Assert.assertEquals("Peso normal", calc.calcularImc(55, 1.7239,19, "masculino"));
    }
    @Test
    public void testeAdultoPesoNormalMax() {
        Assert.assertEquals("Peso normal", calc.calcularImc(60, 1.5497,19, "masculino"));
    }
    @Test
    public void testeAdultoSobrePesoMin() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(60, 1.549,19, "masculino"));
    }
    @Test
    public void testeAdultoSobrepesoMax() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(70, 1.529,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIMin() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(70, 1.527,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIMax() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(80, 1.512,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIIMin() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(80, 1.5115,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIIMax() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(90, 1.5001,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau 3 (Obesidade mórbida)", calc.calcularImc(90, 1.5,19, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(50, 1.511,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoPesoNormalMin() {
        Assert.assertEquals("Peso normal", calc.calcularImc(50, 1.505,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoPesoNormalMax() {
        Assert.assertEquals("Peso normal", calc.calcularImc(60, 1.491,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoSobrepesoMin() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(60, 1.486,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoSobrepesoMax() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(70, 1.528,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauIMin() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(70, 1.5245,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauIMax() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(79, 1.504,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauIIMin() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(79, 1.5,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauIIMax() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(90, 1.503,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau 3 (Obesidade mórbida)", calc.calcularImc(90, 1.5,66, "masculino"));
    }
    @Test
    public void testeIdosoFemininoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(50, 1.511,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoPesoNormalMin() {
        Assert.assertEquals("Peso normal", calc.calcularImc(50, 1.505,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoPesoNormalMax() {
        Assert.assertEquals("Peso normal", calc.calcularImc(60, 1.491,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoSobrepesoMin() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(60, 1.486,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoSobrepesoMax() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(70, 1.48,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauIMin() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(70, 1.476,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauIMax() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(80, 1.471,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauIIMin() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(80, 1.468,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauIIMax() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(90, 1.465,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau 3 (Obesidade mórbida)", calc.calcularImc(90, 1.463,66, "feminino"));
    }
}
