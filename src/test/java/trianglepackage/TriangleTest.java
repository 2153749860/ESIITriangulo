package trianglepackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private Triangle teste;

    @Test
    public void testPerimetroNormal(){
        teste = new Triangle(2,2,2);

        //execução
        int perimetro = teste.getPerimeter();

        //Verificação
        Assertions.assertEquals(6, perimetro, "Perimetro nao compativel");
    }

    @Test
    public void testPerimetroInvalido(){
        //montagem de cenário
        teste = new Triangle(-1,2,2);

        //execução
        int perimetro = teste.getPerimeter();

        //Verificação
        Assertions.assertEquals(-1, perimetro, "Perimetro nao compativel");
    }

    @Test
    public void testareaValida(){
        //montagem de cenário
        teste = new Triangle(10,10,12);

        //execução
        double area = teste.getArea();

        //Verificação
        Assertions.assertEquals(48, area, "Area nao compativel");
    }

    @Test
    public void testareaInvalida(){
        //montagem de cenário
        teste = new Triangle(10,10,-1);

        //execução
        double area = teste.getArea();

        //Verificação
        Assertions.assertEquals(-1, area, "Area nao compativel");
    }

    @Test
    public void testClasseficacaoImpossibleNumeroNegativo(){
        //montagem de cenário
        teste = new Triangle(10,10,-1);

        //execução
        String classificacao = teste.classify();

        //Verificação
        Assertions.assertEquals("impossible", classificacao, "Clasificaçao nao compativel");
    }

    @Test
    public void testClasseficacaoImpossibleLadosImpossiveis(){
        //montagem de cenário
        teste = new Triangle(150,1,1);

        //execução
        String classificacao = teste.classify();

        //Verificação
        Assertions.assertEquals("impossible", classificacao, "Clasificaçao nao compativel");
    }

    @Test
    public void testClasseficacaoRetanguloPossivel(){
        //montagem de cenário
        teste = new Triangle(3,4,5);

        //execução
        String classificacao = teste.classify();

        //Verificação
        Assertions.assertEquals("right-angled", classificacao, "Clasificaçao nao compativel");
    }

    @Test
    public void testClasseficacaoIsosceles(){
        //montagem de cenário
        teste = new Triangle(2,2,3);

        //execução
        String classificacao = teste.classify();

        //Verificação
        Assertions.assertEquals("isossceles", classificacao, "Clasificaçao nao compativel");
    }

    @Test
    public void testClasseficacaoEquilatero(){
        //montagem de cenário
        teste = new Triangle(2,2,2);

        //execução
        String classificacao = teste.classify();

        //Verificação
        Assertions.assertEquals("equilateral", classificacao, "Clasificaçao nao compativel");
    }

    @Test
    public void testClasseficacaoScalene(){
        //montagem de cenário
        teste = new Triangle(6,10,8);

        //execução
        String classificacao = teste.classify();

        //Verificação
        Assertions.assertEquals("scalene", classificacao, "Clasificaçao nao compativel");
    }


}
